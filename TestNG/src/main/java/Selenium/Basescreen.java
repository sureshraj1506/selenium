package Selenium;

import java.io.IOException;

import javax.sql.rowset.spi.XmlReader;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import Selenium.Constants;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class Basescreen {
	
	private WebDriver driver;
	private WebElement element;
	private ReadXmlFile readXMl;
	
	public void getUrl(){
		
		driver = new FirefoxDriver();	
		driver.navigate().to("http://www.walgreens.com/");
		driver.manage().window().maximize();
	}
	
	public void quitBrowser(){
		
		driver.quit();
	}
	
	public WebElement getWebElementName(String Name){
		try {
			
			element=driver.findElement(By.name(Name));
			
			}catch(Exception e){
			e.printStackTrace();
		}
		return element;
	}
	
	public void mouseOver(WebElement element1)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element1).click().build().perform();
	}
	
	public void click(){
		try {
			element.click();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public WebElement getWebElementXpath(String xpath){
		try {
			element=driver.findElement(By.xpath(xpath));
			Thread.sleep(2000);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return element;
	}
	
	
	public void SendKeys(String Value){
		try {
			element.sendKeys(Value);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
