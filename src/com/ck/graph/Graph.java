package com.ck.graph;

import java.util.ArrayList;

public class Graph {
	static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
		am.get(s).add(d);
		// am.get(d).add(s);
	}

	public static void main(String[] args) {
		int vertices = 5;
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(vertices);
		for (int i = 0; i < vertices; i++) {
			adjList.add(new ArrayList<Integer>());
		}
		// Add edges
		addEdge(adjList, 0, 1);
		addEdge(adjList, 0, 2);
		addEdge(adjList, 0, 3);
		addEdge(adjList, 2, 3);

		printGraph(adjList);
	}

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