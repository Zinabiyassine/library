<div class="row">
<div class="col-md-12">
		<div class="card">
			<div class="header">
				<h4 class="title">
						Les Reservations 
						<div style="margin-left:98%">
						
						<button type="button" class="btn btn-warning btn-xs" >
										<i class="ti-plus"></i>
									</button> 
					</div>
				</div>
				</h4>
				
					

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
										<i class="ti-pencil"></i>
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
</div>
	</div>


