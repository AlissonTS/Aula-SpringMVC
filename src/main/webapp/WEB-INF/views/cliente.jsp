<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Insert title here</title>
</head>
<body>
		<form action="adicionarClientes">
			<label for="nome">Nome:</label>
  			<input type="text" name="nome" id="nome"><br>
  			
  			<label for="ruaNroComp">Rua - Complemento:</label>
  			<input type="text" name="ruaNroComp" id="ruaNroComp"><br>
  			
  			<label for="bairro">Bairro:</label>
  			<input type="text" name="bairro" id="bairro"><br>
  			
  			<label for="cidade">Cidade:</label>
  			<input type="text" name="cidade" id="cidade"><br>
  			
  			<input type="submit" value="Adicionar">
		</form>
		
		<h2>Lista de Clientes</h2>
		
		<table border="1" style="width:100%">
		  <tr>
		  	<td>Código</td>
		    <td>Nome</td>
		    <td>Rua/Complemento</td> 
		    <td>Bairro</td>
		    <td>Cidade</td>
		    <td>Remover</td>
		  </tr>
		  <c:forEach var="cliente" items="${clientes}"> 
			  <tr>	
			  		<td>${cliente.codigo}</td>	
			    	<td>${cliente.nome}</td>
			    	<td>${cliente.ruaNroComp}</td>
			    	<td>${cliente.bairro}</td>
			    	<td>${cliente.cidade}</td>
			    	<td><a href="remover?codigo=${cliente.codigo}" title="Remover Cliente">Remover Cliente</a></td>
			  </tr>
		  </c:forEach>
		</table>	
	</body>
</html>