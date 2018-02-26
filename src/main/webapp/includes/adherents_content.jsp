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

					<div class="col-md-4">
						<form>
							<div class="form-group">
								<input title="Chercher les reservations par adherent"
									type="text" class="form-control border-input"
									placeholder="Nom de l'adherent .." />
							</div>
						</form>
					</div>


				</div>




				<div class="content">
					<table class="table table-hover">
						<thead class="thead-light">
							<tr>
								<th scope="col">#</th>
								<th scope="col">Nom-Prénom</th>
								<th scope="col">Date de naissance</th>
								<th scope="col">Date d'inscription</th>
								<th scope="col">Statut</th>
								<th scope="col">Date fin abonnement</th>
								<th scope="col">Actions</th>
							</tr>
						</thead>
						<tbody>
							<s:iterator value="allAdherent">

								<tr>
									<th scope="row"><s:property value="id" /></th>
									<td><s:property value="nom" /> <s:property value="prenom" /></td>
									<td><s:property value="dateNaissance" /></td>
									<td><s:property value="dateInscription"/></td>
									<td><s:property value="statut"/></td>
									<td><s:property value="finAbonnement"/></td>

									<s:url namespace="/" action="deleteReservation" var="trash">

										<s:param name="keyA">
											<s:property value="key.idAdherent" />
										</s:param>
										<s:param name="keyL">
											<s:property value="key.idLivre" />
										</s:param>
									</s:url>


									<td>
									<div class="dropdown">
                                  <button class="btn btn-info btn-m btn-fill dropdown-toggle" type="button" 
                                  data-toggle="dropdown">Action
                                  </button>
                                  <ul class="dropdown-menu">
                                      <li><a href="#"><i class="ti-trash"></i>  Supprimer</a></li>
                                      <li><a href="#"><i class="ti-pencil"></i> Editer</a></li>
                                    
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
        <h4 class="modal-title">Modal Header</h4>
      </div>
      <div class="modal-body">
        <p>dir li bghitti hnna</p>
       
						
						
						

      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>

</div>
</div>