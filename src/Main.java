public class Main {
    public static void main(String[] args) {
        Compte compte1 = new Compte(1,"amine",980.00);

        System.out.println("Veuillez saisir les informations du compte :\n");
        compte1.saisirCompte();

        compte1.retirerArgent(200);
        System.out.println("solde ="+compte1.getSolde());

    }
}