package univ.lille1.miagem2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "afficheCatalogueJSP", urlPatterns = { "/affichecataloguejsp" })
public class AfficheCatalogueJSP extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("afficheCatalogue.jsp").forward(req, resp);

	}
}