package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.JordanContry;

public class JordanValidationTest extends TestBase {
	HomePage homepage;
	JordanContry jordan_plan;

	@Test(priority = 1)
	public void choseContry() throws InterruptedException {

		homepage = new HomePage(driver);
		homepage.choseContry();
		jordan_plan = new JordanContry (driver);
		jordan_plan.jordanContryPlan();
		Assert.assertTrue(HomePage.countryName.getText().contains("Jor"));
		jordan_plan.printTheResult();

	}
}
