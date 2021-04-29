package interfacepackage;

public interface Sample2
{
	void m1();
}
class Test implements Sample2
{
	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.m1();
	}
}