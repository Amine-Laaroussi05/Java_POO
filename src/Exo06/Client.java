package Exo06;

import java.util.ArrayList;
import java.util.List;

public class Client {


    //Attributes
    /**
     * @param nom : String
     * @param prenom : String
     * @param age : int
     * @param numero : int
     * @param comptes : List<Compte>
     */

    private String nom;
    private String prenom;
    private int age;
    private int numero;
    private List<Compte> comptes = new ArrayList<>();



    //Getters & Setters
    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = age;
        }
        else System.out.println("Age invalide.");
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public final List<Compte> getComptes() {
        return this.comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }



    //Constructors
    public Client(String nom, String prenom, int age, int numero) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAge(age);
        this.setNumero(numero);
    }


    //Methods
    public void afficher(){
        System.out.println("Nom: " + getNom() + ", Prenom: " + getPrenom() + ", Age: " + getAge() + ", Numéro client: " + getNumero());
    }

    public void ajouterCompte(Compte compte){ // Ajoute un compte à la liste
        getComptes().add(compte);
    }

    public Compte getCompte(int numero) { //Retourne le compte avec le numéro saisi
        for (int index = 0; index < getComptes().size(); index++) {
            if(getComptes().get(index).getNumero() == numero){
                return getComptes().get(index);
            }
        }
        System.out.println("Le numéro saisi n'existe pas.");
        return null;
    }
}
