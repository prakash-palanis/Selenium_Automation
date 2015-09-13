package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GetAttributeEx {

	public static final String sURL = "http://ccqol.mint.com/CCBank2/greetings.jsp";	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteWebDriver driver = new FirefoxDriver();
		
		driver.get(sURL);
	
		
		System.out.println(driver.findElement(By.xpath("//*[@name='Login']")).getAttribute("value"));
		System.out.println(driver.findElement(By.xpath("//*[@name='Login']")).getAttribute("type"));
	
		driver.quit();

	}

}
