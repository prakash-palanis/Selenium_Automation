package testngex;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGSkipTCEx {

	@Test
	public void skipTestcase1 ()
	{
		throw new SkipException ("Hi there .... This is learning of Skipping a Testcase.");
		
	}
	
}
