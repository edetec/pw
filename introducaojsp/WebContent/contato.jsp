<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Introdu��o jsp</title>
<%@ include file="fragmentos/head.jsp"%>
</head>
<body>
	<div class="container">
		<%@ include file="fragmentos/menu.jsp"%>

		<div class="page-header">
			<h1>Contato</h1>
		</div>

		<div class="row">
			<div class="col-md-9">
				<div class="panel panel-default">
					<div class="panel-body">
						<!-- Formul�rio -->
						<form class="form-horizontal" role="form">
							<div class="form-group">
								<label for="inputNome" class="col-sm-3 control-label">Nome completo</label>
								<div class="col-sm-9">
									<input type="text" class="form-control" id="inputNome"
										placeholder="Nome completo">
								</div>
							</div>
							<div class="form-group">
								<label for="inputEmail3" class="col-sm-3 control-label">E-mail</label>
								<div class="col-sm-9">
									<input type="email" class="form-control" id="inputEmail3"
										placeholder="E-mail">
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword3" class="col-sm-3 control-label">Senha</label>
								<div class="col-sm-9">
									<input type="password" class="form-control" id="inputPassword3"
										placeholder="Senha">
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-3 col-sm-9">
									<div class="checkbox">
										<label> <input type="checkbox" name="naumsei" value="true"> N�o sei
										</label>
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-3 col-sm-9">
									<button type="submit" class="btn btn-default">Enviar</button>
								</div>
							</div>
						</form>
						<!-- Fim do formul�rio -->
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="list-group">
					<a href="#" class="list-group-item">
						<h4 class="list-group-item-heading">JSP Compilation</h4>
						<p class="list-group-item-text">Quando um navegador solicita
							uma JSP, o motor JSP primeiro verifica para ver se ele precisa
							compilar a p�gina. Se a p�gina n�o foi compilado, ou se o JSP foi
							modificado desde a �ltima compila��o, o motor JSP compila a
							p�gina.</p>
					</a> <a href="#" class="list-group-item	 active">
						<h4 class="list-group-item-heading">JSP Initialization</h4>
						<p class="list-group-item-text">Quando um cont�iner carrega um
							JSP que chama o m�todo jspInit () antes de reparar todos os
							pedidos. Se voc� precisa executar a inicializa��o JSP espec�ficos
							de, substituir o m�todo jspInit ()</p>
					</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>