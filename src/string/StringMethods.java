package string;

public class StringMethods {

	public static void main(String[] args) 
	{
		String str = "Nadeem";
	    System.out.println(str.charAt(0));
	    System.out.println(str.toUpperCase());
	    System.out.println(str.toLowerCase());
	    System.out.println(str.indexOf('e'));
	    System.out.println(str.lastIndexOf('e'));
	    System.out.println(str.startsWith("Nad"));
	    System.out.println(str.endsWith("eem"));
	    System.out.println(str.substring(0));
	    System.out.println(str.substring(0,5));
	    String str1 = " nad eem ";
	    System.out.println(str1.length());
	    String str2 = str1.trim();
	    System.out.println(str2.length());
	    System.out.println(str2);
	    String str3 = "This is core java course";
	    String[] strarray = str3.split(" ");
	    System.out.println(strarray.length);
	    for(int i=0;i<strarray.length;i++)
	    {
	    	System.out.println(strarray[i]);
	    }
	   
	}

}
