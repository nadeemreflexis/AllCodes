package javaInterviewQuestions;

class Human
{
	public void eat()
	{
		System.out.println("Human is eating");
	}
}

class Boy extends Human
{
	public void eat()
	{
		System.out.println("Boy is eating");
	}
}

public class JavaInheritance {

	public static void main(String[] args) 
	{
		Boy b = new Boy();
		b.eat();
		
		Human h = new Boy();
		h.eat();
		

	}

}
