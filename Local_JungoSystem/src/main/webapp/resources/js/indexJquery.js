/**
 * 
 */
$(document).ready(function() {
	$("#index tbody tr td").click(function() {
		var num = $(this).attr('id');
		$(location).attr("href", "indexInfo?id="+num);
	})
	$("#back").click(function() {
		var current = Number($("h3").attr('id'))-1;
		$(location).attr("href", "/jungonara/noticelistinfo?num="+current);
	})
	$("#next").click(function() {
		var current = Number($("h3").attr('id'))+1;
		$(location).attr("href", "/jungonara/noticelistinfo?num="+current);
	})
	$("#backList").click(function() {
		$(location).attr("href", "/jungonara/noticelist?pageNum=1");
	})
})