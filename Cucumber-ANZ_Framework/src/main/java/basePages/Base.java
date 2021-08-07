package basePages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	protected static WebDriver driver;
	public static Properties prop;
	
	
	public static WebDriver getWebDriver() throws IOException {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/conf.properties");
			prop.load(fis);
			String driverStr = prop.getProperty("browser");
			if (driverStr.equalsIgnoreCase("firefox")) {
				return initFirefoxDriver();
			} else {
				return initChromeDriver();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static WebDriver initChromeDriver() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/krishnamurthypatil/Documents/chromedriver"); //System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver initFirefoxDriver() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/src/main/resources/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		return driver;
	}
	
	public void getScreenshot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(("user.dir")+"/reports/"+result+"screenshot.png"));
		
	}


}
