package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.SDET35.genericutilities.WebDriverUtility;

public class OrganisationInfoPage extends WebDriverUtility
{
	//declaration
	@FindBy(className ="dvHeaderText")
	private WebElement organizationName;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorIcon;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOutButton;

	//initalization
	
	public  OrganisationInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public String getOrganizationName()
	{
		return organizationName.getText();
	}
	
	public void getMouseCursorOverAdministratorIconANdClickOnSignOut(WebDriver driver)
	{
		mouseOverElement(driver,administratorIcon);
		signOutButton.click();
	}
	
	
}
