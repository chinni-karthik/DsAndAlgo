package com.ck.graph;

public class MyGraphWithDistance extends MyGraph {
	private int distance[];

	MyGraphWithDistance(int vertices) {
		super(vertices);
		distance = new int[vertices];
		for (int i = 0; i < distance.length; i++) {
			distance[i] = -1;
		}
	}

	public int[] getDistance() {
		return distance;
	}

	public void setDistance(int[] distance) {
		this.distance = distance;
	}
}
