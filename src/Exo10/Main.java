package Exo10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Saisi des données client
        System.out.println("Saisir le nom du client: ");
        String nom = scanner.next();
        System.out.println("Saisir le prénom du client: ");
        String prenom = scanner.next();
        System.out.println("Saisir l'age du client: ");
        int age = scanner.nextInt();
        System.out.println("Saisir le numéro du client: ");
        int numero = scanner.nextInt();
        Client client = new Client(nom,prenom,age,numero);
        System.out.println("---------------------------------");


        //Ajout d'un compte client
        System.out.println("Saisir le numero du compte: ");
        numero = scanner.nextInt();
        System.out.println("Saisir le solde du client: ");
        double solde = scanner.nextDouble();
        Compte compte = new Compte(numero, solde);
        client.ajouterCompte(compte);
        System.out.println("---------------------------------");


        //Ajout d'un 2m̀e compte client
        System.out.println("Saisir le numero du 2ème compte: ");
        numero = scanner.nextInt();
        System.out.println("Saisir le solde du client: ");
        solde = scanner.nextDouble();
        compte = new Compte(numero, solde);
        client.ajouterCompte(compte);
        System.out.println("---------------------------------");


        //Vérifie compte client
        System.out.println("Saisir votre numero de compte: ");
        numero = scanner.nextInt();
        try {
            compte = client.getCompte(numero);
        } catch (Exo06.BanqueException e) {
            throw new RuntimeException(e);
        }

        if (compte != null) {
            System.out.println("Votre compte numero " + compte.getNumero() + " contient " + compte.getSolde() + " euros.");
        }
        System.out.println("---------------------------------");


        //Ajout d'un taux
        System.out.println("Saisir un taux pour le compte rémunéré: ");
        double taux = scanner.nextDouble();
        List<Compte> copyList = client.getComptes();
        copyList.set(0,new CompteRemunere(client.getComptes().get(0).getNumero(), client.getComptes().get(0).getSolde(), taux));
        client.setComptes(copyList);
        System.out.println("---------------------------------");



        //Ajout d'un seuil
        System.out.println("Saisir un seuil pour le compte à seuil: ");
        double seuil = scanner.nextDouble();
        copyList = client.getComptes();
        copyList.set(1,new CompteASeuil(client.getComptes().get(1).getNumero(), client.getComptes().get(1).getSolde(), seuil));
        client.setComptes(copyList);
        System.out.println("---------------------------------");



        //Verser les intêrets sur les comptes rémunérés
        System.out.println("Versement des intêrets ...");
        for (Compte compteBrowse: client.getComptes()) {
            if(compteBrowse.getClass() == CompteRemunere.class) ((CompteRemunere) compteBrowse).verserInterets();
        }
        System.out.println("---------------------------------");



        //Afficher le compte
        System.out.println("Saisir votre numéro de compte: ");
        numero = scanner.nextInt();
        try {
            compte = client.getCompte(numero);
        } catch (Exo06.BanqueException e) {
            throw new RuntimeException(e);
        }

        compte.afficher();
        System.out.println("---------------------------------");



        //Ajout d'un CompteASeuilRemunere
        System.out.println("Saisir le solde du nouveau compte à seuil et rémunéré: ");
        solde = scanner.nextDouble();
        System.out.println("Saisir le taux: ");
        taux = scanner.nextDouble();
        System.out.println("Saisir le seuil: ");
        seuil = scanner.nextDouble();
        ICompteRemunere compteRem = new CompteASeuilRemunere(3,solde,taux, seuil);






        //Afficher le compte à seuil rémnunéré
        ((CompteASeuilRemunere) compteRem).afficher();
        System.out.println("Seuil: " + ((CompteASeuilRemunere) compteRem).getSeuil());
        System.out.println("---------------------------------");



        //Verser des intêrets sur le compte à seuil rémunéré
        System.out.println("Versement des intêrets ...");
        compteRem.verserInterets();
        System.out.println("---------------------------------");


        //Afficher le solde après versement
        System.out.println("Votre compte après versement: ");
        ((CompteASeuilRemunere) compteRem).afficher();
        System.out.println("Seuil: " + ((CompteASeuilRemunere) compteRem).getSeuil());
        System.out.println("---------------------------------");



        //Retrait solde
        System.out.println("Saisir le montant souhaitant être retiré: ");
        double montant = scanner.nextDouble();
        if(((CompteASeuilRemunere) compteRem).getSolde() - montant > ((CompteASeuilRemunere) compteRem).getSeuil()){
            System.out.println("Retrait du montant " + montant + " euros de votre solde en cours...");
            try {
                ((CompteASeuilRemunere) compteRem).retirer(montant);
            } catch (BanqueException e) {
                throw new RuntimeException(e);
            }
        } else{
            throw new IllegalArgumentException("Le montant saisi est supérieur au montant autorisé sur votre compte à seuil. Retrait impossible.");
        }
        System.out.println("---------------------------------");



        //Afficher le solde après retrait
        System.out.println("Votre compte après retrait: ");
        ((CompteASeuilRemunere) compteRem).afficher();
        System.out.println("Seuil: " + ((CompteASeuilRemunere) compteRem).getSeuil());
        System.out.println("---------------------------------");








    }
}
