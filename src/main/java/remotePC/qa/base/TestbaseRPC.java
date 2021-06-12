package remotePC.qa.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import remotePC.qa.utils.XLS_Reader;

public class TestbaseRPC {
	
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	public static XLS_Reader reader = new XLS_Reader("..\\RemotePCAutomation\\src\\main\\java\\remotePC\\qa\\utils\\remotepc.xlsx");
	
	public static void Initialization() {
		String browser = reader.getCellData("URL", 1, 3);
		System.out.println("Browser data received from Excel sheet : "+browser);
		
		
		try {
			if(browser.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "..\\RemotePCAutomation\\src\\main\\java\\remotePC\\qa\\utils\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}else if (browser.equals("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "..\\RemotePCAutomation\\src\\main\\java\\remotePC\\qa\\utils\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
		}catch(Exception e) {
			System.out.println("Error while Loading webdriver");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

}
