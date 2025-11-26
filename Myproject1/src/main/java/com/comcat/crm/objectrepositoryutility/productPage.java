package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productPage {
	WebDriver driver;
	public productPage(WebDriver driver)
   {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createnewproduct;
	@FindBy(name = "productname")
	private WebElement productname;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	@FindBy(xpath = "//a[text()='Calendar']")
	private WebElement calendarlink;
	@FindBy (xpath = "//td[@class='calAddButton']")
	private WebElement addbtn;
	@FindBy(id = "addmeeting")
	private WebElement meetingbtn;
	
	public WebElement getCalendarlink() {
		return calendarlink;
	}
	public WebElement getAddbtn() {
		return addbtn;
	}
	public WebElement getMeetingbtn() {
		return meetingbtn;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCreatenewproduct() {
		return createnewproduct;
	}
	public WebElement getProductname() {
		return productname;
	}
	public void createproduct()
	{
		createnewproduct.click();
	}
	public void productnam(String productnamen)
	{
		productname.sendKeys(productnamen);
	}
	public void savebutton()
	{
		savebtn.click();
	}
	public void newproduct()
	{
		createnewproduct.click();
	}
	public void productname(String product)
	{
		productname.sendKeys(product);
	}
	public void caledarlnk() {
		calendarlink.click();
	}
public void addbutton()
{
	addbtn.click();
	}
public void meetingbutton()
{
	meetingbtn.click();
	}
}
