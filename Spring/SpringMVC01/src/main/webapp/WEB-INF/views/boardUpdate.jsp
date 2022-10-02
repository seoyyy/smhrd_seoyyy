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
		<h2>SpringMVC01</h2>
		<div class="panel panel-default">
			<div class="panel-heading">Panel Heading</div>
			<div class="panel-body">

<!--  post방식에서도 action에 boardUpdate.do?idx=${board.idx}
이렇게 쿼리스트링을 넣어주는건 문제가 되지 않았다. 
-->
				<form class="form-horizontal" action="boardUpdate.do" method="post">
				
				<input type="hidden" name="idx" value="${board.idx}">
				
					<div class="form-group">
						<label class="control-label col-sm-2" for="title">제목:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="title"
								value="${board.title}" name="title">
								<!-- placeholder는 사용자가 클릭하면 없어지는 임시값, value로바꾸면 실제 들어가잇는 값이됨.출력  -->
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="writer">작성자:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="writer"
								value="${board.writer}" name="writer" readonly="readonly">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="content">내용:</label>
						<div class="col-sm-10">
							<textarea name="content" id="content" rows="10"
								class="form-control">${board.content}</textarea>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">Submit</button>
						</div>
					</div>
			</div>
			</form>

		</div>
		<div class="panel-footer">빅데이터 한서영</div>
	</div>
	</div>

</body>
</html>