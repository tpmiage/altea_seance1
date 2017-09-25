package univ.lille1.miagem2.bean;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Catalogue {

	private static Catalogue catalogue;
	private String nom;
	private Map<String, Produit> listProduit;

	private Catalogue() {

	}

	public static Catalogue getInstance(){
		if(catalogue == null){
			init();
		}
		return catalogue;
	}
	
	private static void init () {
		// TODO Créer 4 Produit différents
		Produit produit1 = new Produit();
		produit1.setId("P1");
		produit1.setNom("Mac");
		produit1.setDescription("Magnifique ordinateur puissant et design");
		produit1.setImage("images/mac.png");
		produit1.setDateDeDisponibilite(LocalDate.of(1991, 10, 2));

		Prix prix1 = new Prix();
		prix1.setPrixEuro(1499.99f);
		prix1.setPrixLivre(1318.77f);
		produit1.setPrix(prix1);
		
		Produit produit2 = new Produit();
		produit2.setId("P2");
		produit2.setNom("PSP");
		produit2.setDescription("Meilleure console de tous les temps");
		produit2.setImage("images/psp.png");
		produit2.setDateDeDisponibilite(LocalDate.of(1991, 1, 29));

		Prix prix2 = new Prix();
		prix2.setPrixEuro(1499.99f);
		prix2.setPrixLivre(1318.77f);
		produit2.setPrix(prix2);
		
		Produit produit3 = new Produit();
		produit3.setId("P3");
		produit3.setNom("Raspberry Pi 3");
		produit3.setDescription("Mini ordinateur permettant d'apprendre l'informatique de zéro");
		produit3.setImage("images/rpi3.png");
		produit3.setDateDeDisponibilite(LocalDate.of(1991, 2, 1));

		Prix prix3 = new Prix();
		prix3.setPrixEuro(1499.99f);
		prix3.setPrixLivre(1318.77f);
		produit3.setPrix(prix3);
		
		Produit produit4 = new Produit();
		produit4.setId("P4");
		produit4.setNom("Iphone X");
		produit4.setDescription("Le téléphone du moment");
		produit4.setImage("images/iphonex.png");
		produit4.setDateDeDisponibilite(LocalDate.of(1991, 6, 31));

		Prix prix4 = new Prix();
		prix4.setPrixEuro(1499.99f);
		prix4.setPrixLivre(1318.77f);
		produit4.setPrix(prix4);



		// initialisation de la liste de produit
		HashMap <String,Produit> listProduit = new HashMap <String,Produit>();
		listProduit.put(produit1.getId(),produit1);
		listProduit.put(produit2.getId(), produit2);
		listProduit.put(produit3.getId(), produit3);
		listProduit.put(produit4.getId(), produit4);

		// création d'un catalogue
		catalogue = new Catalogue();
		catalogue.setNom("Catalogue") ;
		catalogue.setListProduit( listProduit );
	}

	public static Catalogue getCatalogue() {
		return catalogue;
	}
	public static void setCatalogue(Catalogue catalogue) {
		Catalogue.catalogue = catalogue;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Map<String, Produit> getListProduit() {
		return listProduit;
	}
	public void setListProduit(Map<String, Produit> produits) {
		this.listProduit = produits;
	}



}
