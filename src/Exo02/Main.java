package Exo02;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisi des coordonnées du point
        Point2D point = new Point2D();
        System.out.println("Saisir la coordonnée X sur l'axe des abscisses: ");
        int x = scanner.nextInt();
        point.setX(x);
        System.out.println("Saisir la coordonnée Y sur l'axe des ordonnées: ");
        int y = scanner.nextInt();
        point.setY(y);

        // Affichage du point saisi
        System.out.print("Le point: ");
        point.afficher();

        // Saisi du point de translation
        Point2D pointDeTranslation = new Point2D(x,y);
        System.out.println("Saisir le point de translation de coordonnée dX et dY: ");
        int dX = scanner.nextInt();
        int dY = scanner.nextInt();

        // Translation et affichage
        point.translater(dX,dY);
        System.out.print("Le point après translation: ");
        point.afficher();


        // Affichage du compteur
        Point2D.getCompteur();


    }
}
