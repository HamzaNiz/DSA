import java.util.Scanner;

class BinarySearchTrees {
    Node root;

    void insert(int value) {
        root = insertRec(root, value);
    }

    Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    boolean search(int value) {
        return searchRec(root, value);
    }

    boolean searchRec(Node root, int value) {
        if (root == null) {
            return false; // Value not found
        }
        if (root.value == value) {
            return true; // Value found
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

public class BST_Search {
    public static void main(String[] args) {
        BinarySearchTrees bst = new BinarySearchTrees();
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

        System.out.println("Enter a number to search:");
        int searchValue = scanner.nextInt();
        if (bst.search(searchValue)) {
            System.out.println(searchValue + " is found in the BST.");
        } else {
            System.out.println(searchValue + " is not found in the BST.");
        }
    }
}
