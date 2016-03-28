import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BreadthFirstSearchDriver {

	public static void main(String args[]){
		Node station1=new Node("Westminister1",null,null);
		Node station2=new Node("Waterloo2",station1,null);
		Node station3=new Node("Trafalgar Square3",station1,station2);
		Node station4 = new Node("Canary Wharf4", station2, station3);
        Node station5 = new Node("London Bridge5", station4, station3);
        Node station6 = new Node("Tottenham Court Road6", station5, station4);
        
        BreadthFirstSearch bfs= new BreadthFirstSearch(station6, station1);
        if(bfs.compute())
        	System.out.println("Path Found");
		
	}

}
class Node{
	
	String stationName;
	Node leftChild;
	Node rightChild;
	Node(String stationName,Node leftChild,Node rightChild){
		this.stationName=stationName;
		this.leftChild=leftChild;
		this.rightChild=rightChild;
			
	}
	
	public boolean equals(Node obj) {
		
		return (obj.stationName.equals(this.stationName));
	}
	@Override
	public String toString() {
		
		return this.stationName;
	}
	public ArrayList<Node> getChildren(){
		ArrayList<Node> childNodes=new ArrayList<>();
		if(this.leftChild!=null){
			childNodes.add(leftChild);
		}
		if(this.rightChild!=null){
			childNodes.add(rightChild);
		}
		return childNodes;
	}
	public boolean removeChild(Node n){
		
		return false;
	}
}

class BreadthFirstSearch{
	Node startNode;
	public BreadthFirstSearch(Node startNode, Node goalNode) {
		super();
		this.startNode = startNode;
		this.goalNode = goalNode;
	}
	Node goalNode;
	public boolean compute(){
		if(this.startNode.equals(goalNode)){
			System.out.println("Goal Node Found: ");
			System.out.println(startNode);
		}
			
		
		Queue<Node> queue= new LinkedList<>();
		Set<Node> explored= new HashSet<>();
		queue.add(this.startNode);
	
		while(!queue.isEmpty()){
			Node currentNode=(Node)queue.remove();
			if(!explored.contains(currentNode)){
				explored.add(currentNode);
			System.out.println(""+currentNode);
			
			if(currentNode.equals(this.goalNode)){
				//System.out.println(explored);
				return true;
			}else  {
				
				if(currentNode.getChildren().isEmpty()){
					return false;
				}else{
				queue.addAll(currentNode.getChildren());
				}
				
			}
			//explored.add(currentNode);*/
			}
				
			}
		return false;	
		}
			
	}

	


