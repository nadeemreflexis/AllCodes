package throwsExample;

public class Marriage3 
{
	void MarriageOfficer() throws InterruptedException
	{
		System.out.println("Marriage officer has to approve");
		System.out.println("Some documents are falling short");
		Thread.sleep(3000);
	}
	void MarriageAgent()
	{
		System.out.println("Marriage agent takes the case up");
		try
		{
			MarriageOfficer();
			System.out.println("Agent handles it");
		}
		catch(InterruptedException ie)
		{
			System.out.println("Agent is unable to handle");
		}
		
	}
	void MarriageRegistrationOffice()
	{
		System.out.println("Inside marriage registration offfice");
		MarriageAgent();
	}

	public static void main(String[] args) 
	{
		Marriage3 couple = new Marriage3();
		couple.MarriageRegistrationOffice();

	}

}
