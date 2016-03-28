package com.practise.codility;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CodiStringTransform {
	
	
	public static String solution(String A){
		StringBuffer result=new StringBuffer();
		Set<String> set= new HashSet<>();
		
		if(null==A||A.length()==0){
			return A;
		}
		
		for(int i=0;i<A.length();i++){
			set.add(String.valueOf(A.charAt(i)));
		}
		/*if(set.size()==1){
			return set.iterator().next();
			
		}*/
		Iterator<String> itr= set.iterator();
		
		
		while(itr.hasNext()){
			result.append(itr.next());
			if(result.toString().equals("AB")||result.toString().equals("BA")){
				result.setLength(0);
				result.append("A");
			}else if(result.toString().equals("BC")||result.toString().equals("CA")){
				result.setLength(0);
				result.append("C");
			}
		}
		
		return result.toString();
		
	}

	public static void main(String[] args) {
		
		System.out.println("solution 3:"+CodiStringTransform.solution("ABBCC"));
		System.out.println("solution 3:"+CodiStringTransform.solution("AB"));
		System.out.println("solution 3:"+CodiStringTransform.solution("AAAAAAAAAAA"));
		System.out.println("solution 3:"+CodiStringTransform.solution(""));
		System.out.println("solution 3:"+CodiStringTransform.solution("CCCCCCCC"));

	}

}
