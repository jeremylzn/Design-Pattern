import java.util.ArrayList;

public class Vertex {
	
	public int vertexNum;
	
	// the list of all the adj of the current vertex
	public ArrayList<Vertex> adj;
	
	
	// distance from vertex s to current vertex
	public int d;  
	
	
	// previous vertex in one of the shortest paths
	// from vertex s to current vertex
	public Vertex p;
	
	
	public Vertex(int vertexNum) {
		this.vertexNum = vertexNum;
		this.adj=new ArrayList<Vertex>();
	}

}