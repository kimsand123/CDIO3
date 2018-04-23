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

				<form>
					<div class="form-group">
						<label for="username">Brugernavn</label> <input type="text"
							class="form-control" id="username"
							placeholder="Indtast brugernavn">
					</div>
					<div class="form-group">
						<label for="password">Kode</label> <input type="password"
							class="form-control" id="password" placeholder="Indtast din kode">
					</div>

					<button type="button" id="btnSubmit" class="btn btn-primary">Log
						ind</button>
				</form>
				<!-- CONTENT - END -->
			</div>
			<div class="col-2"></div>
		</div>
	</div>

	<%@ include file="shared/footer.jsp"%>
	<%@ include file="shared/page_js.jsp"%>

	<script>
		$(function() {

			var btnSubmit = $("#btnSubmit");

			btnSubmit.on("click", function() {

				var uid = $("#username").val();
				var pw = $("#password").val();

				alert("Du skrev: " + uid + " og: " + pw);

			});
		});
	</script>
</body>
</html>