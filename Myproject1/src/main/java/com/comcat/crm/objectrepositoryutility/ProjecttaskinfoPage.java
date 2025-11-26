package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjecttaskinfoPage {

	WebDriver driver;
	public ProjecttaskinfoPage(WebDriver driver)
   {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement header;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getHeader() {
		return header;
	}

    public String Header()
    {
    	String headertext = header.getText();
    	return headertext;
    }
    
}
