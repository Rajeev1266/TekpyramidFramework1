package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentsPage {
	WebDriver driver;
	public DocumentsPage(WebDriver driver)
   {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createnewdocument;
	@FindBy(name = "notes_title")
	private WebElement title;
	@FindBy(name = "filename")
	private WebElement filename;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement header;
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCreatenewdocument() {
		return createnewdocument;
	}
	public WebElement getTitle() {
		return title;
	}
	public WebElement getFilename() {
		return filename;
	}
	public WebElement getHeader() {
		return header;
	}
	public String actualheader()
	{
		String header1 = header.getText();
	    return	header1;
	}
	public void cretedocument()
	{
		createnewdocument.click();
	}
	public void savebutton()
	{
		savebtn.click();
	}
	
}
