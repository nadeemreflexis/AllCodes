package practise;

import java.math.BigDecimal;

public class SampleTest1 {

	public static void main(String[] args) 
	{
		 
		 String balance ="123.00";

		    BigDecimal number = new BigDecimal(balance);

		    String formattedBalance = number.stripTrailingZeros().toPlainString();

		    int roundedBalance = Integer.parseInt(formattedBalance);
		    System.out.println(roundedBalance);
	}
	
	
}
