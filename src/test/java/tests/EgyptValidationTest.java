package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.EgyptContry;
import pages.HomePage;

public class EgyptValidationTest extends TestBase {
	HomePage homepage;
	EgyptContry egypt_plan;

	@Test(priority = 1)
	public void choseContry() throws InterruptedException {

		homepage = new HomePage(driver);
		homepage.choseContry();
		egypt_plan = new EgyptContry(driver);
		egypt_plan.egyptContryPlan();
		Assert.assertTrue(HomePage.countryName.getText().contains("Egy"));
		egypt_plan.printTheResult();

	}
}
