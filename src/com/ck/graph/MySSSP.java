package com.ck.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class MySSSP {
	static void getSSSP(MyGraphWithDistance g, int source) {
		boolean[] visitedArray = g.getVisited();
		int[] distanceArray = g.getDistance();
		// Create a new queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();
		// Mark the current node as visited and enqueue it
		visitedArray[source] = true;
		// Mark distance of source to be 0
		distanceArray[source] = 0;
		queue.add(source);
		while (queue.size() > 0) {
			// pop a vertex from queue and print it
			source = queue.poll();
			System.out.print(source + " ");
			// Traverse all adj vertices,if not visited, mark visited and enqueue
			Iterator<Integer> it = g.getAdjLists()[source].listIterator();
			while (it.hasNext()) {
				int curr = it.next();
				if (!visitedArray[curr]) {
					visitedArray[curr] = true;
					distanceArray[curr] = distanceArray[source] + 1;
					queue.add(curr);
				}
			}
		}
	}

	private static void printShortestPath(MyGraphWithDistance g) {
		System.out.println("\nFollowing is Shortest path using BFS");
		int[] distanceArray = g.getDistance();
		for (int i = 0; i < distanceArray.length; i++) {
			System.out.print(distanceArray[i] + " ");
		}
	}

	public static void main(String args[]) {
		MyGraphWithDistance g = new MyGraphWithDistance(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(3, 2);
		g.addEdge(3, 4);
		System.out.println("Following is Breadth First Traversal");
		getSSSP(g, 0);
		printShortestPath(g);
	}
}
