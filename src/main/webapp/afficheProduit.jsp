<%@page import="univ.lille1.miagem2.bean.Produit"%>
<%@page import="univ.lille1.miagem2.bean.Catalogue"%>
<html>
<body>
<link rel=stylesheet type="text/css" href="/miagetp1/css/styles.css">
<% 
	String id = String.valueOf(request.getParameter("id"));
	Produit produit = Catalogue.getInstance().getListProduit().get(id);
	if(produit == null) {
	%>
		<div>Ce produit n'existe pas !</div>
	<%
		
	} else {
%>

<div class="produit">
<table>
    <tr>
        <td rowspan="2"><img src="<%= produit.getImage() %>"/></td>
        <td class="nom"><%= produit.getNom() %></td>
    </tr>
    <tr>
        <td class="prix"><%= produit.getPrix().getPrixEuro() %>&nbsp;&euro;</td>
    </tr>
    <tr>
        <td colspan="2" class="desc"><%= produit.getDescription() %></td>
    </tr>
</table>
</div>
<form method="get" action="AjouteAuPanier">
<input type="hidden" name="id" value="<%= id %>">
<input type="submit" value="ajouter au panier">
</form>
<% } %>
</body>
</html>