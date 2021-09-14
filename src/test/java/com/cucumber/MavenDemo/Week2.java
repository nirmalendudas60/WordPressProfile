package testNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Week2 {

	@Test
	public void Week2_Patch1_unix() {
		System.out.println("This is Week2's unix patch");
	}
	
	@Test(groups= {"SecPatch"})
	public void Week2_Patch2_windows() {
		System.out.println("This is Week2's windows patch");
	}
	
	@Test
	public void Week2_Patch3_linux() {
		System.out.println("This is Week2's linux patch");
	}
	
	@BeforeTest
	public void BeforeWeeklyPatch() {
		System.out.println("This should run before the weekly patch program");
	}
	
	@BeforeMethod(groups= {"SecPatch"})
	public void ClearCache() {
		System.out.println("Before executing any method, just clear the cache first");
	}
}
