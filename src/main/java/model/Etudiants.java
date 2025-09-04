package model;
import java.time.LocalDate;
import java.util.List;


public class Etudiants {
    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateEntreHEI;
    private List<Groupe> historiquesDeGroupes;
    private List<Frais> frais;

    public Etudiants(int id, String nom, String prenom, LocalDate dateEntreHEI, List<Groupe> historiquesDeGroupes, List<Frais> frais) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateEntreHEI = dateEntreHEI;
        this.historiquesDeGroupes = historiquesDeGroupes;
        this.frais = frais;
    }

    public void ajouterGroupe(Groupe groupe) {
        this.historiquesDeGroupes.add(groupe);
    }

    public List<Groupe> getHistoriquesDeGroupes() {
        return historiquesDeGroupes;
    }

    public void ajouterFrais(Frais frais) {
        this.frais.add(frais);
    }

    public List<Frais> getFrais() {
        return frais;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDateEntreHEI() {
        return dateEntreHEI;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateEntreHEI(LocalDate dateEntreHEI) {
        this.dateEntreHEI = dateEntreHEI;
    }

    public void setHistoriquesDeGroupes(List<Groupe> historiquesDeGroupes) {
        this.historiquesDeGroupes = historiquesDeGroupes;
    }

    public void setFrais(List<Frais> frais) {
        this.frais = frais;
    }
}
