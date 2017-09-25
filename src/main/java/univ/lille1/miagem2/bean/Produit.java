package univ.lille1.miagem2.bean;

import java.time.LocalDate;

public class Produit {
	public String id;
	public String nom;
	public String description;
	public String image;
	public LocalDate dateDeDisponibilite;
	public Prix prix;
	
	public Produit() {

	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public LocalDate getDateDeDisponibilite() {
		return dateDeDisponibilite;
	}
	public void setDateDeDisponibilite(LocalDate dateDeDisponibilite) {
		this.dateDeDisponibilite = dateDeDisponibilite;
	}
	public Prix getPrix() {
		return prix;
	}
	public void setPrix(Prix prix) {
		this.prix = prix;
	}
	
	

}
