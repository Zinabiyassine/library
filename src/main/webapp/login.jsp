<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-jquery-tags" prefix="jq"%>

<%@ include file="includes/header.jsp"%>
<div class="wrapper">
	<div class="container">
		<div class="col-md-4 authen">
			<div class="search-box">
				<div class="caption">
					<h3>Autenetification</h3>
				</div>
				<form action="login" method="post" class="loginForm">
					<div class="input-group">
						<input type="text" id="mail" name="email" class="form-control"
							placeholder="email ..."> <input type="password" id="paw"
							name="pwd" class="form-control" placeholder="mot de passe ...">
						<input type="submit" id="submitValid" disabled
							class="form-control" value="Valider">
					</div>
				</form>
			</div>
		</div>
		
		<div class="col-md-6 register ">
			<div class="search-box">
				<div class="caption">
					<h3>Inscription</h3>
				</div>
				<form action="addAdherent" method="post" class="loginForm">
					<div class="row">
						<div class="col-md-3">
							<div class="form-group">
								<label>Civilité</label> <select class="form-control"
									name ="sexe" id="exampleFormControlSelect1">
									<option></option>
									<option>F</option>
									<option>H</option>
								</select>
							</div>
						</div>
						<div class="col-md-5">
							<div class="form-group">
								<label>Nom</label> <input type="text" name="nom"
									class="form-control border-input" placeholder="Dupond" />
							</div>

						</div>
						<div class="col-md-4">
							<div class="form-group">
								<label>Prénom</label> <input type="text" name="prenom"
									class="form-control border-input" placeholder="Dupond" />
							</div>
						</div>


					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="form-group">
								<label>Date de naissance</label> <input type="date" name="naissance"
									class="form-control borders-input"  />
							</div>
						</div>
						
						<div class="col-md-6">
							<div class="form-group">
								<label>Adresse mail</label> <input type="email" name="email"
									class="form-control border-input" placeholder="Dupond@exemple.fr ..." />
							</div>
						</div>

					</div>
					
					<div class="row">
					<div class="col-md-6">
							<div class="form-group">
								<label>Mot de passe</label> <input type="password" name="password" id="pwd1"
									class="form-control border-input" placeholder="mot de passe" />
							</div>
						</div>
						
						<div class="col-md-6">
							<div class="form-group">
								<label>Confirmation</label> <input type="password" name="password1" id="pwd2"
									class="form-control border-input" placeholder=" Confirmation mot de passe" />
							</div>
						</div>
					
					</div>
					
					<div class="row">
					<div class="col-md-6">
							<div class="form-group">
								<label>Telephone</label> <input type="text" name="telephone" 
									class="form-control border-input" placeholder="0769800941 " />
							</div>
						</div>
						
						<div class="col-md-6">
							<div class="form-group">
								<label>Photo</label> <input type="file" name="photo" 
									 placeholder="" />
								<small>Taille max : 1 Mo</small>
							</div>
						</div>
					</div>
					
					  <button type="submit" class="btn btn-primary  btn-fill">Valider</button>
					
				</form>
			</div>
		</div>
		<div class="col-md-1">
			<div class="aro-pswd_info">
				<div id="pswd_info">
					<h4>Au moins</h4>
					<ul>
						<li id="letter" class="invalid"><strong>Une lettre</strong></li>
						<li id="capital" class="invalid"><strong>Une lettre
								majuscule</strong></li>
						<li id="number" class="invalid"><strong>Un nombre</strong></li>
						<li id="length" class="invalid"><strong>8 characters</strong></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

</div>

<%@ include file="includes/footer.jsp"%>