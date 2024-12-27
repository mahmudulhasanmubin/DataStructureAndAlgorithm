package org.mubin.DataStructures;
//19

//Graph, AdjacencyMatrix, Node will work together for adjacency matrix.


public class AdjacencyMatrix {

    //Adjacency Matrix = An 2D array to store 1's/0's to represent edges
    //                   # of rows =    of unique nodes
    //                   # of columns =    of unique nodes

    //                   runtime complexity to check an Edge: 0(1)
    //                   space complexity: 0(V^2)

    public void run() {

        Graph graph = new Graph(5);//size = 5 means 25 elements
//        Graph graph = new Graph(5);//size = 5 means 25 elements


        graph.addNodeToAdjMatrix(new Node('A'));
        graph.addNodeToAdjMatrix(new Node('B'));
        graph.addNodeToAdjMatrix(new Node('C'));
        graph.addNodeToAdjMatrix(new Node('D'));
        graph.addNodeToAdjMatrix(new Node('E'));

        graph.addEdgeToAdjMatrix(0,1);
        graph.addEdgeToAdjMatrix(1,2);
        graph.addEdgeToAdjMatrix(2,3);
        graph.addEdgeToAdjMatrix(2,4);
        graph.addEdgeToAdjMatrix(4,0);
        graph.addEdgeToAdjMatrix(4,2);

        graph.printAdjMatrix();

//        System.out.println("\n\n" + graph.checkEdge(3,2));

    }
}
