/**
 * 
 */

$(document).ready(function(){
	
	$("#LoginForm").submit(function() {
		var username = $('#usernameField').val();
		var password = $('#passwordField').val();
		alert("username: " + username + "\n" + "password: " + password);
	})
	
})