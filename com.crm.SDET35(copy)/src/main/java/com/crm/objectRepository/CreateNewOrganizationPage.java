package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.SDET35.genericutilities.WebDriverUtility;

public class CreateNewOrganizationPage extends WebDriverUtility
{
	//declaration
	@FindBy(name= "accountname")
	private WebElement organisationTextEdt;
	
	@FindBy(name= "industry")
	private WebElement industryDropDown;
	
	@FindBy(name= "accounttype")
	private WebElement typeDropDown;
	
	@FindBy(id= "employees")
	private WebElement employeesNumber;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	//initalization
	
	public CreateNewOrganizationPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver,this);
	}
	//utilization
	

	public void enterOrgInfo(String OranizationName,String industry,String type,String number)
	{   
		organisationTextEdt.sendKeys(OranizationName);
		selectDropDownByValue(industryDropDown,industry);
		selectDropDownByValue(typeDropDown,type);
		employeesNumber.sendKeys(number);
		saveButton.click();
	}
	
	
}
