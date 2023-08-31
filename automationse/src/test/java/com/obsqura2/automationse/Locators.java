package com.obsqura2.automationse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Locators extends Base2{
	public void locateById()
	{
		WebElement showMessageButton=driver.findElement(By.id("button-on"));
		WebElement singleInputField=driver.findElement(By.id("single-input-field"));
		WebElement yourMessage=driver.findElement(By.id("message-one"));
		WebElement enterDatesField=driver.findElement(By.id("single-input-field2"));
		WebElement autoClosableButton=driver.findElement(By.id("autoclosable-btn-success"));
		WebElement normalSuccessButton=driver.findElement(By.id("normal-btn-success"));
	}
	
	public void locateByClass() {
		WebElement section=driver.findElement(By.className("clearfix"));
		driver.navigate().to("https://web.classplusapp.com/");
		WebElement batches=driver.findElement(By.className("ToolTip"));
		WebElement batchText=driver.findElement(By.className("ToolTipText"));
		WebElement batchHeading=driver.findElement(By.className("courseName"));
		WebElement subjectName=driver.findElement(By.className("subjectName"));
		WebElement filters=driver.findElement(By.className("Filters"));
		}
	public void locateByCssselector() {
		WebElement showMessageButton=driver.findElement(By.cssSelector("button#button-one"));
		
		WebElement sectionUsingCssselector=driver.findElement(By.cssSelector("section.clearfix"));
		
		WebElement getTotal=driver.findElement(By.cssSelector("button[id=button-two]"));
		
	}
	public void locateByName()
	{
		WebElement description=driver.findElement(By.name("description"));
	}
	public void locateByLinkText()
	{
		WebElement link=driver.findElement(By.linkText("Simple Form Demo"));
	}
	public void locateByPartialLinkText()
	{
		WebElement partial=driver.findElement(By.partialLinkText("Simple Form"));
	}
	public void locateByXpath()
	{
		WebElement message=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement enterValueATextField=driver.findElement(By.xpath("//input[@id='value-a']"));
	}
	
public static void main(String args[])
{
	Locators locators=new Locators();
	locators.initializeBrowser();
	locators.locateByXpath();
	locators.locateByName();
	locators.locateByLinkText();
	locators.locateByPartialLinkText();
	locators.driverCloseOrQuit();
}
}



