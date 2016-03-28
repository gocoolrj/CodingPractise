
public class SecondLargestElement {
	
	public static int findSecond(int[] input){
		int largest=input[0],secondLargest=0;
		for(int i:input){
			if(largest<i){
				secondLargest=largest;
				largest=i;
			}else if(secondLargest<i){
					secondLargest=i;
			}
					
		}
		return secondLargest;
		
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 10, 20, 40, 32, 44, 51, 6 };
		System.out.println("Second largest Element : " + findSecond(A));

	}

}
