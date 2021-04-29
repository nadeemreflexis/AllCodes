package practise;

public class QapitolQA {

	public static void main(String[] args) 
	{
		int x[] = {21, 23, 56, 65, 34, 54, 76, 32, 23, 45, 21, 23, 25};
		int smallest = x[0];
		int largest = x[0];
		for(int i=0;i<x.length;i++)
		{
			if(largest < x[i])
			{
				largest=x[i];
			}
			else if(smallest > x[i])
			{
				smallest=x[i];
			}
				
		}
		System.out.println("Largest::"+largest);
		System.out.println("Smallest::"+smallest);
			
		
		
		

	}
	
}
	




