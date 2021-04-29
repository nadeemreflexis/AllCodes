package javaInterviewQuestions;

public class NullArgument 
{
	//Pass null argument with method overloading with String and Object types

	public static void main(String[] args) 
	{
		
		test(null);       // it is giving compile time error because StringBuffer is not in a hierarchy of String. Both are different.
		                   //  Since Object is parent and String is child, so compiler give preference to child

	}
	
	public static void test(Object o)
	{
		System.out.println("Object Argument");
	}
	public static void test(String s)
	{
		System.out.println("String Argument");
	}
	/*public static void test(StringBuffer s)        
	{ 
		System.out.println("String Argument");       
	}
*/
}
