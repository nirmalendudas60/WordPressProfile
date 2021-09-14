package testNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Month2 {
	@Test
	public void Month2_LCM2_windows() {
		System.out.println("This is Month2's LCM2 for windows");
	}
	
	@Test
	public void Month2_LCM2_web() {
		System.out.println("This is Month2's LCM2 for web");
	}
	
	@BeforeTest
	public void BeforeMonthlyPatchMethod() {
		System.out.println("This should be executed before the monthly patch program");
	}
	
	@BeforeMethod
	public void BeforeEeryMethod1() {
		System.out.println("This is before every method");
	}

}
