package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateDocumentPage 

{
	//Declaration
	@FindBy(xpath="//img[@title='Create Document...']")
	private WebElement createDocumentLkpImg;
	
	//Initalization
	
	public CreateDocumentPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
    
	//Utilization
	
	public WebElement getCreateDocumentLkpImg() {
		return createDocumentLkpImg;
	}
	
	public void clickOnCreateDocumentLkpImg()
	{
		createDocumentLkpImg.click();
	}
	
	
	
	
	

}
