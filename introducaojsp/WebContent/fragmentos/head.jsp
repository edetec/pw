
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="css/bootstrap-theme.min.css">

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="js/bootstrap.min.js"></script>

<script type="text/javascript">
	function atualizarRelogio() {
		var data = new Date();
		$('#relogio').text(data.toLocaleTimeString());
	}

	function ativarItemDoMenu(){
		$('#menu li a').each(function(chave,elemento){
			if(location.href == elemento.href ){
				$(elemento.parentElement).addClass('active');
			}
		})
	}
	
	$(function() {
		setInterval(atualizarRelogio, 1000);
		
		ativarItemDoMenu();
	})
</script>