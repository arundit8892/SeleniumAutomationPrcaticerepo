package objrepo2;

import org.openqa.selenium.By;

import utilities2.BaseClass2modifiedWithBy;

public class HomePageOR extends BaseClass2modifiedWithBy {

	public static By testingFormPage = By.xpath("//a[contains(text(),'Testing Form Page')]");
	public By shortWait = By.xpath("//a[contains(text(),'Short Wait')]");
	public By longWait = By.xpath("//a[contains(text(),'Long Wait')]");
	public By xpathOperator = By.xpath("//a[contains(text(),'Xpath Operators')]");
	public By keyboardDisabled = By.xpath("//a[contains(text(),'Keyboard Disabled')]");
	public By newTab = By.xpath("//a[contains(text(),'NewTab')]");
	public By uploadAndDownload = By.xpath("//a[contains(text(),'Upload and Download')]");
	public By more = By.xpath("//a[contains(@class,'blog-pager-older-link')]");

// operation logic

	public static void clickTestingHomePage() {

		click(testingFormPage);

	}

	public void clickShortWait() {
		click(shortWait);
	}

	public void clickLongWait() {
		click(longWait);
	}

	public void clickXpathOperators() {
		click(xpathOperator);
	}

	public void keywordDisabled() {
		click(keyboardDisabled);
	}

	public void newtab() {
		click(newTab);
	}

}