package Exo06;

public class Compte {

    //Attributes
    /**
     * @param numero : int
     * @param solde : double
     */

    private int num;
    private double solde;


    //Getters & Setters
    public int getNum() {
        return this.num;
    }

    public double getSolde() {
        return this.solde;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }


    //Constructors
    public Compte(int numero, double solde){
        this.setNum(numero);
        this.setSolde(solde);
    }


    //Methods
    public void afficher(){
        System.out.println("Numéro de compte: " + getNum());
        System.out.println("Solde: " + getSolde());
    }

    public void ajouter(double montant){
        this.setSolde(getSolde() + montant);
    }

    public void retirer(double montant){
        this.setSolde(getSolde() - montant);
    }


}
