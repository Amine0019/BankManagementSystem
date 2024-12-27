public class Compte {
    // Declaration des attributs de classe
    private int numCompte;
    private String nomPropreitaire;
    private float solde;

    // génération du constructeur par defaut
    public Compte(int numCompte, String nomPropreitaire, float solde) {
        this.numCompte = numCompte;
        this.nomPropreitaire = nomPropreitaire;
        this.solde = Math.max(solde, 0);
    }

    // génération des getters et setters
    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public String getNomPropreitaire() {
        return nomPropreitaire;
    }

    public void setNomPropreitaire(String nomPropreitaire) {
        this.nomPropreitaire = nomPropreitaire;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }


}
