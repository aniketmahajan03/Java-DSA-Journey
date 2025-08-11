

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if(root == null) {
            root = new Node(val);
            return root;
        }

        if(root.data > val) {
            root.left = insert(root.left, val);
        }//else
        if(root.data < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }
 
    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    //bst search code
    public static boolean search(Node root, int key) {
        if(root == null) {
            return false;
        }

        if(root.data == key) {
            return true;
        }
        if(root.data > key) {
           return search(root.left,key);
        }
        else {
            return search(root.right, key);
        }
    }

    //delete node code
    public static Node delete(Node root, int val) {
        if(root.data < val) {
            root.right = delete(root.right, val);
        }
        else if(root.data > val) {
            root.left = delete(root.left, val);
        }
        else{
           if(root.left == null && root.right == null) {
            return null;
           } 
           //case 2
           if(root.left == null) {
            return root.right;
           }
           else if(root.right == null) {
            return root.left;
           }

        //    case 3
        Node IS = findInorderSuccessor(root.right);
        root.data = IS.data;
        root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if(root == null){
            return;
        } if(root.data >= k1 && root.data <= k2) {
            printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1) {
            printInRange(root.left,k1,k2);
        }
        else {
            printInRange(root.left,k1,k2);
        }
    }

    public static boolean isValidBST(Node root, Node min, Node max) {
        if(root == null) {
            return true;
        }
        if(min != null && root.data <= min.data) {
            return false;
        }
        else if(max != null && root.data >= max.data) {
            return false;
        }
        return isValidBST(root.left, min, root) 
        && isValidBST(root.right, root, max);

        // return isValidBST(root.left, min, root);
        // && isValidBST(root.right, root, max);

    }
        public static void main(String aniket[]) {
            int value[] = {8,5,3,1,4,6,10,11,14};
            Node root = null;

            for(int i=0; i<value.length; i++) {
                root = insert(root, value[i]);
            }
            inorder(root);
            System.out.println();

            if(isValidBST(root,null,null)) {
                System.out.print("valid");

            } else {
                System.out.println("invalid");
            }
            
            // printInRange(root,5,12);
                
            // root = delete(root, 5);
            // System.out.println();

            // inorder(root);
        }
    }
