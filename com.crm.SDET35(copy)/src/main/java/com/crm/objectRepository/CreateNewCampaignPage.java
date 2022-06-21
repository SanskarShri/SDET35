package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCampaignPage
{
	//Declaration
	
	@FindBy(name="campaignname")
	private WebElement campaignNameTxtEdt;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	//Initalization
	
	public CreateNewCampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	
	public void enteringCampaignNameAndClickingOnSave(String campaignName)
	{
		campaignNameTxtEdt.sendKeys(campaignName);
		saveButton.click();
	}
	
	
	

}
