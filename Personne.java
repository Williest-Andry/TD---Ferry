package Ferry;

import java.time.LocalDate;

public abstract class Personne {
    protected String nom ;
    protected String prenom ;
    protected LocalDate date_naissance;
    protected String adresse;
    protected double poids;

    public Personne(String nom, String prenom, LocalDate date_naissance, String adresse, double poids) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.adresse = adresse;
        this.poids = poids;
    }

    public void voyager(){

    }
}
