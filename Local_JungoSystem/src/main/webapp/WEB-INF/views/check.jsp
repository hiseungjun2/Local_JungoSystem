<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<div class="container">
	<div id="basic_table">
		<div class="container-body">
			<h2>검토내역</h2>
			<!----------------------------------------------------테이블 생성----------------------------------------------->
			<div>
				<table id="notice" class="table table-striped table-hover">
					<thead>
						<tr>
							<td class="col-md-1">번호</td>
							<td class="col-md-2">주문번호</td>
							<td class="col-md-2">물품명</td>
							<td class="col-md-1">진행상태</td>
							<td class="col-md-5">메모</td>
						</tr>
					</thead>
					<tbody>
						<tr style="cursor: pointer;">
							<td id="" class="col-md-1">1</td>
							<td id="" class="col-md-2">20181018_121324</td>
							<td id="" class="col-md-2">아이폰8</td>
							<td id="" class="col-md-1">진행중</td>
							<td id="" class="col-md-5">11시에 댁으로 찾으러 갑니다</td>
						</tr>
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
<script src="js/homeJquery.js?ver=1"></script>
<script src="js/bootstrap.min.js"></script>
</body>
</html>