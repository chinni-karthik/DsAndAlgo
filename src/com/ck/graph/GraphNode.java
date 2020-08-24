package com.ck.graph;

public class GraphNode {
	int source;
	int destination;
	Integer weight;

	public GraphNode(int source, int destination, Integer weight) {
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}

	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public int getDestination() {
		return destination;
	}

	public void setDestination(int destination) {
		this.destination = destination;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Edge [source=" + source + ", destination=" + destination + ", weight=" + weight + "]";
	}
}
