package Exo06;

public class CompteASeuilRemunere extends CompteRemunere implements ICompteRemunere, ICompteASeuil{

    //Attributes
    double seuil;




    public CompteASeuilRemunere(int numero, double solde, double taux, double seuil) {
        super(numero, solde, taux);
        this.setSeuil(seuil);
    }

    @Override
    public double getSeuil() {
        return this.seuil;
    }

    @Override
    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }
}
