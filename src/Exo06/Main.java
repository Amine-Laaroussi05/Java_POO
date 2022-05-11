package Exo06;

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
        compte = client.getCompte(numero);
        if (compte != null) {
            System.out.println("Votre compte numero " + compte.getNumero() + " contient " + compte.getSolde() + " euros.");
        }
        System.out.println("---------------------------------");


        //Ajout d'un taux
        System.out.println("Saisir un taux pour le compte rémunéré: ");
        double taux = scanner.nextDouble();
        client.getComptes().set(0,new CompteRemunere(client.getCompte(1).getNumero(), client.getCompte(1).getSolde(), taux));
        System.out.println("---------------------------------");



        //Ajout d'un seuil
        System.out.println("Saisir un seuil pour le compte à seuil: ");
        double seuil = scanner.nextDouble();
        client.getComptes().set(1,new CompteASeuil(client.getCompte(2).getNumero(), client.getCompte(2).getSolde(), seuil));
        System.out.println("---------------------------------");



        //Verser les intêrets sur les comptes rémunérés
        System.out.println("Versement des intêrets ...");
        for (Compte compteVar: client.getComptes()) {
            if(compteVar.getClass() == CompteRemunere.class) ((CompteRemunere) compteVar).verserinterets();
        }
        System.out.println("---------------------------------");



        //Afficher le compte
        System.out.println("Saisir votre numéro de compte: ");
        numero = scanner.nextInt();
        compte = client.getCompte(numero);
        compte.afficher();
    }
}
