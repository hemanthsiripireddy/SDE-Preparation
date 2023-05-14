package graphs;

public class AdjacencyListGraph {
	private Vertex[] vertexes;
	private int i;
	

	public AdjacencyListGraph(int size) {
		this.vertexes=new Vertex[size];
		i=0;
	}
	public void addVertex(Vertex v) {
		if(i<vertexes.length) {
			vertexes[i++]=v;
			
		}
	}
	public void addEdge(Vertex v1,Vertex v2) {
		v1.addNeighbour(v2);
	}
	public void removeEdge(Vertex v1,Vertex v2) {
		v1.removeNeighbour(v2);
	}
	public void showAllEdges() {
		for(int j=0;j<vertexes.length;j++) {
			vertexes[j].showNeightbours();
		}
	}
	

}
