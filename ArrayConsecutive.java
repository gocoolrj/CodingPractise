
public class ArrayConsecutive {
	
	public static boolean isConsecutive(int[] input){
		if(null==input||input.length==0)
			return false;
		if(input.length==1)
			return true;
		int min=input[0],max=input[0];
		for(int i:input){
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		int range=max-min+1;
		int[] count= new int[range];
		for(int i=0;i<input.length;i++){
			if(count[input[i]-min]==1)
				return false;
			count[input[i]-min]++;
			
		}
	
		
		
		return false;
	}

	public static void main(String[] args) {
		int [] arrA = {21,24,22,26,23,25};
		
		System.out.println(isConsecutive(arrA));
		int [] arrB = {11,10,12,14,13};
		System.out.println(isConsecutive(arrB));
		int [] arrC = {11,10,14,13};
		System.out.println(isConsecutive(arrC));

	}

}
