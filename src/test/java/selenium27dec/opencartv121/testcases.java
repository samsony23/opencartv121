package selenium27dec.opencartv121;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import testobjects.homepage;
import testobjects.registrationpage;

public class testcases extends testbase

{
	
	@Test
	public void verifyreg() throws InterruptedException {
		
		homepage homepageObj=new homepage(driver);
		homepageObj.verifyaccount();
		
		homepageObj.verifyreg();
		
		registrationpage registrationpageObj = new registrationpage(driver);
		
		registrationpageObj.setfirstname(randomString().toUpperCase());
		
		registrationpageObj.setlastname(randomString().toUpperCase());
		
		registrationpageObj.setemail(randomString() + "@gmail.com");
		Thread.sleep(3000);
		
		registrationpageObj.settelephone(randomNumber());
		String Password= randomAlphaNumeric();
		registrationpageObj.setpass(Password);
		
		registrationpageObj.setconf(Password);
		
		registrationpageObj.clickrad();
		registrationpageObj.clickcheck();
		registrationpageObj.clickcont();
		
		Thread.sleep(4000);
		String confmsg=(registrationpageObj.getconfirmationmsg());
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
	}
	
	public String randomString() {
		
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return  generatedString;
		
		
		
	}
	public String randomNumber() {
		String generatedNumber= RandomStringUtils.randomNumeric(10);
		return generatedNumber;
		
		
		
	}
	public String randomAlphaNumeric() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		String generatedNumber= RandomStringUtils.randomNumeric(10);
		
		return generatedString+"@"+generatedNumber;
		
	}

}
