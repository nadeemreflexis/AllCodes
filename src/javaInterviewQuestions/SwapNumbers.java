package javaInterviewQuestions;

public class SwapNumbers {

	public static void main(String[] args) 
	{
		//1. Swap two numbers with using third variable
	    int a=10;
	    int b=20;
	    System.out.print("Before swapping value of a and b: ");
	    System.out.print(a+" ");
	    System.out.println(b);
	    
	    int c=a;
	    a=b;
	    b=c;
	    System.out.print("After swapping value of a and b: ");
	    System.out.print(a+" ");
	    System.out.println(b);
		
	    //2. Swap two numbers without using third variable (by addition and subtraction)
	    a = a+b; // 30
	    b = a-b; // 30-20=10
	    a = a-b; // 30-10=20
	    System.out.print("After swapping without using third variable(+&-) values of a and b are: ");
	    System.out.print(a+" ");
	    System.out.println(b);
	    
	    //3. swap two numbers without using third variable (by multiplication and division)
	    a = a*b;  // 200
	    b = a/b;  // 200/20=10
	    a = a/b;  // 200/10=20
	    System.out.print("After swapping without using third variable(*&/) values of a and b are: ");
	    System.out.print(a+" ");
	    System.out.println(b);
	    
	    //4. swap two numbers by using XOR(^)
	    a = a^b;
	    b = a^b;
	    a = a^b;
	    System.out.print("After swapping without using third variable(XOR) values of a and b are: ");
	    System.out.print(a+" ");
	    System.out.println(b);
	    
	    
	}

}
