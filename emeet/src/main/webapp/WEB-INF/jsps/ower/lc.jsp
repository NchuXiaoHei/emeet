<div>
	<p>当前流程:</p>
	<table>
		<tr>
			<td>时间</td>
			<td>环节</td>
		</tr>
			<c:foreach var="item" item="list">
				<tr>
					<td>${item.sTime } - ${item.eTime }</td>
					<td>${item.note }</td>
					</tr>
				</c:foreach>
	</table>
	<div>
		<button onclick="update_lc()">编辑流程</button>
		<button onclick="add_lc()">添加流程</button>
	</div>
</div>


<script type="text/javascript">
	function add_lc(){
		/* $.ajax(
			type:'POST',
			url:'/add_ch_user',
			data: 'hy_id='+hy_id+'&user_id='+$("#user_id").val()+'&type='+$("#type").val(),
			dataType: "text",
			success: function(msg){
				$("#right").html(msg);
			}
		); */
	}
	function update_lc(){
		/* $.ajax(
			type:'POST',
			url:'/add_ch_user',
			data: 'hy_id='+hy_id+'&user_id='+$("#user_id").val()+'&type='+$("#type").val(),
			dataType: "text",
			success: function(msg){
				$("#right").html(msg);
			}
		); */
	}
	function delete_lc(){
		/* $.ajax(
			type:'POST',
			url:'/add_ch_user',
			data: 'hy_id='+hy_id+'&user_id='+$("#user_id").val()+'&type='+$("#type").val(),
			dataType: "text",
			success: function(msg){
				$("#right").html(msg);
			}
		); */
	}
	</script>