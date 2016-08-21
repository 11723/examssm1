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
<form action="addAddress" method="post">  
<input type="hidden" name="store_id" value="1"/>
first_name:<input type="text" name="first_name" /><br>
last_name:<input type="text" name="last_name" /><br>
email:<input type="text" name="email" /><br>
<input type="submit" value="ok"/>
address:<select  name="address">  
    <c:forEach items="${list}" var="u">  
        <option value="${u.address}">  
            ${u.address}  
        </option>  
    </c:forEach>  
</form>
</body>
</html>