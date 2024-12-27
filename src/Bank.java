public class Bank {
    // Declaration des attributs de la classe
    private String nom;
    Compte[] comptes;

    // génération du contructeur par défaut
    public Bank(){

    }

    //génération du constructeur paramétré
    public Bank(String nom){
        comptes = new Compte[50];
        this.nom = nom;
    }





}
