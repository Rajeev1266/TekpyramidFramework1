package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class morePgae {
	WebDriver driver;
	public morePgae(WebDriver driver)
    {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="Invoice")
	private WebElement invoicelink;
	@FindBy(name="Sales Order")
	private WebElement salesorderlink;
	
	
	public WebElement getSalesorderlink() {
		return salesorderlink;
	}
	public WebDriver getDriver() 
	{
		return driver;
	}
	public WebElement getInvoicelink() 
	{
		return invoicelink;
	}
	public void invoice()
	{ 
		invoicelink.click();
	}
	public void salesorder()
	{
		salesorderlink.click();
	}
	
}
