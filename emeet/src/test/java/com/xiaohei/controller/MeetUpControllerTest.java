package com.xiaohei.controller;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.File;
import java.io.FileInputStream;

import javax.servlet.ServletContext;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextConfiguration({"classpath*:mvc-dispatcher-servlet.xml","classpath*:applicationContext*.xml","classpath*:applicationContext-service.xml"})

//����ع�
@TransactionConfiguration(defaultRollback = true)  
@Transactional
public class MeetUpControllerTest {
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	
	
	@Autowired
	MeetUpController meetUpController;
	@Autowired
	ServletContext context;

	@Before
	public void setUp() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void testMeetUp() throws Exception {
		assertNotNull(mockMvc);
		File file = new File("D:\\Personal\\Desktop\\oracle 11g附录实验答案.docx");

		MockMultipartFile file1=new MockMultipartFile("data", "oracle 11g附录实验答案.docx", "text/plain", new FileInputStream(file));
		MockMultipartFile file2=new MockMultipartFile("data", "oracle 11g附录实验答案.docx", "text/plain", new FileInputStream(file));

		mockMvc.perform(MockMvcRequestBuilders.fileUpload("/meetUp")
				.file(file1)
				.file(file2)
				.param("theme", "test")
				.param("s_time", "2018-06-01 15:30:00")
				.param("e_time", "2018-06-01 15:30:00")
				.param("pirture1","D:\\Personal\\Desktop\\oracle 11g附录实验答案.docx")
				.param("pirture2","D:\\Personal\\Desktop\\oracle 11g附录实验答案.docx")
				
				)
		.andExpect(status().isOk())
		.andDo(print());
	}

}
