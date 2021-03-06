package Exo06;

public class CompteASeuil extends Compte implements ICompteASeuil{

    //Attributes
    /**
     * @param seuil : double
     */
    double seuil;



    //Getters & Setters
    public double getSeuil() {
        return seuil;
    }

    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }



    //Constructors
    public CompteASeuil(int numero, double solde, double seuil) {
        super(numero, solde);
        setSeuil(seuil);
    }



    //Methods
    public void afficher(){
        System.out.println("Numéro de compte: " + getNumero());
        System.out.println("Solde: " + getSolde());
        System.out.println("Seuil: " + getSeuil());
    }

    public void retirer(double valeur) throws BanqueException{
        if(getSolde()-valeur > getSeuil()){
            System.out.println("Vous venez de retirer le montant de " + valeur + " euros de votre solde.");
            super.retirer(valeur);
            System.out.println("Votre solde après retrait est de: " + getSolde());
        }
        else {
            throw new BanqueException("Votre seuil est supérieur au montant saisi. Retrait impossible.");
        }
    }
}
