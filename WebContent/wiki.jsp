<%@ include file="shared/doc_type.jsp"%>
<html>
<head>
<%@ include file="shared/meta.jsp"%>
<%@ include file="shared/css.jsp"%>
<title>Operatør Login</title>
</head>
<body>
	<%@ include file="shared/header.jsp"%>

	<div class="container">
		<div class="row">
			<div class="col-2"></div>
			<div class="col-8">
				<!-- CONTENT - START -->
				
				<style>
				h1{margin-top: 2rem;}
				h2{font-size: 1.2rem;}
				
				</style>
				
				
				<p>
				Tænkte vi her på siden kunne smide de elementer som vi bruger - så vi får et 
				ensartet udseende på siden!? - What you say?
				
				</p>
				
				<h1>UI ting</h1>
				
				
				<p>Her kan I slå andre elementer op: <a target="_blank" href="https://getbootstrap.com/docs/4.1/components/alerts/">https://getbootstrap.com/docs/4.1/components/alerts/</a></p>
				

				<h2>Besked for OK</h2>
				<div class="alert alert-success" role="alert">This is a uccess alert check it out!</div>
				
				<h2>Besked for fejl</h2>
				<div class="alert alert-danger" role="alert">This is adanger alert check it out!</div>
	
				<h2>Knap</h2>
				<button type="button" class="btn btn-primary">Log ind</button>
				<div>Flere knapper her: <a href="https://getbootstrap.com/docs/4.1/components/buttons/" target="_blank">Bootstrap: Knapper</a></div>

				
				<h1>Endpoints so far</h1>
				<div><a href="rest/user" target="_blank">/rest/user</a>: Operationer på 1 user</div>				
				<div><a href="rest/users" target="_blank">/rest/users</a>: Operationer på flere users</div>
				
				<!-- CONTENT - END -->
			</div>
			<div class="col-2"></div>
		</div>
	</div>

	<%@ include file="shared/footer.jsp"%>
	<%@ include file="shared/page_js.jsp"%>

	<!-- FOR SCRIPTS THAT SHOULD ONLY BE INCLUDED ON THIS PAGE -->
	<script>
		$(function() {});	
	</script>
</body>
</html>