package GraphDFS;

class DFSApp
{
	public static void main(String[] args)
	{
		Graph theGraph = new Graph();
		theGraph.addVertex('a');    // 0  (start for dfs)
		theGraph.addVertex('b');    // 1
		theGraph.addVertex('c');    // 2
		theGraph.addVertex('d');    // 3
		theGraph.addVertex('e');    // 4
		theGraph.addVertex('f');    // 4
		theGraph.addVertex('g');    // 4
		theGraph.addVertex('h');    // 4
		theGraph.addVertex('i');    // 4
		theGraph.addVertex('j');    // 4
		theGraph.addVertex('k');    // 4
		theGraph.addVertex('m');    // 4
		
		theGraph.addEdge(0, 1);     // AB
		theGraph.addEdge(0, 3);     // BC
		theGraph.addEdge(0, 2);     // AD
		theGraph.addEdge(1, 4);     // DE
		theGraph.addEdge(2, 5);     // DE
		theGraph.addEdge(2, 6);     // DE
		theGraph.addEdge(2, 7);     // DE
		theGraph.addEdge(2, 3);     // DE
		theGraph.addEdge(3, 8);     // DE
		theGraph.addEdge(6, 9);     // DE
		theGraph.addEdge(8, 10);     // DE
		theGraph.addEdge(8, 11);     // DE
		
		System.out.print("Visits: ");
		theGraph.dfs();             // depth-first search
		System.out.println();
	}  // end main()
}  // end class DFSApp