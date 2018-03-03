<div class="col-md-12">
		<div class="card">
			<div class="header">
			
				<div class="col-md-4">
				
					<h4 class="title">Les réservation</h4>
					<hr/>
				</div>
				<div class="col-md-2"></div>
				
				<!-- <div class="col-md-4">
							<form >
							<div class="form-group">
								<input title="Chercher les reservations par adherent" type="text"
									class="form-control border-input" 
									placeholder="Nom de l'adherent .." />
							</div>
							</form>	
				</div> -->
					
				
				</div>
				
				
					

			<div class="content">
				<table class="table table-hover">
					<thead class="thead-light">
						<tr>
							<th scope="col">ISBN Livre</th>
							<th scope="col">Date Reservation</th>
							<th scope="col">Date Limite</th>
							<th scope="col">Actions</th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="allReservationAdherent">
										<s:url namespace="/" action="displayadherent" var="infoadherent">
										<s:param name="adhrentid">
											<s:property value="key.idAdherent" />
										</s:param>

									</s:url>
							<tr>
								
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
								<s:url namespace="/" action="prolongerRes" var="prol">
									
									<s:param name="keyA">
										<s:property value="key.idAdherent" />
									</s:param> 
									<s:param name="keyL">
										<s:property value="key.idLivre"/>
									</s:param> 
								</s:url>
							
								<td>
								<div class="dropdown">
                                  <button class="btn btn-info btn-m btn-fill dropdown-toggle" type="button" 
                                  data-toggle="dropdown">Action
                                  </button>
                                  <ul class="dropdown-menu">
                                      <li><s:a href="%{prol}" class="btn btn-primary btn-xs">
										<i  class="ti-time"></i> Prolonger(7 jours)
									</s:a></li>
                                      <li><s:a href="%{trash}" class="btn btn-primary btn-xs">
										<i class="ti-share"></i> Restituer
									</s:a></li>
                                    
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
	
		
<s:if test="%{#session['statut']==2}">
<s:if test="%{allRetard.size()>0}">
	
	<div class="col-md-4">
		<div class="card">
			<div class="header">
				<h4 class="title">
					Réservations en retard
				</h4>

			</div>
			<div class="content">
			<table class="table table-dark">
					<thead class="thead-light">
						<tr>
							<th scope="col">ISBN</th>
							<th scope="col">Date de restitution</th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="allRetard">

							<tr>
								<th scope="row">ISBN-<s:property value="key.idLivre" /></th>
								<td><s:property value="dateLimite" /></td>
							</tr>
						</s:iterator>

					</tbody>
				</table>
			
			</div>

		</div>
	</div>
		<div class="col-md-8">
	
	</s:if>
		<s:if test="%{allRetard.size()==0}">
			<div class="col-md-12">
		</s:if>
		<div class="card">
			<div class="header">
				<h4 class="title">
					Mon historique
				</h4>

			</div>
			<div class="content">
			<table class="table table-dark">
					<thead class="thead-light">
						<tr>
							<th scope="col">Livre ISBN</th>							
						
							<th scope="col">Date de reservation</th>
							<th scope="col">Date de retour</th>
						</tr>
					</thead>
					<tbody>
							
						
							<s:iterator value="allhitoryAdherent">

							<tr>
								<td scope="col">ISBN-<s:property value="idlivre" /></td>
								<td><s:property value="dateReservation" /></td>
								<td><s:property value="dateLimite" /></td>
							</tr>
						</s:iterator>
							
							
					</tbody>
				</table>
			</div>

		</div>
	</div>
	
		</s:if>
	
</div>

	