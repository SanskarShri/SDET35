package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactPage 
{
	
	//Declaration
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createContactLkpImg;
	
	//Initalization
	public CreateContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//Utilization
	
	public WebElement getContactLkpImg()
	{
		return createContactLkpImg;
	}
	
	public void clickOncreateContactLkp()
	{
		createContactLkpImg.click();
	}
}
