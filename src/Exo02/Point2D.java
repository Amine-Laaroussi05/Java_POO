package Exo02;


public class Point2D {
    private static int compteur =0;
    private int x;
    private int y;





    // Constructors

    public  Point2D(){
        this.setX(0);
        this.setY(0);
        compteur++;
    }


    public Point2D(int x, int y){
        this.setX(x);
        this.setY(y);
        compteur++;
    }




// Setters && getters

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }





    // Methods

    public void afficher(){
        System.out.println("[" + this.x + "," + this.y + "]");
    } // affiche le point

    public void translater(int x, int y){ // translate le point
        this.x += x;
        this.y += y;
    }

    public static void getCompteur(){ // affiche le compteur
        System.out.println("La valeur du compteur est: " + compteur);
    }


}
