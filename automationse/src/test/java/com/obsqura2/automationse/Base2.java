package com.obsqura2.automationse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base2 
{
	    WebDriver driver;
	    public void initializeBrowser() 
	    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\git\\automationse\\automationse\\src\\main\\java\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		}
public void driverCloseOrQuit()
	    {
	    driver.quit();
	    }
public static void main(String args[]) 
        {
	     Base2 base2=new Base2();
	     base2.initializeBrowser();
	  base2.driverCloseOrQuit();
	
         }
}
