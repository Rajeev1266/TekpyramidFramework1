package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class invoicePage {
	WebDriver driver;
	public invoicePage(WebDriver driver)
    {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement cretenewinvoice;
	@FindBy(name = "subject")
	private WebElement subjecttextfield;
	@FindBy(xpath = "//input[@id='single_accountid']/following-sibling::img")
	private WebElement orgnameimg;
	@FindBy(name = "search_text")
	private WebElement searchtextfield;
	@FindBy(name = "search")
	private WebElement searchbtn;
	@FindBy(xpath = "//a[@href='javascript:window.close();']")
	private WebElement namelink;
	@FindBy(name = "bill_street")
	private WebElement billadress;
	@FindBy(name = "ship_street")
	private WebElement shippingsdress;
	@FindBy(id = "searchIcon1")
	private WebElement productlink;
	@FindBy(id = "qty1")
	private WebElement quantity;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement header;
	@FindBy(xpath = "//td[contains(text(),'Invoice No')]/following-sibling::td[@class='dvtCellInfo']")
	private WebElement invoiceno;
	
	public WebElement getHeader() {
		return header;
	}
	public WebElement getInvoiceno() {
		return invoiceno;
	}
	public WebElement getQuantity() {
		return quantity;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getBilladress() {
		return billadress;
	}
	public WebElement getShippingsdress() {
		return shippingsdress;
	}
	public WebElement getProductlink() {
		return productlink;
	}
	public WebElement getSearchtextfield() {
		return searchtextfield;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getNamelink() {
		return namelink;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCretenewinvoice() {
		return cretenewinvoice;
	}
	public WebElement getSubjecttextfield() {
		return subjecttextfield;
	}
	public WebElement getOrgnameimg() {
		return orgnameimg;
	}
	public String actualheader()
	{
		String txt = header.getText();
		return txt;
	}
	public String actualinvoiceno()
	{
		String txt2=invoiceno.getText();
		return txt2;
	}
	public void newinvoice()
	{
		cretenewinvoice.click();
	}
	public void subjecttext(String subject)
	{
		subjecttextfield.sendKeys(subject);
	}
	public void orgimg()
	{
		orgnameimg.click();
	}
	public void serachtext(String orgname)
	{
		searchtextfield.sendKeys(orgname);
	}
	public void searchbutton()
	{
		searchbtn.click();
	}
	public void link()
	{
		namelink.click();
	}
	public void billing(String Billingaddress)
	{
		billadress.sendKeys(Billingaddress);
	}
	public void shippping(String Shippingadress)
	{
		shippingsdress.sendKeys(Shippingadress);
	}
	public void product()
	{
		productlink.click();
	}
	public void Quantityno(String Quantity)
	{
		quantity.sendKeys(Quantity);
	}
	public void savebutton()
	{
		savebtn.click();
	}
}
