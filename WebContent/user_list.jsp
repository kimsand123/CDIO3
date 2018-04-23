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
			<div class="col-2">col1</div>
			<div class="col-8">
				<!-- CONTENT - START -->
<div class="container">
		<div class="row">
			<div class="col-2"></div>
			<div class="col-8">

				<h1>Rediger en bruger</h1>

				<div class="alert alert-success" role="alert">This is a
					success alert check it out!</div>
				<div class="alert alert-danger" role="alert">This is a danger
					alert check it out!</div>




				<table class="table table-hover">
					<thead>
						<tr>
							<th scope="col">BrugerID</th>
							<th scope="col">BrugerNavn</th>
							<th scope="col">Roller</th>
							<th scope="col">Fornavn</th>
							<th scope="col">Efternavn</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>123123</td>
							<td>Mark</td>
							<td>Kok</td>
							<td>Hanne</td>
							<td>Madsen</td>
						</tr>
						<tr>
							<td>123123</td>
							<td>Mark</td>
							<td>Kok</td>
							<td>Hanne</td>
							<td>Madsen</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-2"></div>
		</div>
	</div>
				<!-- CONTENT - END -->
			</div>
			<div class="col-2">col3</div>
		</div>
	</div>

	<%@ include file="shared/footer.jsp"%>
	<%@ include file="shared/page_js.jsp"%>

	<script>
	
	
	
		$(function() {

			alert("hej");
			});
	
	</script>
</body>
</html>