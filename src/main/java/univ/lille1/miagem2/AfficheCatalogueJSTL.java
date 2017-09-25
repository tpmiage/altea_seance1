package univ.lille1.miagem2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "afficheCatalogueJSTL", urlPatterns = { "/affichecataloguejstl" })
public class AfficheCatalogueJSTL extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("afficheCatalogueJSTL.jsp").forward(req, resp);

	}
}