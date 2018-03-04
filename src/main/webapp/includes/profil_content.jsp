<div class="row">
	<div class="col-lg-4 col-md-5">
		<div class="card card-user">
			<div class="image">
				<img src="assets/img/background.jpg" alt="..." />
			</div>
			<div class="content">
				<div class="author">
					<img class="avatar border-white"
						src="<s:property value='#session.path'/>" alt="..." />
					<h4 class="title">
						<s:property value='nom' />
						<s:property value='prenom' />
						<br />
					</h4>
				</div>
			</div>
			<s:if test="%{#session['statut']==2}">
				<div class="text-center">
					<h3>Mes reservations</h3>
				</div>
				<hr>
				<div class="text-center">
					<div class="row">
						<div class="col-md-3 col-md-offset-1">
							<h5>
								<s:property value='reservations' />
								<br /> <small class="label label-primary">En cours</small>
							</h5>
						</div>
						<div class="col-md-4">
							<h5>
								<s:property value='retard' />
								<br /> <span class="label label-warning">Retard</span>
							</h5>
						</div>
						<div class="col-md-3">
							<h5>
								<s:property value='history' />
								<br /> <small class="label label-success">Archives</small>
							</h5>
						</div>
					</div>
				</div>
			</s:if>
		</div>

	</div>
	<div class="col-lg-8 col-md-7">
		<div class="card">
			<div class="header">
				<h4 class="title">Editer mon profil</h4>
			</div>
			<div class="content">
				<form action="updateProfil" method="POST">
					<div class="row">

						<div class="col-md-2">
							<div class="form-group">
								<label>Civilité</label> <input type="text"
									class="form-control border-input" disabled name="sexe"
									placeholder="sexe" value="<s:property value='sexe'/>">
							</div>
						</div>
						<div class="col-md-3	">
							<div class="form-group">
								<label>Nom</label> <input type="text"
									class="form-control border-input" placeholder="Dupond"
									name="nom" value="<s:property value='nom'/>">
							</div>
						</div>
						<div class="col-md-3">
							<div class="form-group">
								<label>Prénom</label> <input type="text"
									class="form-control border-input" placeholder="David"
									name="prenom" value="<s:property value='prenom'/>">
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> <input
									type="email" class="form-control border-input" name="email"
									placeholder="Email" value="<s:property value='email'/>">
							</div>
						</div>
					</div>
					<s:if test="%{#session['statut']==2}">
						<div class="row">
						
							<div class="col-md-6">
								<div class="form-group">
									<label>Date d'inscription</label> <input type="text"
										class="form-control border-input" disabled name="create"
										placeholder="inscription" value="<s:property value='create'/>">
								</div>
							</div>

							<div class="col-md-6">
								<div class="form-group">
									<label>Fin abonnement</label> <input type="text"
										class="form-control border-input" disabled
										name="finAbonnement" placeholder="Last Name"
										value="<s:property value='finAbonnement'/>">
								</div>
							</div>
						</div>
					</s:if>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<label>Addresse </label> <input type="text" name="adresse"
									class="form-control border-input" placeholder="Home Address"
									value="<s:property value='adresse'/>">
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-md-7">
							<div class="form-group">
								<label>Photo</label> <input type="file"
									class="form-control-file" id="exampleInputFile"
									aria-describedby="fileHelp" name="photo" value="test.png">
								<small id="fileHelp" class="form-text text-muted">
									Limité à 2 Mo .</small>
							</div>
						</div>

						<div class="col-md-5">
							<div class="form-group">
								<label>Mot de passe</label> <input type="password"
									class="form-control border-input"
									value="<s:property value='password'/>" name="password"
									placeholder="mot de passe">
							</div>
						</div>
					</div>


					<div class="text-right">
						<button type="submit" class="btn btn-info btn-fill ">Valider</button>
					</div>
					<div class="clearfix"></div>
				</form>
			</div>
		</div>
	</div>


</div>
</div>
</div>
