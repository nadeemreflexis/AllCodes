package javaInterviewQuestions;

public class PrintHelloWithoutSemiColon {

	public static void main(String[] args) 
	{
		//1st approach
		if(System.out.printf("Hello World"+"\n")== null)
		{
			
		}
		//2nd approach
		if(System.out.append("Hello World"+"\n")==null)
		{
			
		}
		//3rd approach
		if(System.out.append("Hello World"+"\n").equals(null))
		{
			
		}
        //4th approach (Not sure about this approach)
		for(int i=0;i<1;System.out.println("Hello World"))
		{
			i++;
		}
	}

}
