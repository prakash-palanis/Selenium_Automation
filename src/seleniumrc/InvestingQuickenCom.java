package seleniumrc;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.CommandProcessor;
import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.webdriven.WebDriverCommandProcessor;

public class InvestingQuickenCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		DefaultSelenium rcdriver = new DefaultSelenium("localhost", 4444, "*firefox /Applications/Firefox.app/Contents/MacOS/firefox","http://ccqol.mint.com/CCBank2/greetings.jsp");
		rcdriver.start();
		rcdriver.open("/CCBank2/greetings.jsp");
		rcdriver.windowMaximize();
		System.out.println(rcdriver.getTitle());
		rcdriver.stop();
		
	}

}
