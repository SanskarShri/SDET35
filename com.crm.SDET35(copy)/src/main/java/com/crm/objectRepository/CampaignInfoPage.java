package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignInfoPage 
{
	//Declaration
	@FindBy(className="dvHeaderText")
	private WebElement actualText;

	
	//Initalization
	public CampaignInfoPage(WebDriver driver)
	{
     PageFactory.initElements(driver,this);
	}


	public String getActualText() {
		return actualText.getText();
	}
	
	//Utilization
	
}
