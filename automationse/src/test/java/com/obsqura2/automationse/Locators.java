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
		driver.navigate().to("https://www.amazon.in/");
		WebElement logo=driver.findElement(By.className("nav-logo-link"));
		WebElement searchDropdown=driver.findElement(By.className("nav-search-dropdown"));
		WebElement headerLayout =driver.findElement(By.className("layoutToolbarPadding"));
		WebElement cartIcon=driver.findElement(By.className("nav-cart-icon"));
		WebElement footerLanguage=driver.findElement(By.className("icp-color-base"));
	}
	public void locateByCssSelector()
	{
		//tag and ID
		WebElement showMessageButton=driver.findElement(By.cssSelector("button#button-one"));
		WebElement enterMessage=driver.findElement(By.cssSelector("input#single-input-field"));
		WebElement enterValue=driver.findElement(By.cssSelector("input#value-a"));
		WebElement getTotal=driver.findElement(By.cssSelector("button#button-two"));
		WebElement total=driver.findElement(By.cssSelector("div#message-two"));
		WebElement heading=driver.findElement(By.cssSelector("div#collapsibleNavbar"));
		//tag and class
		WebElement sectionUsingCssselector=driver.findElement(By.cssSelector("section.clearfix"));
		driver.navigate().to("https://www.amazon.in/");
		WebElement sideIcon=driver.findElement(By.cssSelector("span.hm-icon-label"));
		WebElement lastInstruction=driver.findElement(By.cssSelector("span._cDEzb_no-rvi-message_1CbyB"));
		WebElement footerText=driver.findElement(By.cssSelector("span.navFooterBackToTopText"));
		WebElement footerLine=driver.findElement(By.cssSelector("div.nav-footer-line"));
		WebElement footerLanguageIcon=driver.findElement(By.cssSelector("span.icp-container-desktop"));
		//tag and attribute
		WebElement getTotal2=driver.findElement(By.cssSelector("button[id=button-two]"));
		WebElement showMessagefield=driver.findElement(By.cssSelector("input[id=single-input-field]"));
		WebElement yourMessage=driver.findElement(By.cssSelector("div[id=message-one]"));
		WebElement enterValueField=driver.findElement(By.cssSelector("input[id=value-a]"));
		WebElement getTotalbutton=driver.findElement(By.cssSelector("button[id=button-two]"));
		WebElement totalField=driver.findElement(By.cssSelector("div[id=message-two]"));
		//tag,attribute and class
		WebElement maleGenderField=driver.findElement(By.cssSelector("input.form-check-input[id=inlineRadio1]"));
		WebElement femalegenderField=driver.findElement(By.cssSelector("input.form-check-input[id=inlineRadio2]"));
		WebElement malePatientButton=driver.findElement(By.cssSelector("input.form-check-input[id=inlineRadio11]"));
		WebElement femalePatientButton=driver.findElement(By.cssSelector("input.form-check-input[id=inlineRadio21]"));
		WebElement patientAgeButton=driver.findElement(By.cssSelector("input.form-check-input[id=inlineRadio23]"));
		}
	public void locateByName()
	{
		WebElement description=driver.findElement(By.name("description"));
		WebElement view=driver.findElement(By.name("viewport"));
		WebElement key=driver.findElement(By.name("keywords"));
		WebElement content=driver.findElement(By.name("author"));
	}
	public void locateByLinkText()
        {
		WebElement link=driver.findElement(By.linkText("Simple Form Demo"));
		WebElement jquery=driver.findElement(By.linkText("jquery-select"));
		WebElement homeButton=driver.findElement(By.linkText("index"));
		WebElement datePickerButton=driver.findElement(By.linkText("date-picker"));
		WebElement tableButton=driver.findElement(By.linkText("table-pagination"));
		WebElement progressBar=driver.findElement(By.linkText("jquery-progress-bar"));
        }
	public void locateByPartialLinkText()
	{
		WebElement partial=driver.findElement(By.partialLinkText("Simple Form"));
		WebElement checkBoxDemo=driver.findElement(By.partialLinkText("check-box"));
		WebElement radioButton=driver.findElement(By.partialLinkText("radio-button"));
		WebElement ajaxFormButton=driver.findElement(By.partialLinkText("ajax-form"));
		WebElement listBox=driver.findElement(By.partialLinkText("bootstrap-dual"));
    }
	public void locateByXpath()
	{
		WebElement message=driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement enterValueATextField=driver.findElement(By.xpath("//input[@id='value-a']"));
		WebElement entervalueBTextField=driver.findElement(By.xpath("//input[@id='value-b']"));
		WebElement getTotalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
		WebElement totalField=driver.findElement(By.xpath("//div[@id='message-two']"));
		//contains
		WebElement showMessgeButtonUsingContains=driver.findElement(By.xpath("//button[contains(@id,'one')]"));
		WebElement enterMessageField=driver.findElement(By.xpath("//input[contains(@id,'single')]"));
		WebElement yourMessage=driver.findElement(By.xpath("//div[contains(@id,'message')]"));
		WebElement enterValueAField=driver.findElement(By.xpath("//input[contains(@id,'value')]"));
		WebElement getTotal=driver.findElement(By.xpath("//button[contains(@id,'two')]"));
		//And
		WebElement showMessageButton=driver.findElement(By.xpath("//button[contains(@class, 'btn-primary') and @id='button-one']"));
		WebElement enterMesageField=driver.findElement(By.xpath("//input[contains(@class, 'form-control') and @id='single-input-field']"));
		WebElement valueAfield=driver.findElement(By.xpath("//input[contains(@class, 'form-control') and @id='value-a']"));
		WebElement valueBField=driver.findElement(By.xpath("//input[contains(@class, 'form-control') and @id='value-b']"));
		WebElement getTotalField=driver.findElement(By.xpath("//button[contains(@class, 'btn-primary') and @id='button-two']"));
		//OR
		WebElement showMessageButtonA=driver.findElement(By.xpath("//button[contains(@class, 'btn-primary') or @id='button-one']"));
		WebElement enterMesageFieldB=driver.findElement(By.xpath("//input[contains(@class, 'form-control') or @id='single-input-field']"));
		WebElement valueAfieldC=driver.findElement(By.xpath("//input[contains(@class, 'form-control') or @id='value-a']"));
		WebElement valueBFieldD=driver.findElement(By.xpath("//input[contains(@class, 'form-control') or @id='value-b']"));
		WebElement getTotalFieldE=driver.findElement(By.xpath("//button[contains(@class, 'btn-primary') or @id='button-two']"));
		
	}
		public static void main(String args[])
	
{
	Locators locators=new Locators();
	locators.initializeBrowser();
	locators.locateById();
	locators.locateByClass();
	locators.locateByCssSelector();
	locators.locateByName();
	locators.locateByLinkText();
	locators.locateByPartialLinkText();
	locators.locateByXpath();
	locators.driverCloseOrQuit();
}
}



