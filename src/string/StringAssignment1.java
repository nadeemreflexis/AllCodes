package string;

public class StringAssignment1 {

	public static void main(String[] args) 
	{
		String str = "Assignment";
		System.out.println(str);
		StringBuffer sb = new StringBuffer(str);
		sb = sb.append(" Of Java");
		System.out.println(sb);
		String str1 = new String(sb);		
		System.out.println(str1);
		
		

	}

}
