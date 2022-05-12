package Exo10;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

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
    private Map<Integer, Compte> comptes = new Hashtable<>();



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
        if (age > 0) {
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
        return new ArrayList<>(this.comptes.values());
    }

    public void setComptes(List<Compte> comptes) {
        int index = 0;
        for(int t: this.comptes.keySet()){
            this.comptes.compute(t, (key,val) -> comptes.get(t-1));
        }
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
        System.out.println("Test");
        return getComptes().get(numero);
    }
}
