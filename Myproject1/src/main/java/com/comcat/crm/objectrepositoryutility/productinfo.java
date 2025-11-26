package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productinfo {
	WebDriver driver;
	public productinfo(WebDriver driver)
   {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement headername;
	@FindBy(id="dtlview_Product")
	private WebElement productname;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getHeadrername() {
		return headername;
	}
	public WebElement getProductname() {
		return productname;
	}
	public String actualheader()
	{
		 String header = headername.getText();
		 return header;
	}
	public String actualproductname()
	{
		String product = productname.getText();
		return product;
	}
}
