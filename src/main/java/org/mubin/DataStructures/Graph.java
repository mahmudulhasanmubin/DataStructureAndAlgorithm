package org.mubin.DataStructures;
//18

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {


    //*************************************************************
    //Adjacent Matrix start
//
//    //1. Directed Graph
//    //2. Undirected Graph
//
//    //                          1. Adjacency matrix (2D Array): time complexity- 0(1) and space complexity- 0(V^2)  [V=vertices]
//    //                          2. Adjacency list (LinkedList): time complexity- 0(V) and space complexity- 0(V+E)  [V=vertices, E=edges]
//
    ArrayList<Node> nodes;
    int[][] matrix;

    public Graph(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNodeToAdjMatrix(Node node) {
        nodes.add(node);
    }

    public void addEdgeToAdjMatrix(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public boolean checkEdgeInAdjMatrix(int src, int dst) {
        if (src < nodes.size() && dst < nodes.size()) {
            return matrix[src][dst] == 1;
        }
        return false;//another solution
//        if (matrix[src][dst] == 1) {
//            return true;
//        }
//        else {
//            return false;
//        }
    }

    public void printAdjMatrix(){
        System.out.println("  ");

        for (Node node : nodes) {
            System.out.println(node.data + " ");
        }
        System.out.println();

        for(int i = 0; i < matrix.length; i++) {
            System.out.println(nodes.get(i).data + " ");
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

    }
//    //Adjacent Matrix end
//
//    //**********************************************************************
//    //Adjacent List start
//
    ArrayList<LinkedList<Node>> alist;

    public Graph(){
        this.alist = new ArrayList<>();
    }

    public void addNodeToAdjList(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdgeToAdjList(int src, int dst){
        if (src < 0 || src >= alist.size() || dst < 0 || dst >= alist.size()) {
            throw new IndexOutOfBoundsException("Source or destination index out of bounds");
        }
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);
    }

    public boolean checkEdgeInAdjList(int src, int dst){
        if (src < 0 || src >= alist.size() || dst < 0 || dst >= alist.size()) {
            return false; // Return false for invalid indices
        }
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);

        for (Node node : currentList) {
            if(node.equals(dstNode)){
                return true;
            }
        }
        return false;
    }

    public void printAdjList(){
        for(LinkedList<Node> currentList : alist){
            for(Node node : currentList){
                System.out.println(node.data + " -> ");
            }
            System.out.println();
        }

    }
//    //Adjacency List end
//    //****************************************************************************************************

    //********************************************************************************
    //Depth First Search (DFS) start


//    ArrayList<Node> nodes;
//    int[][] matrix;
//    Graph(int size){
//        nodes = new ArrayList<>();
//        matrix = new int[size][size];
//    }

    public void addNodeToDepthFirstSearch(Node node){
        nodes.add(node);
    }
    public void addEdgeToDepthFirstSearch(int src, int dst){
        if (src < matrix.length && dst < matrix[src].length){
            matrix[src][dst] = 1;
        }

    }
    public boolean checkEdgeToDepthFirstSearch(int src, int dst){
        if (src < matrix.length && matrix[src][dst] == 1){
            return true;
        }

        return false;
    }
    public void printDepthFirstSearch(){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }

    }
    public void depthFirstSearch(int src){
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src, visited);
    }

    private void dFSHelper(int src, boolean[] visited) {
        //use recursion
        if(visited[src]){
            return;
        }
        else {
            visited[src] = true;
            System.out.println(nodes.get(src).data + " = visited");
        }
        for (int i = 0; i < matrix[src].length; i++) {
            if(matrix[src][i] == 1){
                dFSHelper(i, visited);
            }
        }
//        return;
    }

    //Depth First Search (DFS) end
    //*******************************************************************

    //**************************************************************
    //BreadthFirstSearch (BFS) start

//    ArrayList<Node> nodes;
//    int [][] matrix;

//    Graph(int size){
//        matrix = new int[size][size];
//        nodes = new ArrayList<>();
//
//        for(int i = 0; i < matrix.length; i++){
//            for(int j = 0; j < matrix[i].length; j++){
//                matrix[i][j] = -1;
//            }
//        }
//    }
    public void addNodeToBreadthFirstSearch(Node node){
        nodes.add(node);
    }
    public void addEdgeToBreadthFirstSearch(int src, int dst){
        matrix[src][dst] = 1;

    }
    public boolean checkEdgeInBreadthFirstSearch(int src, int dst){
        if (src < nodes.size() && dst < nodes.size()) {
            return matrix[src][dst] == 1;
        }
        return false;//another solution
//        if (matrix[src][dst] == 1) {
//            return true;
//        }
//        else {
//            return false;
//        }

    }
    public void printBreadthFirstSearch(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("  ");

    }
    public void breathFirstSearch(int src){

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.offer(src);
        visited[0] = true;

        while(!queue.isEmpty()){

            src = queue.poll();
            System.out.println(nodes.get(src).data +" = visited");

            for (int i =0; i<matrix[src].length; i++){
                if (matrix[src][i] == 1 && !visited[i]){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }

    }
    //BreadthFirstSearch end
}
