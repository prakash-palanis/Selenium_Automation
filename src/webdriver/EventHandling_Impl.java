package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;


// Step 1 : Create an Event Listener class (Here implemented the interface)

public class EventHandling_Impl implements WebDriverEventListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 2: Create an instance of the WebDriver
		
		WebDriver driver = new FirefoxDriver ();
		
		// Step 3: Create an instance of the EventFiringWebDriver
		
		EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
		
		// Step 4: Create an instance of the Event Listener Class
		
		EventHandling_Impl listener = new EventHandling_Impl();
		
		// Step 5: Register Listener with the EventFiringWebDriver
		
		eventFiringWebDriver.register(listener);
		
		// Step 6: Execute / Fire the events in the EventFiringWebDriver

		eventFiringWebDriver.get("http://www.apple.com");

		eventFiringWebDriver.navigate().to("http://www.yahoo.com");

		eventFiringWebDriver.navigate().back();
		eventFiringWebDriver.navigate().forward();		
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("afterNavigateBack triggered. Current URL :" + driver.getCurrentUrl());
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		System.out.println("afterNavigateForward triggered. Current URL :" + driver.getCurrentUrl());
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("afterNavigateTo triggered. Current URL :" + driver.getCurrentUrl());
		
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("beforeNavigateBack triggered. Current URL :" + driver.getCurrentUrl());
		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("beforeNavigateForward triggered. Current URL :" + driver.getCurrentUrl());
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("beforeNavigateTo triggered. Current URL :" + driver.getCurrentUrl());
		
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

}
