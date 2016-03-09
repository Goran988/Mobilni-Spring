<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post"
		action="${pageContext.request.contextPath }/docreate">
		<table>
			<tr>
				<td>Model</td>
				<td><input name="model" type="text"></td>
			</tr>
			<tr>
				<td>Procesor</td>
				<td><input name="procesor" type="text"></td>
			</tr>
			<tr>
				<td>Ram</td>
				<td><input name="ram" type="text"></td>
			</tr>
			<td>Cijena</td>
			<td><input name="cijena" type="text"></td>
			<tr>
			<td><input value="Dodaj mobilni" type="submit" /></td>
			</tr>
		</table>
	</form>

</body>
</html>