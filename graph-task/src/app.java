import java.util.ArrayList;
public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> V=new ArrayList<ArrayList<Integer>>();
		
		int arr[]= {0,0,0,0,0,0,0,0};
		


		// Add vertex 0
		V.add(new ArrayList<Integer>());
		V.get(0).add(1); //add edge (0,1)
		V.get(0).add(2); //add edge (0,2)
		V.get(0).add(3); //add edge (0,3)


		// Add vertex 1
		V.add(new ArrayList<Integer>());
		V.get(1).add(4); //add edge (1,4)


		// Add vertex 2
		V.add(new ArrayList<Integer>());
		V.get(2).add(1); //add edge (2,1)
		V.get(2).add(4); //add edge (2,4)
		V.get(2).add(5); //add edge (2,5)


		// Add vertex 3
		V.add(new ArrayList<Integer>());
		V.get(3).add(2); //add edge (3,2)


		// Add vertex 4
		V.add(new ArrayList<Integer>());
		V.get(4).add(7); //add edge (4,7)


		// Add vertex 5
		V.add(new ArrayList<Integer>());
		V.get(5).add(3); //add edge (5,3)
		V.get(5).add(4); //add edge (5,4)
		V.get(5).add(6); //add edge (5,6)
		V.get(5).add(7); //add edge (5,7)


		// Add vertex 6
		V.add(new ArrayList<Integer>());
		V.get(6).add(3); //add edge (6,3)
		V.get(6).add(7); //add e 
		
		// Add vertex 7
		V.add(new ArrayList<Integer>());

	      for (int index = 0; index < V.size(); index++) {
	    	  arr[index]+=V.get(index).size();
	    	  for (int k = 0; k < V.get(index).size(); k++) {
	    		  arr[V.get(index).get(k)]+=1;
	    	  }
	      }
	      for (int j = 0; j < arr.length; j++) { 		      
	          System.out.println(j+ "=" + arr[j]);		
	      }
	}
	
	

}

