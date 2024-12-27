package org.mubin.DataStructures;
//20
//Graph, AdjacencyList, Node will work together for adjacency list.


public class AdjacencyList {

    //Adjacency List =  An Array/ArrayList of LinkedList
    //                  Each LinkedList has a unique node at the head.
    //                  All adjacent neighbors to that node are added to that node's LinkedList

    //                  runtime complexity to check an Edge: 0(V)
    //                  space complexity: 0(V+E)

    public void run() {

        Graph graph1 = new Graph(5);

        graph1.addNodeToAdjList(new Node('A'));
        graph1.addNodeToAdjList(new Node('B'));
        graph1.addNodeToAdjList(new Node('C'));
        graph1.addNodeToAdjList(new Node('D'));
        graph1.addNodeToAdjList(new Node('E'));

        graph1.addEdgeToAdjList(0,1);
        graph1.addEdgeToAdjList(1,2);
        graph1.addEdgeToAdjList(1,4);
        graph1.addEdgeToAdjList(2,3);
        graph1.addEdgeToAdjList(2,4);
        graph1.addEdgeToAdjList(4,0);
        graph1.addEdgeToAdjList(4,2);

        graph1.printAdjList();
    }
}
