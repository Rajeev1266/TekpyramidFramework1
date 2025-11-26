package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class opportunitiesPage {
     WebDriver driver;
	public opportunitiesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath ="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createoppurnitiesimg;
	@FindBy(name="potentialname")
	private WebElement oppurnityname;
	@FindBy(xpath = "//input[@id='related_to_display']/following-sibling::img[@src='themes/softed/images/select.gif']")
	private WebElement relatedtoorgname;
	@FindBy(name="search_text")
	private WebElement serachtextfield;
	@FindBy(name = "search")
	private WebElement searchbtn;
	@FindBy(xpath = "//a[@href='javascript:window.close();']")
	private WebElement linkclick;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement header;
	@FindBy(id = "dtlview_Opportunity")
	private WebElement oppurnity;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCreateoppurnityimg() {
		return createoppurnitiesimg;
	}
	public WebElement getOppurnityname() {
		return oppurnityname;
	}
	public WebElement getRelatedtoorgname() {
		return relatedtoorgname;
	}
	public WebElement getSerachtextfield() {
		return serachtextfield;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getLinkclick() {
		return linkclick;
	}
	
	public WebElement getSavebtn() {
		return savebtn;
	}
	
	public WebElement getHeader() {
		return header;
	}
	public WebElement getOppurnity() {
		return oppurnity;
	}
	public void searchorg(String orgname)
	{
		serachtextfield.sendKeys(orgname);
	}
	public void oppurnityname(String oppurnity)
	{
		oppurnityname.sendKeys(oppurnity);
	}
	  public String actualheder()
	  {
		  String header1 = header.getText();
		  return header1;
		  
	  }
	  public void saveButton()
	  {
		  savebtn.click();
	  }
	  public void relatedtoorganization()
	  {
		  relatedtoorgname.click();
	  }
	  public void searchbutton()
	  {
		  searchbtn.click();
	  }
	  public void linkon()
	  {
		  linkclick.click();
	  }
	
}
