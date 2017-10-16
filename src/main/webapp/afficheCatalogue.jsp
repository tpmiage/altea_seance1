<%@page import="univ.lille1.miagem2.bean.Produit"%>
<%@page import="java.util.Map"%>
<%@page import="univ.lille1.miagem2.bean.Catalogue"%>
<html>
<head>
<link rel=stylesheet type="text/css" href="/miagetp1/css/styles.css">
</head>
<body>
<div class="titre">Catalogue</div>
<br><br>

<%
	for(Produit produit : Catalogue.getInstance().getListProduit().values()) {
		%>
		<div class="produit">
		    <table>
		        <tr>
		            <td rowspan="2"><img src="<%= produit.getImage() %>"/></td>
		            <td><a class="nom" href="afficheproduit?id=<%= produit.getId() %>"> <%=produit.getNom() %></a></td>
		        </tr>
		        <tr>
		            <td class="prix"><%= produit.getPrix().getPrixEuro() %>&nbsp;&euro;</td>
		        </tr>
		        <tr>
		            <td colspan="2" class="desc"><%=produit.getDescription() %></td>
		        </tr>
		    </table>
		</div>
		<%
	}
%>
</body>
</html>