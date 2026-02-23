public class Main {
    public static void main(String[] args) {
        Calculator ca = new Calculator();
        int result1 = ca.add(2,5);
        double result2 = ca.add(2.5,3.5);
        int result3 = ca.add(2,5,8);

        System.out.println("add(int,int): " + result1);
        System.out.println("add(double,double): " + result2);
        System.out.println("add(int,int,int): " + result3);
    }
}