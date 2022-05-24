package SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radioAdnCheckbox {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement radio1 = driver.findElement(By.xpath("//*[@id='vfb-7-1']"));
		
		if(radio1.isSelected()==false) {
			radio1.click();
			System.out.println("radio1 is selected");
		}
		
		WebElement check2 = driver.findElement(By.xpath("//*[@id='vfb-6-1']"));
		
		if(check2.isSelected()==false) {
			check2.click();
			System.out.println("checkbox2 is selected");
		}
		
		driver.quit();
		
	}

}
