<div id="hy_status">
	<p>会议当前状态:<label>${hy.status }</label><p>
	<button id="hy_start" name="hy_start" onclick="meet_start(${hy.hy_id},"进行中")">开始会议</button>
	<button id="hy_stop" name="hy_stop" onclick="meet_end(${hy.hy_id},"已结束")">结束会议</button>
</div>

<script>
	function meet_start(var hy_id, var status){
		$.ajax(
			type:'POST',
			url:'/updateStatus',
			data: 'hy_id='+hy_id+'&status='+status,
			dataType: "text",
			success: function(msg){
				$("right").html(msg);
			}
		);
	}
	
	function meet_end(var hy_id, var status){
		$.ajax(
			type:'POST',
			url:'/updateStatus',
			data: 'hy_id='+hy_id+'&status='+status,
			dataType: "text",
			success: function(msg){
				$("right").html(msg);
			}
		);
	}
</script>