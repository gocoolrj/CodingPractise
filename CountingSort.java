package com.practise.alg;

public class CountingSort {

	public static int[] sortEngineCountingAlgorithm(int[] inputArray){
		ArraySort.startTime=System.currentTimeMillis();
		
		int length= inputArray.length;
		//System.out.println(length);
		
		int min=inputArray[0];
		int max=inputArray[0];
		
		for(int i:inputArray){
			if(min>i){
				min=i;
			}else if(max<i){
				max=i;
			}
		}
		
		int range=max-min+1;
		
		
		int count[]=new int[range];
		
		
		for(int number:inputArray){
			count[number-min]++;
		}
		
		int z=0;
		for(int i=min;i<=max;i++){
			while(count[i-min]>0){
				inputArray[z]=i;
				z++;
				count[i-min]--;
			}
		}
		
		ArraySort.endTime = System.currentTimeMillis();
		System.out.println("That took "+(ArraySort.endTime-ArraySort.startTime));
		return inputArray;
	}
	
	public static void main(String[] args) {
		
		

	}

}
