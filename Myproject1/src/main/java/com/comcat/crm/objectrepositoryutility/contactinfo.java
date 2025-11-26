package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Rajvir
 *  contains contact information page element and business library like contactinfo()
 * 
 */
public class contactinfo {

	WebDriver driver;
	public contactinfo(WebDriver driver)
   {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement contactheader;
	@FindBy(id = "dtlview_Last Name")
	private WebElement lastname;
	@FindBy(xpath = "//td[@id='mouseArea_Support Start Date']")
	private WebElement startdate;
	@FindBy(id = "dtlview_Support End Date")
	private WebElement enddate;
	
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getContactheader() {
		return contactheader;
	}
	public WebElement getLastname() {
		return lastname;
	}
	
	public WebElement getStartdate() {
		return startdate;
	}
	public WebElement getEnddate() {
		return enddate;
	}
	public String actualheader()
	{
		String header = contactheader.getText();
		return header;
	}
	public String actuallastname()
	{
		String lastname = contactheader.getText();
		return lastname;
	}
	public String actualstartdate()
	{
		 String start = startdate.getText();
		 return start;
	}
	public String actualenddate()
	{
		String end = enddate.getText();
		return end;
	}
}
