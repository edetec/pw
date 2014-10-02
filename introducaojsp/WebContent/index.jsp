<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Introdução jsp</title>
<%@ include file="fragmentos/head.jsp"%>
</head>
<body>
	<div class="container">
		<%@ include file="fragmentos/menu.jsp"%>

		<div class="page-header">
			<h1>
				Introdução <small>Java Server Pages <b>(JSP)</b></small>
			</h1>
		</div>

		<div class="row">
			<div class="col-md-9">
				<div class="panel panel-default">
					<div class="panel-body">
						<h2>Setting up Java Development Kit</h2>
						<p>This step involves downloading an implementation of the
							Java Software Development Kit (SDK) and setting up PATH
							environment variable appropriately.</p>
						<p>You can download SDK from Oracle's Java site: Java SE
							Downloads.</p>
						<p>Once you download your Java implementation, follow the
							given instructions to install and configure the setup. Finally
							set PATH and JAVA_HOME environment variables to refer to the
							directory that contains java and javac, typically
							java_install_dir/bin and java_install_dir respectively.</p>
						<p>If you are running Windows and installed the SDK in
							C:\jdk1.5.0_20, you would put the following line in your
							C:\autoexec.bat file.</p>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="#" class="list-group-item active">
						<h4 class="list-group-item-heading">JSP Compilation</h4>
						<p class="list-group-item-text">Quando um navegador solicita
							uma JSP, o motor JSP primeiro verifica para ver se ele precisa
							compilar a página. Se a página não foi compilado, ou se o JSP foi
							modificado desde a última compilação, o motor JSP compila a
							página.</p>
					</a> <a href="#" class="list-group-item	">
						<h4 class="list-group-item-heading">JSP Initialization</h4>
						<p class="list-group-item-text">Quando um contêiner carrega um
							JSP que chama o método jspInit () antes de reparar todos os
							pedidos. Se você precisa executar a inicialização JSP específicos
							de, substituir o método jspInit ()</p>
					</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>