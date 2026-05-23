package testobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpass;
	
	@FindBy(xpath= "//input[@type='submit']")
	WebElement but;
	
	public loginpage ( WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
}
public void verifymail(String email) {
	txtemail.sendKeys(email);
	
}public void verifypass(String pass) {
	txtpass.sendKeys(pass);
}public void verifylogin() {
	but.click();
	
}
}