package com.comcat.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Rajvir
 * contains login page  element and business li like login()
 * 
 * 
 */

public class LoginPage {
	// rule1 create saperate java class

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "user_name")
	private WebElement username;
	@FindBy(name = "user_password")
	private WebElement password;
	@FindBy(id = "submitButton")
	private WebElement loginbtn;

  
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	/**
	 * loginto application  based on username,  password arguments
	 * 
	 * 
	 * @param usernames
	 * @param passwords
	 */
	  

	public void getloginToapp(String usernames, String passwords) {
		driver.manage().window().maximize();
		username.sendKeys(usernames);
		password.sendKeys(passwords);
		loginbtn.click();
	}

}
