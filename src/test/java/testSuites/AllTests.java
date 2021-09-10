package testSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testCases.Homepage;
import testCases.LoginTest;

@RunWith(Suite.class)
@SuiteClasses({ Homepage.class, LoginTest.class })
public class AllTests {
	
	/*
	 * This is a Test Suite.
	 * 
	 * A Test Suite is used to run multiple Test Cases in a single Test Run.
	 * 
	 * In this example I have included both the LoginTest and FlighFinderTest Test Cases.
	 * To run: Right click -> Run as -> JUnit Test
	 * 
	 */
	

}
