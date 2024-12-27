package org.mubin.Searching;
//21
//Graph, Node, DepthFirstSearch class work together

import org.mubin.DataStructures.Node;
import org.mubin.DataStructures.Graph;

public class DepthFirstSearch {

    //      DFS = a search algorithm for traversing a tree or graph data structure
    //              1. Pick a route
    //              2. Keep going until you reach a dead end, or a previously visited node
    //              3. Backtrack to last node that has unvisited adjacent neighbors

    public void run() {

        Graph graph = new Graph(5);

        graph.addNodeToDepthFirstSearch(new Node('A'));
        graph.addNodeToDepthFirstSearch(new Node('B'));
        graph.addNodeToDepthFirstSearch(new Node('C'));
        graph.addNodeToDepthFirstSearch(new Node('D'));
        graph.addNodeToDepthFirstSearch(new Node('E'));

        graph.addEdgeToDepthFirstSearch(0,1);
        graph.addEdgeToDepthFirstSearch(1,2);
        graph.addEdgeToDepthFirstSearch(1,4);
        graph.addEdgeToDepthFirstSearch(2,3);
        graph.addEdgeToDepthFirstSearch(2,4);
        graph.addEdgeToDepthFirstSearch(4,0);
        graph.addEdgeToDepthFirstSearch(4,2);

        graph.printDepthFirstSearch();

        graph.depthFirstSearch(1);
    }





}
