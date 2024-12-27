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


    public int searchCompte(Compte compte){
        int index = -1;
        for(int i = 0; i < comptes.length; i++){
            if(comptes[i] == compte){
                return i;
            }
        }
        return index;
    }



}
