package practise;

public class ThisSuperExample 
{
	String name;
	int age;

	public ThisSuperExample(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println(name);
		System.out.println(age);
	}
	
	
	public static void main(String[] args) 
	{
		
		ThisSuperExample tse = new ThisSuperExample("Tom",20);
	}

}
