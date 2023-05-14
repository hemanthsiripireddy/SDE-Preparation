package graphs;

public class AdjacencyMatixGraph {
	private boolean[][] adj;
	private int vertexCount;
	public AdjacencyMatixGraph(int vertexCount) {
		
		this.vertexCount = vertexCount;
		this.adj=new boolean[vertexCount][vertexCount];
	}
	
	public void addEdge(int i,int j) {
		if(i>=0&&i<vertexCount&&j>=0&&j<vertexCount) {
			adj[i][j]=true;
		}
	}
	public void removeEdge(int i,int j) {
		if(i>=0&&i<vertexCount&&j>=0&&j<vertexCount) {
			adj[i][j]=false;
		}
		
	}
	public boolean isEdge(int i,int j) {
		if((i<0||i>=vertexCount)||(j<0||j>=vertexCount))
			return false;
		return adj[i][j];
	}
	public void getAllEdges() {
		for(int i=0;i<vertexCount;i++) {
			for(int j=0;j<vertexCount;j++) {
				if(adj[i][j])
					System.out.println(i+" -> "+j);
				
			}
			
		}
	}
	

}
