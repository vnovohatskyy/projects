<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Add New Subject</title>
</head>
<body>
	<form action="SubjectController.do" method="post">
		<fieldset>
			<div>
				<label for="id">id</label> <input type="text" name="id"
					value="<c:out value="${subject.id}" />" placeholder="id" />
			</div>
			<div>
				<label for="name">name</label> <input type="text" name="name"
					value="<c:out value="${subject.name}" />" placeholder="name" />
			</div>
			<div>
				<label for="subjectType">type</label> 
				<select name="type">
						<option value="LECTURE">lecture</option>
						<option value="SEMINAR">seminar</option>
						<option value="PRACTICE">practice</option>
						<option value="LAB">lab</option>
				</select>
			</div>
			<div>
				<label for="course">course</label> <select name="course">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
			</div>
			<div>
				<input type="submit" value="Submit" />
			</div>
		</fieldset>
	</form>
</body>
</html>