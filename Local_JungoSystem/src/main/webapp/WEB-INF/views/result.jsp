<%@page import="com.gntech.dto.orderDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<%
	List<orderDTO> list = (List)request.getAttribute("list");
%>
<body>
	<div class="container">
		<div id="basic_table">
			<div class="container-body">
				<div id="buyDiv">
					<h2>완료내역</h2>
					<table id="buy" class="table table-striped table-hover">
						<thead>
							<tr>
								<td class="col-md-1">번호</td>
								<td class="col-md-2">주문번호</td>
								<td class="col-md-2">판매자</td>
								<td class="col-md-3">품목명</td>
								<td class="col-md-1">가격</td>
								<td class="col-md-2">상태</td>
							</tr>
						</thead>
						<tbody>
						<% for(orderDTO dto : list) { 
								if (dto.getStatus().equals("거래완료")) {%>
							<tr style="cursor: pointer;">
								<td id="<%=dto.getId() %>" class="col-md-1"><%=dto.getId() %></td>
								<td id="<%=dto.getId() %>" class="col-md-2"><%=dto.getOrder_num() %></td>
								<td id="<%=dto.getId() %>" class="col-md-2"><%=dto.getOrder_name() %></td>
								<td id="<%=dto.getId() %>" class="col-md-3"><%=dto.getPro_name() %></td>
								<td id="<%=dto.getId() %>" class="col-md-1"><%=dto.getPrice() %></td>
								<td id="<%=dto.getId() %>" class="col-md-2"><%=dto.getStatus() %></td>
							</tr>
							<% }
								} %>
						</tbody>
					</table>
					<div>
						<nav style="display: inline">
							<ul class="pagination">
								<li><a href="#" aria-label="Previous"><span
										aria-hidden="true">&laquo;</span></a></li>
								<%-- <% for(int i = 1; i<=Math.ceil(sbcount/5.0);i++) { %>
								<li><a href="/jungonara/mypagelist?sbpageNum=1&buypageNum=<%=i%>&id=<%=id %>"><%=i %></a></li>
								<!-- 페이지네이션 선언 -->
								<%} %> --%>
								<li><a href="">1</a></li>
								<li><a href="#" aria-label="Next"><span
										aria-hidden="true">&raquo;</span></a></li>
							</ul>
						</nav>
					</div>
				</div>
				<div id="sbDiv">
					<h2>취소내역</h2>
					<table id="sb" class="table table-striped table-hover">
						<thead>
							<tr>
								<td class="col-md-1">번호</td>
								<td class="col-md-2">주문번호</td>
								<td class="col-md-2">판매자</td>
								<td class="col-md-3">품목명</td>
								<td class="col-md-1">가격</td>
								<td class="col-md-2">상태</td>
							</tr>
						</thead>
						<tbody>
							<% for(orderDTO dto : list) { 
								if (dto.getStatus().equals("거래취소")) {%>
							<tr style="cursor: pointer;">
								<td id="<%=dto.getId() %>" class="col-md-1"><%=dto.getId() %></td>
								<td id="<%=dto.getId() %>" class="col-md-2"><%=dto.getOrder_num() %></td>
								<td id="<%=dto.getId() %>" class="col-md-2"><%=dto.getOrder_name() %></td>
								<td id="<%=dto.getId() %>" class="col-md-3"><%=dto.getPro_name() %></td>
								<td id="<%=dto.getId() %>" class="col-md-1"><%=dto.getPrice() %></td>
								<td id="<%=dto.getId() %>" class="col-md-2"><%=dto.getStatus() %></td>
							</tr>
							<% }
								} %>
						</tbody>
					</table>
					<div>
						<nav style="display: inline">
							<ul class="pagination">
								<li><a href="#" aria-label="Previous"><span
										aria-hidden="true">&laquo;</span></a></li>
								<%-- <% for(int i = 1; i<=Math.ceil(sbcount/5.0);i++) { %>
								<li><a href="/jungonara/mypagelist?sbpageNum=1&buypageNum=<%=i%>&id=<%=id %>"><%=i %></a></li>
								<!-- 페이지네이션 선언 -->
								<%} %> --%>
								<li><a href="">1</a></li>
								<li><a href="#" aria-label="Next"><span
										aria-hidden="true">&raquo;</span></a></li>
							</ul>
						</nav>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<!-- 커스텀 Jquery 파일 선언 -->
<script src="resources/js/resultJquery.js?ver=1"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
</html>