package org.example;
//22

public class BreadthFirstSearch {

    //      BFS =   a search algorithm for traversing a tree or graph data structure.
    //              This is done one "level" at a time,
    //              rather than one "branch" at a time.

    // Breadth FS = Traverse graph level by level
    //              Utilizes a Queue
    //              Better if destination is on average close to start
    //              Siblings are before children

    // Depth FS =   Traverse graph branch by branch
    //              Utilizes a Stack
    //              Better if destination is on average far from the start
    //              Children are visited before siblings
    //              More popular for games/puzzles

    public void run() {


        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();

        graph.breathFirstSearch(0);
    }
}
