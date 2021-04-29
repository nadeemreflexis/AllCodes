package throwsExample;

public class Marriage {
	
	void MarriageOfficer()
	{
		System.out.println("Marriage officer has to sign the document");
	}
	void MarriageAgent()
	{
		System.out.println("Marriage Agent takes the case up");
		MarriageOfficer();
	}
	void MarriageRegistrationOffice()
	{
		System.out.println("Inside Marriage Registration Office");
		MarriageAgent();
	}
	public static void main(String[] args) 
	{
		Marriage couple = new Marriage();
		System.out.println("Couple decides to get married");
		couple.MarriageRegistrationOffice();
	}

}
