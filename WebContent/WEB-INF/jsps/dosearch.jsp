<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="mobilni" items="${list2}">
    ID: ${mobilni.id}<br />
    Model: ${mobilni.model}<br />
    Procesor: ${mobilni.procesor}<br />
    Ram: ${mobilni.ram} <br />
    Cijena: ${mobilni.cijena} <br />
	</c:forEach>
</body>
</html>