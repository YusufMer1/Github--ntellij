public class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    Node newNode(int data){
        return new Node(data);
    }

    Node insert(Node root, int data) {
        if (root != null) {
            if (data < root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        } else {
            root = newNode(data);
        }
        return root;
    }


    Node search(int data, Node root) {
        if (root != null) {
            if (root.data != data) {
                if (root.data > data) {
                    return search(data, root.left);
                } else {
                    return search(data, root.right);
                }
            }
            else {
                System.out.println(data + " is found");
                return root;
            }

        }
        System.out.println("list hasn't " + data);
        return null;
    }
    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data + "  ");
            inorder(root.right);
        }
    }
}
