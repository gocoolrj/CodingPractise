package com.practise.alg;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySort {
	
	public static int[] sortMyLogicBasic(int[] input){
		startTime=System.currentTimeMillis();
		for(int i=0;i<input.length;i++){
			
			for(int j=i+1;j<input.length;j++){
				if(input[i]>input[j])
				{
					int temp=input[j];
					input[j]=input[i];
					input[i]=temp;
				}
			}
		}
		endTime = System.currentTimeMillis();
		System.out.println("That took "+(endTime-startTime));
		return input;
	}
	
	
	
	
	public static int[] generateRandomArray(){
		int[] theArray = new int[200000];
		for(int i=0;i<200000;i++){
			theArray[i] = (int)(Math.random()*50)+10;
			
		}
		return theArray;
	}
	static long startTime,endTime;
	public static void main(String[] args) {
		int theArray[]=ArraySort.generateRandomArray();
		ArraySort.sortMyLogicBasic(theArray);
		CountingSort.sortEngineCountingAlgorithm(theArray);
		
		//System.out.println("The Unsorted Array \n"+Arrays.toString(theArray));
		//System.out.println("The Sorted array \n"+Arrays.toString(ArraySort.sortMyLogicBasic(theArray)));
		//System.out.println("The Sorted array using counting sort \n"+Arrays.toString(CountingSort.sortEngineCountingAlgorithm(theArray)));
	}

}
