package testcases;

import org.junit.Test;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class TC001_LoginIRCTC extends GenericWrappers{
	/*
	public TC001_LoginIRCTC(RemoteWebDriver driver, ExtentTest test) {
		super(driver, test);
		// TODO Auto-generated constructor stub
	}
	*/
	public TC001_LoginIRCTC(){
		
		browserName="chrome";
		invokeApp(browserName);
		
	}

	@BeforeClass
	public void setData() {
//		testCaseName="Login";
//		testDescription="Login To Opentaps";
//		browserName="chrome";
//		dataSheetName="TC001";
//		category="Smoke";
//		authors="Babu";
	}
	
	
	
	@Test
	public void beforeMethod(){
//		test = startTestCase(testCaseName, testDescription);
//		test.assignCategory(category);
//		test.assignAuthor(authors);
		invokeApp(browserName);
		

	}


}
