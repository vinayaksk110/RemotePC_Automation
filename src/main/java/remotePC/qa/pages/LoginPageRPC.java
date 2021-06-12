package remotePC.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import remotePC.qa.base.TestbaseRPC;

public class LoginPageRPC extends TestbaseRPC {
	
	@FindBy(xpath = "//*[@id='email']")
	WebElement loginEmail;
	
	@FindBy(xpath = "//*[@id='password']")
	WebElement loginPassword;
	
	@FindBy(xpath = "//*[@id='loginButton']")
	WebElement loginButton;
	
	
	@FindBy(xpath="//a[@id='forgotPwdLink']")
	WebElement forgotPassLink;
	
	@FindBy(linkText = "Create new account")
	WebElement Signuplink;
	
	
	
	
	
	
	//Initializing pageFactory
	public LoginPageRPC() {
		PageFactory.initElements(driver, this);
	}
	
	public void EmailTextField(String email) {
		loginEmail.sendKeys(email);;
	}
	
	public void PasswordTextField(String pass) {
		loginPassword.sendKeys(pass);
	}
	
	public void LoginToAccount() {
		loginButton.click();
	}
	
	public void ForgotPasswordLink() {
		forgotPassLink.click();
	}
	
	public void SignupLinkRedirection() {
		Signuplink.click();
	}
	

}
