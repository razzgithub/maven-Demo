/**
 * 
 */
package com.crm.vtiger.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author BIKRAM
 *
 */
public class LoginPageTest {
	
	@Test
	
	public void LoginToApp() {
		
		
		WebDriver driver=null;
		
		String browser= System.getProperty("browser");
		/*Browser Selection*/
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(System.getProperty("url"));
	
		driver.findElement(By.name("user_name")).sendKeys(System.getProperty("username"));
		driver.findElement(By.name("user_password")).sendKeys(System.getProperty("password"));
		driver.findElement(By.id("submitButton")).click();
		
		
		 WebElement wb =driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
 		Actions act = new Actions(driver);
 		act.moveToElement(wb).perform();
 		driver.findElement(By.linkText("Sign Out")).click();
		driver.close();
		
	}
	

}
