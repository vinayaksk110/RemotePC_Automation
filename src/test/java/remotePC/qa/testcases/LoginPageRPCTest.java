package remotePC.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.LogStatus;

import remotePC.qa.base.TestbaseRPC;
import remotePC.qa.pages.LoginPageRPC;


public class LoginPageRPCTest extends TestbaseRPC{
	
	LoginPageRPC loginPage;
	SignupPageRPCTest signupPageTest;
	
	
	
	public LoginPageRPCTest() {
		super();
	}
	
//	@BeforeTest   // initializing extent report
//	public void setExtentReport() {
//		extent = new ExtentReports(System.getProperty("user.dir")+"\\test-output\\ExtentReport.html", true);
//		extent.addSystemInfo("Host name", "Vinayak");
//		extent.addSystemInfo("OS", "Windows");
//	}
//	
//	@AfterTest  //flushing and closing extent report
//	public void EndReport() {
//		extent.flush();
//		extent.close();
//	}
	
	
	@BeforeMethod
	public void setup() {
		try{
			String loginPageURL = reader.getCellData("URL", 1, 2);
			System.out.println("received signup URL from excel :" + loginPageURL);
			Initialization();
			System.out.println("Browser launched");
			driver.get(loginPageURL);
			System.out.println("URL opened");
			loginPage = new LoginPageRPC();
			signupPageTest = new SignupPageRPCTest();
			
		}catch(Exception e){
			System.out.println("Error while initializing");
		}
	}
	
	@Test
	public void ValidateLoginPage() {
//		extentTest = extent.startTest("ValidateLoginPage");
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals("Login to your RemotePC account", loginPageTitle, "Login page title did not match");
	}
	
	@Test
	public void SignupRedirection() {
//		extentTest = extent.startTest("SignupRedirection");
		loginPage.SignupLinkRedirection();
		signupPageTest.ValidateSignupPage();
	}
	
	
	@Test
	public void loginToConsumerAccount() {
//		extentTest = extent.startTest("loginToConsumerAccount");
		System.out.println("Started loginToConsumerAccount testcase-------------------------------");
		String email = reader.getCellData("LoginCredentials", 0, 6);
		System.out.println("consumer email received :"+email);
		String pass = reader.getCellData("LoginCredentials", 1, 6);
		System.out.println("consumer pass received :"+pass);
		loginPage.EmailTextField(email); //send login email
		loginPage.PasswordTextField(pass); //send password
		loginPage.LoginToAccount();
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement downloadComputers =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='downloadRpc']")));
		if(downloadComputers.isDisplayed()){
			String homePageTitle = driver.getTitle();
			System.out.println(homePageTitle);
			Assert.assertEquals("RemotePC™ - Computers", homePageTitle,"Failed to receive title.Login failed");
			
		}
		
	}
	
	@Test
	public void Invalidlogin() {
//		extentTest = extent.startTest("Invalidlogin");
		System.out.println("Started Invalidlogin testcase-------------------------------");
		String email = reader.getCellData("LoginCredentials", 0, 7);
		System.out.println("consumer email received :"+email);
		String pass = reader.getCellData("LoginCredentials", 1, 7);
		System.out.println("consumer pass received :"+pass);
		loginPage.EmailTextField(email); //send login email
		loginPage.PasswordTextField(pass); //send password
		loginPage.LoginToAccount();
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement errorMessage =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='loginError' and contains(@style,'display: block;')]")));   
		String aErrorMessage = errorMessage.getText();
		assertEquals("Email address or Password is invalid", aErrorMessage,"Error message did not display on login screen");	
	}
	
	@Test
	public void navigateToForgotPassword() {
		loginPage.ForgotPasswordLink();
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement ForgotPASStext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Forgot Password?')]")));
		if(ForgotPASStext.isDisplayed()== true) {
			String forgotPageTitle = driver.getTitle();
			System.out.println(forgotPageTitle);
			Assert.assertEquals("Forgot your RemotePC account password?", forgotPageTitle,"Failed to receive title.Login failed");	
		}
		
	}
	
	
	@AfterMethod
	public void teardown(ITestResult result) {
//		if(result.getStatus()== ITestResult.FAILURE) {
//			extentTest.log(LogStatus.FAIL, "Testcase failed is: "+result.getName());
//			extentTest.log(LogStatus.FAIL, "Testcase failed is: "+result.getThrowable());
//		}else if(result.getStatus()==ITestResult.SKIP) {
//			extentTest.log(LogStatus.SKIP, "Testcase skipped is: "+result.getName());
//		}
//		else if(result.getStatus()== ITestResult.SUCCESS) {
//			extentTest.log(LogStatus.PASS, "Testcase passed is: "+result.getName());
//		}
//		extent.endTest(extentTest);  // to end the extentreport
		driver.quit();
	}
	
	

}
