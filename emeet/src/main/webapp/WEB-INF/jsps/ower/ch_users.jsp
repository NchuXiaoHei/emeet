	已邀请：
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
	
	
	请选择：
	<div id="ch_users">
		<form action="add_ch_user">
			<input type="hidden" id="hy_id" name="hy_id" value="${hy.hy_id }"></input>
			<input id="user_id" name="user_id" type="text" placeholder="输入用户名"></input>
			<input id="type" name="type" placeholder="输入此人角色"></input>
			<input type="submit" text="确定"/>
		</form>
	</div>