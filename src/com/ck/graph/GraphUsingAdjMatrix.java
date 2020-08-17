package com.ck.graph;

public class GraphUsingAdjMatrix {
	public static void main(String[] args) {
		AdjMatrixGraph graph = new AdjMatrixGraph(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(2, 3);
		System.out.println(graph);
	}
}
