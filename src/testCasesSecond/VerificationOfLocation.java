package testCasesSecond;

import org.testng.annotations.Test;

import utilities2.BaseClass2modifiedWithBy;

public class VerificationOfLocation extends BaseClass2modifiedWithBy {
	
	
	@Test
	
	public void location() throws InterruptedException {
		openBrowser("firefox");
		openUrl("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		verificationOfLOcation("//input[@id='male']");
		Thread.sleep(3000);
		shutdown();
	}

}
