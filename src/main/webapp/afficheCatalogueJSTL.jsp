<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	pageContext.setAttribute("items", Catalogue.getInstance().getListProduit());
%>
<c:forEach var="entry" items="${items}">
	<div class="produit">
		    <table>
		        <tr>
		            <td rowspan="2"><img src="${ entry.value.getImage() }"/></td>
		            <td><a class="nom" href="afficheproduit?id=${ entry.value.getId()}"> ${ entry.value.getNom() }</a></td>
		        </tr>
		        <tr>
		            <td class="prix">${ entry.value.getPrix().getPrixEuro() }&nbsp;&euro;</td>
		        </tr>
		        <tr>
		            <td colspan="2" class="desc">${ entry.value.getDescription() }</td>
		        </tr>
		    </table>
		</div>
</c:forEach>

</body>
</html>