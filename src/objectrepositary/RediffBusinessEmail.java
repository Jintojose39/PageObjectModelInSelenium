package objectrepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffBusinessEmail {

	WebDriver driver;

	public RediffBusinessEmail(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "Business Email")
	WebElement businessEmail;

	@FindBy(linkText = "Login")
	WebElement businessLogin;

	@FindBy(xpath = "//*[@id='username_direct']")
	WebElement businessUsername;

	@FindBy(xpath = "//*[@id='clpass_direct']")
	WebElement businessPassword;

	@FindBy(xpath = "//*[@id=\"tab1\"]/li[4]/button")
	WebElement businessSignIn;

	public WebElement BusinessEmail() {
		return businessEmail;

	}

	public WebElement BusinessLogin() {
		return businessLogin;

	}

	public WebElement BusinessUsename() {
		return businessUsername;

	}

	public WebElement BusinessPassword() {
		return businessPassword;

	}

	public WebElement BusinessSign() {
		return businessSignIn;

	}

}