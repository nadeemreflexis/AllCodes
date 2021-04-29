package practise;

class Human 
{
	String name;
	
     public void eat()
     {
    	 System.out.println("Human is eating");
     }
}

class Boy extends Human
{
	int id;
	public void eat()
	{
		System.out.println("boy is eating");
	}
}

public class Execution
{
	public static void main(String[] args) 
	{
		Human h = new Boy();
		h.name="My name is nadeem who is parent of boy";
		
		System.out.println(h.name);
		h.eat();
		
		Boy b =(Boy)h;
		b.id=121;
		System.out.println(b.name);
		System.out.println(b.id);
		b.eat();
		
		
	}
}