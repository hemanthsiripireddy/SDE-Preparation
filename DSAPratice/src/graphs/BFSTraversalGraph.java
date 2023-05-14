package graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BFSTraversalGraph {
	
	
	
	public void bfs(Vertex root) {
		Queue<Vertex>queue=new LinkedList<>();
		Set<Vertex>set=new HashSet<>();
		queue.add(root);
		set.add(root);
		System.out.println("visited Node"+root.getName());
		while(!queue.isEmpty()) {
			Vertex cur=queue.poll();
			for(Vertex v:cur.getNeighbours()) {
				if(set.add(v)) {
					System.out.println("visited Node"+v.getName());
					queue.add(v);
					
				}
			}
		}
		
		
	}

}
