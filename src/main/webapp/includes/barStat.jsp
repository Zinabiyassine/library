<div class="row">
				<div class="col-lg-3 col-sm-6">
					<div class="card">
						<div class="content">
							<div class="row">
								<div class="col-xs-5">
									<div class="icon-big icon-warning text-center">
										<i class="ti-book"></i>
									</div>
								</div>
								<div class="col-xs-7">
									<div class="numbers">
										<p>Livres</p>
										<s:property value="allLivres" />

									</div>
								</div>
							</div>
							<div class="footer">
								<hr />
								<div class="stats">
									<i class="ti-shopping-cart"></i> <s:property value="tauxReservation" />% sont reserv�s
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="card">
						<div class="content">
							<div class="row">
								<div class="col-xs-5">
									<div class="icon-big icon-success text-center">
										<i class="ti-shopping-cart-full"></i>
									</div>
								</div>
								<div class="col-xs-7">
									<div class="numbers">
										<p>R�servations</p>
										<s:property value="reservations" />
									</div>
								</div>
							</div>
							<div class="footer">
								<hr />
								<div class="stats">
									<i class="ti-book"></i> <s:property value="tauxRetardLivre" /> livres au totale
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="card">
						<div class="content">
							<div class="row">
								<div class="col-xs-5">
									<div class="icon-big icon-danger text-center">
										<i class="ti-user"></i>
									</div>
								</div>
								<div class="col-xs-7">
									<div class="numbers">
										<p>Adherent</p>
									<s:property value="allAdherents" />
									</div>
								</div>
							</div>
							<div class="footer">
								<hr />
								<div class="stats">
									<i class="ti-comments-smiley"></i> <s:property value="adherentActive"/>% active
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-3 col-sm-6">
					<div class="card">
						<div class="content">
							<div class="row">
								<div class="col-xs-5">
									<div class="icon-big icon-info text-center">
										<i class="ti-thumb-down"></i>
									</div>
								</div>
								<div class="col-xs-7">
									<div class="numbers">
										<p>Retard</p>
										<s:property value="retard"/>
									</div>
								</div>
							</div>
							<div class="footer">
								<hr />
								<div class="stats">
									<i class="ti-book"></i> <s:property value="tauxRetardLivre"/> livres <i class="ti-user"></i> <s:property value="tauxRetardAdherent"/>
									adherents
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>