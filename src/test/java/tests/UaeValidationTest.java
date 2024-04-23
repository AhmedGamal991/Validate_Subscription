package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UaeContry;

public class UaeValidationTest extends TestBase {
	HomePage homepage;
	UaeContry uae_plan;

	@Test(priority = 1)
	public void choseContry() throws InterruptedException {

		homepage = new HomePage(driver);
		homepage.choseContry();
		uae_plan = new UaeContry(driver);
		uae_plan.uaeContryPlan();
		Assert.assertTrue(HomePage.countryName.getText().contains("UAE"));
		uae_plan.printTheResult();

	}
}
