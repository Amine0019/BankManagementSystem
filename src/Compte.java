import java.util.Scanner;

public class Compte {
    // Declaration des attributs de classe
    private int numCompte;
    private String nomPropreitaire;
    private double solde;

    // génération du constructeur par defaut
    public Compte(int numCompte, String nomPropreitaire, double solde) {
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

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        if (solde>0) {
            this.solde = solde;
        }
    }

    //une méthode qui nous permet de saisir un compte bancaire
    void saisirCompte() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir le numero de compte:");
        this.numCompte = sc.nextInt();
        sc.nextLine();

        System.out.print(" Veuillez saisir le Nom du propreitaire : ");
        this.nomPropreitaire = sc.nextLine();

        System.out.println("Veuillez saisir le solde du compte bancaire: ");
        this.solde = sc.nextDouble();
        sc.nextLine();


    }



}
