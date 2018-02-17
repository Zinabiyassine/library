
<div class="row">
	<s:iterator value="adherents">
		<div class="col-lg-3 ">
			<div class="card card-user">
				<div class="image" style="height: 50px;">
					<img src="assets/img/background.jpg" alt="..." />
				</div>
				<div class="content" style="min-height: 0">
					<div class="author">
						<img class="avatar border-white"
							src="<s:property value="photo" />" alt="..." />
						<h4 class="title">
							<a href="adherents/2"><s:property value="nom" /></a><br />
							<small> <s:if test="%{statut==1}">
									<span class="label label-success">Actif</span>
								</s:if> <span class="label label-info" title="fin abonnement">12-09-2028</span>
							</small>

						</h4>
					</div>
				</div>
				<hr>
				<div class="text-center">
					<div class="row">
					
						<button type="button" class="btn btn-danger btn-xs" title="Supprimer l'adherent">
							<i class="ti-trash"></i>
						</button>
						<button type="button" class="btn btn-warning btn-xs" title="suspendre l'adherent">
							<i class="ti-na"></i>
						</button>
						
						<button type="button" class="btn btn-info btn-xs" title="suspendre l'adherent">
							<i class="ti-eye"></i>
						</button>
					</div>
				</div>
			</div>

		</div>
	</s:iterator>

</div>
</div>
</div>