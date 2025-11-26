package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 
public class Organizationinfo {
	WebDriver driver;
	public Organizationinfo(WebDriver driver)
   {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement orginfoheader;
	@FindBy(id="dtlview_Organization Name")
	private WebElement orgname;
	@FindBy(id="dtlview_Industry")
	private WebElement industryname;
	@FindBy(id="dtlview_Type")
	private WebElement typename;
	@FindBy(id="dtlview_Phone")
	private WebElement phoneno;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getOrginfoheader() {
		return orginfoheader;
	}
	public WebElement getOrgname() {
		return orgname;
	}
	
	public WebElement getIndustryname() {
		return industryname;
	}
	public WebElement getTypename() {
		return typename;
	}
	public WebElement getPhoneno() {
		return phoneno;
	}
	public String headertext()
	{
		String orgnameheader = orginfoheader.getText();
		return orgnameheader;
	}
	public String actualorgtext()
	{
		String actualorgname=orgname.getText();
		return actualorgname;
	}
	
	public String actualindustry()
	{
	String industry = industryname.getText();
	return industry;
	
	}
	public String actualtype()
	{
		String type = typename.getText();
		return type;
		
	}
	public String actualphoneno()
	{
		String phone = phoneno.getText();
		return phone;
	}
	public void savebuttton()
	{
		savebtn.click();
	}
	
}
