package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DFSTraversalGraph {
	
	private List<Vertex> vertexes=new ArrayList<>();
	Set<Vertex>set;
	public DFSTraversalGraph(List<Vertex>v) {
		this.vertexes=v;
		set=new HashSet<>();
	}
	public void performDFS() {
		for(Vertex v:vertexes) {
			if(set.add(v)) {
				dfs(v);
				
			}
		}
	}
	public void dfs(Vertex root) {
		System.out.println("Visiting node "+root.getName());
		for(Vertex v:root.getNeighbours()) {
			if(set.add(v)) {
				dfs(v);
			}
		}
	}

}
