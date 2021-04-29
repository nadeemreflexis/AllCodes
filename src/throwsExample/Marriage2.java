package throwsExample;

public class Marriage2
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
		MarriageOfficer();
	}
	void MarriageRegistrationOffice()
	{
		System.out.println("Inside marriage registration offfice");
		MarriageAgent();
	}
	public static void main(String[] args) 
	{
		Marriage2 couple = new Marriage2();
		couple.MarriageRegistrationOffice();
	}

}
