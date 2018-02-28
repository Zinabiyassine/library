	<div class="row">
<div class="col-md-12">
		<div class="card">
			<div class="header">
			<div class="row">
				<div class="col-md-2" style="width: 4.666667%;">
				<button title="Enregistrer une reservation" type="button" class="btn btn-info btn-xs btn-fill" data-toggle="modal" id="modalup" data-target="#myModal" ><i class="ti-plus"></i></button>
				
				</div>
				<div class="col-md-4">
				
					<h4 class="title">Les réservation</h4>
				</div>
				<div class="col-md-2"></div>
				
				<div class="col-md-4">
							<form >
							<div class="form-group">
								<input title="Chercher les reservations par adherent" type="text"
									class="form-control border-input" 
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
							<th scope="col">ISBN Livre</th>
							<th scope="col">Date Reservation</th>
							<th scope="col">Date Limite</th>
							<th scope="col">Actions</th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="allReservation">

							<tr>
								<th scope="row"><s:property value="key.idAdherent" /></th>
								<td><s:property value="key.idLivre" /></td>
								<td><s:property value="dateReservation" /></td>
								<td><s:property value="dateLimite" /></td>

								
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
	
	<div class="col-md-4">
		<div class="card">
			<div class="header">
				<h4 class="title">
					Les derniers livre
				</h4>

			</div>
			<div class="content">
			<table class="table table-dark">
					<thead class="thead-light">
						<tr>
							<th scope="col">ISBN</th>
							<th scope="col">Titre</th>
							<th scope="col">Categorie</th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="allLivre">

							<tr>
								<th scope="row"><s:property value="isbn" /></th>
								<td><s:property value="titre" /></td>
								<td><s:property value="categorie" /></td>
							</tr>
						</s:iterator>

					</tbody>
				</table>
			
			</div>

		</div>
	</div>
	
	<div class="col-md-8">
		<div class="card">
			<div class="header">
				<h4 class="title">
					Les derniers reservations
				</h4>

			</div>
			<div class="content">
			<table class="table table-dark">
					<thead class="thead-light">
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Date de reservation</th>
							<th scope="col">Date de retour</th>
							<th scope="col">Livre</th>
							<th scope="col">Adherent</th>
							
						</tr>
					</thead>
					<tbody>
							<tr>
							<th >Id</th>
							<th >Date de reservation</th>
							<th >Date de retour</th>
							<th >Livre</th>
							<th >Adherent</th>
							
							</tr>
							<tr>
							<th >Id</th>
							<th >Date de reservation</th>
							<th >Date de retour</th>
							<th >Livre</th>
							<th >Adherent</th>
							
							</tr>
							<tr>
							<th >Id</th>
							<th >Date de reservation</th>
							<th >Date de retour</th>
							<th >Livre</th>
							<th >Adherent</th>
							
							</tr>
							
					</tbody>
				</table>
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
      <form action="addReservation" method="post" class="loginForm">
        <p> entrez le code du livre que vous voulez reserver</p>
        <label>code adherent</label> <input type="number" name="codeadherent" class="form-control border-input"  />
         <label>ISBN Livre</label> <input type="text" name="isbn" class="form-control border-input"  />
         
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Fermer</button>
         <button type="submit" class="btn btn-primary  btn-fill">Confirmer</button>
      </div>
      </form>
    </div>

  </div>
</div>
</div>
	</div>


