public class Main {
    public static void main(String[] args) {
        //création d'une instance de la classe compte
        Compte compte1 = new Compte(1,"amine",0);

        // tester la méthode saisir compte
        System.out.println("Veuillez saisir les informations du compte :\n");
        compte1.saisirCompte();

        // tester la methode retirerArgent
        compte1.retirerArgent(200);
        compte1.consulterSole();

        // tester la methode consulterSolde
        compte1.deposerArgent(450);
        compte1.consulterSole();

        //création d'une instance de la classe Bank
        Bank bank = new Bank("BNA");

        //création des comptes bancaires pour le test
        Compte compte2 = new Compte(2,"Skander",1000);
        Compte compte3 = new Compte(3,"Anas",2000);
        Compte compte4 = new Compte(4,"Ines",3000);

        //Ajout des Comptes dans la banques :
        bank.getComptes()[0] = compte2;
        bank.getComptes()[1] = compte3;
        bank.getComptes()[2] = compte4;

        // Tester la méthode SearchCompte
        int index = bank.searchCompte(compte2);

        if(index !=-1){
            System.out.println("Le Compte a été trouvé a l'index : "+index);
        }else{
            System.out.println("Le Compte n'a pas été trouvé : ");
        }


        // Tester la méthode avec un compte qui n'existe pas dans la banque
        Compte compteInexistant = new Compte(5,"elleh",5000);
        index = bank.searchCompte(compteInexistant);

        // Tester la méthode SearchCompte
        if(index !=-1){
            System.out.println("Le Compte a été trouvé a l'index : "+index);
        }else{
            System.out.println("Le Compte n'a pas été trouvé : ");
        }

        //Test l'ajout d'un compte supplementaire
        Compte compteSupplementaire = new Compte(6,"Elyes",6000);
        bank.addCompte(compteSupplementaire);

        // Tester l'ajout d'un compte quand la banque est pleine
        Bank fullBank = new Bank("Banque Pleine");
        for(int i=0;i<50;i++){
            fullBank.addCompte(new Compte(i+1,"Client"+(i+1),1000));
        }
        fullBank.addCompte(new Compte(51,"Client51",1000));



    }
}