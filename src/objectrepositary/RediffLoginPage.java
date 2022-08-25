package objectrepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPage {

	WebDriver driver;

	public RediffLoginPage(WebDriver driver) {

		this.driver = driver;
		
		PageFactory.initElements(driver,this);

	}

	/*
	 * By username = By.xpath("//input[@id='login1']");
	 * By password = By.xpath("//input[@id='password']");
	 * By signIn = By.name("proceed");
	 * By home = By.linkText("rediff.com");
	 */

	@FindBy(xpath = "//input[@id='login1']")
	WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(name = "proceed")
	WebElement signIn;

	@FindBy(linkText = "rediff.com")
	WebElement home;

	public WebElement EmailId() {

		return username;

	}

	public WebElement Password() {
		return password;

	}

	public WebElement Submit() {
		return signIn;
	}

	public WebElement Home() {
		return home;

	}
}