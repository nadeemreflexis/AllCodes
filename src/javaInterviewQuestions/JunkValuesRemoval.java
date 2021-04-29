package javaInterviewQuestions;

public class JunkValuesRemoval {

	public static void main(String[] args) 
	{
		String s = "$#$%%^^^&*Selenium129090909";
		// Regular expression: [^a-zA-Z0-9]
		String s1=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
	}

}
