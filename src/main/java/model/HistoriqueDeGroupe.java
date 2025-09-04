package model;
import java.time.Instant;
public class HistoriqueDeGroupe {
    private Groupe groupe;
    private Instant dateDentree;
    private Instant dateDeSortie;

    public HistoriqueDeGroupe(Groupe groupe, Instant dateDentree, Instant dateDeSortie) {
        this.groupe = groupe;
        this.dateDentree = dateDentree;
        this.dateDeSortie = dateDeSortie;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }
}
