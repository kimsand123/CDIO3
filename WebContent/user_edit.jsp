<%@ include file="shared/doc_type.jsp"%>
<html>
<head>
<%@ include file="shared/meta.jsp"%>
<%@ include file="shared/css.jsp"%>
<title>Rediger en bruger</title>
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
						<label for="exampleInputEmail1">Email address</label> <input
							type="email" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="Enter email"> <small
							id="emailHelp" class="form-text text-muted">We'll never
							share your email with anyone else.</small>
					</div>
					<div class="form-group">
						<label for="exampleInputPassword1">Password</label> <input
							type="password" class="form-control" id="exampleInputPassword1"
							placeholder="Password">
					</div>
					<div class="form-group form-check">
						<input type="checkbox" class="form-check-input" id="exampleCheck1">
						<label class="form-check-label" for="exampleCheck1">Check
							me out</label>
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
				<!-- CONTENT - END -->
			</div>
			<div class="col-2"></div>
		</div>
	</div>

	<%@ include file="shared/footer.jsp"%>
	<%@ include file="shared/page_js.jsp"%>

	<!-- FOR SCRIPTS THAT SHOULD ONLY BE INCLUDED ON THIS PAGE -->
	<script>
		$(function() {
		});
	</script>
</body>
</html>



