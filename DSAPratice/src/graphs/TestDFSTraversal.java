package graphs;

import java.util.Arrays;
import java.util.List;

public class TestDFSTraversal {
	public static void method() {
		
		Vertex v1=new Vertex(1);
		Vertex v2=new Vertex(2);
		Vertex v3=new Vertex(3);
		Vertex v4=new Vertex(4);
		Vertex v5=new Vertex(5);
		Vertex v6=new Vertex(6);
		Vertex v7=new Vertex(7);
		Vertex v8=new Vertex(8);
		Vertex v9=new Vertex(9);
		Vertex v10=new Vertex(10);
		Vertex v11=new Vertex(11);
		
		
		v1.addNeighbour(v2);
		v1.addNeighbour(v3);
		v1.addNeighbour(v4);
		v2.addNeighbour(v3);
		v2.addNeighbour(v5);
		v2.addNeighbour(v6);
		v4.addNeighbour(v1);
		v4.addNeighbour(v7);
		v5.addNeighbour(v8);
		v8.addNeighbour(v7);
		//v8.addNeighbour(v9);
		v9.addNeighbour(v10);
		v10.addNeighbour(v11);
		v11.addNeighbour(v9);
		List<Vertex>list=Arrays.asList(v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11);
		DFSTraversalGraph bfs=new DFSTraversalGraph(list);
		bfs.performDFS();
		
	}

}
