package listing;

public class Personne {
private String nom,prenom,adresse;
private Gender genre;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public Gender getGenre() {
	return genre;
}
public void setGenre(Gender genre) {
	this.genre = genre;
}
public Personne(String nom, String prenom, String adresse, Gender genre) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.genre = genre;
}
@Override
public String toString() {
	return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", genre=" + genre + "]";
}


}
