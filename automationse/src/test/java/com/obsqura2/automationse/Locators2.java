package com.obsqura2.automationse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators2 extends Base2 {
	public void locateById()
	{
		WebElement showMessageButton=driver.findElement(By.id("button-one"));
		WebElement enterMessageField=driver.findElement(By.id("single-input-field"));
		WebElement yourMessageField=driver.findElement(By.id("message-one"));
		WebElement enterValueAField=driver.findElement(By.id("value-a"));
		WebElement enterValueBField=driver.findElement(By.id("value-b"));
	}
	public void locateByClass()
	{
		driver.navigate().to("https://www.google.co.in/");
		WebElement searchBoxField=driver.findElement(By.className("SDkEP"));
		WebElement searchByImageIcon=driver.findElement(By.className("Gdd5U"));
		WebElement countryName=driver.findElement(By.className("uU7dJb"));
		WebElement googleText=driver.findElement(By.className("lnXdpd"));
	    WebElement googleOfferedText=driver.findElement(By.className("vcVZ7d"));
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
		//starts-with
		WebElement showMessagebutton=driver.findElement(By.xpath("//button[starts-with(@id,'button-o')]"));
		WebElement yourMessageField=driver.findElement(By.xpath("//div[starts-with(@id,'message-o')]"));
		WebElement enterValueA=driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
		WebElement enterValueB=driver.findElement(By.xpath("//input[starts-with(@id,'value-b')]"));
		WebElement getTotalfield=driver.findElement(By.xpath("//button[starts-with(@id,'button-t')]"));
			//using text
		WebElement showMessageButtonfield=driver.findElement(By.xpath("//button[text()= 'Show Message']"));
		WebElement total=driver.findElement(By.xpath("//button[text()= 'Get Total']"));
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
	    WebElement radioButton=driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
	    WebElement getResults=driver.findElement(By.xpath("//button[text()='Get Results']"));
	   }
	public void axesMethod()
	{
		//parent
		WebElement parent=driver.findElement(By.xpath("//input[@id='single-input-field']//parent::div"));
		WebElement enterValueA=driver.findElement(By.xpath("//input[@id='value-a']//parent::div"));
		WebElement getTotalKey=driver.findElement(By.xpath("//button[@id='button-two']//parent::form"));
		WebElement getTotalKeyParentButton=driver.findElement(By.xpath("//button[@id='button-two']//parent::button"));
		WebElement enterValueB=driver.findElement(By.xpath("//input[@id='value-b']//parent::div"));
		//child
		WebElement child=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
		WebElement moreThanOneChild=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//child::ul"));
		//following
		WebElement following=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
		WebElement enterMessage=driver.findElement(By.xpath("//input[@id='single-input-field']//following::form"));
		WebElement enterAValue=driver.findElement(By.xpath("//input[@id='value-a']//following::div[@class='form-group']"));
		driver.navigate().to("https://selenium.obsqurazone.com/jquery-select.php");
		WebElement jqueryStatesDropdown=driver.findElement(By.xpath("//span[@id='select2-cepe-container']//following::div[@class='copyright']"));
		WebElement stateDrpodown=driver.findElement(By.xpath("//span[@id='select2-whyq-container']//following::div[@class='copyright']"));
		//preceding
		WebElement preceding=driver.findElement(By.xpath("//button[@id='button-one']//preceding::button"));
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']//preceding::nav"));
		WebElement header=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//preceding::div[@class='container']"));
		WebElement headerNavbar=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//preceding::button"));
		WebElement total=driver.findElement(By.xpath("//button[@id='button-two']//preceding::button[@class='navbar-toggler']"));
		//ancestor
		WebElement ancestor=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::button"));
		WebElement showMessage=driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[@class='container page']"));
		WebElement valueA=driver.findElement(By.xpath("//input[@id='value-a']//ancestor::div[@class='container page']"));
		WebElement valueB=driver.findElement(By.xpath("//input[@id='value-b']//ancestor::div[@class='container page']"));
		WebElement getTotalB=driver.findElement(By.xpath("//button[@id='button-two']//ancestor::div[@class='container page']"));
		//descendant
		WebElement descendant=driver.findElement(By.xpath("//form[@method='POST']//descendant::button[@id='button-one']"));
		WebElement getTotalDescendant=driver.findElement(By.xpath("//form[@method='POST']//descendant::button[@id='button-two']"));
		WebElement section=driver.findElement(By.xpath("//section[@class='clearfix']//descendant::div[@class='container page']"));
		WebElement headerdescendant=driver.findElement(By.xpath("//div[@class=\"mb-sec\"]//descendant::div[@class='container']"));
		WebElement navBar=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//a[@id='progress-bars']"));
		//following-sibling
		WebElement followingSibling=driver.findElement(By.xpath("//button[@id='button-one']//following-sibling::div"));
		WebElement headerNavBar=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//following-sibling::ul"));
		WebElement navBarHeader=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//following-sibling::a[@id='alert-modal']"));
		WebElement navBarH=driver.findElement(By.xpath("//div[@id='collapsibleNavbar']//following-sibling::a[@id='progress-bars']"));
		
		
		

	}
		public static void main(String args[])
	{
			Locators2 locators2=new Locators2();
			locators2.initializeBrowser();
			locators2.locateById();
			locators2.locateByClass();
			locators2.locateByCssSelector();
			locators2.locateByName();
			locators2.locateByLinkText();
			locators2.locateByPartialLinkText();
			locators2.locateByXpath();
			//locators2.axesMethod();
			locators2.driverCloseOrQuit();
			
			
	
	}
	
}

