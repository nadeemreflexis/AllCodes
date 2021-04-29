package javaInterviewQuestions;

class A
{
	void method(int i)
	{
		System.out.println("Inside A- int");
	}
}
class B extends A
{
	
	void method(Integer i)
	{
		System.out.println("Inside B- Integer");
	}
}
public class AutoBoxOverride 
{
	public static void main(String[] args) 
	{
		A a = new B();
		a.method(new Integer(10));
		a.method(10);
		
		B b = new B();
		b.method(new Integer(10));
		b.method(20);
		
	}

}
