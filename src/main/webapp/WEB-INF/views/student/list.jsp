<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="/async/res/common.js"></script>
<link rel="stylesheet" href="/async/res/common.css">
</head>
<body>
	<div class="container">
		<h1>학생목록</h1>
		<div class="mb5  pull-right">
			<a class="btn btn-primary" href="create?pg=${ pagination.pg }"> <i
				class="glyphicon glyphicon-plus"></i> 학생등록
			</a>
		</div>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>id</th>
					<th>학번</th>
					<th>이름</th>
					<th>학과</th>
					<th>학년</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="student" items="${ list }">
					<tr data-url="edit?id=${student.id}">
						<td>${ student.id }</td>
						<td>${ student.studentNumber }</td>
						<td>${ student.name }</td>
						<td>${ student.departmentId }</td>
						<td>${ student.year }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
