package extentreporters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {
	public static ExtentReports extentreportgenerator()
	{
	String path = System.getProperty("user.dir")+"\\reports\\zerodhareport.html";
	ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
	reporter.config().setReportName("ZerodhaTestReporter");
	reporter.config().setTheme(Theme.DARK);
	ExtentReports extents = new ExtentReports();
	extents.attachReporter(reporter);
	extents.setSystemInfo("organigation", "velocity");
	extents.setSystemInfo("OS", "Windows");
	return extents;
	
	}

}
