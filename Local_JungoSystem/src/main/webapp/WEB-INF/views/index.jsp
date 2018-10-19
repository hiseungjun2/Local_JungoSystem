<%@page import="com.gntech.dto.orderDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<%
	List<orderDTO> list = (List)request.getAttribute("list");
%>
<div class="container">
	<div id="basic_table">
		<div class="container-body">
			<h2>신청내역</h2>
			<!----------------------------------------------------테이블 생성----------------------------------------------->
			<div>
				<table id="index" class="table table-striped table-hover">
					<thead>
						<tr>
							<td class="col-md-1">번호</td>
							<td class="col-md-2">주문번호</td>
							<td class="col-md-5">물품명</td>
							<td class="col-md-2">판매자 이름</td>
							<td class="col-md-1">가격</td>
						</tr>
					</thead>
					<tbody>
					<%for (orderDTO dto : list) { %>
						<tr style="cursor: pointer;">
							<td id="<%=dto.getId() %>" class="col-md-1"><%=dto.getId() %></td>
							<td id="<%=dto.getId() %>" class="col-md-2"><%=dto.getOrder_num() %></td>
							<td id="<%=dto.getId() %>" class="col-md-5"><%=dto.getPro_name() %></td>
							<td id="<%=dto.getId() %>" class="col-md-2"><%=dto.getOrder_name() %></td>
							<td id="<%=dto.getId() %>" class="col-md-1"><%=dto.getPrice() %></td>
						</tr>
					<% } %>
					</tbody>
				</table>
			</div>
			<!---------------------------------------------------------------------------------------------------------------------->
			<!----------------------------------------------------페이지네이션 선언----------------------------------------------->
			<div>
				<nav>
					<ul class="pagination">
						<li><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
						<li><a href="">1</a></li>
						<li><a href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
					</ul>
				</nav>
			</div>
			<!------------------------------------------------------------------------------------------------------------>
		</div>
	</div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="resources/js/indexJquery.js?ver=12"></script>
<script src="resources/js/bootstrap.min.js"></script>
</body>
</html>