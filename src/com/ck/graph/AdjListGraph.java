package com.ck.graph;

import java.util.ArrayList;

public class AdjListGraph {
	private int numVertices;
	private ArrayList<Integer> adjLists[];

	// Add edge
	static void addEdge(ArrayList<ArrayList<Integer>> list, int source, int destination) {
		list.get(source).add(destination);
	}

	// Print the graph
	static void printGraph(ArrayList<ArrayList<Integer>> am) {
		for (int i = 0; i < am.size(); i++) {
			System.out.println("\nVertex " + i + ":");
			for (int j = 0; j < am.get(i).size(); j++) {
				System.out.print(" -> " + am.get(i).get(j));
			}
			System.out.println();
		}
	}
}
