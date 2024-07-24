package Ferry;

import java.time.LocalDate;

public class Conducteur extends Personne{
    private String numeroPermis;

    public Conducteur(String nom, String prenom, LocalDate date_naissance, String adresse, double poids, String numeroPermis) {
        super(nom, prenom, date_naissance, adresse, poids);
        this.numeroPermis = numeroPermis;
    }
}
