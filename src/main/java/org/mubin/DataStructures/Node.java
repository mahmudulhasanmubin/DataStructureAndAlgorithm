package org.mubin.DataStructures;
//19

public class Node {
    char data;
    boolean visited;//DepthFirstSearch use

    Node(char data) {
        this.data = data;
    }

    //BinarySearchTree use
    int dataForBinarySearchTree;
    Node left;
    Node right;

    public Node(int dataForBinarySearchTree) {
        this.dataForBinarySearchTree = dataForBinarySearchTree;
    }

//    //AdjacencyList use
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        Node node = (Node) obj;
//        return data == node.data;
//    }
//
//    @Override
//    public int hashCode() {
//        return Integer.hashCode(data);
//    }




}
