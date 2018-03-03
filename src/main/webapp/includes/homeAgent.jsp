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
				
			<!-- 	<div class="col-md-4">
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
							<th scope="col">#</th>
							<th scope="col">ISBN Livre</th>
							<th scope="col">Date Reservation</th>
							<th scope="col">Date Limite</th>
							<th scope="col">Actions</th>
						</tr>
					</thead>
					<tbody>
						<s:iterator value="allReservation">
										<s:url namespace="/" action="displayadherent" var="infoadherent">
										<s:param name="adhrentid">
											<s:property value="key.idAdherent" />
										</s:param>

									</s:url>
							<tr>
								<th scope="row">
								<s:a href="%{infoadherent}" data-toggle="modal" id="modalup" data-target="#adherent">
											<s:property value="key.idAdherent" /></th>
								
								</s:a>
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
								
							
								<td>
								<div class="dropdown">
                                  <button class="btn btn-info btn-m btn-fill dropdown-toggle" type="button" 
                                  data-toggle="dropdown">Action
                                  </button>
                                  <ul class="dropdown-menu">
                                      
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
	
	
	
	
	<div id="myModal" class="modal fade" role="dialog" >
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Reservation</h4>
      </div>
            <form action="addReservationbyagent" method="post" class="loginForm">
      
      <div class="modal-body">
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

	