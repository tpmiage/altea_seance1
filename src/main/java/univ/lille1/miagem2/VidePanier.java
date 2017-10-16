package univ.lille1.miagem2;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@WebServlet(name = "ajouterAuPanier", urlPatterns = { "/ajouteaupanier" })
public class VidePanier extends HttpServlet {

	private static final String PANIER = "panier";
	private static final String ID = "id";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		JSONArray panier = null;
		Cookie cookie = null; 
		for(Cookie c : cookies) {
			if(c.getName().equals(PANIER)) {
				cookie = c;
				break;
			}
		}
		if(cookie != null) {
			cookie.setMaxAge(0);
			resp.addCookie(cookie);
		}
		
		req.getRequestDispatcher("afficheCatalogue.jsp").forward(req, resp);

	}
}