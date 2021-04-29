package throwsExample;

public class Marriage5 
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
	void MarriageRegistrationOffice() throws InterruptedException
	{
		System.out.println("Inside marriage registration offfice");
		MarriageAgent();
	}
	public static void main(String[] args) 
	{
		Marriage5 couple = new Marriage5();
		System.out.println("Couple decide to get married");
		try
		{
			couple.MarriageRegistrationOffice();
			System.out.println("Parent handles it");
		}
		catch(InterruptedException ie)
		{
			System.out.println("Parent is unable to handle");
		}
		
	}

}
