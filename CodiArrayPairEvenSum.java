package com.practise.codility;

public class CodiArrayPairEvenSum {

	 public int solution(int[] A) {
	        
	        if(null==A||A.length<2)
	        return 0;
	        
	        int numberEvens=0;
	        int numberOdds=0;
	        
	        for (int i:A) {
	     if (i % 2 == 0) {
	        numberEvens++;
	     }else
	     numberOdds++;
	  }
	  int evenResult= (numberEvens*(numberEvens-1))/2;
	   int oddResult= (numberOdds*(numberOdds-1))/2;
	  
	  return evenResult+oddResult;

	        
	        
	    }
	public static void main(String[] args) {
		CodiArrayPairEvenSum c= new CodiArrayPairEvenSum();
		System.out.println("Solution : "+c.solution(new int[]{}));
		System.out.println("Solution : "+c.solution(new int[]{1}));
		System.out.println("Solution : "+c.solution(new int[]{1,1}));
		System.out.println("Solution : "+c.solution(new int[]{1,1,1,2,2,2}));
		System.out.println("Solution : "+c.solution(new int[]{2,1,5,-6,9}));
		
		
	}

}
