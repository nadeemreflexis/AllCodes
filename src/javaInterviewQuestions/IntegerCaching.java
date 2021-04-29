package javaInterviewQuestions;

public class IntegerCaching {

	public static void main(String[] args) 
	{
		Integer num1 = -128;
		Integer num2 = -128;
		
//          Since object comparison should give false and else part should print, but in this case integer caching
//		  is happening. Integer object is converted to int primitive type which is possible by autoboxing. There is 
//	      range in which this conversion is possible i.e. -128 to 127.
	      
		if(num1 == num2)
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are unequal");
		}
	

	}

}
