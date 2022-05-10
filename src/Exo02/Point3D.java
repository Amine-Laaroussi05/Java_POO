package Exo02;

import java.util.Objects;

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


    public int hashCode(){
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + Objects.hash(z);
        return result;
    }

    /*public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if (!super.equals(obj)){
            return false;
        }
        if (!(obj instanceof Point3D)){
            return false;
        }
        Point3D other = (Point3D) obj;
        return Objects.equals(z,)
    }*/




}
