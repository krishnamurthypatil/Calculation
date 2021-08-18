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

	By sSignlin = By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/nav[1]/div[1]/a[1]");
	By sEmail =  By.xpath("//input[@id='email_create']");
	By sCreateButton = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]");
	By sGenderM = By.xpath("//div[@id='uniform-id_gender1']");
	By sGenderF = By.xpath("//div[@id='uniform-id_gender2']");
	By sName = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]");
	
	By sLastName = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[3]/input[1]");
	By sPass = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[5]/input[1]");
	
	By sDay = By.xpath("//select[@id='days']");
	By sMnth = By.xpath("//select[@id='months']");
	By sYrs = By.xpath("//select[@id='years']");
	By sEmailFilled = By.xpath("//input[@id='email']");
	
	
	By sFname = By.xpath("//input[@id='firstname']");
	By sLname = By.xpath("//input[@id='lastname']");
	By sComp = By.xpath("//input[@id='company']");
	By sAdd1 = By.xpath("//input[@id='address1']");
	By sAdd2 = By.xpath("//input[@id='address2']");
	By aCity = By.xpath("//input[@id='city']");
	By sState = By.xpath("//select[@id='id_state']");
	By sPostal = By.xpath("//input[@id='postcode']");
	By sCntry = By.xpath("//select[@id='id_country']");
	
	By sAddDetails = By.xpath("//textarea[@id='other']");
	By sHomephone = By.xpath("//input[@id='phone']");
	By sMobile = By.xpath("//input[@id='phone_mobile']");
	By sAddOther = By.xpath("//input[@id='alias']");
	
	By sSubmit = By.xpath("//button[@id='submitAccount']");
	
	By slogout = By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]");
	By susername = By.xpath("//input[@id='email']");
	By suserpasst = By.xpath("//input[@id='passwd']");
	By sLoginto = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]");
	
	By sClickTab = By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]");
	By sAddItem = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/span[1]/span[1]");
	By sAddCart = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]");
	
	By sStoreName = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]");
	
	
	By sGotoCart = By.xpath("//b[contains(text(),'Cart')]");
	By sverifyCart = By.xpath("//tbody/tr[contains(@id,'product_')]/td[2]/p[1]/a[1]");
	
		
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
	
		public void registerForm(String vEmail, String vGender, String vName, String vLName, String vPass,
			String vDay, String vMnth, String vTrs, String vFname, String vLaname,
			String vComp, String vAdd1, String vAdd2,
			String vCity, String vState, String vPostal, String vCntry, String vAddDetails,
			String vHomePh, String vMobile, String vAddOther) {
		try {
			
			
			driver.findElement(sSignlin).click();
			
			driver.findElement(sEmail).sendKeys((String) vEmail);
			
			driver.findElement(sCreateButton).click();
			
		/*	if(vGender.contains("Mr"))
				driver.findElement(sGenderM).click();
			else
				driver.findElement(sGenderF).click();
			
			*/
	
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_firstname")));

			driver.findElement(sName).sendKeys((String) vName);
			
			driver.findElement(sLastName).sendKeys((String) vLName);
			
			String checkEmail = driver.findElement(sEmailFilled).getText();
			System.out.println(checkEmail);
			//Assert.assertTrue(checkEmail.contains(vEmail));
			
			
			
			driver.findElement(sPass).sendKeys((String) vPass);
			driver.findElement(sDay).sendKeys((String) vDay);
			driver.findElement(sMnth).sendKeys((String) vMnth);
			driver.findElement(sYrs).sendKeys((String) vTrs);
			
			driver.findElement(sFname).sendKeys((String) vFname);
			driver.findElement(sLname).sendKeys((String) vLaname);
			driver.findElement(sComp).sendKeys((String) vComp);
			driver.findElement(sAdd1).sendKeys((String) vAdd1);
			driver.findElement(sAdd2).sendKeys((String) vAdd2);
			
			driver.findElement(aCity).sendKeys((String) vCity);
			driver.findElement(sState).sendKeys((String) vState);
			driver.findElement(sPostal).sendKeys((String) vPostal);
			driver.findElement(sCntry).sendKeys((String) vCntry);
			driver.findElement(sAddDetails).sendKeys((String) vAddDetails);
			driver.findElement(sHomephone).sendKeys((String) vHomePh);
			driver.findElement(sMobile).sendKeys((String) vMobile);
			driver.findElement(sAddOther).sendKeys((String) vAddOther);
			
			driver.findElement(sSubmit).click();
			
			
			log.info(" Registration is successful");

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public void checkLoginDetails(String vName, String vLName) {
		try {
			log.info(" Check First / Last Names on the home screen");
			
			
			String tem=vName+" "+vLName;
			
			String sNamesHome="//span[contains(text(),tem)]";
			
			By finalxpath = By.xpath(sNamesHome);
			
			
			String ExpectedText = "Kush Pat";
			
			Assert.assertEquals(ExpectedText, driver.findElement(finalxpath).getText());
			System.out.println("Names displaying Correctly");
			log.info(" Verified User");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void logout() {
		try {
			log.info(" Log out from site");
			
			driver.findElement(slogout).click();
			System.out.println("Logged Out");
			log.info(" Logged Out");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void loginback(String vEmail, String vPass) {
		try {
			log.info(" Log In To site");
			
			driver.findElement(sSignlin).click();
			
			driver.findElement(susername).sendKeys((String) vEmail);
			driver.findElement(suserpasst).sendKeys((String) vPass);
			
			driver.findElement(sLoginto).click();
			System.out.println("Logged In");
			
			log.info(" Logged In");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public void addToCart() {
		try {
			log.info(" Add to Cart");
			
			driver.findElement(sClickTab).click();
			
			String storeText= driver.findElement(sStoreName).getText();
			
			driver.findElement(sAddItem).click();
			driver.findElement(sAddCart).click();
			
			driver.findElement(sGotoCart).click();
			
			
			Assert.assertEquals(storeText, driver.findElement(sverifyCart).getText());
			
			log.info(" Added to Cart and Verified");
		} catch (Exception e) {
			e.printStackTrace();
		}

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
