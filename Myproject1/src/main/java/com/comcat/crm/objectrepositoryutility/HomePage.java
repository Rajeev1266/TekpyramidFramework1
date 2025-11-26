package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Rajvir
 * Contains Home page  element and business lib like Home()
 * 
 * 
 */

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
   {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Organizations")
	private WebElement orglink;
	@FindBy(linkText = "Contacts")
	private WebElement contactlink;
	@FindBy (linkText = "More")
	private WebElement morelink;
	@FindBy(linkText = "Campaigns")
	private WebElement camplaignlink;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminimg;
	@FindBy(linkText ="Sign Out")
	private WebElement signoutlink;
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement productlink;
	@FindBy(xpath = "//a[text()='Documents']")
	private WebElement documentslink;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getOrglink() {
		return orglink;
	}
	public WebElement getContactlink() {
		return contactlink;
	}
	public WebElement getMorelink() {
		return morelink;
	}
	public WebElement getCamplaignlink() {
		return camplaignlink;
	}
	public WebElement getAdminimg() {
		return adminimg;
	}
	public WebElement getSignoutlink() {
		return signoutlink;
	}
	public WebElement getProductlink() {
		return productlink;
	}
	
	public WebElement getDocumentslink() {
		return documentslink;
	}
	/**
	 * 
	 * navigate to camplaignlink
	 * 
	 */
	public void navigateTocamlaignpage()
	{
		Actions act=new Actions(driver);
		act.moveToElement(morelink).perform();
	    camplaignlink.click();
	}
	public void organizationlink()
	{
		orglink.click();
	}
	/**
	 * logout application
	 * @throws InterruptedException
	 */
	public void logout() throws InterruptedException
	{
		Actions act1= new Actions(driver);
		act1.moveToElement(adminimg).perform();
		Thread.sleep(2000);
		signoutlink.click();
	}
	
	public void contactlink()
	{
		contactlink.click();
	}
	public void documentlink()
	{
		documentslink.click();
	}
	public void productlnk()
	{
		productlink.click();
		}
	public void more()
	{
		morelink.click();
	}
	
}
