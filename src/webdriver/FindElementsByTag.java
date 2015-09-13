package webdriver;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElementsByTag {

	WebDriver driver = null;
	
	List lsExpectedLinks = new ArrayList ();
	
		
	String sURL = "http://www.google.co.in/";
	
	@BeforeTest (alwaysRun=true)
	public void setup () throws Exception
	{
		System.out.println("@BeforeTest (alwaysRun=true) : Setup");
		driver = new FirefoxDriver ();
		driver.get(sURL);
	}
	
	@Test
	public void findElementsByTag ()
	{
		lsExpectedLinks.add("Gmail");
		lsExpectedLinks.add("Images");
		lsExpectedLinks.add("Sign in");
		
		List lsActElements  = new ArrayList ();
	
	 List<WebElement> elements = driver.findElements(By.tagName("A"));
		for (WebElement el : elements)
		{
			lsActElements.add(el.getText());
			//System.out.println(el.getText() + " -> " + el.getAttribute("href"));
		}

		System.out.println(lsActElements);

		ListIterator<String> strItr = lsExpectedLinks.listIterator();
		
		while (strItr.hasNext() )
		{
			Assert.assertTrue(lsActElements.contains(strItr.next()));
		}
		
		
		//System.out.println(lsActElements.containsAll(lsExpectedLinks));
		
	}
	
	@AfterTest (alwaysRun=true)
	public void tearDown ()
	{
		System.out.println("@AfterTest (alwaysRun=true) : tearDown");
		if (driver != null)
			driver.quit();
	}
	
	
}
