package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Qickcreate {

	WebDriver driver;
	public Qickcreate(WebDriver driver)
   {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

		
		@FindBy(name = "projectname")
		private WebElement projectname;
		@FindBy(name="startdate")
		private WebElement stdate;
		@FindBy(name="targetenddate")
		private WebElement targetdate;
		@FindBy(xpath = "//input[@title='Save [Alt+S]']")
		private WebElement savbtn;
		@FindBy(xpath = "//select[@onchange='QCreate(this);']")
		private WebElement quickcreate;
		@FindBy(name = "projecttaskname")
		private WebElement projtasknmae;
		@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
		private WebElement relatedto;
		@FindBy(name = "search_text")
		private WebElement searchtext;
		@FindBy(name = "search")
		private WebElement searchbtn;
		@FindBy(xpath = "//a[@href='javascript:window.close();']")
		private WebElement linktext;
		
		public WebElement getLinktext() {
			return linktext;
		}


		public WebElement getSearchbtn() {
			return searchbtn;
		}


		public WebElement getSearchtext() {
			return searchtext;
		}


		public WebElement getProjtasknmae() {
			return projtasknmae;
		}


		public WebElement getQuickcreate() {
			return quickcreate;
		}


		public WebElement getSavbtn() {
			return savbtn;
		}


		public WebElement getTargetdate() {
			return targetdate;
		}


		public WebElement getStdate() {
			return stdate;
		}


		public WebDriver getDriver() 
		{
			return driver;
		}


		public WebElement getProjectname() {
			return projectname;
		}
		public void projectnames(String projtname)
		{
			projectname.sendKeys(projtname);
		}
		public void StartDate(String startdate)
		{
			stdate.clear();
			stdate.sendKeys(startdate);
		}
		public void EndDate(String enddate)
		{
			targetdate.clear();
			targetdate.sendKeys(enddate);
		}
		public void SaveButton()
		{
			savbtn.click();
		}
		public void QuickcreateTask()
		{
			quickcreate.click();
			Select sq=new Select(quickcreate);
			sq.selectByIndex(16);
		}
		public void ProjectTaskName(String task)
		{
			projtasknmae.sendKeys(task);
		}
		public void RelatedTo()
		{
			relatedto.click();
		}
		public void SearchTextField(String projectname)
		{
			searchtext.sendKeys(projectname);
		}
		public void SearchButton()
		{
			searchbtn.click();
		}
		public void link()
		{
			linktext.click();
		}
		
		
	

}
