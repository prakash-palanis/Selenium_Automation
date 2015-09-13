package testngex;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_AnnotationsEx {

	@BeforeSuite
	public void beforeSuite () 	{
		System.out.println("Hi there ...! This is Before Suite. This will run before any tests in this Test class ");
		System.out.println("");
	}


	@BeforeTest
	public void beforeTest () 	{
		System.out.println("");
		System.out.println("Hi there ...! This is Before Test Method. This will run before any tests in this Test class ");		
		System.out.println("");
	}
	

	@BeforeClass
	public void beforeClass () 	{
		System.out.println("Hi there ...! This is Before Class. This will run before any tests in this Test class ");
		System.out.println("");
	}

	@BeforeMethod
	public void beforeMethod () 	{
		System.out.println("Hi there ...! This is Before Method. This will run before every method in this Test class ");
	}
	
	@AfterMethod
	public void afterMethod () 	{
		System.out.println("Hi there ...! This is After Method. This will run after every method in this Test class ");
		System.out.println("");
	}

	//@Test
	@Test (priority = 0)
	public void testcaseFirstPriority (){
		System.out.println("Hi there ...! This is P0 Testcase (# 1).");
		
	}

	//@Test (dependsOnMethods = {"testcaseRegister"})
	@Test (priority = 1)
	public void testcaseSecondPriority (){
		System.out.println("Hi there ...! This is P1 Testcase.(# 2)");
		
	}
	
	//@Test (dependsOnMethods = {"testcaseLogin"})
	@Test (priority = 2)
	public void testcaseThirdPriority (){
		System.out.println("Hi there ...! This is P2 Testcase.(# 3)");
		
	}
		
//	@Test (dependsOnMethods = {"testcaseChangePassword"})
	@Test (priority = 3)
	public void testcaseForthPriority (){
		System.out.println("Hi there ...! This is P3 Testcase.(# 4)");
		
	}

	
	@Test (priority=4)
	public void testcaseRegister (){
		System.out.println("Hi there ...! This is Register Testcase (Step 1).");
		
	}

	@Test (dependsOnMethods = {"testcaseRegister"})
	public void testcaseLogin (){
		System.out.println("Hi there ...! This is Login Testcase.(Step 2)");
		
	}
	
	@Test (dependsOnMethods = {"testcaseLogin"},priority =0)
	public void testcaseChangePassword (){
		System.out.println("Hi there ...! This is Change Password Testcase.(Step 3)");
		//Assert.assertTrue(false);
	}
	
	
	@Test (dependsOnMethods = {"testcaseLogin"},priority=10)
	public void testcaseLogout (){
		System.out.println("Hi there ...! This is Logout Testcase.(Step 4)");
		
	}

	@AfterClass
	public void afterClass () 	{
		System.out.println("Hi there ...! This is After Class. This will run before any tests in this Test class ");
		System.out.println("");
	}

	@AfterTest
	public void afterTest () 	{
		System.out.println("");
		System.out.println("Hi there ...! This is After Test Method. This will run after all the test methods.");
		System.out.println("");
		System.out.println("");

	}

	@AfterSuite
	public void afterSuite () 	{
		System.out.println("");
		System.out.println("Hi there ...! This is After Suite Method. This will run after all the test methods.");
		System.out.println("");
		System.out.println("");

	}


	public void testcaseA_Wout_TestAnno (){
		System.out.println("Hi there ...! This is Testcase is not supposed to run.");
		
	}

}
