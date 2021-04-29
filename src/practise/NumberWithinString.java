package practise;

public class NumberWithinString {

	public static void main(String[] args) 
	{
		String str = "I have 3 years 4 months experience in automation and i rate myself as 4 out of 5";
		String str1 = str.replaceAll("[^\\d]"," ");
		str1=str1.trim();
		String str2 = str1.replaceAll(" +"," ");
		
		String str3[] = str2.split(" ");
		int size = str3.length;
		int arr[] = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = Integer.parseInt(str3[i]);
		}
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println(sum);
		

	}

}
