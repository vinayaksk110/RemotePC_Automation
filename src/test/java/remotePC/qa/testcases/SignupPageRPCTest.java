package remotePC.qa.testcases;

import remotePC.qa.pages.SignupPageRPC;
import remotePC.qa.base.TestbaseRPC;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SignupPageRPCTest extends TestbaseRPC{
	SignupPageRPC signupPage;
	
	public SignupPageRPCTest(){
		super();
	}
	
	@BeforeMethod
	public void setup() {
		try{
			String signupURL = reader.getCellData("URL", 1, 1);
			System.out.println("received signup URL");
			System.out.println(signupURL);
			Initialization();
			driver.get(signupURL);
			signupPage = new SignupPageRPC();
		}catch(Exception e){
			System.out.println("Error while initializing");
		}
	}
	@Test(priority = 1)
	public void ValidateSignupPage() {
		String signupPageTitle = driver.getTitle();
		Assert.assertEquals("Signup for a RemotePC account", signupPageTitle, "Login page title did not match");
		System.out.println("Signup title received is: "+signupPageTitle);
	}
	
	@Test(priority = 2)
	public void Consumer1YearPlan() {
		try {
			signupPage.signupPlans();
			submitSignup();
		}catch(Exception e) {
			System.out.println("Error occured while adding plan");
		}
	}
	
	
	@Test(priority = 3)
	public void Validfirstname() {
		try {
			String fname = reader.getCellData("Signup", 0, 2);
			System.out.println("Firstname received from excel is :"+fname);
			signupPage.signupFirstaName(fname);	
		}catch(Exception e){
			System.out.println("Error occured while adding first name");
			
		}
	}
	
	@Test(priority = 4)
	public void ValidLastName() {
		try {
			String lname = reader.getCellData("Signup", 1, 2);
			System.out.println("Lastname received from Excel is :" + lname);
			signupPage.signuplastName(lname);
			Thread.sleep(5000);
		}catch(Exception e) {
			System.out.println("Error while adding last name");
		}
	}
	
	
	@Test
	public void submitSignup() {
		try {
			signupPage.SignupbuttonClick();
		}catch(Exception e) {
			System.out.println("Error while clicking Signup button");
		}
	}
	
	
	@Test
	public void ValidSignup() {
		try {
			Consumer1YearPlan();
			Validfirstname();
			ValidLastName();
			Thread.sleep(7000);
			submitSignup();
		}catch(Exception e) {
			System.out.println("Error ehile signing up");
		}
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
