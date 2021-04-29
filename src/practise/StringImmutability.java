package practise;

public class StringImmutability {

	public static void main(String[] args) 
	{
		String s1 = "Nadeem";
		String s2 = "Nadeem";
//		s2="Zaya";
		s1 = s1.concat(s2);
		System.out.println(s1);
		
	
		int x[] = {21,36,12,78,89,90};
		int smallest = x[0];
		int largest = x[0];
		for(int i=1;i<x.length;i++)
		{
			if(smallest>x[i])
			{
				smallest = x[i];
			}
			else if(largest<x[i])
			{
				largest = x[i];
			}
		}
		System.out.println("Largest::"+largest);
		System.out.println("Smallest::"+smallest);
		
	   String str = "NadeemZaya";
	   
	   

	}

}
