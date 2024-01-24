package GeneralQuestions;
// Java Program to swap two numbers without using temporary
// variable
import java.io.*;

class swappingTwoNos {
	public static void main(String[] args)
	{
		int x = 10;
		int y = 5;

			x = x * y; // x now becomes 50
			y = x / y; // y becomes 10
			x = x / y; // x becomes 5
		
		System.out.println("After swapping:"+ " x = " + x + ", y = " + y);
	}
}

// This code is contributed by Aditya Kumar (adityakumar129)
