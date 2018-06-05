<html>
<head>
<%@ taglib uri="https://journaldev.com/jsp/tlds/customTag" prefix="ct"%>
</head>
<body>
<h1>Cadastro de pessoas</h1>
<form action="servlet_req" method="POST">
	Nome: <input type="text" name="nome"/>	
	Sobrenome: <input type="text" name="sobrenome"/>	
	<ct:customTag visible="true"/>
</form>




<!-- <form action="servlet_req" method="GET"> -->
<!-- 	<h1>GET</h1> -->
<!-- 	Login: <input type="text" name="login"/>	 -->
<!-- 	Senha: <input type="password" name="password"/>	 -->
<!-- 	<input type="submit" name="Entrar"/>	 -->
<!-- </form> -->

</body>

</html>
