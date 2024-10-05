package org.example;
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


        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();

//        System.out.println("\n\n" + graph.checkEdge(3,2));

    }
}
