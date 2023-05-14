package graphs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private int name;
	private List<Vertex>adj;
	public Vertex(int name) {
		
		this.name = name;
		adj=new ArrayList<>();
	}
	public void addNeighbour(Vertex vertex) {
		adj.add(vertex);
	}
	public void removeNeighbour(Vertex vertex) {
		adj.remove(vertex);
	}
	public void showNeightbours() {
		for(Vertex v:adj) {
			System.out.println(this.name+"-> "+v.getName());
		}
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	
	public List<Vertex>getNeighbours(){
		return this.adj;
	}
	

}
