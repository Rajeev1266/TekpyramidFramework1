package com.comcat.crm.objectrepositoryutility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class OrganizationPage {
	
	WebDriver driver;
	public OrganizationPage(WebDriver driver)
   {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
     private WebElement createorgbtn;
	@FindBy(name="accountname")
	private WebElement orgnizationaname;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	@FindBy(name = "industry")
	private WebElement industryDD;
	@FindBy(name="accounttype")
	private WebElement typeDD;
	@FindBy(id="phone")
	private WebElement phone;
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement verifyorgname;
	@FindBy(xpath = "//a[text()='Opportunities']")
	private WebElement opportunitieslink;
	@FindBy(xpath = "(//input[@type=\\\"radio\\\"])[2]")
	private WebElement Assignto;
	@FindBy(xpath = "//select[@onchange='QCreate(this);']")
	private WebElement quickcreate;
	public WebElement getQuickcreate() {
		return quickcreate;
	}
	public WebElement getAssignto() {
		return Assignto;
	}
	public WebElement getVerifyorgname() {
		return verifyorgname;
	}
	public WebElement getIndustryDD() {
		return industryDD;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getcreateorgbtn() {
		return createorgbtn;
	}
	public WebElement getOrgnizationaname() {
		return orgnizationaname;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	
	public WebElement getCreateorgbtn() {
		return createorgbtn;
	}
	public WebElement getType() {
		return typeDD;
	}
	public WebElement getPhone() {
		return phone;
	}
	
	public WebElement getOpportunitieslink() {
		return opportunitieslink;
	}
	public void createorg(String orgname, String industry)
	{
		orgnizationaname.sendKeys(orgname);
		Select s= new Select(industryDD);
		s.selectByVisibleText(industry);
	
	}
	public void createorgwithphone(String type)
	
	{
	   Select s1= new Select(typeDD);
	   s1.selectByVisibleText(type);
	   
	}
	public void createorgbtn()
	{
		createorgbtn.click();
	}
	public void savebutton()
	{
		savebtn.click();
	}
	public void enterphoneno(String phoneno)
	{
		phone.sendKeys(phoneno);
	}
	public void organizationame(String orgname)
	{
		orgnizationaname.sendKeys(orgname);
	}
	public void typedd(String type)
	{
		Select s3= new Select(typeDD);
		s3.selectByVisibleText(type);
	}
	public void asiignTo()
	{
		Assignto.click();
	}
	public void createorganization()
	{
		createorgbtn.click();
	}	
	public void Quickcreate()
	{
		quickcreate.click();
	}
	public  void QuickcreateDD()
	{
		Select sq= new Select(quickcreate);
		sq.selectByIndex(14);
	}
	 
	 
	
}
