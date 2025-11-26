package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class caledarPage {
	WebDriver driver;
	public caledarPage(WebDriver driver)
   {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[text()='Calendar']")
	private WebElement calendarlink;
	@FindBy (xpath = "//td[@class='calAddButton']")
	private WebElement addbtn;
	@FindBy(id = "addmeeting")
	private WebElement meetingbtn;
	@FindBy(name = "subject")
	private WebElement eventname;
	@FindBy(id = "starthr")
	private WebElement starthour;
	@FindBy(id = "startmin")
	private WebElement startmin;
	@FindBy(name = "date_start")
	private WebElement startdate;
	@FindBy(id = "endhr")
	private WebElement endhour;
	@FindBy (id = "endmin")
	private WebElement endmin;
	@FindBy(name = "due_date")
	private WebElement enddate;
	@FindBy(xpath = "//input[@alt='Save [Alt+S]']")
	private WebElement savebtn;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCalendarlink() {
		return calendarlink;
	}
	public WebElement getAddbtn() {
		return addbtn;
	}
	public WebElement getMeetingbtn() {
		return meetingbtn;
	}
	public WebElement getEventname() {
		return eventname;
	}
	public WebElement getStarthour() {
		return starthour;
	}
	public WebElement getStartmin() {
		return startmin;
	}
	public WebElement getStartdate() {
		return startdate;
	}
	public WebElement getEndhour() {
		return endhour;
	}
	public WebElement getEndmin() {
		return endmin;
	}
	public WebElement getEnddate() {
		return enddate;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public void saveButton()
	{
		savebtn.click();
	}
	public void event(String event)
	{
		eventname.sendKeys(event);
	}
	
}
