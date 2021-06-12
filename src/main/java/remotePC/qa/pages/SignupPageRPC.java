package remotePC.qa.pages;

import remotePC.qa.base.TestbaseRPC;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignupPageRPC extends TestbaseRPC {
	
	@FindBy(xpath = "//*[@id='94']")
	WebElement consumer29;
	
	@FindBy(xpath = "//input[@id='fname']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='lname']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailAddress;
	
	@FindBy(xpath = "//input[@id='pwd']")
	WebElement password;
	
	@FindBy(xpath = "//select[@id='countryCode']")
	WebElement countrycodeDropdown;
	
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phoneNumber;
	
	@FindBy(xpath = "//input[@name='cardnumber']")
	WebElement cardNumber;
	
	@FindBy(xpath = "//input[@id='bill']")
	WebElement billingAddress;
	
	@FindBy(xpath = "//input[@id='zip']")
	WebElement zipCode;
	
	@FindBy(xpath = "//input[@id='terms_check']")
	WebElement termsAndConditionCheckbox;
	
	@FindBy(xpath = "//input[@id='submit-signup']")
	WebElement submitSignup;
	
	
	public SignupPageRPC() {
		PageFactory.initElements(driver, this);
	}
	
	public void signupPlans() {
		consumer29.click();
	}
	
	public void signupFirstaName(String fname) {
		firstName.sendKeys(fname);
	}
	
	public void signuplastName(String lname) {
		lastName.sendKeys(lname);
	}
	
	public void signupEmailID(String email) {
		emailAddress.sendKeys(email);
	}
	
	public void signupPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void signupCountryCode(String countryName) {
		Select country = new Select(countrycodeDropdown);
		country.selectByVisibleText(countryName);
	}
	
	public void signupPhoneNumber(String phone) {
		phoneNumber.sendKeys(phone);
	}
	
	public void signupCardNumber(String cardNum) {
		cardNumber.sendKeys(cardNum);
	}
	
	public void signupBillingAddress(String billingInfo) {
		billingAddress.sendKeys(billingInfo);
	}
	
	public void signupzipcode(String zipcode) {
		zipCode.sendKeys(zipcode);
	}
	
	public void SingupAgreeCheckbox() {
		termsAndConditionCheckbox.click();
	}
	
	public void SignupbuttonClick() {
		submitSignup.click();
	}
	
	
	

}
