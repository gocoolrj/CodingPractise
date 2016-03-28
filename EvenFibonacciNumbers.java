package com.practise.alg;

public class EvenFibonacciNumbers {
	 
    static long evenFib()
    {
        long sum = 0;
        long a = 2, b = 8, c = 0;
         
        sum = sum + a + b;
        while(true)
        {
            c = b * 4 + a;
            if(c>4000000)
                break;
            sum = sum + c;
            a = b;
            b = c;
            
        }
        return sum;
    }
    public static void main(String a[])
    {
    	
        System.out.println("Sum of even valued fibo numbers below 4,000,000 : " + EvenFibonacciNumbers.evenFib());
    }
}