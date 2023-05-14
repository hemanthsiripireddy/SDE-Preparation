package graphs;

public class TestAdjacencyList {
	public static void method() {
		AdjacencyListGraph a=new AdjacencyListGraph(4);
		Vertex v1=new Vertex(1);
		Vertex v2=new Vertex(2);
		Vertex v3=new Vertex(3);
		Vertex v4=new Vertex(4);
		a.addVertex(v1);
		a.addVertex(v2);
		a.addVertex(v3);
		a.addVertex(v4);
		a.addEdge(v1, v2);
		a.addEdge(v1, v3);
		a.addEdge(v3, v1);
		a.showAllEdges();
		System.out.println("##########");
		a.removeEdge(v1, v2);
		a.addEdge(v1, v4);
		a.showAllEdges();
	}

}
