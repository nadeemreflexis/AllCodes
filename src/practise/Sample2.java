package practise;

public class Sample2 {

	public static void main(String[] args) 
	{

		Sample2 s = new Sample2();
		s.output();
				

	}
	
	void output()
	{
		long[] x = {7,8,9};
		long[] y = fix(x);
		System.out.println(x[0]+x[1]+x[2]+" ");
		System.out.println(y[0]+y[1]+y[2]);
	}
	
	long[] fix(long[] z)
	{
		z[1]=4;
		return z;
	}

}
