package testNG;

import org.testng.annotations.Test;

public class Week3 {

	@Test(dependsOnMethods= {"Week3_Patch3_linux"})
	public void Week3_Patch1_unix() {
		System.out.println("This is Week3's unix patch");
	}
	
	@Test(groups={"SecPatch"})
	public void Week3_Patch2_windows() {
		System.out.println("This is Week3's windows patch");
	}
	
	@Test
	public void Week3_Patch3_linux() {
		System.out.println("This is Week3's linux patch");
	}
}
