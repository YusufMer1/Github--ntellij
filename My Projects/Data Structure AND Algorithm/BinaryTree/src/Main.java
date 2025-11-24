import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = bt.insert(bt.root,50);
        bt.root = bt.insert(bt.root,30);
        bt.root = bt.insert(bt.root,70);
        bt.root = bt.insert(bt.root,40);
        bt.root = bt.insert(bt.root,60);
        bt.root = bt.insert(bt.root,35);
        bt.root = bt.insert(bt.root,45);
        bt.root = bt.insert(bt.root,20);
        bt.root = bt.insert(bt.root,65);
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num = input.nextInt();
        bt.insert(bt.root,num);
        bt.inorder(bt.root);
        System.out.println();
        bt.search(45,bt.root);

    }
}