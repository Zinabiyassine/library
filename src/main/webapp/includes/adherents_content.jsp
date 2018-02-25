
	
<div class="card">
  <div class="card-header">
					<h4 class="title">Les adhérents</h4>
  </div>
  <div class="card-block">
    <h4 class="card-title">Special title treatment</h4>
    <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
<div class="row">
<div class="col-md-4">
							<form >
							<div class="form-group">
								<input title="Chercher les reservations par adherent" type="text"
									class="form-control border-input" 
									placeholder="Nom de l'adherent .." />
							</div>
							</form>	
				</div>
				
				
				
				
<div class="col-md-4">
				
					<h4 class="title">Les adhérents</h4>
				</div>
				
				
					
				
				
				
					

			<div class="content">
				<table class="table table-hover">
					<thead class="thead-light">
						<tr>
							<th scope="col">#</th>
							<th scope="col">Nom</th>
							<th scope="col">Prénom</th>
							<th scope="col">Date d'inscription</th>
							<th scope="col">Date fin abonnement</th>
							<th scope="col">Email</th>
							
							<th scope="col">Statut</th>
							<th scope="col">Actions</th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="adherents">

							<tr>
								<th scope="row"><s:property value="id" /></th>
								<td><s:property value="nom" /></td>
								<td><s:property value="prenom" /></td>
								<td><s:property value="dateInscription" /></td>
								<td><s:property value="finAbonnement" /></td>
								<td><s:property value="statut" /></td>
								<td><s:property value="email" /></td>
								

								
								<s:url namespace="/" action="deleteReservation" var="trash">
									
									<s:param name="keyA">
										<s:property value="key.idAdherent" />
									</s:param> 
									<s:param name="keyL">
										<s:property value="key.idLivre"/>
									</s:param> 
								</s:url>
								
							
								<td><s:a href="%{yassine}" class="btn btn-primary btn-xs">
										<i  class="ti-pencil"></i>
									</s:a>
									<s:a href="%{trash}" class="btn btn-primary btn-xs">
										<i class="ti-trash"></i>
									</s:a>
									
									</button>
									<button type="button" class="btn btn-warning btn-xs">
										<i class="ti-na"></i>
									</button></td>
							</tr>
						</s:iterator>

					</tbody>
				</table>
				<div class="footer">
					<hr>
					<div class="chart-legend">
						<i class="fa fa-circle text-primary"></i> Editer <i
							class="fa fa-circle text-danger"></i> Supprimer <i
							class="fa fa-circle text-warning"></i> Suspendre
					</div>


				</div>
			</div>
		</div>


	
</div>
</div></div>
</div>