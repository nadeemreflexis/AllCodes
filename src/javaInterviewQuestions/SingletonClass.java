package javaInterviewQuestions;

public class SingletonClass 
{
	private static SingletonClass singletonObject=null;
	
	public String s;
	
	private SingletonClass()
	{
		 s = "Hello I am string part of singleton class";
	}
	
	public static SingletonClass getInstance()
	{
		if(singletonObject == null)
		{
			singletonObject = new SingletonClass();
		}
		
		return singletonObject;
	}

	public static void main(String[] args) 
	{
		
		SingletonClass x = SingletonClass.getInstance();
		SingletonClass y = SingletonClass.getInstance();
		SingletonClass z = SingletonClass.getInstance();
		
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s);
		

	}

}
