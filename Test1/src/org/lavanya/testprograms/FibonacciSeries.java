package org.lavanya.testprograms;
import java.util.Scanner;
public class FibonacciSeries {
      
	public static void main(String[] args) {
		System.out.print("Enter number upto which Fibonacci series to print: ");
			@SuppressWarnings("resource")
			int  n = new Scanner(System.in).nextInt();
	  /*I did not get how to take input from keyboard without using System.in*/
	        System.out.println("Fibonacci series upto " + n +" numbers : ");
		for(int i=1; i<=n; i++){
            System.out.print(fibonacci(i));}
	}
	public static int fibonacci(int n)  {
	    if(n == 0)
	        return 0;
	/*If i dont mention this line,am getting following Exception in IDE
      if(n == 0)
      return 0;
      Enter number upto which Fibonacci series to print: 5
      Fibonacci series upto 5 numbers : 
      1Exception in thread "main" java.lang.StackOverflowError*/
     else
	    	if(n == 1)
	      return 1;
	   else
	      return fibonacci(n - 1) + fibonacci(n - 2);
	}
		}


