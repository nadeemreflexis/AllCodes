package practise;

public class ByjusProgram2 {

	public static void main(String[] args) 
	{
		String str = "Hi*,"
				+ "\n"+ "I am Kavya%s#*";
		
		String str1 = str.replaceAll("[^A-Za-z0-9 ,]","");
		System.out.println(str1);

	}

}


/*

Page object Model with page factory hybrid framework:
	
	Maven Project:
		src/main/java -- reusable methods
		basepage.java -- contructor for webdriver and pagefactory element initialization
		page1.java extends basepage
		page2.java extends basepage
		page3.java extends basepage
		
		pages package
		util package -- config.properties, json file, excel file
		resource package -- jsonReader.java, xlsxReader.java
		
		
		src/test/java -- test scripts
		baseTest.java -- @BeforeTest and @AfterTest for pre condition and post condition
		LoginTest.java -- Create an object of Page 1
		
		
		testng.xml
		one default boiler plate 
		test suite,test,class name 
		
		pom.xml
		define all dependencies
		for excuting testng.xml , we use surefire plugin in pom.xml
		
		At last we run pom.xml
		
		
		
		
		git clone "url of repostory"
		
		git init
		
		git remote add origin git@github.com:projectname.git
		
		git status
		
		git add -A
		
		git commit -m "first commit"
		
		git push -u origin master
		
		username and password 
		
		git pull 
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		