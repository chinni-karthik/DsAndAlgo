package com.ck.graph;

import java.util.Arrays;
import java.util.LinkedList;

public class MyWeightedGraph {
	private int numVertices;
	private LinkedList<GraphNode> adjLists[];
	private Integer distance[];

	MyWeightedGraph(int vertices) {
		numVertices = vertices;
		adjLists = new LinkedList[vertices];
		distance = new Integer[vertices];
		for (int i = 0; i < vertices; i++) {
			adjLists[i] = new LinkedList<GraphNode>();
			distance[i] = Integer.MAX_VALUE;
		}
	}

	void addEdge(int source, int destination, int weight) {
		adjLists[source].add(new GraphNode(source, destination, weight));
	}
	
	public int getNumVertices() {
		return numVertices;
	}

	public void setNumVertices(int numVertices) {
		this.numVertices = numVertices;
	}

	public LinkedList<GraphNode>[] getAdjLists() {
		return adjLists;
	}

	public void setAdjLists(LinkedList<GraphNode>[] adjLists) {
		this.adjLists = adjLists;
	}

	public Integer[] getDistance() {
		return distance;
	}

	public void setDistance(Integer[] distance) {
		this.distance = distance;
	}

	@Override
	public String toString() {
		return "MyWeightedGraph [numVertices=" + numVertices + ", adjLists=" + Arrays.toString(adjLists) + ", distance="
				+ Arrays.toString(distance) + "]";
	}
}
