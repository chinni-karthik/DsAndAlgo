package com.ck.graph;

import java.util.LinkedList;

public class MyGraph {
	private int numVertices;
	private LinkedList<Integer> adjLists[];
	private boolean visited[];

	MyGraph(int vertices) {
		numVertices = vertices;
		adjLists = new LinkedList[vertices];
		visited = new boolean[vertices];
		for (int i = 0; i < vertices; i++)
			adjLists[i] = new LinkedList<Integer>();
	}

	void addEdge(int source, int destination) {
		adjLists[source].add(destination);
	}

	public int getNumVertices() {
		return numVertices;
	}

	public void setNumVertices(int numVertices) {
		this.numVertices = numVertices;
	}

	public LinkedList<Integer>[] getAdjLists() {
		return adjLists;
	}

	public void setAdjLists(LinkedList<Integer>[] adjLists) {
		this.adjLists = adjLists;
	}

	public boolean[] getVisited() {
		return visited;
	}

	public void setVisited(boolean[] visited) {
		this.visited = visited;
	}
}
