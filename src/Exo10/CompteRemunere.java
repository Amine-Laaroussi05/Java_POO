package Exo10;

public class CompteRemunere extends Compte implements ICompteRemunere {

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
        if(taux >= 0 && taux < 1)  this.taux = taux;
        else {
            throw new IllegalArgumentException("Le taux doit être entre 0 et 1.");
        }
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
        return this.getTaux() * super.getSolde();
    }

    public void verserInterets(){
        super.ajouter(calculerInterets());
    }




}
