<%@page import="org.springframework.web.context.request.RequestScope"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

恭喜你成功登录！！！
<form action="selectAddress" method="post">
<input type="submit" value="新建"/>
</form> 
<br/>
<table align="center" width="70%" border="1">
<tr>
		<th>customer_id</th>
        <th>store_id</th>
		<th>first_name</th>
		<th>last_name</th>
		<th>email</th>
		<th>address_id</th>
		<th>active</th>
		<th>create_date</th>
		<th>last_update</th>
</tr>
			<c:forEach items="${list}" var="user">
				<tr>
				<td>${user.customer_id}</td>
				<td>${user.store_id}</td>
				<td>${user.first_name}</td>
				<td>${user.last_name}</td>
				<td>${user.email}</td>
				<td>${user.address_id}</td>
				<td>${user.active}</td>
				<td>${user.create_date}</td>
				<td>${user.last_update}</td>
				</tr>

			</c:forEach>
</table>
<br>

</body>
</html>