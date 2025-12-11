public class Main {
    public static void main(String[] args) {
            Room r1 = new Room("guestroom",3,40);
            Building b1 = new Building("BlueHotel",r1,50);

            System.out.println("blue horel area: " + b1.getTotalArea());

            Owner[] owner = new Owner[2];

            Owner ow1 = new Owner("Ali",123);
            Owner ow2 = new Owner("Zeynep",456);

            owner[0] = ow1;
            owner[1] = ow2;

            Building b2 = new Building("Hotel XYZ",r1,25,owner);
            b2.DisplayAllOwners();

        }
    }
