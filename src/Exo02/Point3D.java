package Exo02;

public class Point3D extends Point2D{

    /**
     * Constructeurs de points 2D
     * @param z : int
     */

    // attributes
    private int z;





    // Constructors
    public Point3D(){
        super();
        this.setZ(0);
    }

    public Point3D(int x, int y, int z){
        super(x,y);
        this.setZ(z);
    }




    // Getters & Setters
    public int getZ(){
        return this.z;
    }

    public void setZ(int z){
        this.z = z;
    }




    // Methods
    public void afficher(){
        System.out.println("[" + getX() + "," + getY() + "," + getZ() + "]");
    }

    public void translater(int x, int y, int z){
        super.translater(x,y);
        this.setZ(getZ() + z);
    }






}
