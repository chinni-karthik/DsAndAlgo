package com.ck.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class MyDFS {
	static void doDFS(MyGraph g, int source) {
		boolean[] visitedArray = g.getVisited();
		visitedArray[source] = true;
		System.out.print(source + " ");
		Iterator itr = g.getAdjLists()[source].listIterator();
		while (itr.hasNext()) {
			int adj_node = (int) itr.next();
			if (!visitedArray[adj_node])
				doDFS(g, adj_node);
		}
	}

	public static void main(String args[]) {
		MyGraph g = new MyGraph(6);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 5);
		System.out.println("Following is Depth First Traversal");
		doDFS(g, 0);
	}
}
