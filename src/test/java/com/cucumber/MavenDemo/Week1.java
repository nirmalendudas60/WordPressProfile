package testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Week1 {
	
	@Parameters({"URL"})
	@Test
	public void Week1_Patch1_unix(String urlname) {
		System.out.println("This is Week1's unix patch");
		System.out.println(urlname);
	}
	
	@Test(groups= {"SecPatch"})
	public void Week1_Patch2_windows() {
		System.out.println("This is Week1's windows patch");
	}
	@Parameters({"URL"})
	@Test
	public void Week1_Patch3_linux(String urlname) {
		System.out.println("This is Week1's linux patch");
	}
	
	@BeforeClass
	public void BeforeFirstWeekPatch() {
		System.out.println("This needs to be executed before the execution of First week's patch");
	}
	
}
