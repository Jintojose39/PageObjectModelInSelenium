package objectrepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffShopping {

	WebDriver driver;

	public RediffShopping(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "Shopping")
	WebElement shopping;

	@FindBy(css = ".homesrchbox.srchword")
	WebElement shopsearch;

	@FindBy(css = ".newsrchbtn")
	WebElement shopButton;

	public WebElement Shoping() {

		return shopping;
	}

	public WebElement ShopSearch() {

		return shopsearch;
	}

	public WebElement ButtonShop() {

		return shopButton;
	}

}
