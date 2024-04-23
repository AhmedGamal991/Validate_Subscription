package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor) driver;

	}

	public static @FindBy(id = "country-name")
	WebElement countryName;

	@FindBy(id = "eg-contry-flag")
	WebElement egContry;

	@FindBy(id = "ae-contry-flag")
	WebElement aeContry;

	@FindBy(id = "jo-contry-flag")
	WebElement joContry;

	

	public static @FindBy(id = "login_credentials") WebElement AssLogOut;

	public void choseContry() throws InterruptedException {
		clickButton(countryName);
		Thread.sleep(2000);
	}

	public void goToCart() throws InterruptedException {
//		clickButton(cart_container);
		Thread.sleep(2000);
	}

	public void LogOut() throws InterruptedException {
//		clickButton(LogoutBut);
		Thread.sleep(2000);
	}
}
