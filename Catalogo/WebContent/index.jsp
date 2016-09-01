<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/message.css">
<script type="text/javascript">
	function verificaConteudo(){
		document.getElementById('submit').disabled = false;
	}
</script>
</head>
<body>
<form action="EnviarCatalogo" method="post" enctype="multipart/form-data">
	<h1><center>Catálogo</center></h1>
	<table>
		<tr>
			<c:if test="${requestScope.message != null}">
				<td class="my-notify-success">
  					<c:out value="${requestScope.message}" />
  				</td>
  			</c:if>
  			<c:if test="${requestScope.messageError != null}">
				<td class="my-notify-error">
  					<c:out value="${requestScope.messageError}" />
  				</td>
  			</c:if>
  		</tr>
  		</table>
  	<table>
		<tr>
			<td>Faça upload da sua planilha: </td><td><input id="file" type="file" onchange="verificaConteudo()" name="file" size=60/>
		</tr>
		<tr>
			<td><input type="submit" id="submit" disabled value="Upload"/></td>
		</tr>
	</table>
		
</form>
</body>
</html>