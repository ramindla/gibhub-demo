package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver driver;
	@FindBy(xpath="//*[@id='userid']")
	 private WebElement userid;
	
	@FindBy(xpath="//*[@id='password']")
	 private WebElement password;
	
	@FindBy(xpath="//*[@type='submit']")
	 private WebElement loginbt;
	
	@FindBy(xpath="//*[@id='pin']")
	 private WebElement lginpin;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public  void loginToApp()
	{
		userid.sendKeys("DV1510");
		password.sendKeys("Year@123");
		loginbt.click();
		
	}
	public void logpin()
	
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		lginpin.sendKeys("959594");
		loginbt.click();
	}
	
	

}
