package javaInterviewQuestions;

public class SwapStrings {

	public static void main(String[] args) 
	{
		String s1 = "Hello";
		String s2 = "World";
		
		System.out.println("***Before swapping***");
	    System.out.println("Value of s1= "+s1);
	    System.out.println("Value of s2= "+s2);
	    
	    //1. append
	    s1 = s1+s2;
	    
	    // 2. store initial string s1 in s2
	    s2 = s1.substring(0, s1.length()-s2.length());
	    
	    // 3. store initial string s2 in s1
	    s1 = s1.substring(s2.length());
	    
	    System.out.println("***After swapping***");
	    System.out.println("Value of s1= "+s1);
	    System.out.println("Value of s2= "+s2);

	}

}
