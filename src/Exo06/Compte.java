package Exo06;

public class Compte extends BanqueException{

    //Attributes
    /**
     * @param numero : int
     * @param solde : double
     */
    private final int numero;
    private double solde;


    //Getters & Setters
    public int getNumero() {
        return this.numero;
    }

    public double getSolde() {
        return this.solde;
    }


    public void setSolde(double solde) {
        this.solde = solde;
    }


    //Constructors
    public Compte(int numero, double solde){
        this.numero = numero;
        this.setSolde(solde);
    }


    //Methods
    public void afficher(){
        System.out.println("Numéro de compte: " + getNumero());
        System.out.println("Solde: " + getSolde());
    }

    public void ajouter(double montant){
        this.setSolde(getSolde() + montant);
    }

    public void retirer(double montant) throws BanqueException{
        if(getSolde() >= montant){
            this.setSolde(getSolde() - montant);
        } else{
            throw new BanqueException("Le montant saisi est supérieur au montant présent dans votre solde. Retrait impossible");
        }

    }


}
