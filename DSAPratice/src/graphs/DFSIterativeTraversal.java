package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class DFSIterativeTraversal {
	
	private List<Vertex>vertexes;
	private Stack<Vertex>stack;
	Set<Vertex>set;
	public DFSIterativeTraversal(List<Vertex> vertexes) {
		this.vertexes=vertexes;
		stack=new Stack();
		set=new HashSet<>();
	}
	public void dfsTraversal() {
		for(Vertex v:vertexes) {
			if(set.add(v)) {
				stack.add(v);
				dfsIterative();
			}
			
		}
		
	}
	public void dfsIterative() {
		
		while(!stack.isEmpty()) {
			Vertex cur=stack.pop();
			System.out.println("Visiting: "+cur.getName());
			for(Vertex v:cur.getNeighbours()) {
				if(set.add(v)) {
					stack.add(v);
				}
			}
		}
		
		
		
	}
	
	

}
