import java.util.*;;
public class app {

	
	/*
	     BFS changes for each v in V the values of p and d:
	     	p - will get the previous vertex in one of the shortest paths from vertex s to v
			d - will get the distance from vertex s to v
	*/
	public static void BFS(ArrayList<Vertex> V, Vertex s) {
		initBFS(V, s);
		opBFS(V, s);
	}
	
	public static void opBFS(ArrayList<Vertex> V, Vertex s) {
		LinkedList<Vertex> queue=new LinkedList<Vertex>();
		queue.add(s);
		
		while(queue.size()>0) {
			Vertex current=queue.poll();
			for(Vertex adj:current.adj) {
				if(adj.d==Integer.MAX_VALUE) {
					adj.p=current;
					adj.d=current.d+1;
					queue.add(adj);
				}
			}
		}
	}
	
	public static void initBFS(ArrayList<Vertex> V, Vertex s) {
		for(Vertex v: V) {
			v.p=null;
			v.d=Integer.MAX_VALUE;
		}
		
		s.d=0;
	}
	
	
	public static void printDistance(ArrayList<Vertex> V) {
		for(Vertex v: V) {
			System.out.println(v.vertexNum+ " : "+v.d);
		}
	}

	public static void printPath(ArrayList<Vertex> V) {
		
		for(Vertex v: V) {
			
			String str="";
			for(Vertex current=v;current!=null;current=current.p) {
				str=current.vertexNum + " - " + str;
			}
				
			System.out.println(str.substring(0, str.length()-2));
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Vertex> V=new ArrayList<Vertex>();
		
		
		//--------------------Add vertices --------------------------
		
		// Add vertex 0
		V.add(new Vertex(0));
		
		// Add vertex 1
		V.add(new Vertex(1));
				
		// Add vertex 2
		V.add(new Vertex(2));
				
		// Add vertex 3
		V.add(new Vertex(3));
		
		// Add vertex 4
		V.add(new Vertex(4));
		
		// Add vertex 5
		V.add(new Vertex(5));
		
			
		
		//--------------------Add edges --------------------------
		
		// Add edges from 0
		V.get(0).adj.add(V.get(1));  //add edge (0,1)
			
		// Add edges from 1
		V.get(1).adj.add(V.get(5));  //add edge (1,5)
			
		// Add edges from 2
		V.get(2).adj.add(V.get(0));  //add edge (2,0)
		V.get(2).adj.add(V.get(3));  //add edge (2,3)
					
		// Add edges from 3
		V.get(3).adj.add(V.get(1));  //add edge (3,1)
		V.get(3).adj.add(V.get(4));  //add edge (3,4)

		
		BFS(V,V.get(2));
		
		printDistance(V);
		printPath(V);
	
	}

}