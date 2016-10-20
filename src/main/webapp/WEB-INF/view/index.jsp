<!DOCTYPE html>
<html>
<head>
 <!-- Compiled and minified CSS -->

  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
   <link rel="stylesheet" href="resources/style.css">
<meta charset="ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>
<div class="mainDiv">
<div>
<div class="top"><img src = "resources/logo.png"  alt = "LOGO" id = "logo"></div>
<div class = "header"><h1>STUDENT MANAGEMENT SYSTEM</h1></div>
</div>
<div class="menu">
<br><br><br>
<div class="card-panel teal lighten-2"><a class="waves-effect orange lighten-2 hoverable btn" href = "add"><big>User-Registration</big></div></a>	
<div class="card-panel teal lighten-2"><a class="waves-effect orange lighten-2 hoverable btn" href = "list"><big>List-User</big></a></div>	
</div>
<br><br>
 <div class="row" id="aligning">
    <form class="col s12">
      <div class="row">
        <div class="input-field col s6">
          <input placeholder="First Name" id="first_name" type="text" class="validate">
          <label for="first_name">First Name</label>
        </div>
        <div class="input-field col s6">
          <input placeholder="Last Name" id="last_name" type="text" class="validate">
          <label for="last_name">Last Name</label>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <input disabled value="I am not editable" id="disabled" type="text" class="validate">
          <label for="disabled">Disabled</label>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <input id="telephone" type="number" class="validate">
          <label for="password">Contact-Number</label>
        </div>
      </div>
      <div class="row">
        <div class="input-field col s12">
          <input id="email" type="email" class="validate">
          <label for="email">Email</label>
        </div>
      </div>
    </form>
  </div>
</div>
</div>
		<script>
	$(document).ready(function(){
		console.log("Hello");
		$('#userReg').click(function(event){
			var myFirstName = $('#first_name').val();
			var myLastName = $('#last_name').val();
			var contact = $('#telephone').val();
			var email = $('#email').val();
			console.log(myFirstName);
			console.log(myLastName);
			console.log(contact);
			console.log(email);
			var myObj = {fname:myFirstName,lname:myLastName,phone:contact,mail:email};
			console.log(myObj);
			event.preventDefault();
			//window.location.href = "http://localhost:8080/CTOCapabilities/add";
		});
	});
	</script>
</body>
</html>