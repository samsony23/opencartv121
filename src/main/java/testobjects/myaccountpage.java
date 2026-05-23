
package testobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class myaccountpage {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//h2[text()='My Account']")
	
	
	WebElement texx;
	
	
public myaccountpage ( WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
public boolean verifyaccount() {
	
	{
		try {
			return(texx.isDisplayed());
		}catch(Exception e) {
		
		return false;
		
		}
	}
		}
	


}