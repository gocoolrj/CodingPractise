import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearchIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> DepthFirstSearchIterationEngine(Graph g, int root){
		List<Integer> flow= new ArrayList<Integer>();
		boolean[] visited= new boolean[g.verticesInGraph()];
		Stack<Integer> st=new Stack<Integer>();
		st.push(root);
		while(!st.isEmpty()){
			
			int temp= st.pop();
			if(!visited[temp]){
			visited[temp]=true;
			flow.add(temp);
			Stack<Integer> aux=new Stack<Integer>();
			for(int i:g.getVerticesConnected(temp)){
				if(!visited[i]){
				aux.push(i);
				}
			}
			while(!aux.isEmpty()){
                st.push(aux.pop());
            }
			}
			
		}
		
		
		return flow;
		
	}

}

