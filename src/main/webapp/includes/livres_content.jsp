<div class="row">
	<div class="col-md-12">
		
		<div class="card">
			<div class="header">
				<div class="row">
					<s:if test="%{#session['statut']==1}">

						<div class="col-md-2" style="width: 4.666667%;">
							<button title="Enregistrer une reservation" type="button"
								class="btn btn-info btn-xs btn-fill" data-toggle="modal"
								id="modalup" data-target="#addLivre">
								<i class="ti-plus"></i>
							</button>

						</div>
					</s:if>
					<div class="col-md-4">

						<h4 class="title">Les livres</h4>
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
								<th scope="col">Titre</th>
								<th scope="col">Auteur</th>
								<th scope="col">Langue</th>
								<th scope="col">Actions</th>
							</tr>
						</thead>
						<tbody>
							<s:iterator status="livre" value="allLivre">

								<tr>
									<th scope="row">ISBN-<s:property value="isbn" /></th>
									<td><s:property value="titre" /></td>
									<td><s:property value="auteur" /></td>
									<td><s:property value="langue" /></td>


									<s:url namespace="/" action="addReservationbyadherent"
										var="reserver">

										<s:param name="isbn">
											<s:property value="isbn" />
										</s:param>

									</s:url>

									<s:url namespace="/" action="deleteLivre" var="delete">

										<s:param name="isbn">
											<s:property value="isbn" />
										</s:param>

									</s:url>

									<s:url namespace="/" action="displaybyadherent" var="infolivre">
										<s:param name="index">
											<s:property value="%{#livre.index}" />
										</s:param>

									</s:url>


									<td>
										<div class="dropdown">
											<button class="btn btn-info btn-m btn-fill dropdown-toggle"
												type="button" data-toggle="dropdown">Action</button>
											<ul class="dropdown-menu">
										<s:if test="%{#session['statut']==2}">
											
												<li><s:a href="%{reserver}"
														class="btn btn-primary btn-xs">
														<i class="ti-shopping-cart"></i> Réserver
									</s:a></li>
									</s:if>
									
										<s:if test="%{#session['statut']==1}">
											
												<li><s:a href="%{delete}"
														class="btn btn-primary btn-xs">
														<i class="ti-trash"></i> Supprimer( à eviter)
									</s:a></li>
									</s:if>

												

												<li><s:a href="%{infolivre}"
														class="btn btn-primary btn-xs" data-toggle="modal"
														data-target="#myModal">
														<i class="ti-eye"></i> Plus d'info
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
	</div>

			
<s:url namespace="/" action="livres" var="redLivre"></s:url>
<div id="myModal" class="modal fade" role="dialog" >
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Information libre</h4>
      </div>      
      <div class="modal-body">
        <p><strong>ISBN : </strong>
		<s:property value="allLivre[#session.index].isbn" />

        </p>
    
        <p><strong>Titre : </strong><s:property value="allLivre[#session.index].titre" />
        </p>
         <p><strong>Auteur : </strong><s:property value="allLivre[#session.index].auteur" /></p>
         <p><strong>Langue : </strong><s:property value="allLivre[#session.index].langue" /></p>
         <p><strong>Categorie : </strong><s:property value="allLivre[#session.index].categorie" /></p>
         <p><strong>Discription : </strong><s:property value="allLivre[#session.index].description" /></p>
         <p><strong>mot cles : </strong><s:property value="allLivre[#session.index].motcle" /></p>
         
      </div>
      <div class="modal-footer">
        <s:a href="%{redLivre}" class="btn btn-primary btn-xs">
						<i class="ti-off"></i> Fermer
									</s:a>
    </div>

  </div>
</div>
		</div>
		
		<div id="addLivre" class="modal fade" role="dialog" >
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Reservation</h4>
      </div>
            <form action="addlivreByAgent" method="post" class="loginForm">
      
      <div class="modal-body">
		
        	<label>Titre</label> <input type="text" name="titre" class="form-control border-input"  />
         	<label>Auteur</label> <input type="text" name="auteur" class="form-control border-input"  />
            <label>Catégorie</label> <input type="text" name="categorie" class="form-control border-input"  />
            <label>Stock</label> <input type="text" name="langue" class="form-control border-input"  />
         	<label>Description</label> <textarea name="description" rows="2" class="form-control" ></textarea>
         	<label>Mots clés</label> <input type="text" name="motcles" class="form-control border-input"  />
         	
     
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Fermer</button>
        <button type="submit" class="btn btn-primary  btn-fill">Confirmer</button>
      </div>
      </form>
    </div>

  </div>
</div>
	</div>