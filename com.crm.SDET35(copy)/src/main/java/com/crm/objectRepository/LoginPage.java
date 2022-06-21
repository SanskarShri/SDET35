package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declaration
	@FindBy(name = "user_name")
	private WebElement userNameTextEdt;
	
	@FindBy(name = "user_password")
	private WebElement passwordTextEdt;
	
	@FindBy(id="submitButton")
	private WebElement submitBtn;
	
	//Initalization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	//Utilization
	
		public WebElement getUserNameTextEdt()
		{
			return userNameTextEdt;
		}

		public WebElement getPasswordTextEdt()
		{
			return passwordTextEdt;
		}

		public WebElement getSubmitBtn() 
		{
			return submitBtn;
		}
		
		//Buisness Libraries
		
		public void loginToApp(String username,String password)
		{
			userNameTextEdt.sendKeys(username);
			passwordTextEdt.sendKeys(password);
			submitBtn.click();
		}
	}
	

	


