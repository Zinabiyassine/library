<div class="card">
			<div class="header">
				<div class="row">
					<div class="col-md-2" style="width: 4.666667%;">
						<button title="Enregistrer une reservation" type="button"
							class="btn btn-info btn-xs btn-fill" data-toggle="modal" id="modalup" data-target="#myModal">
							<i class="ti-plus"></i>
						</button>

					</div>
					<div class="col-md-4">

						<h4 class="title">Les adherents</h4>
					</div>
					<div class="col-md-2"></div>

					<!-- <div class="col-md-4">
						<form>
							<div class="form-group">
								<input title="Chercher les reservations par adherent"
									type="text" class="form-control border-input"
									placeholder="Nom de l'adherent .." />
							</div>
						</form>
					</div> -->


				</div>




				<div class="content">
					<table class="table table-hover">
						<thead class="thead-light">
							<tr>
								<th scope="col">#</th>
								<th scope="col">Nom-Prénom</th>
								<th scope="col">Date d'inscription</th>
								<th scope="col">Identifiant</th>
								<th scope="col">Date fin abonnement</th>
								<th scope="col">Actions</th>
							</tr>
						</thead>
						<tbody>
							<s:iterator value="allAdherent">

								<tr>
									<th style="width: 5%">
										<img style="max-width: 147%;border-radius: 50%;" src="<s:property value="photo" />">	
									
									</th>
									<td><s:property value="nom" /> <s:property value="prenom" /></td>
									<td><s:property value="dateInscription"/></td>
									<td><s:property value="id"/></td>
									<td><s:property value="finAbonnement"/></td>

									<s:url namespace="/" action="addReservationbyadherent" var="trash">

										<s:param name="isbn">
											<s:property value="isbn" />
										</s:param>
									</s:url>


									<td>
									<div class="dropdown">
                                  <button class="btn btn-info btn-m btn-fill dropdown-toggle" type="button" 
                                  data-toggle="dropdown">Action
                                  </button>
                                  <ul class="dropdown-menu">
                                  <s:url namespace="/" action="deleteAdherent"
										var="delete">

										<s:param name="codeadherent">
											<s:property value="id" />
										</s:param>

									</s:url>
                                      <li><s:a href="%{delete}"><i class="ti-trash"></i>Supprimer</s:a></li>
                                    
                                  </ul>
                                </div>
									</td>
								</tr>
							</s:iterator>

						</tbody>
					</table>
					<div class="footer">
						<hr>
					</div>
				</div>
			</div>


		</div>

	<div id="myModal" class="modal fade" role="dialog" >
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Inscription</h4>
      </div>
      <div class="modal-body">
			<form action="addAdherent" method="post" class="loginForm">
					<div class="row">
						<div class="col-md-3">
							<div class="form-group">
								<label>Civilité</label> <select required class="form-control"
									name ="sexe" id="exampleFormControlSelect1">
									<option></option>
									<option>F</option>
									<option>H</option>
								</select>
							</div>
						</div>
						<div class="col-md-5">
							<div class="form-group">
								<label>Nom</label> <input required type="text" name="nom"
									class="form-control border-input" placeholder="Dupond" />
							</div>

						</div>
						<div class="col-md-4">
							<div class="form-group">
								<label>Prénom</label> <input required type="text" name="prenom"
									class="form-control border-input" placeholder="Dupond" />
							</div>
						</div>


					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<label>Adresse mail</label> <input required type="email" name="email"
									class="form-control border-input" placeholder="Dupond@exemple.fr ..." />
							</div>
						</div>

					</div>
					
					<div class="row">
					<div class="col-md-6">
							<div class="form-group">
								<label>Mot de passe</label> <input required type="password" name="password" id="pwd1"
									class="form-control border-input" placeholder="mot de passe" />
							</div>
						</div>
						
						<div class="col-md-6">
							<div class="form-group">
								<label>Confirmation</label> <input  required type="password" name="password1" id="pwd2"
									class="form-control border-input" placeholder=" Confirmation mot de passe" />
							</div>
						</div>
					
					</div>
					
					<div class="row">
					<div class="col-md-6">
							<div class="form-group">
								<label>Telephone</label> <input required type="text" name="telephone" 
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
					 <div class="modal-footer">
					  <button type="submit" class="btn btn-primary  btn-fill">Valider</button>
     				 </div>
					
				</form>
      </div>
     
    </div>

  </div>
</div>

</div>
</div>