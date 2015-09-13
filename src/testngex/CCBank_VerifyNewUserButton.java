package testngex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CCBank_VerifyNewUserButton {

	public static WebDriver driver = new FirefoxDriver ();
	public static final String myAppURL = "http://ccqol.mint.com/CCBank2/greetings.jsp";
	public int iSleep = 0;
	
//	@BeforeTest(groups={"MustRun"})
	@BeforeTest(alwaysRun=true)
	public void testCCBankInitTest() throws Exception
	{
		System.out.println("testCCBankInitTest @ CCBank_VerifyNewUserButton");
		driver.manage().window().maximize();
		driver.get(myAppURL);
		Thread.sleep(iSleep);
	}
	

	@Test (groups={"PresenceVerification"})
	public void testCCBank_VerifyNewUserButtonExists () throws Exception
	{
		System.out.println("START: testCCBank_VerifyNewUserButtonExists");
		
		WebElement newUserBtn = driver.findElement(By.name("Create New User"));
		Assert.assertEquals(newUserBtn.getAttribute("value"),"Create New User");		
		Assert.assertTrue(newUserBtn != null, "Create New User Button Exists in the Welcome Screen: ");
		Thread.sleep(iSleep);
	}

	@Test (dependsOnMethods={"testCCBank_VerifyNewUserButtonExists"},groups={"TextVerification"})
	public void testCCBank_VerifyNewUserButtonText () throws Exception
	{
		System.out.println("START: testCCBank_VerifyNewUserButtonText");
		WebElement newUserBtn = driver.findElement(By.name("Create New User"));
		Assert.assertEquals(newUserBtn.getAttribute("value"),"Create New User");	
		Thread.sleep(iSleep);
	}

	@AfterTest(alwaysRun=true)
	public void testCCBankFinishTest ( ) throws Exception
	{
		System.out.println("testCCBankFinishTest @ CCBank_VerifyNewUserButton");
		Thread.sleep(iSleep);
		
		if (driver != null)
			driver.close();
		System.out.println("");
		
	}
}

