package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.SDET35.genericutilities.WebDriverUtility;

public class ContactInfoPage extends WebDriverUtility
{
	    //Declaration
		@FindBy(className ="dvHeaderText")
		private WebElement contactName;
		
		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement administratorIcon;
		
		@FindBy(xpath="//a[text()='Sign Out']")
		private WebElement signOutButton;
		
		//Initalization
		public ContactInfoPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
        
		//Utilization
		public WebElement getContactName()
		{
			return contactName;
		}

		public WebElement getAdministratorIcon() 
		{
			return administratorIcon;
		}

		public WebElement getSignOutButton() 
		{
			return signOutButton;
		}
        
		public String getContacts()
		{
			return contactName.getText();
		}
		public void getMouseCursorOverAdministratorIconANdClickOnSignOut(WebDriver driver)
		{
			mouseOverElement(driver,administratorIcon);
			signOutButton.click();
		}
		
	
		
		
}
