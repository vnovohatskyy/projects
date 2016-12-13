<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show All Subjects</title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>id</th>
                <th>name</th>
                <th>subjectType</th>
                <th>course</th>
                <th colspan="2">action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${subjects}" var="subject">
                <tr>
                    <td><c:out value="${subject.id}" /></td>
                    <td><c:out value="${subject.name}" /></td>
                    <td><c:out value="${subject.type}" /></td>
                    <td><c:out value="${subject.course}" /></td>
                    <td><a
                        href="SubjectController.do?action=edit&id=<c:out value="${subject.id }"/>">Update</a></td>
                    <td><a
                        href="SubjectController.do?action=delete&id=<c:out value="${subject.id }"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p>
        <a href="SubjectController.do?action=insert">Add Subject</a>
    </p>
</body>
</html>