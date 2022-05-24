package SeleniumTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		System.out.println(frames.size());
		
		driver.switchTo().frame("a077aa5e");
		System.out.println("we have switched to iframe");
		driver.findElement(By.xpath("//html/body/a/img")).click();
		driver.switchTo().parentFrame();
		System.out.println("We switched to main frame");
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
