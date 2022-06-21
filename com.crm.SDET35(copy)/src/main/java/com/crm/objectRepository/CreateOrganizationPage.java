package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage 

{
	//declaration
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createOrgLkpImg;
	
	
	
	//Initalization
	
	public CreateOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	
	public WebElement getCreateOrgLkpImg()
	{
		return createOrgLkpImg;
	}
	
	public void clickOnCreateOrgLkp()
	{
		createOrgLkpImg.click();
	}
	

}
