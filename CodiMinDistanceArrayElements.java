package com.practise.codility;

public class CodiMinDistanceArrayElements {
	 public int solution(int[] A) {
	        
	        if(null==A||A.length==0){
	            return -1;
	        }
	        if(A.length==2)
	        return (A[1]-A[0]);
	        
	        int smallest= A[0];
	        int secondSmallest = A[0];
	        for(int i:A){
	            
	            if (i < smallest) {
	            secondSmallest = smallest;
	            smallest = i;
	        } 
	        else if (i < secondSmallest) {
	            secondSmallest = i;
	        }
	        }
	        
	        return secondSmallest-smallest;
	       
	    }
	public static void main(String[] args) {
		CodiMinDistanceArrayElements codi= new CodiMinDistanceArrayElements();
		
		System.out.println("Solution"+codi.solution(new int[]{}));
		System.out.println("Solution"+codi.solution(new int[]{1}));
		System.out.println("Solution"+codi.solution(new int[]{1,2}));
		System.out.println("Solution"+codi.solution(new int[]{8,24,3,20,1,17}));
		System.out.println("Solution"+codi.solution(new int[]{7,21,3,42,3,7}));

	}

}
