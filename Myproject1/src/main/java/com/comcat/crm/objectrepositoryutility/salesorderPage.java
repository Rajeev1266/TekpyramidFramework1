package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.webDriverutility;

public class salesorderPage {
	WebDriver driver;
	public salesorderPage(WebDriver driver)
    {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createnewsalesorderimg;
	@FindBy(name = "subject")
	private WebElement subjecttextfield;
	@FindBy(xpath = "(//img[@src='themes/softed/images/select.gif'])[4]")
	private WebElement organizationanmeimg;
	@FindBy(id = "search_txt")
	private WebElement searchtextfield;
	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchbtn;
	@FindBy(xpath = "//a[@href='javascript:window.close();']")
	private WebElement orglink;
	@FindBy(xpath = "//select[@name='invoicestatus']")
	private WebElement invoicestatus;
	@FindBy(xpath = "//b[text()='Terms & Conditions']")
	private WebElement termsandcondition;
	@FindBy(xpath = "//textarea[@name='bill_street']")
	private WebElement bilingadress;
	@FindBy(xpath = "//select[@onchange='QCreate(this);']")
	private WebElement quickcreate;
	@FindBy(xpath = "//textarea[@name='ship_street']")
	private WebElement shippingadress;
	@FindBy(name = "productname")
	private WebElement productname;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebtn1;
	public WebElement getSavebtn1() {
		return savebtn1;
	}
	public WebElement getProductname() {
		return productname;
	}
	public WebElement getInvoicestatus() {
		return invoicestatus;
	}
	public WebElement getTermsandcondition() {
		return termsandcondition;
	}
	public WebElement getBilingadress() {
		return bilingadress;
	}
	public WebElement getquickcreate() {
		return quickcreate;
	}
	public WebElement getShippingadress() {
		return shippingadress;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCreatenewsalesorderimg() {
		return createnewsalesorderimg;
	}
	public WebElement getSubjecttextfield() {
		return subjecttextfield;
	}
	public WebElement getOrganizationanmeimg() {
		return organizationanmeimg;
	}
	public WebElement getSearchtextfield() {
		return searchtextfield;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getOrglink() {
		return orglink;
	}
	public void quickcreteproduct()
	{
		quickcreate.click();
		webDriverutility wlib= new webDriverutility();
		wlib.selectByIndex(quickcreate, 13);
		
	}
	public void producttextfield(String newproductname)
	{
		productname.sendKeys(newproductname);
		savebtn1.click();
		
	}
	public void saleorderimage()
	{
		createnewsalesorderimg.click();
	}
	public void subjecttext(String subject)
	{
		subjecttextfield.click();
	}
	public void orgimg()
	{
		organizationanmeimg.click();
	}
	public void searchtext(String orgname)
	{searchtextfield.sendKeys(orgname);}
	public void searchbutton()
	{
		searchbtn.click();
	}
	public void organizationlink()
	{
		orglink.click();
	}
	public void billing(String Billingadress)
	{
		bilingadress.sendKeys(Billingadress);
	}
	public void shipping(String Shippingadress)
	{
		shippingadress.sendKeys(Shippingadress);
	}
}
