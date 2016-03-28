import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DepthFirstSearch {
	
	public static void main(String[] args){
		
		Graph aGraph = new Graph(12);
		
        //Connect vertives as seen in the tree image 
        		aGraph.addConnection(0, 1);
        		aGraph.addConnection(0, 2);
        		aGraph.addConnection(0, 3);
        		aGraph.addConnection(1, 5);
        		aGraph.addConnection(1, 6);
        		aGraph.addConnection(2, 4);
        		aGraph.addConnection(3, 2);
		        aGraph.addConnection(3, 4);
		        aGraph.addConnection(4, 1);
		        aGraph.addConnection(6, 4);
		        //aGraph.addConnection(9, 11);
		
        		//Create our object that will search the graph.
    		    //Consider vertex 0 as the source or root node
        	DFS search = new DFS(aGraph, 0);
		      DepthFirstSearchIteration search2= new DepthFirstSearchIteration();
        		System.out.println(search.getFlow());
		        System.out.println(search2.DepthFirstSearchIterationEngine(aGraph, 0));
	}

}

class Graph{
	private int n;
	private List[] siblings;
	Graph(int numb){
		n=numb;
		siblings=new List[numb];
		for(int i=0;i<n;i++){
			siblings[i]=new ArrayList<Integer>();
		}
	}
	void addConnection(int vertex1,int vertex2){
		siblings[vertex1].add(vertex2);
		
	}
	
	int verticesInGraph(){
		return siblings.length;
	}
	
	List<Integer> getVerticesConnected(int vertex){
		return (List<Integer>)siblings[vertex];
	}
	
}

class DFS{
	private boolean[] visited;
	private Queue flow= new LinkedList();
	DFS(Graph g,int root){
		visited= new boolean[g.verticesInGraph()];
//		/System.out.print(" "+root);
		flow.add(root);
		dfsEngine(root,g);
	}
	public Queue getFlow() {
		return flow;
	}
	private void dfsEngine(int root, Graph g) {
		
		//System.out.print(" "+root);
		visited[root]=true;
		for(int i: g.getVerticesConnected(root)){
			if(!visited(i)){
				flow.add(i);
				//System.out.print(" "+i);
				dfsEngine(i,g);
			}
			
		}
		
		
	}
	private boolean visited(int i) {
		// TODO Auto-generated method stub
		return visited[i];
	}
}
