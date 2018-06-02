package com.xiaohei.service.impl;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.xiaohei.service.RegisterService;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

@Service("registerService")
public class RegisterServicelmpl implements RegisterService{

	public String encode(String contents, int width, int height, String uploadPath, String realUploadPath,
			String imageName) {
		//生成条形码时的一些配置
        Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();  
        // 指定纠错等级,纠错级别（L 7%、M 15%、Q 25%、H 30%）  
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);  
        // 内容所使用字符集编码  
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");     

        OutputStream out=null;
        try {
            if(realUploadPath!=null&&realUploadPath!=""){

                out = new FileOutputStream(realUploadPath+"/"+imageName);
            }
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        BitMatrix bitMatrix;
        try {
            // 生成二维码  
            bitMatrix = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, width, height, hints);
            MatrixToImageWriter.writeToStream(bitMatrix, "png", out);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return uploadPath+"/"+imageName ;
    }

	public String LogoMatrix(File image, String uploadPath, String realUploadPath, String imgPath) {
		// TODO Auto-generated method stub
		OutputStream os = null ;
        String logoFileName = "logo_"+imgPath ;   // 设置二维码名称
        try {
           Image image2 = ImageIO.read(image) ;
           int width = image2.getWidth(null) ;
           int height = image2.getHeight(null) ;
           BufferedImage bufferImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB) ;
           //BufferedImage bufferImage =ImageIO.read(image) ;
           Graphics2D g2 = bufferImage.createGraphics();  
           g2.drawImage(image2, 0, 0, width, height, null) ;
           int matrixWidth = bufferImage.getWidth();  
           int matrixHeigh = bufferImage.getHeight();  

           //读取Logo图片 
            BufferedImage logo= ImageIO.read(new File(realUploadPath+"/"+"2.jpg"));
            //开始绘制图片  
            g2.drawImage(logo,matrixWidth/5*2,matrixHeigh/5*2, matrixWidth/5, matrixHeigh/5, null);//绘制       
            BasicStroke stroke = new BasicStroke(5,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);   
            g2.setStroke(stroke);// 设置笔画对象  
            //指定弧度的圆角矩形  
            RoundRectangle2D.Float round = new RoundRectangle2D.Float(matrixWidth/5*2, matrixHeigh/5*2, matrixWidth/5, matrixHeigh/5,20,20);  
            g2.setColor(Color.white);  
            g2.draw(round);// 绘制圆弧矩形  

            //设置logo 有一道灰色边框  
            BasicStroke stroke2 = new BasicStroke(1,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);   
            g2.setStroke(stroke2);// 设置笔画对象  
            RoundRectangle2D.Float round2 = new RoundRectangle2D.Float(matrixWidth/5*2+2, matrixHeigh/5*2+2, matrixWidth/5-4, matrixHeigh/5-4,20,20);  
            g2.setColor(new Color(128,128,128));  
            g2.draw(round2);// 绘制圆弧矩形  

            g2.dispose();  

            bufferImage.flush() ;  
            os = new FileOutputStream(realUploadPath+"/"+logoFileName) ;
               JPEGImageEncoder en = JPEGCodec.createJPEGEncoder(os) ;
               en.encode(bufferImage) ;

       } catch (Exception e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       } finally {
           if(os!=null) {
               try {
                   os.close();
               } catch (IOException e) {
                   // TODO Auto-generated catch block
                   e.printStackTrace();
               }
           }
       }   
        return uploadPath+"/"+logoFileName ;
	}  
	

}
