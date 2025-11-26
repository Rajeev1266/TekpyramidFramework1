package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactPage {
	WebDriver driver;
	public contactPage(WebDriver driver)
   {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createnewcontactimg;
	@FindBy(name = "lastname")
	private WebElement lastname;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	@FindBy(name="support_start_date")
	private WebElement startdate;
	@FindBy(name="support_end_date")
	private WebElement enddate;
	@FindBy (xpath = "//img[@src='themes/softed/images/select.gif']")
	private WebElement orgbtn;
	@FindBy(id ="search_txt")
	private WebElement serarchfield;
	@FindBy(name = "search")
	private WebElement searchbtn;
	@FindBy(xpath = "//a[@href='javascript:window.close();']")
	private WebElement link;
	 
	
	
	
	
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getLink() {
		return link;
	}
	public WebElement getSerarchfield() {
		return serarchfield;
	}
	public WebElement getStartdate() {
		return startdate;
	}
	public WebElement getEnddate() {
		return enddate;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCreatenewcontactimg() {
		return createnewcontactimg;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public void contactimg()
	{
		createnewcontactimg.click();
	}
	public void Lastname(String Lastname)
	{
		lastname.sendKeys(Lastname);
	}
	public void savebutton()
	{
		savebtn.click();
	}
	public void orgbutton()
	{
		orgbtn.click();
	}
	public void searchtext(String orgname)
	{
		serarchfield.sendKeys(orgname);
	}
	public void searchbutton()
	{
		searchbtn.click();
	}
	public void links()
	{
		link.click();
	}
	 
	
}
