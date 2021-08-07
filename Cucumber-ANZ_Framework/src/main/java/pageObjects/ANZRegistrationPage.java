package pageObjects;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ANZRegistrationPage {

	public static Logger log = LogManager.getLogger(basePages.Base.class.getName());

	public WebDriver driver;
	public WebDriverWait wait;

		
	By typeSingle = By.xpath("//body/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]");
	By typeJoint =  By.xpath("//body/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/label[1]");
	
	By dependents = By.xpath("//body[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/select[1]");
	By spropertylive = By.xpath("//body/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[1]/label[1]");
	By spropertyinvest = By.xpath("//body/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/ul[1]/li[2]/label[1]");
	
	
	By sincome = By.xpath("//body/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
	By sotherincome = By.xpath("//body/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]");
	By slivingexp = By.xpath("//input[@id='expenses']");
	By scurrenthomeloan = By.xpath("//input[@id='homeloans']");
	By sotherloan = By.xpath("//input[@id='otherloans']");
	By sothercommitments = By.xpath("//body/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[4]/div[1]/input[1]");
	By screditcards = By.xpath("//input[@id='credit']");
	
	By scalculate = By.xpath("//button[@id='btnBorrowCalculater']");
	By restart = By.xpath("(//button[@class='start-over' and @aria-label='Start over'])[2]");
	
	By errormsg = By.xpath("//body[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/span[1]");
	
	
	
	public ANZRegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void fillIncomeForm(String sType, String sDependent, String sProperty, String sYourInc, String sOtherInc,
			String sLivingExp, String sCurrentHomeLoan, String sOtherLoan, String sOtherCommitments, String sCreditLimit) {
		try {
			wait = new WebDriverWait(driver, 5);
			Actions act = new Actions(driver);
			
			if(sType.contains("Single"))
				driver.findElement(typeSingle).click();
			else
				driver.findElement(typeJoint).click();
			
			
			driver.findElement(dependents).click();
			String temp1= "//option[contains(text(),'replacethisval')]";
			String selectdependents= temp1.toString().replace("replacethisval", sDependent);
			By selectdependents1 = By.xpath(selectdependents);
			driver.findElement(selectdependents1).click();
			
			
			if(sProperty.contains("live"))
				driver.findElement(spropertylive).click();
			else
				driver.findElement(spropertyinvest).click();
			
			driver.findElement(sincome).sendKeys((String) sYourInc);
			
			driver.findElement(sotherincome).sendKeys((String) sOtherInc);
			
			driver.findElement(slivingexp).sendKeys((String) sLivingExp);
			
			driver.findElement(scurrenthomeloan).sendKeys((String) sCurrentHomeLoan);
			
			driver.findElement(sotherloan).sendKeys((String) sOtherLoan);
			
			driver.findElement(sothercommitments).sendKeys((String) sOtherCommitments);
			
			driver.findElement(screditcards).sendKeys((String) sCreditLimit);
			
			driver.findElement(scalculate).click();
			
			log.info(" Calculation is successful");

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void clickStartOver() {
		try {
			wait = new WebDriverWait(driver, 5);
			Actions act = new Actions(driver);
			driver.findElement(restart).click();
			log.info(" Clicked Start Over successful");

			String checkreset = driver.findElement(scalculate).getText();
			System.out.println(checkreset);
			Assert.assertTrue(checkreset.contains("Work out"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void checkErrorMessage() {
		try {
			wait = new WebDriverWait(driver, 5);
			
			log.info(" Check Error Message");

			String checkreset = driver.findElement(errormsg).getText();
			System.out.println(checkreset);
			Assert.assertTrue(checkreset.contains("Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

}
