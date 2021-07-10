package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DasboardPage {
	
	
	@FindBy(xpath="//*[text()='Dashboard']")
	private WebElement dashboard;
	
	@FindBy(xpath="//*[@id='search-input']")
	private WebElement searchbox;
	
	@FindBy(xpath="//*[text()='SBIN']")
	private WebElement sbin;
	
	


}
