import java.util.Comparator;
import java.util.PriorityQueue;

public class KthElementFind {
	
	public static int findKthSmallest(int[] input,int k){
		int n=-1;
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		for(int i:input){
			pq.offer(i);
		}
		while(k>0){
			n=pq.poll();
			k--;
		}
		return n;
	}
	public static int findKthLargest(int[] input,int k){
		int n=-1;
		PriorityQueue<Integer> pq= new PriorityQueue<>(new Comparator<Integer>(){

			@Override
			public int compare(Integer arg0, Integer arg1) {
				
				return arg1-arg0;
			}
			
		});
		for(int i:input){
			pq.offer(i);
		}
		while(k>0){
			n=pq.poll();
			k--;
		}
		return n;
	}
	

	public static void main(String[] args) {
		

	}

}
