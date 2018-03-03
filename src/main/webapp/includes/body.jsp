<div class="content">
	<div class="container-fluid">

		<s:if test="%{pagetitle=='accueil'}">
			<%@ include file="barStat.jsp"%>
			<%@ include file="home_content.jsp"%>
		</s:if>
		
		<s:if test="%{pagetitle=='adherents'}">
			<%@ include file="adherents_content.jsp"%>
		</s:if>
		
		<s:if test="%{pagetitle=='profil'}">
			<%@ include file="profil_content.jsp"%>
		</s:if>
		<s:if test="%{pagetitle=='livres'}">
			<%@ include file="livres_content.jsp"%>
		</s:if>
	<%@ include file="signature.jsp"%>
		





	</div>
</div>