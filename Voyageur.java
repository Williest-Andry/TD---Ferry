package Ferry;

import java.time.LocalDate;

public class Voyageur extends Personne{
    private LocalDate dateVoyage;

    public Voyageur(String nom, String prenom, LocalDate date_naissance, String adresse, double poids, LocalDate dateVoyage) {
        super(nom, prenom, date_naissance, adresse, poids);
        this.dateVoyage = dateVoyage;
    }
}
