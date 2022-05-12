package Exo10;

public interface ICompteASeuil {
    void retirer(double valeur) throws BanqueException;
    double getSeuil();
    void setSeuil(double seuil);
}
