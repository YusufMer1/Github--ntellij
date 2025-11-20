public class Cylinder {
    double r;
    double h;
    static int noOFCylinder=0;

    Cylinder(){
        r=3;
        h=4;
    }
    Cylinder(int r,int h){
        this.r=r;
        this.h=h;
    }
    public static int getNoOfCylinder(){
        return noOFCylinder;
    }
    public double calculateBaseArea(){
        return Math.PI * r*r;
    }
    public double calculateSurfaceArea(){
        return Math.PI * r *(r+h);
    }
    public double calculateVolume(){
        return Math.PI * r * r * h;
    }
    public double calculateMass(double density){
        return calculateVolume() * density;
    }
}