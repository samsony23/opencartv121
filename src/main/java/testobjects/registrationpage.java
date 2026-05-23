package testobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registrationpage {

	
	
WebDriver driver;
	
	@FindBy( xpath="//input[@id='input-firstname']")
	
	private WebElement txtfirstname;
	
	@FindBy(xpath= "//input[@id='input-lastname']")
	private WebElement txtlastname;
	
	
	@FindBy(xpath= "//input[@id='input-email']")
	private WebElement txtmail;
	
	@FindBy(xpath =" //input[@id='input-telephone']")
	private WebElement txttel;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement txtpass;
	
	@FindBy(xpath=" //input[@id='input-confirm']")
	private WebElement conf;
	
	@FindBy(xpath ="(//input[@type='radio'])[3]")
	private WebElement but;
	
	@FindBy(xpath ="//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement conbut;
	
	@FindBy(xpath="//div[@id='content']//h1")
	private WebElement msgconfirmation;
	
	public registrationpage ( WebDriver driver) {
		
	this.driver=driver;
	
	PageFactory.initElements(driver,this);
	}
	
	public void setfirstname(String fname) {
		txtfirstname.sendKeys(fname);
		
		
	}
	
	public void setlastname (String lname) {
		txtlastname.sendKeys(lname);
		
		
	}
	public void setemail(String email) {
		txtmail.sendKeys(email);
		
	}
	
	public void settelephone(String tel) {
		txttel.sendKeys(tel);
		
	}
	
	public void setpass(String pass) {
		txtpass.sendKeys(pass);
		
	}
	
	public void setconf(String con) {
		conf.sendKeys(con);
		
	}
	public void clickrad() {
		but.click();
		
	}
	
	public void clickcheck() {
		checkbox.click();
		
	}
	
	public void clickcont() {
		conbut.click();
	}
	
	public String getconfirmationmsg() {
		try {
		return msgconfirmation.getText();
		}catch(Exception e) {
		return (e.getMessage());
		}
}
}
