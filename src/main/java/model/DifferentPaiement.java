package model;
import java.time.LocalDate;

public class DifferentPaiement {
    private int id;
    private double montant;
    private LocalDate dateHeure;

    public DifferentPaiement(int id, double montant, LocalDate dateHeure) {
        this.id = id;
        this.montant = montant;
        this.dateHeure = dateHeure;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public LocalDate getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(LocalDate dateHeure) {
        this.dateHeure = dateHeure;
    }

}
