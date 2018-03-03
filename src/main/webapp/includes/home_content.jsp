	<div class="row">
			<s:if test="%{#session['statut']==2}">
				<%@ include file="homeAdherent.jsp"%>
			</s:if>
	
				<s:if test="%{#session['statut']==1}">
				<%@ include file="homeAgent.jsp"%>
			</s:if>
</div>
	</div>


