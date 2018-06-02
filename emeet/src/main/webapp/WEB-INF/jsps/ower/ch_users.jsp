	<p>已邀请：</p>
	<table>
		<tr>                
           <th style="margin-left:200px;">姓名</th>
           <th style="margin-left:200px;">类型</th>
        </tr>
        <c:foreach var=ch_user item="ch_users">
			<tr>${ch_user.name }</tr>
			<tr>${ch_user.type }</tr>
		</c:foreach>
	</table>
	
	
	<p>请选择：</p>
	<div id="ch_users">
		<form>
			<input type="hidden" id="hy_id" name="hy_id" value="${hy.hy_id }"></input>
			<input id="user_id" name="user_id" type="text" placeholder="输入用户名"></input>
			<input id="type" name="type" placeholder="输入此人角色"></input>
			<button onclick="add_ch_user()" text="确定"/>
		</form>
	</div>
	
	<script type="text/javascript">
	function add_ch_user(){
		$.ajax(
			type:'POST',
			url:'/add_ch_user',
			data: 'hy_id='+hy_id+'&user_id='+$("#user_id").val()+'&type='+$("#type").val(),
			dataType: "text",
			success: function(msg){
				$("#right").html(msg);
			}
		);
	}
	</script>