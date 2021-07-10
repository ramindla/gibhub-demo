package testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class CommonClass {

	
	 static WebDriver driver;
	 LoginPage lp;
	@BeforeSuite
	public void openbrowser()
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\Ramu\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
	}
    @BeforeClass	
    public void creatobject()
    {
	
		 lp = new LoginPage(driver);
		
    }
	
	//@AfterSuite
	//public void out() throws Exception
	//{
		
		//driver.quit();
	//}

}

