package org.example;
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

        graph1.addNode(new Node('A'));
        graph1.addNode(new Node('B'));
        graph1.addNode(new Node('C'));
        graph1.addNode(new Node('D'));
        graph1.addNode(new Node('E'));

        graph1.addEdge(0,1);
        graph1.addEdge(1,2);
        graph1.addEdge(1,4);
        graph1.addEdge(2,3);
        graph1.addEdge(2,4);
        graph1.addEdge(4,0);
        graph1.addEdge(4,2);

        graph1.print();
    }
}
