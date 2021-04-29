package throwsExample;

public class Marriage6 
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
	public static void main(String[] args) throws InterruptedException 
	{	
    Marriage6 couple = new Marriage6();
    System.out.println("Couple decides to get married");
    couple.MarriageRegistrationOffice();
	}
}
