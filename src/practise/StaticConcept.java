package practise;

import practise.StaticConcept.A.B;

public  class StaticConcept 
{
	public static class A
	{
		public static class B
		{
			public void m1()
			{
				System.out.println("Inside inner class B method-m1");
			}
		}
		
	}

	public static void main(String[] args) 
	{
		B s = new B();
		s.m1();
	}

}
