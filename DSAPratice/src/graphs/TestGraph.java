package graphs;

public class TestGraph {
	public static void method() {
		AdjacencyMatixGraph adj=new AdjacencyMatixGraph(4);
		adj.addEdge(0, 1);
		adj.addEdge(0, 3);
		adj.addEdge(2, 1);
		adj.getAllEdges();
		System.out.println("###########after modification ####");
		
		adj.removeEdge(0, 3);
		adj.addEdge(2, 3);
		adj.getAllEdges();
	}

}
