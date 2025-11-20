public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6};
        recursive r = new recursive(list);
        System.out.println(r.even(list, 0));

    }
}