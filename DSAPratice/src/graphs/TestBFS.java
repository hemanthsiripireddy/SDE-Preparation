package graphs;

public class TestBFS {
	public static void method() {
		BFSTraversalGraph bfs=new BFSTraversalGraph();
		Vertex v1=new Vertex(1);
		Vertex v2=new Vertex(2);
		Vertex v3=new Vertex(3);
		Vertex v4=new Vertex(4);
		Vertex v5=new Vertex(5);
		Vertex v6=new Vertex(6);
		Vertex v7=new Vertex(7);
		Vertex v8=new Vertex(8);
		v1.addNeighbour(v2);
		v1.addNeighbour(v3);
		v1.addNeighbour(v4);
		v2.addNeighbour(v3);
		v2.addNeighbour(v5);
		v2.addNeighbour(v6);
		v4.addNeighbour(v1);
		//v4.addNeighbour(v7);
		v5.addNeighbour(v8);
		v8.addNeighbour(v7);
		bfs.bfs(v1);
		
	}

}
