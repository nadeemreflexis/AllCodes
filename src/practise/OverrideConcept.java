package practise;

class Parent
{

	public static void m1()
	{
		System.out.println("Inside m1 method-parent");
	}

}
class Child extends Parent
{
	public static void m1()
	{
		System.out.println("Inside m1 method-child");
	}
	
}

public class OverrideConcept
{
	public static void main(String[] args) 
	{
		Parent.m1();
		// We can't override static method in java becuase static means common we can't change implementation in child class.
//		If we write same static method in child class which means it specific to child class not common to all
		
	}
}

