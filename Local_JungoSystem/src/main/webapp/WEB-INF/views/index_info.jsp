<%@page import="com.gntech.dto.orderDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<div class="container">
	<div id="basic_table">
		<div class="container-body">
			<h2>삽니다</h2>
			<%
				request.setCharacterEncoding("UTF-8");
				orderDTO dto = (orderDTO) request.getAttribute("select");
				/* int count = (int) request.getAttribute("buycount"); */
			%>
			<!------------------------- 상단 버튼 (수락 / 거절) ------------------------------>
			<div class="pull-right">
				<button type="button" id="back" class="btn btn-success">확인</button>
				<button type="button" id="backList" class="btn btn-danger">취소</button>
			</div>
			<br><br>
			<!------------------------------------------------------------------------------>
			<%-- <h3 id="<%=dto.getId()()%>"><%=dto.getBuy_title()%></h3> --%>
			<p id="orderDate" class="text-right">
				작성일 : <strong><%=dto.getOrder_date()%></strong>
			</p>
			<br>
			<div id="contents">
				<p><strong>주문번호 : </strong><%=dto.getOrder_num()%></p>
				<p><strong>작성자 : </strong><%=dto.getOrder_name()%></p>
				<p><strong>작성자 휴대폰 : </strong><%=dto.getOrder_phone()%></p>
				<p><strong>물품명 </strong><%=dto.getPro_name()%></p>
				<p><strong>판매금액 : </strong><%=dto.getPrice()%></p>
				<br>
				<br>
				<p>이미지 부분</p>
				<br>
				<br>
				<p><strong>물품 내용</strong></p>
				<p><%=dto.getPro_content()%></p>
			</div>
		</div>
	</div>
</div>
</body>
<!-- 커스텀 Jquery 파일 선언 -->
<script src="resources/js/indexJquery.js?ver=123"></script>
<script>
</script>
</html>