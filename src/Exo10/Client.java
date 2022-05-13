package Exo10;

import Exo06.BanqueException;

import java.util.*;
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
    private Map<Integer, Compte> compteMap = new Hashtable<>();





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
        return new ArrayList<>(this.compteMap.values());
    }


    public void setComptes(List<Compte> comptes) {
        Collections.reverse(comptes);
        for(int index = 0; index < comptes.size(); index++){
            this.compteMap.put(index, comptes.get(index));
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
        List<Compte> addCompte = getComptes();
        addCompte.add(compte);
        setComptes(addCompte);
    }

    public Compte getCompte(int numero) throws BanqueException{ //Retourne le compte avec le numéro saisi
        for(Compte compteBrowse: this.getComptes()){
            if(compteBrowse.getNumero() == numero){
                return compteBrowse;
            }
        }
        throw new BanqueException("Le numéro saisi n'existe pas.");
    }
}
