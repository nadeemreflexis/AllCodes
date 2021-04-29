package practise;

public class EvenOdd {

	public static void main(String[] args) 
	{
		String input = "9437076543";
		int rev=0;
		String output="";
		input = input.substring(5,10);
        int n = Integer.parseInt(input);
        while(n>0)
        {
        	rev = rev*10+n%10;
        	n = n/10;
        	
        }
        System.out.println(rev);
        int n1 = Integer.parseInt(input);
        System.out.println(n1);
	}

}
