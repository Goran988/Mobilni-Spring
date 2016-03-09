<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link
	href="${pageContext.request.contextPath }/static/bootstrap/bootstrap.min.css"
	rel="stylesheet" />
<title>Insert title here</title>
</head>
<body>
	<h2>Unesite rjec za pretragu(model, cijena ili id)</h2>
	<form method="post" action="${pageContext.request.contextPath }/searchmobilni">
	 <input name="term" type="text"> 
	 <input value="Pretrazi" type="submit">
	</form>
</body>
</html>