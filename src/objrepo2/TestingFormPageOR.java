package objrepo2;

import org.openqa.selenium.By;

import utilities2.BaseClass2modifiedWithBy;

public class TestingFormPageOR extends BaseClass2modifiedWithBy {
	
	public static By heading = By.xpath("//h3[contains(text(),'Testing Form Page')]");
	public static By fName= By.xpath("//input[@id='ts_first_name']");
	public static By LName =By.xpath("//input[@id='ts_last_name']");
	public static By address= By.xpath("//textarea[@name='ts_address']");
	public static By nationality=By.xpath("//select[@name='ts_country']");
	public static By genderMale= By.xpath("//select[@name='ts_country']//following::label[1]");
	public static By genderFeMale= By.xpath("//select[@name='ts_country']//following::label[2]");
	public static By Cricket = By.xpath("//select[@name='ts_country']//following::input[@value='cricket']");
	public static By FootBall = By.xpath("//select[@name='ts_country']//following::input[@value='football']");
	public static By hockey = By.xpath("//select[@name='ts_country']//following::input[@value='Hockey']");
	public static By submit= By.xpath("//input[@name='Submit1']");

	
	//operation logic
	
	public static void formFill(String fname,String lname,String add,String nation,String gender, String interest) {
		enterText(fName, fname);
		enterText(LName, lname);
		enterText(address, add); 
		select(nationality, nation);
		if(gender.equalsIgnoreCase("male")) {
			click(genderMale);
		}
		else if(gender.equalsIgnoreCase("female")) {
			click(genderFeMale);
		}
		else{
			System.out.println("not a valid string content "+gender);
		}
		
		if(interest.equalsIgnoreCase("cricket")) {
			click(Cricket);
		}
		else if(interest.equalsIgnoreCase("football")) {
			click(FootBall);
		}
		else if (interest.equalsIgnoreCase("hockey")) {
			click(hockey);
		}
		else {
			System.out.println("not a valid string conetent "+interest);
		}
		
		click(submit);
		
	}
	
	
}




