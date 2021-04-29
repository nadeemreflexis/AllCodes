package throwsExample;

public class Marriage1 
{

	void MarriageOfficer()
	{
		try
		{
			System.out.println("Some documents are falling short");
			Thread.sleep(3000);
			System.out.println("Marriage officer is in good mood and signs the document");
		}
		catch(InterruptedException ie)
		{
			System.out.println("Please get the documents, i will wait");
		}
	}
	void MarriageAgent()
	{
		System.out.println("Marriage agent takes the case up");
		MarriageOfficer();
	}
	void MarriageRegistrationOffice()
	{
		System.out.println("Inside marriage registration office");
		MarriageAgent();
	}
	public static void main(String[] args) 
	{
		
		System.out.println("Couple decides to get married");
		Marriage1 couple = new Marriage1();
		couple.MarriageRegistrationOffice();

	}

}
