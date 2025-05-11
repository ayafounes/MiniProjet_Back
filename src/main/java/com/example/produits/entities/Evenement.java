package com.example.produits.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity
public class Evenement {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idEvenement;
private String nomEvenement;
private Double prixEvenement;
@JsonFormat(pattern = "yyyy-MM-dd")
private Date dateCreation;


@ManyToOne
private Genre genre;

public Evenement() {
super();
}
public Evenement(String nomEvenement, Double prixEvenement, Date dateCreation) {
super();
this.nomEvenement = nomEvenement;
this.prixEvenement = prixEvenement;
this.dateCreation = dateCreation;
}
public Long getIdEvenement() {
return idEvenement;
}
public void setIdEvenement(Long idEvenement) {
this.idEvenement = idEvenement;
}
public String getNomEvenement() {
return nomEvenement;
}
public void setNomEvenement(String nomEvenement) {
this.nomEvenement = nomEvenement;
}
public Double getPrixEvenement() {
return prixEvenement;
}
public void setPrixEvenement(Double prixEvenement) {
this.prixEvenement = prixEvenement;
}
public Date getDateCreation() {
return dateCreation;
}
public void setDateCreation(Date dateCreation) {
this.dateCreation = dateCreation;
}
@Override
public String toString() {
    return "Evenement [idEvenement=" + idEvenement + ", nomEvenement=" + nomEvenement +
            ", prixEvenement=" + prixEvenement + ", dateCreation=" + dateCreation + "]";
}
public Genre getGenre() {
	return genre;
}
public void setGenre(Genre genre) {
	this.genre=genre;
}


}
