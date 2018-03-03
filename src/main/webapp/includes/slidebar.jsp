<div class="sidebar" data-background-color="white"
	data-active-color="danger">
	<div class="sidebar-wrapper">
		<div class="logo">
			<a href="#" class="simple-text">
				Library </a>
		</div>

		<ul class="nav">
		<s:if test="%{pagetitle=='accueil'}">
			<li class="active"><a href="index"> <i class="ti-home"></i>
					<p style="text-transform: capitalize;">Tableau de bord </p>
			</a></li>
			<s:if test="%{#session['statut']==1}">

			<li><a href="adherents"> <i class="ti-shopping-cart"></i>
					<p>Adherents</p>
			</a></li>
			</s:if>
			<li><a href="livres"> <i class="ti-book"></i>
					<p>Livres</p>
			</a></li>
			</s:if>
			
					<s:if test="%{pagetitle=='livres'}">
			<li ><a href="index"> <i class="ti-home"></i>
					<p>Tableau de bord </p>
			</a></li>
			<s:if test="%{#session['statut']==1}">

			<li><a href="adherents"> <i class="ti-shopping-cart"></i>
					<p>Adherents</p>
			</a></li>
			</s:if>
			<li class="active"><a href="livres"> <i class="ti-book"></i>
					<p>Livres</p>
			</a></li>
			</s:if>
			
			<s:if test="%{pagetitle=='adherents'}">
			<li ><a href="index"> <i class="ti-home"></i>
					<p>Tableau de bord </p>
			</a></li>
			<s:if test="%{#session['statut']==1}">

			<li  class="active"><a href="adherents"> <i class="ti-shopping-cart"></i>
					<p>Adherents</p>
			</a></li>
			</s:if>
			<li><a href="livres"> <i class="ti-book"></i>
					<p>Livres</p>
			</a></li>
			</s:if>
			
			<s:if test="%{pagetitle=='profil'}">
			<li ><a href="index"> <i class="ti-home"></i>
					<p>Tableau de bord </p>
			</a></li>
			<s:if test="%{#session['statut']==1}">

			<li  class="active"><a href="adherents"> <i class="ti-shopping-cart"></i>
					<p>Adherents</p>
			</a></li>
			</s:if>
			<li><a href="livres"> <i class="ti-book"></i>
					<p>Livres</p>
			</a></li>
			</s:if>	
		</ul>
	</div>
</div>

<div class="main-panel">
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar bar1"></span> <span class="icon-bar bar2"></span>
					<span class="icon-bar bar3"></span>
				</button>
				<a class="navbar-brand" href="#" style="text-transform: capitalize;"><s:property value="pagetitle" /></a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#"><img src="<s:property value='#session.path'/>" id="face-small"/></a></li>
								
					<li role="presentation" class="dropdown">
					<a
						class="dropdown-toggle" data-toggle="dropdown" href="#"
						role="button" aria-haspopup="true" aria-expanded="false">
						<span><s:property value="#session.name" /></span>
					</a>
						<ul class="dropdown-menu" id="dropdown-menu">
					
							<li> <a href="profil"><i id="icons" class="ti-user"></i>Profil</a></li>
							<li> <a href="deconnexion"><i id="icons" class="ti-lock"></i>Déconnexion</a></li>
							
						</ul>
						</li>
				</ul>

			</div>
		</div>
	</nav>