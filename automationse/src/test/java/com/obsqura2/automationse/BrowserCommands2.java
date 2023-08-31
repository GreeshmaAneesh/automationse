package com.obsqura2.automationse;

import org.apache.commons.exec.util.StringUtils;

public class BrowserCommands2 extends Base2 {
	String expectedTitle="Obsqura Testing";
	public void browserCommands()
	{
		String Title=driver.getTitle();
		String URL=driver.getCurrentUrl();
		String pagesource=driver.getPageSource();
	}
	public void navigationComments() {
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public void verifyTitle() {
		if(expectedTitle.equals(driver.getTitle()))
				{
			System.out.println("Passed");
				}
		else
		{
			System.out.println("Failed");
		}
	}
public static void main(String args[])
{
	BrowserCommands2 browsercommands2=new BrowserCommands2();
	browsercommands2.initializeBrowser();
	browsercommands2.browserCommands();
	browsercommands2.verifyTitle();
	browsercommands2.navigationComments();
	browsercommands2.driverCloseOrQuit();
}
}
