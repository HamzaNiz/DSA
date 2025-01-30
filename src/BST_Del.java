import java.util.Scanner;
class BinarySearchTreess {
    Node root;

    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(value< root.value){
            root.left = insertRec(root.left,value);
        } else if (value> root.value) {
            root.right = insertRec(root.right,value);
        }
        return root;
    }

    void delete(int value) {
        root = deleteRec(root, value);
    }

    Node deleteRec(Node root, int value) {
        if (root == null) {
            return root;
        }

        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        } else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        } else {

            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.value = minValue(root.right);

            root.right = deleteRec(root.right, root.value);
        }

        return root;
    }
    int minValue(Node root) {
        int minValue = root.value;
        while (root.left != null) {
            minValue = root.left.value;
            root = root.left;
        }
        return minValue;
    }

    boolean         search(int value) {
        return searchRec(root, value);
    }

    boolean searchRec(Node root, int value) {
        if (root == null) {
            return false;
        }
        if (root.value == value) {
            return true;
        }
        return value < root.value ? searchRec(root.left, value) : searchRec(root.right, value);
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }
}

public class BST_Del {
    public static void main(String[] args) {
        BinarySearchTreess bst = new BinarySearchTreess();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            bst.insert(value);
        }

        System.out.println("In-order Traversal:");
        bst.inorder();
        System.out.println();

        System.out.println("Enter a number to delete:");
        int deleteValue = scanner.nextInt();
        bst.delete(deleteValue);

        System.out.println("In-order Traversal after deletion:");
        bst.inorder();
        System.out.println();
    }
}
