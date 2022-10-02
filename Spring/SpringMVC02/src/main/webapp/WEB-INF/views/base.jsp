<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h2>SpringMVC02</h2>
		<div class="panel panel-default">
			<div class="panel-heading">Panel Heading</div>
			<div class="panel-body">

				<table class="table table-boardered table-hover">
					<thead>
						<tr>
							<td>글번호</td>
							<td>제목</td>
							<td>작성자</td>
							<td>작성일</td>
							<td>조회수</td>
						</tr>
					</thead>

					<tbody id="tbody">
						<!-- 자바코드가아닌 자바스크립트언어로 통신할거면  ajax를 사용해야함 그러려면 임포트먼저해주기  -->
<!-- table 내용  -->
					</tbody>
				</table>


			</div>
			<div class="panel-footer">빅데이터 한서영</div>
		</div>
	</div>
	
	<script src="resources/js/board.js"></script>
	<script type="text/javascript">
	
			
	</script>

</body>
</html>