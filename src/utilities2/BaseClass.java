package utilities2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public WebDriver driver;
	public String expected;
	public String actual;
	
	public void openBrowser(String browserName,int timeWait) {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\EDUREKA SEPT 2022\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "G:\\EDUREKA SEPT 2022\\Drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "G:\\EDUREKA SEPT 2022\\Drivers\\msedgedriver.exe");
			driver= new EdgeDriver();
		}
		else {
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
	public void shutdown() {
		driver.close();
	}
	public void click(String locVal) {
		driver.findElement(By.xpath(locVal)).click();
	}
	public void verification(String locValue) {
		 expected ="Testing For Page";
		 actual =driver.findElement(By.xpath(locValue)).getText();
		if(expected.equals(actual)) {
			System.out.println("we are on testing form page");
		}
		else {
			System.out.println("test failed and we are not on the required page ");
		}
		
	}
}
