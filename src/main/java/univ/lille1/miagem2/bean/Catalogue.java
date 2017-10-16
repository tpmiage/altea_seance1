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
		produit1.setImage("https://support.apple.com/library/content/dam/edam/applecare/images/en_US/macos/macos-sierra-update-software-app-store-hero.jpg");
		produit1.setDateDeDisponibilite(LocalDate.of(1991, 10, 2));

		Prix prix1 = new Prix();
		prix1.setPrixEuro(1499.99f);
		prix1.setPrixLivre(1318.77f);
		produit1.setPrix(prix1);
		
		Produit produit2 = new Produit();
		produit2.setId("P2");
		produit2.setNom("PSP");
		produit2.setDescription("Meilleure console de tous les temps");
		produit2.setImage("https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Psp-1000.jpg/1200px-Psp-1000.jpg");
		produit2.setDateDeDisponibilite(LocalDate.of(1991, 1, 29));

		Prix prix2 = new Prix();
		prix2.setPrixEuro(1499.99f);
		prix2.setPrixLivre(1318.77f);
		produit2.setPrix(prix2);
		
		Produit produit3 = new Produit();
		produit3.setId("P3");
		produit3.setNom("Raspberry Pi 3");
		produit3.setDescription("Mini ordinateur permettant d'apprendre l'informatique de zéro");
		produit3.setImage("https://www.newark.com/productimages/nio/standard/77Y6519-40.jpg?01AD=3VkClHQrNEwoZ8fMu2CjhaTin1QYRh4YuZx45QvbKLEKP2nsr6bfr-Q&01RI=1F0925DB6C11A56&01NA=");
		produit3.setDateDeDisponibilite(LocalDate.of(1991, 2, 1));

		Prix prix3 = new Prix();
		prix3.setPrixEuro(1499.99f);
		prix3.setPrixLivre(1318.77f);
		produit3.setPrix(prix3);
		
		Produit produit4 = new Produit();
		produit4.setId("P4");
		produit4.setNom("Iphone X");
		produit4.setDescription("Le téléphone du moment");
		produit4.setImage("https://store.storeimages.cdn-apple.com/4974/as-images.apple.com/is/image/AppleInc/aos/published/images/i/ph/iphone/x/iphone-x-select-2017?wid=189&hei=376&fmt=png-alpha&qlt=95&.v=1504378258086");
		produit4.setDateDeDisponibilite(LocalDate.of(1991, 6, 30));

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
