package Rectangle;

public class Rectangle {

    /**
     * Attributes:
     * longueur & largeur du rectangle
     */
    int a;
    int b;


    /**
     * Getters & Setters
     * @return a & b
     */
    public int getA() {
        if (this.a > 0) {
            return this.a;
        } else {
            throw new IllegalArgumentException("La longueur du rectangle doit être strictement positive.");
        }
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        if (this.b > 0) {
            return this.b;
        } else {
            throw new IllegalArgumentException("La largeur du rectangle doit être strictement positive");
        }
    }

    public void setB(int b) {
        this.b = b;
    }


    /**
     * Constructor
     * @param a : int (longueur)
     * @param b : int (largeur)
     */
    public Rectangle(int a, int b) {
        this.setA(a);
        this.setB(b);
    }




    /**
     * Surface du rectangle
     * @return a*b
     */
    public int surface() {
        return this.getA() * this.getB();
    }



    /**
     * Afficher le rectangle
     * @return (a,b)
     */
    public String toString() {
        return "Rectangle{a=" + getA() + ", b=" + this.getB() + "}";
    }


}
