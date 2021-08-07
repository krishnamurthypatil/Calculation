package com.krishna.run;

import basePages.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import pageObjects.ANZCalculatorsPage;
import pageObjects.ANZRegistrationPage;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Step;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ANZSteps extends Base {
	public static Logger log = LogManager.getLogger(basePages.Base.class.getName());

	@Step("Successfully launch the website")
	@Given("^User launch the gillette \"([^\"]*)\" website$")
	public void User_launch_the_gillette_website(String sUrl) throws IOException {
		driver = getWebDriver();
		log.info("Browser initialized");
		driver.get(sUrl);
		driver.manage().window().maximize();
		log.info("Website launch successful");

	}
	
	@Description("User Fills the form and Submit")
	@Then("^User Fills \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" the details$")
	public void User_fills_the_registration_form_and_submit(String sType, String sDependent, String sProperty, String sYourInc, String sOtherInc,
			String sLivingExp, String sCurrentHomeLoan, String sOtherLoan, String sOtherCommitments, String sCreditLimit) throws Throwable {
		ANZRegistrationPage regPage = new ANZRegistrationPage(driver);
		log.info("User On Calculator Page");
		regPage.fillIncomeForm(sType, sDependent, sProperty, sYourInc, sOtherInc, sLivingExp, sCurrentHomeLoan, sOtherLoan, sOtherCommitments, sCreditLimit);
		//driver.quit();
	}

	
	@Then("Click on Start Over")
	public void User_Clicks_Start_Over() {
		ANZRegistrationPage regPage = new ANZRegistrationPage(driver);
		log.info("User On Calculator Page");
		regPage.clickStartOver();
		//driver.quit();
	}
	
	@Then("Check Error Message")
	public void Check_Error_Message() {
		ANZRegistrationPage regPage = new ANZRegistrationPage(driver);
		log.info("Check Error Messagee");
		regPage.checkErrorMessage();
		//driver.quit();
	}
}
