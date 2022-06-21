package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.SDET35.genericutilities.WebDriverUtility;

public class ProductInfoPage extends WebDriverUtility

{
	//Declaration
	@FindBy(linkText="More")
	private WebElement MoreButton;
	
	//Initalization
	
	public ProductInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="Campaigns")
	private WebElement campaignsLnk;
	
    //Utilization
	public WebElement getMoreButton() {
		return MoreButton;
	}
	
	public void goingToMoreButtonAndClickingCampaigns(WebDriver driver)
	{
		mouseOverElement(driver,MoreButton);
		campaignsLnk.click();
	}
	
	

}
