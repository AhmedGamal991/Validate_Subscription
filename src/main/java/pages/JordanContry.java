package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JordanContry extends PageBase {

	public JordanContry(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "country-name")
	WebElement countryName;
	@FindBy(id = "jo-contry-flag")
	WebElement joContry;

	@FindBy(id = "classic-selection")
	WebElement classicSelection;

	@FindBy(id = "lite-selection")
	WebElement liteSelection;

	@FindBy(id = "premium-selection")
	WebElement premiumSelection;

	public static	@FindBy(id = "currency-lite")
	WebElement currencyLite;
	
	public static	@FindBy(id = "currency-classic")
	WebElement currencyClassic;
	
	public static	@FindBy(id = "currency-premium")
	WebElement currencyPremium;
	
	public static	@FindBy(id = "name-lite")
	WebElement namelite;
	
	public static	@FindBy(id = "name-classic")
	WebElement nameClassic;
	
	public static	@FindBy(id = "name-premium")
	WebElement namepremium;


	public void jordanContryPlan() throws InterruptedException {

		clickButton(joContry);
		Thread.sleep(1000);
		

	}

	public void verifyJordanPlans() throws InterruptedException {
		clickButton(liteSelection);
		clickButton(classicSelection);
		clickButton(premiumSelection);
		Thread.sleep(1000);
		clickButton(currencyLite);
		clickButton(currencyClassic);
		clickButton(currencyPremium);
		Thread.sleep(1000);
		
	}

	public void printTheResult() throws InterruptedException {
		System.out.println("Contry Name: "+countryName.getText());
		System.out.println(namelite.getText()+" Plan: "+currencyLite.getText());
		System.out.println(nameClassic.getText()+" Plan: "+currencyClassic.getText());
		System.out.println(namepremium.getText()+" Plan: "+currencyPremium.getText());

		
							
	

	}

}
