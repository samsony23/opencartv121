package selenium27dec.opencartv121;

import org.testng.Assert;
import org.testng.annotations.Test;

import testobjects.homepage;
import testobjects.loginpage;
import testobjects.myaccountpage;

public class testbase2 extends testbase{
	
	
@Test

public void verifylogin() throws InterruptedException {
	
	
	homepage homepageObj = new homepage(driver);
	homepageObj.verifyaccount();
	

	homepageObj.verifylogin();
	
	loginpage loginpageObj= new loginpage(driver);
	loginpageObj.verifymail(prop.getProperty("email"));
	loginpageObj.verifypass(prop.getProperty("password"));
	loginpageObj.verifylogin();
	
	myaccountpage myaccountpageObj = new myaccountpage(driver);
	  boolean targetpage= myaccountpageObj.verifyaccount();
	  Assert.assertEquals(targetpage, true, " login fil");
}
}
