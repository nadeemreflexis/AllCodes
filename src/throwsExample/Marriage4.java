package throwsExample;

public class Marriage4 
{
	void MarriageOfficer() throws InterruptedException
	{
		System.out.println("Marriage officer has to approve");
		System.out.println("Some documents are falling short");
		Thread.sleep(3000);
	}
	void MarriageAgent() throws InterruptedException
	{
		System.out.println("Marriage agent takes the case up");
		MarriageOfficer();
	}
	void MarriageRegistrationOffice()
	{
		System.out.println("Inside marriage registration offfice");
		try
		{
			MarriageAgent();
			System.out.println("Marriage Registration office handles it");
		}
		catch(InterruptedException ie)
		{
			System.out.println("Marriage office id unable to handle");
		}
		
	}

	public static void main(String[] args) 
	{
		Marriage4 couple = new Marriage4();
		couple.MarriageRegistrationOffice();

	}

}
