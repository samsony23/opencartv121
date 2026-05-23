package selenium27dec.opencartv121;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testbase {

	public WebDriver driver;
	
public static Properties prop;
	
	public static FileInputStream fip;

	@BeforeClass
	@Parameters({"os","browser"})
	public void openbrowser(String os, String br) throws IOException {

	    System.out.println("Launching browser: " + br);
fip = new FileInputStream ("E:\\gfh\\opencartv121\\configproperties");
		
		prop = new Properties();
		prop.load(fip);
		
		if(prop.getProperty("execution_env").equalsIgnoreCase("remote"){
			DesiredCapabilities cap = new DesiredCapabilities();
			
			cap.setPlatform(Platform.WI1)
		}
		
		
	    switch (br.toLowerCase()) {

	        case "chrome":
	            WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
	            break;

	        case "firefox":
	            WebDriverManager.firefoxdriver().setup();
	            driver = new FirefoxDriver();
	            break;

	        default:
	            throw new RuntimeException("Invalid browser: " + br);
	    }

	    driver.manage().window().maximize();
	    driver.get(prop.getProperty("URL"));
	}

	@AfterClass
	public void closebrowser() {
	    driver.quit(); // better than close()
	}
}