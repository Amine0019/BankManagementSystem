public class Bank {
    // Declaration des attributs de la classe
    private String nom;
    private Compte[] comptes;

    // génération du contructeur par défaut
    public Bank(){

    }

    //génération du constructeur paramétré
    public Bank(String nom){
        comptes = new Compte[50];
        this.nom = nom;
    }

    // génération des getters et setters


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Compte[] getComptes() {
        return comptes;
    }

    public void setComptes(Compte[] comptes) {
        this.comptes = comptes;
    }
}
