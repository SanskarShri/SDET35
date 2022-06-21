package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePurchaseOrderPage 
{
	//Declaration
	@FindBy(xpath="//img[@title='Create Purchase Order...']")
	private WebElement purchaseOrderLkpImg;
	
	//Initalization
	public CreatePurchaseOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Utilization

	public WebElement getPurchaseOrderLkpImg() 
	{
		return purchaseOrderLkpImg;
	}
	public void clickOnPurchaseOrderLkpImg()
	{
		 purchaseOrderLkpImg.click();
	}
	
	
}
