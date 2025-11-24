public class Main {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder1");
        System.out.println("r: " + c1.r);
        System.out.println("h: " + c1.h);
        System.out.println(Cylinder.getNoOfCylinder());
        System.out.println();
        Cylinder c2 = new Cylinder(10,20);
        System.out.println("Cylinder2");
        System.out.println("r: " + c2.r);
        System.out.println("h: " + c2.h);
        System.out.println("base area: " + c2.calculateBaseArea());
        System.out.println("surface area:"  +c2.calculateSurfaceArea());
        System.out.println("volume: " + c2.calculateVolume());
        System.out.println("density: " + c2.calculateMass(5.12));
        System.out.println(Cylinder.getNoOfCylinder());
    }
}