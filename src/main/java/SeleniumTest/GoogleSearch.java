package SeleniumTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("google");
		
		List<WebElement> list= driver.findElements(By.xpath("//ul[@role ='listbox']/li/descendant::div[@class='wM6W7d']"));
		
		System.out.println("number of search results : "+list.size());
		
		for(int i =0;i<list.size();i++) {
			list.get(i).getText();
			if(list.get(i).getText().equals("google meet")) {
				list.get(i).click();
				break;
			}
		}
		
		driver.quit();
	}

}
