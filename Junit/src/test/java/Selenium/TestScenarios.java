package Selenium;
import org.junit.After;
import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestScenarios {
	
	
	private Basescreen data;
	private Constants obj;
    private WebElement element;
    private WebDriver driver;
  //  private String windowID=driver.getWindowHandle();
    
	
	
	@BeforeTest
	public void setUp() throws Exception{
	obj = new Constants();
	data = new Basescreen();
	obj.xmlReader();
	data.getUrl();
	Thread.sleep(2000);
	
	}
	
	@Test
	public void test1() throws Exception{
	
	element = data.getWebElementXpath(obj.getsearch());
	data.SendKeys(obj.getPhoto());
	data.getWebElementXpath(obj.getSerchbutton()).click();
	Thread.sleep(2000);
	data.getWebElementXpath(obj.getPrint()).click();
	Thread.sleep(2000);
	
	}
	
	@Test
	public void test2() throws Exception{
		
		element = data.getWebElementXpath(obj.getPharmacymouseover());
		data.mouseOver(element);
		Thread.sleep(20000);
		data.getWebElementXpath(obj.getRefillprescriptions()).click();
		Thread.sleep(30000);
		
	}
	
	@Test
	public void test3() throws Exception{
		
		
		data.getWebElementXpath(obj.getRegister()).click();
		Thread.sleep(1000);
		data.getWebElementXpath(obj.getSignup()).click();
		Thread.sleep(10000);
		
		data.getWebElementXpath(obj.getFirstname()).sendKeys(obj.getFirstnamevalue());
		Thread.sleep(1000);
		data.getWebElementXpath(obj.getLastname()).sendKeys(obj.getLastnamevalue());
		Thread.sleep(1000);
		data.getWebElementXpath(obj.getEmail()).sendKeys(obj.getEmailvaluve());
		Thread.sleep(1000);
		data.getWebElementXpath(obj.getConfirmemailAddress()).sendKeys(obj.getConfirmemailAddressvalue());
		Thread.sleep(1000);
		data.getWebElementXpath(obj.getPassword()).sendKeys(obj.getPasswordvalue());
		Thread.sleep(1000);
		data.getWebElementXpath(obj.getConfirmpassword()).sendKeys(obj.getConfirmpasswordvalue());
		Thread.sleep(1000);
		data.getWebElementXpath(obj.getSubmit()).submit();
		Thread.sleep(10000);
		data.getWebElementXpath(obj.getAlertAccept()).click();
		Thread.sleep(10000);
		//driver.switchTo().alert().accept();
		
	}
	
	@AfterTest
	public void tearDown() throws Exception{
		data.quitBrowser();
		Thread.sleep(5000);
		
	}
}
