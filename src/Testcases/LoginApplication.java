package Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepositary.RediffBusinessEmail;
import objectrepositary.RediffHomePage;
import objectrepositary.RediffLoginPage;
import objectrepositary.RediffShopping;

public class LoginApplication {

	@Test
	public void Login() {

		WebDriver driver = new ChromeDriver();

		System.setProperty("WebDriver.ChromeDriver", "ChromeDriver.exe");

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.manage().window().maximize();

		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.EmailId().sendKeys("jintojose39@gmail.com");
		rd.Password().sendKeys("Jintojose1996");
		rd.Submit().click();
		rd.Home().click();

		RediffHomePage rdh = new RediffHomePage(driver);

		rdh.Search().sendKeys("hello");

		/*
		 * RediffShopping rds = new RediffShopping(driver);
		 * 
		 * rds.Shoping().click();
		 * 
		 * rds.ShopSearch().sendKeys("Book");
		 * 
		 * rds.ButtonShop().click();
		 */

		RediffBusinessEmail rdb = new RediffBusinessEmail(driver);

		rdb.BusinessEmail().click();
		rdb.BusinessLogin().click();
		rdb.BusinessUsename().sendKeys("Jintojose");
		rdb.BusinessPassword().sendKeys("Jinto1996");
		rdb.BusinessSign().click();

		driver.close();

	}

}
