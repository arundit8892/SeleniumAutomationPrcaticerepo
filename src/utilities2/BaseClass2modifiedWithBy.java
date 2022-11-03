package utilities2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass2modifiedWithBy {

	public static WebDriver driver;
	public static WebElement element;

	// public WebElement element;

	public void openBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\EDUREKA SEPT 2022\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "G:\\EDUREKA SEPT 2022\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "G:\\EDUREKA SEPT 2022\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println(" not a valid browser");
		}

		driver.manage().window().maximize();

	}

	public void waitImplicit(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public void openUrl(String url) {
		driver.get(url);
	}

	public void navigate() {
		driver.navigate().back();
	}

	public void navigateUrl(String url) {
		driver.get(url);
	}

	public void shutdown() {
		driver.close();
	}

	public static void click(By locValue) {
		try {
			driver.findElement(locValue).click();
		} catch (Exception e) {
			System.out.println("wrong xpath so element having locator value " +locValue+" is not clickable");
		}
	}

	public static void enterText(By locVa, String data) {
		driver.findElement(locVa).sendKeys(data);
	}

	public void enterText(String locValue, String data) {
		try {
			driver.findElement(By.xpath(locValue)).sendKeys(data);
		} catch (Exception e) {
			System.out.println("wrong xpath value hence could not find target element");
		}
	}

	public void enterText(WebElement element, String data) {
		try {
			element.sendKeys(data);
		} catch (Exception e) {
			System.out.println("web element could not identify");
		}

	}

	public void select(String locValue, String data) {
		try {
			element = driver.findElement(By.xpath(locValue));
			Select s = new Select(element);
			s.selectByVisibleText(data);
		} catch (Exception e) {
			System.out.println("the action did not perform well as the xpath provided could not find thge element");
		}
	}

	public  void select(By locValue, int num) {
		try {
			element = driver.findElement(locValue);
			Select s = new Select(element);
			s.selectByIndex(num);
		} catch (Exception e) {
			System.out.println("the action did not perform well as the xpath provided could not find thge element");
		}
	}

	public static void select(By locVal, String data) {
		try {
			element = driver.findElement(locVal);
			Select s = new Select(element);
			s.selectByVisibleText(data);
		} 
		catch (Exception e) {
			System.out.println("could not find element having locator value "+locVal);
		}

	}

	public void urlValidations(String expectedResult) {
		String actualUrl = driver.getCurrentUrl();
		boolean result = actualUrl.equalsIgnoreCase(expectedResult);
		System.out.println("validation result is " + result);
	}

	public void titleValidation(String expectedTitle) {
		String actualTitle = driver.getTitle();
		boolean result = actualTitle.equalsIgnoreCase(expectedTitle);
		System.out.println("Title validation result is " + result);
	}

	public void alertAction(String action) {
		try {
			if (action.equalsIgnoreCase("ok")) {
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
			} else if (action.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {
			System.out.println("alert operation can not be performed with " + action
					+ "so go and check whether you have given right action ");
		}
	}
	
	public void verificationOfLOcation(String locValu) {
		
	List<WebElement> element	=driver.findElements(By.xpath(locValu));
	
	int count = element.size();
	System.out.println(" total number of web elements having the locator value "+locValu+" is "+count);
	
	for(int i=0;i<count;i++)
	{
		int x=element.get(i).getLocation().getX();
		if(x!=0)
		{
			element.get(i).click();
		}
	}
	
	}
	
}
