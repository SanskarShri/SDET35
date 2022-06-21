package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage 
{
	
	//Declaration
	
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement createCampaignLkpImg;
	
	//Initalization
	
	public CreateCampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	
	
	public WebElement createCampaignLkpImg()
	{
		return createCampaignLkpImg;
	}
	
	public void clickOnCreateCampaignLkpImg()
	{
		createCampaignLkpImg.click();
	}

}
