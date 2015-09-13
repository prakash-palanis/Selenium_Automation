package testngex;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.*;

import org.testng.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CCBank_VerifyTitleLoginButton {

	public static WebDriver driver = new FirefoxDriver ();
	public static final String myAppURL = "http://ccqol.mint.com/CCBank2/greetings.jsp";
	public int iSleep = 0;
	
	@BeforeTest(alwaysRun=true)
	public void testCCBankInitTest() throws Exception
	{
		System.out.println("testCCBankInitTest @ CCBank_VerifyTitleLoginButton");
		driver.manage().window().maximize();
		driver.get(myAppURL);
		Thread.sleep(iSleep);
	}
	
	@Test(groups={"PresenceVerification","TextVerification"})
	public void testCCBank_VerifyTitle () throws Exception
	{
		System.out.println("");
		System.out.println("START: testCCBank_VerifyTitle");
		String sExpectedTitle = "Greetings";
		String sAppTitle = driver.getTitle();
		//System.out.println("driver.getTitle() output = " + driver.getTitle());	
		Assert.assertEquals(sExpectedTitle, sAppTitle);
		System.out.println("");	
		Thread.sleep(iSleep);
	}

	@Test (dependsOnMethods={"testCCBank_VerifyTitle"},groups={"PresenceVerification"})
	public void testCCBank_VerifyLoginButtonExists () throws Exception
	{
		System.out.println("START: testCCBank_VerifyLoginButtonExists");
		WebElement loginBtn = driver.findElement(By.name("Login"));
		Assert.assertEquals(loginBtn.getAttribute("value"),"Login");		
		Assert.assertTrue(loginBtn != null, "Login Button Exists in the Welcome Screen: ");
		Thread.sleep(iSleep);
	}

	@Test (dependsOnMethods={"testCCBank_VerifyTitle","testCCBank_VerifyLoginButtonExists"},groups={"TextVerification"})
	public void testCCBank_VerifyLoginButtonText () throws Exception
	{
		System.out.println("START: testCCBank_VerifyLoginButtonText");
		WebElement loginBtn = driver.findElement(By.name("Login"));
		Assert.assertEquals(loginBtn.getAttribute("value"),"Login");	
		Thread.sleep(iSleep);
	}

	@AfterTest(alwaysRun=true)
	public void testCCBankFinishTest ( ) throws Exception
	{
		System.out.println("testCCBankInitTest @ CCBank_VerifyTitleLoginButton");
		Thread.sleep(iSleep);
		if (driver != null)
			driver.close();
		System.out.println("");
		
	}
}
