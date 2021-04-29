package javaInterviewQuestions;

public class StringManipulation {

	public static void main(String[] args) 
	{
		String s = "The rain has started";
		String s1 = "The rain Has started";
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(5));
		
		System.out.println(s.indexOf('a'));
		
		System.out.println(s.indexOf('a', s.indexOf('a')+1 )); // second occurrence of a
		
		System.out.println(s.indexOf('a', s.indexOf('a', s.indexOf('a')+1 )+1)); // third occurrence of a
 		
		System.out.println(s.indexOf("has"));
		
		System.out.println(s.indexOf("have")); // -1 if string not present
		
		System.out.println(s.equals(s1));
		
		System.out.println(s.equalsIgnoreCase(s1));
		
		// substring
		
		System.out.println(s.substring(4, 8));
		
		// trim
		
		String s2 = "     Selenium is good tool           ";
		System.out.println(s2.trim());
		
		String date= "01-01-2021";
		System.out.println(date.replace("-","/"));
		
		// split
		
		String s3 = "Java is used in selenium automation";
		String[] str = s3.split(" ");
		/*for(String str1:str)
		{
			System.out.println(str1);
		}
		*/
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		// Concat
		String s4 = "Hello";
		String s5 = "World";
		int a=10;
		int b=20;
		
		System.out.println(s4+s5+a+b); // HelloWorld1020
		System.out.println(s4+s5+(a+b)); // HelloWorld30
		System.out.println(s4.concat(s5.concat(String.valueOf(a))));
		
	}

}
