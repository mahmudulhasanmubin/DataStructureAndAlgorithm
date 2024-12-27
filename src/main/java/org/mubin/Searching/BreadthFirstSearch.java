package org.mubin.Searching;
//22

import org.mubin.DataStructures.Node;
import org.mubin.DataStructures.Graph;

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

        graph.addNodeToBreadthFirstSearch(new Node('A'));
        graph.addNodeToBreadthFirstSearch(new Node('B'));
        graph.addNodeToBreadthFirstSearch(new Node('C'));
        graph.addNodeToBreadthFirstSearch(new Node('D'));
        graph.addNodeToBreadthFirstSearch(new Node('E'));

        graph.addEdgeToBreadthFirstSearch(0,1);
        graph.addEdgeToBreadthFirstSearch(1,2);
        graph.addEdgeToBreadthFirstSearch(1,4);
        graph.addEdgeToBreadthFirstSearch(2,3);
        graph.addEdgeToBreadthFirstSearch(2,4);
        graph.addEdgeToBreadthFirstSearch(4,0);
        graph.addEdgeToBreadthFirstSearch(4,2);

        graph.printBreadthFirstSearch();

        graph.breathFirstSearch(0);
    }
}
