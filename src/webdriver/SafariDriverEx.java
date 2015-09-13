package webdriver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class SafariDriverEx {

	public static void main(String[] args) throws Exception{

		WebDriver driver = new SafariDriver();
		
		driver.get("http://www.apple.com");

		List<WebElement> lsAnc = driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> itr = lsAnc.iterator();

		while (itr.hasNext())
		{
			WebElement webElement = itr.next();
			
			if ( webElement.getAttribute("href").contains("/iphone/"))
			{
				webElement.click();
				break;
			}
			
		}
		
		Thread.sleep(5000);
	}

}
