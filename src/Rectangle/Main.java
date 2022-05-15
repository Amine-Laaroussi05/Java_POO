package Rectangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir la longueur du rectangle: ");


        int a = scanner.nextInt();
        System.out.println("Saisir la largeur du rectangle: ");


        int b = scanner.nextInt();
        Rectangle rectangle = new Rectangle(a, b);


        System.out.println("La surface du rectangle est: " + rectangle.surface());
    }
}
