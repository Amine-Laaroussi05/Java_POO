package Exo06;

public class CompteRemunere extends Compte{

    //Attributes
    /**
     * @param taux : double
     */
    double taux;



    //Getters & Setters
    public double getTaux() {
        return this.taux;
    }

    public void setTaux(double taux) {
        if(taux >= 0 && taux <= 1)  this.taux = taux;
        else System.out.println("Taux incorrect");
    }



    //Constructors
    public CompteRemunere(int numero, double solde, double taux) {
        super(numero, solde);
        setTaux(taux);
    }



    //Methods
    public void afficher(){
        System.out.println("Numéro de compte: " + getNumero());
        System.out.println("Solde: " + getSolde());
        System.out.println("Taux: " + getTaux());
    }

    public double calculerInterets(){
        return getTaux() * getSolde();
    }

    public void verserinterets(){
        ajouter(calculerInterets());
    }




}
