package Exo02;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisi des coordonnées du point
        Point3D point = new Point3D();
        System.out.println("Saisir la coordonnée X sur l'axe des abscisses: ");
        point.setX(scanner.nextInt());
        System.out.println("Saisir la coordonnée Y sur l'axe des ordonnées: ");
        point.setY(scanner.nextInt());
        System.out.println("Saisir la coordonnée Z sur l'axe des cotes: ");
        point.setZ(scanner.nextInt());

        // Affichage du point saisi
        System.out.print("Le point: ");
        point.afficher();

        // Saisi du point de translation
        Point3D pointDeTranslation = new Point3D(point.getX(), point.getY(), point.getZ());
        System.out.println("Saisir le point de translation de coordonnée dX et dY et dZ: ");
        pointDeTranslation.setX(scanner.nextInt());
        pointDeTranslation.setY(scanner.nextInt());
        pointDeTranslation.setZ(scanner.nextInt());

        // Translation et affichage
        point.translater(pointDeTranslation.getX(), pointDeTranslation.getY(), pointDeTranslation.getZ());
        System.out.print("Le point après translation: ");
        point.afficher();


        // Affichage du compteur
        Point3D.getCompteur();


    }
}
