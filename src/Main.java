public class Main {
    public static void main(String[] args) {
        Compte compte1 = new Compte(1,"amine",0);

        System.out.println("Veuillez saisir les informations du compte :\n");
        compte1.saisirCompte();

        compte1.retirerArgent(200);
        compte1.consulterSole();

        compte1.deposerArgent(450);
        compte1.consulterSole();

    }
}