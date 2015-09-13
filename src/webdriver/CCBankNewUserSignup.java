package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class CCBankNewUser
{
	public static final String sURL = "http://ccqol.mint.com/CCBank2/greetings.jsp";	
	
	String sUserName;
	String sPassword;
	
	CCBankNewUser (String username, String password)
	{
		sUserName = username;
		sPassword = password;
	}
	
}

public class CCBankNewUserSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sExpectedResult = "";

		WebDriver driver = new FirefoxDriver ();
				
		CCBankNewUser ccUser = new CCBankNewUser ("QKNAuto", "quicken");
		
		driver.get(CCBankNewUser.sURL);
		
		sExpectedResult = "Greetings";
		
		if (driver.getTitle().compareTo(sExpectedResult) == 0)
		{
			System.out.println("SUCCESS: Expected Title is matching. Expected: "+ sExpectedResult + "  Got:" + driver.getTitle());
		}
		else
		{
			System.err.println("ERROR: Expected Title doesn't match. Expected: "+ sExpectedResult + "  Got:" + driver.getTitle());
		}
		
		driver.findElement(By.name("Create New User")).click();
		
		sExpectedResult = "Create New User";
		
		if (driver.getTitle().compareTo(sExpectedResult) == 0)
		{
			System.out.println("SUCCESS: Expected Title is matching. Expected: "+ sExpectedResult + "  Got:" + driver.getTitle());
		}
		else
		{
			System.err.println("ERROR: Expected Title doesn't match. Expected: "+ sExpectedResult + "  Got:" + driver.getTitle());
		}
		
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(ccUser.sUserName);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(ccUser.sPassword);
		driver.findElement(By.name("submit")).click();
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		String exUser = "There is a user with the same username already in the database";
		String bodyText = driver.findElement(By.tagName("body")).getText();
		
		System.out.println(bodyText.contains(exUser));
	}

}
