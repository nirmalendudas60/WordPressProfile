package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Month1 {

	@Test
	public void Month1_LCM1_windows() {
		System.out.println("This is Month1's LCM1 for windows");
	}
	
	@Test
	public void Month1_LCM1_web() {
		System.out.println("This is Month1's LCM1 for web");
		//System.out.println(urlname);
	}
	
	@AfterTest
	public void AfterMonthlyPatch() {
		System.out.println("This needs to be executed after the monthly patch program");
	}
}
