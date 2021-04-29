package javaInterviewQuestions;

public class StringReverse {

	public static void main(String[] args) 
	{
		String s = "Selenium";
		String rev = "";
		
		int len = s.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println("Reverse String:: "+rev);
		
		StringBuffer s1 = new StringBuffer("Hello World");
		System.out.println(s1.reverse());
	}

}
