<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme() + "://"  
            + request.getServerName() + ":" + request.getServerPort()  
            + path + "/";  
%> 
<form action="/addZl" name="userForm" method="post">
<div class="form-group">
<h2>上传资料</h2>
</div>
<div>
<label style="float:left;margin-right:40px;margin-top:10px;">名称 </label>
<input type="text" id="upload" name="zl_id" class="form-control" placeholder="名称"  style="width:330px;margin-top:20px;" required autofocus>
</div>
<div class="form-group">
    <label for="name" style="float:left;margin-right:10px;margin-top:30px;">简要说明</label>
    <textarea class="form-control" name="note" rows="3" style="width:330px;margin-top:10px;" placeholder="简单说明文件作用"></textarea>
</div>
<div class="form-group">
    <input type="file" id="inputfile" name="file_path" style="margin-top:10px;">
</div>
<div class="form-group">
<button  type="submit" style="width:130px;height:40px;">提交</button>
</div>
</form>
