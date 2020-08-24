package com.ck.graph;

import java.util.Iterator;
import java.util.PriorityQueue;

public class MyDijkstraImpl {
	static void getSSSPUsingDijkstraAlgo(MyWeightedGraph g, int source) {
		Integer[] distanceArray = g.getDistance();
		// Create a new PQ
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		// Mark distance of source to be 0
		distanceArray[source] = 0;	
		pq.add(source);
		while (pq.size() > 0) {
			// pop a vertex from queue and print it
			source = pq.poll();
			System.out.print(source + " ");
			// Traverse all adj vertices,if not visited, mark visited and enqueue
			Iterator<GraphNode> it = g.getAdjLists()[source].listIterator();
			while (it.hasNext()) {
				GraphNode curr = it.next();
				if (distanceArray[curr.getDestination()] > distanceArray[source] + curr.getWeight()) {
					distanceArray[curr.getDestination()] = distanceArray[source] + curr.getWeight();
					pq.add(curr.getDestination());
				}
			}
		}
	}

	private static void printShortestPath(MyWeightedGraph g) {
		System.out.println("\nFollowing is Shortest path using Dijkstra's Algorithm");
		Integer[] distanceArray = g.getDistance();
		for (int i = 0; i < distanceArray.length; i++) {
			System.out.print(distanceArray[i] + " ");
		}
	}

	public static void main(String args[]) {
		MyWeightedGraph g = new MyWeightedGraph(4);
		g.addEdge(0, 1, 5);
		g.addEdge(0, 2, 2);
		g.addEdge(1, 3, 1);
		g.addEdge(2, 1, 1);
		g.addEdge(2, 3, 7);
		System.out.println("Following is the traversal using Dijkstra's Algorithm");
		getSSSPUsingDijkstraAlgo(g, 0);
		printShortestPath(g);
	}
}
