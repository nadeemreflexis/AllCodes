package practise;

import java.util.Scanner;

public class SampleByjus {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String camelcase = sc.next();
		String snakecase = covertFromCamelToSnake(camelcase);
		System.out.println(snakecase);
		sc.close();
		
	}
	
	public static String covertFromCamelToSnake(String s)
	{
		String snake_case = "";
		char ch[] = s.toCharArray();
		if(Character.isUpperCase(ch[0]))
		{
		String result = s.replaceAll("(.)([A-Z])", "$1_$2");
		snake_case = result.toLowerCase();
		}
		else
		{
			String result = s.replaceAll("()([A-Z])", "$1_$2");
			snake_case = result.toLowerCase();
		}
		return snake_case;
	}

}
