package org.mubin.DataStructures;
//23

public class BinarySearchTree {

    // Binary Search tree = A tree data structure, where each node is greater than it's left child,
    //                      but less than it's right.

    //                      benefit: easy to locate a node when they are in this order

    //                      time complexity: best case O(log n)
    //                                       worst case O(n)

    //                                       space complexity: O(n)

    Node root;

    public void insert(Node node){
        root = insertHelper(root, node);
    }
    private Node insertHelper(Node root, Node node){
        int data = node.dataForBinarySearchTree;
        if(root == null){
            root = node;
            return root;
        }
        else if(data < root.dataForBinarySearchTree){
            root.left = insertHelper(root.left, node);
        }
        else {
            root.right = insertHelper(root.right, node);
        }


        return root;
    }
    public void display(){
        displayHelper(root);
    }
    private void displayHelper(Node root){
        if(root != null){
            displayHelper(root.left);
            System.out.println(root.dataForBinarySearchTree);
            displayHelper(root.right);
        }
    }
    public boolean search(int dataForBinarySearchTree){
        return searchHelper(root, dataForBinarySearchTree);
    }
    private boolean searchHelper(Node root, int dataForBinarySearchTree){
        if(root == null){
            return false;
        }
        else if(root.dataForBinarySearchTree == dataForBinarySearchTree){
            return true;
        } else if (root.dataForBinarySearchTree > dataForBinarySearchTree) {
            return searchHelper(root.left, dataForBinarySearchTree);
        }
        else {
            return searchHelper(root.right, dataForBinarySearchTree);
        }
    }
    public void remove(int dataForBinarySearchTree){
        if (search (dataForBinarySearchTree)) {
            removeHelper(root, dataForBinarySearchTree);
        }
        else {
            System.out.println(dataForBinarySearchTree + " is not found");
        }
    }
    public Node removeHelper(Node root, int dataForBinarySearchTree){
        if(root != null){
            return root;
        }
        else if(root.dataForBinarySearchTree < root.dataForBinarySearchTree){
            root.left = removeHelper(root.left, dataForBinarySearchTree);
        }
        else if(root.dataForBinarySearchTree > root.dataForBinarySearchTree){
            root.right = removeHelper(root.right, dataForBinarySearchTree);
        }
        else { //node found
            if(root.left == null && root.right == null){
                root = null;
            }
            //replace '!=' with '=='
            else if(root.right != null && root.left != null){ //find a successor to replace this node
                root.dataForBinarySearchTree = successor(root);
                root.right = removeHelper(root.right, root.dataForBinarySearchTree);
            }
            else { //find a predecessor to replace this node
                root.dataForBinarySearchTree = predecessor(root);
                root.left = removeHelper(root.left, root.dataForBinarySearchTree);
            }
        }
        return null;
    }
    private int successor(Node root){ //find the least value below the right child of this root node
        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        return root.dataForBinarySearchTree;
    }
    private int predecessor(Node root){ //find the greatest value below the left child of this root node
        root = root.left;
        while(root.right != null){
            root = root.right;
        }
        return root.dataForBinarySearchTree;
    }

    public void run(){
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        tree.remove(5);

        tree.display();

        System.out.println(tree.search(0)); //output = false
        System.out.println(tree.search(1)); //output = true

        tree.remove(0);


    }


}
