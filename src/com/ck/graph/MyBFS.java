package com.ck.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class MyBFS {
	static void doBFS(MyGraph g, int source) {
		boolean[] visitedArray = g.getVisited();
		// Create a new queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();
		// Mark the current node as visited and enqueue it
		visitedArray[source] = true;
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
					queue.add(curr);
				}
			}
		}
	}

	public static void main(String args[]) {
		MyGraph g = new MyGraph(6);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 5);
		System.out.println("Following is Breadth First Traversal");
		doBFS(g, 0);
	}
}
