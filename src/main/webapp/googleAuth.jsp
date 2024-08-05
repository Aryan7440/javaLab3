<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- <script src="https://apis.google.com/js/platform.js" async defer></script> -->
<script src="https://accounts.google.com/gsi/client" async defer></script>
<meta name="google-signin-scope" content="profile email">
<meta name="google-signin-client_id"
     content="252000350233-0cvkfqu7m9daj4u7mrnj7cuvt266leno.apps.googleusercontent.com">

<title>Servlet OAuth example</title>
</head>
<body>
	<h2>Servlet OAuth </h2>
	<br>
	<div class="g_id_signin" ></div>
    <div id="g_id_onload"
     data-client_id="252000350233-0cvkfqu7m9daj4u7mrnj7cuvt266leno.apps.googleusercontent.com"
     data-callback="handleCredentialResponse">
    </div>
    <!-- <div class="g-signin2" data-onsuccess="handleCredentialResponse"></div> -->

	<script>
	function handleCredentialResponse(response) {
    console.log('ID: ' + response.credential);

    //do not post above info to the server because that is not safe.
    //just send the id_token

    var redirectUrl = 'GoogleCallbackServlet';
    //using jquery to post data dynamically
    var form = $('<form action="' + redirectUrl + '" method="post">' +
                    '<input type="text" name="id_token" value="' +
                    response.credential + '" />' +
                '</form>');
    $('body').append(form);
    form.submit();
}

	</script>
</body>
</html>