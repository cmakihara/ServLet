
<%@page import="java.time.LocalDateTime"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EX1e</title>
</head>
<body>	
	<!--  Scriplet -->
	<%out.println("<p>Univel</p> " + request.getRemoteAddr()); %>
	
	<!--  Declaration -->
	</br>
	<%!String texto1 = "Univel";
	   String texto2 = "2018";	
	%>
	</br>
	<%out.println(texto1 + " " + texto2); %>
	
	</br>
	<!--  Expression -->
	<%! String dataHoje = LocalDateTime.now().toString(); %>
	<p>
	Data: <%=dataHoje %>
	
	</p>
	<% System.out.println("TESTE !!!"); %>
	
	
	
<%-- 	<jsp:scriplet> --%>
<!-- 		out.println("Univel"); -->
<%-- 	</jsp:scriplet> --%>
	
</body>
</html>