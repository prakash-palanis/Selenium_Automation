package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverChromeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Users/ppalanisamy/Desktop/SELENIUM/libs
		//chromedriver
		
		System.setProperty("webdriver.chrome.driver", "/Users/ppalanisamy/Desktop/SELENIUM/libs/chromedriver" );
		WebDriver driver = new ChromeDriver ();
		
		driver.get("http://www.google.com");
		
		
	}

}
