package com.ck.graph;

public class AdjMatrixGraph {
	private boolean adjMatrix[][];
	private int numVertices;

	public AdjMatrixGraph(int numVertices) {
		super();
		this.numVertices = numVertices;
		this.adjMatrix = new boolean[numVertices][numVertices];
	}

	// Add edges
	public void addEdge(int i, int j) {
		adjMatrix[i][j] = true;
//	    adjMatrix[j][i] = true;
	}

	// Remove edges
	public void removeEdge(int i, int j) {
		adjMatrix[i][j] = false;
//		adjMatrix[j][i] = false;
	}

	// Print the matrix
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < numVertices; i++) {
			for (boolean j : adjMatrix[i]) {
				s.append((j ? 1 : 0) + " ");
			}
			s.append("\n");
		}
		return s.toString();
	}

}
