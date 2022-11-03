package objrepo2;

import org.openqa.selenium.By;

import utilities2.BaseClass2modifiedWithBy;

public class MorePageOR extends BaseClass2modifiedWithBy {
	
	public By disabledElement =By.xpath("//a[contains(text(),'DisabledElement')]");
	public By hiddenElement =By.xpath("//a[contains(text(),'HiddenElement')]");
	public By toolTip =By.xpath("//a[contains(text(),'ToolTip')]");
	public By modelDialogue =By.xpath("//a[(text()='Modal Dialogue')]");
	public By iframe =By.xpath("//a[(text()='Iframe')]");
	

}
