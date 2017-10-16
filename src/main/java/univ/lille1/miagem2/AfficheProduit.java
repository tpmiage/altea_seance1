package univ.lille1.miagem2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import univ.lille1.miagem2.bean.Catalogue;
import univ.lille1.miagem2.bean.Produit;

@WebServlet(name = "afficheProduit", urlPatterns = { "/afficheproduit" })
public class AfficheProduit extends HttpServlet {
	
	public static final String ID_PARAM = "id";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Produit produit = Catalogue.getInstance().getListProduit().get(req.getParameter(ID_PARAM));
		
        resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("<html>" +
		"<body>" +
		"<link rel=stylesheet type=\"text/css\" href=\"/miagetp1/css/styles.css\">"+
		"<div class=\"produit\">"+
		"<table>"+
		    "<tr>"+
		       "<td rowspan=\"2\"><img src=\"" + produit.getImage() + "\"/></td>"+
		        "<td class=\"nom\">" + produit.getNom() + "</td>"+
		    "</tr>"+
		    "<tr>"+
		        "<td class=\"prix\">"+ produit.getPrix().getPrixEuro() + "&nbsp;&euro;</td>"+
		    "</tr>"+
		    "<tr>"+
		        "<td colspan=\"2\" class=\"desc\">" + produit.getDescription() + "</td>"+
		    "</tr>"+
		"</table>"+
		"</div>"+
		"<form method=\"get\" action=\"ajouteaupanier\">"+
		"<input type=\"hidden\" name=\"id\" value=\""+ req.getParameter(ID_PARAM) +"\">"+
		"<input type=\"submit\" value=\"ajouter au panier\">"+
		"</form>"+
		"</body>"+
		"</html>");

	}
}