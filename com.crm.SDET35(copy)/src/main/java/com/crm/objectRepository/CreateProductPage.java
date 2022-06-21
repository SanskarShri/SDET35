package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage 
{  
	//Declaration
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement createProductLkpImg;

	//Initalization
	public CreateProductPage(WebDriver driver)
	{
		
	PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void clickCreateProductLkpImg()
	{
		createProductLkpImg.click();	
	}
}
