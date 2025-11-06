import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.showlist();
        System.out.println("middle = " + stack.middle.data);
        stack.pop();
        stack.showlist();
        System.out.println("middle = " + stack.middle.data);
        stack.deletemiddle();
        stack.showlist();
        System.out.println("middle = " + stack.middle.data);

        stack.showlist();


    }
}