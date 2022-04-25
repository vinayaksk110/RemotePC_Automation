package SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtable {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> companyList =  driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		
		System.out.println(companyList.size());
		
		for (int i =0;i<companyList.size();i++) {
			System.out.println(companyList.get(i).getText());
		}
		
		driver.quit();
	}

}
