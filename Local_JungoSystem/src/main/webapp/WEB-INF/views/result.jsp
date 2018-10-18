<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
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
							<tr style="cursor: pointer;">
								<td id="" class="col-md-1">1</td>
								<td id="" class="col-md-2">20181018_123123</td>
								<td id="" class="col-md-2">김승준</td>
								<td id="" class="col-md-3">아이폰8</td>
								<td id="" class="col-md-1">80000</td>
								<td id="" class="col-md-2">거래완료</td>
							</tr>
						</tbody>
					</table>
					<div>
						<nav style="display: inline">
							<ul class="pagination">
								<li><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
								<%-- <% for(int i = 1; i<=Math.ceil(sbcount/5.0);i++) { %>
								<li><a href="/jungonara/mypagelist?sbpageNum=1&buypageNum=<%=i%>&id=<%=id %>"><%=i %></a></li>
								<!-- 페이지네이션 선언 -->
								<%} %> --%>
								<li><a href="">1</a></li>
								<li><a href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
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
							<tr style="cursor: pointer;">
								<td id="" class="col-md-1">2</td>
								<td id="" class="col-md-2">20181017_123123</td>
								<td id="" class="col-md-2">김상범</td>
								<td id="" class="col-md-3">맥북 2018년형</td>
								<td id="" class="col-md-1">250000</td>
								<td id="" class="col-md-2">거래취소</td>
							</tr>
						</tbody>
					</table>
					<div>
						<nav style="display: inline">
							<ul class="pagination">
								<li><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
								<%-- <% for(int i = 1; i<=Math.ceil(sbcount/5.0);i++) { %>
								<li><a href="/jungonara/mypagelist?sbpageNum=1&buypageNum=<%=i%>&id=<%=id %>"><%=i %></a></li>
								<!-- 페이지네이션 선언 -->
								<%} %> --%>
								<li><a href="">1</a></li>
								<li><a href="#" aria-label="Next"><span aria-hidden="true">&raquo;</span></a></li>
							</ul>
						</nav>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<!-- 커스텀 Jquery 파일 선언 -->
<script src="resources/js/mypageJquery.js?ver=1"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
</html>