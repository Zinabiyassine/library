<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-jquery-tags" prefix="jq" %>

<%@ include file="includes/header.jsp" %>


<div class="wrapper">
   	<div class="row">
		<div class="col-md-4 col-md-offset-4 text-center">
			<div class="search-box">
				<div class="caption">
					<h3>Autenetification</h3>
				</div>
				<form action="index" method="post" class="loginForm">
					<div class="input-group">
						<input type="text" id="name" class="form-control" placeholder="Full Name">
						<input type="password" id="paw" class="form-control" placeholder="Password">
						<input type="submit" id="submitValid" disabled class="form-control" value="Valider">
					</div>
				</form>
			</div>
		</div>
		<div class="col-md-4">
			<div class="aro-pswd_info">
				<div id="pswd_info">
					<h4>Le mot de passe doit respecter les contraintes suivantes</h4>
					<ul>
						<li id="letter" class="invalid">Au moins <strong>une lettre</strong></li>
						<li id="capital" class="invalid">Au moins <strong>une lettre majuscule</strong></li>
						<li id="number" class="invalid">Au moins <strong>un nombre</strong></li>
						<li id="length" class="invalid">Au moins <strong>8 characters</strong></li>
					</ul>
				</div>
			</div>
		</div>
  </div>
    
</div>

    <%@ include file="includes/footer.jsp" %>