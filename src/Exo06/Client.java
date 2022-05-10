package Exo06;

import java.util.List;

public class Client {


    //Attributes
    /**
     * @param nom : String
     * @param prenom : String
     * @param age : int
     * @param numero : int
     * @param comptes : Compte[]
     */

    private String nom;
    private String prenom;
    private int age;
    private int numero;
    private List<Compte> comptes;



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
        this.age = age;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Compte> getComptes() {
        return this.comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }



    //Constructors
    public Client(String nom, String prenom, int age, int numero, List<Compte> comptes) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setAge(age);
        this.setNumero(numero);
        this.setComptes(comptes);
    }


    //Methods
    public void afficher(){
        System.out.println("Nom: " + getNom() + ", Prenom: " + getPrenom() + ", Age: " + getAge() + ", Numéro client: " + getNumero());
    }

    public void ajouterCompte(Compte compte){
        getComptes().add(compte);
    }

    /*public Compte getCompte(int numero){
        getComptes().
    }*/

}
