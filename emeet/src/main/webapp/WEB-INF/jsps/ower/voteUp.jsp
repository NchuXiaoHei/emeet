
	<table class="table table-striped" >
		<tr>                
           <th style="margin-left:200px;">投票ID</th>
           <th style="margin-left:200px;">投票信息</th>
        </tr>
        <c:foreach var="tp" items="voteList">
        	<tr>
        		<td>${tp.tp_id }</td>
        		<td>${tp.note }</td>
        		<td><a href="/voteDown?tp_id=${tp.tp_id }&hy_id=${tp.hy_id">删除投票</a></td>
        	</tr>
        </c:foreach>
	</table>


<div id="vote_up">
	<h2>添加投票</h2>
	<input id="note" type="text" placeholder="请输入投票描述"/>
	<button id="vote_sub" onclick="vote_sub(${hy.hy_id})">提交</button>
</div>

<script type="text/javascript">
	function vote_sub(var hy_id){
		$.ajax(
			type: 'post',
			dataType: "text",
			data: "note="+$("#note").val()+"&hy_id="+hy_id,
			url: '/vote_up',
			success: function(msg){
				$("#right").html(msg);
			}
		);
	}
</script>