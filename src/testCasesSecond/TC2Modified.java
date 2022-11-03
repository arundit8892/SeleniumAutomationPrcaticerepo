package testCasesSecond;

import org.testng.annotations.Test;

import objrepo2.HomePageOR;
import objrepo2.TestingFormPageOR;
import utilities2.BaseClass2modifiedWithBy;

public class TC2Modified extends BaseClass2modifiedWithBy {
	@Test
	public void test1() {

		openBrowser("chrome");
		openUrl("https://seleniumautomationpractice.blogspot.com/");
		waitImplicit(15);
		HomePageOR.clickTestingHomePage();
		TestingFormPageOR.formFill("arun", "dit", "ditindia banglore ", "America", "male", "cricket");
		alertAction("ok");
		shutdown();

	}

}
