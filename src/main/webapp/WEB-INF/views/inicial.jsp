<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content -Type" content="text/html; charset=UTF-8">
<link href="/css/inicial.css" rel="stylesheet" type="text/css"/>
<title>Cervejeiros</title>
</head>

<body>
	<nav> 
	<a href="Cervejeiros/">Inicial</a> 
	<a href="cadastro.jsp">Cadastro</a>
	<a href="eventos.jsp">Eventos</a>
	<a href="lances.jsp">Lances</a>
	<a href="discussões.jsp">Discussões</a>
	</nav>
	
	<section>

	<table id="tabela">
		<thead id="headTabela">
			<tr>
				<th>Assunto</th>
				<th>Tipo</th>
				<th>Criador</th>
				<th>Data</th>
				<th>Mensagens</th>
			</tr>
		</thead>
		<tbody id="bodyTabela">
			<c:forEach items="${lista.lances}" var="forum">
				<tr>
					<td>${forum.assunto}</td>
					<td>${forum.tipo}</td>
					<td>${forum.pessoa.nome}</td>
					<td>${forum.data}</td>
					<td>${forum.mensagem}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	</section>

	<aside>
	<h1>Anúncios</h1>
	</aside>


</body>
</html>