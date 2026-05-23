package testobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homepage {
	
	

	WebDriver driver;
	
	@FindBy( xpath="(//span[@class='hidden-xs hidden-sm hidden-md'])[3]")
	
	private WebElement account;
	
	
	@FindBy(xpath="//a[@href='https://tutorialsninja.com/demo/index.php?route=account/register']")
	private WebElement reg;
	
	   @FindBy(linkText = "Login")
	    private WebElement login;
	
	
	public homepage ( WebDriver driver) {
	
	this.driver=driver;
	
	PageFactory.initElements(driver,this);
	}
	public void verifyaccount() {
		
		account.click();
	}
	
	public void verifyreg() {
		reg.click();
	}
	public void verifylogin() {

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
	}
	}
	
		


