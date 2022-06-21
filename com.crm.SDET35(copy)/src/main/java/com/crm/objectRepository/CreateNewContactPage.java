package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.SDET35.genericutilities.WebDriverUtility;

public class CreateNewContactPage extends WebDriverUtility
{  
	//declaration
	@FindBy(name="firstname")
	private WebElement firstName;
	
	@FindBy(name="lastname")
	private WebElement lastName;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement selectOrganizationLkpImg;
	
	@FindBy (id="search_txt")
	private WebElement searchTextBar;
	
	@FindBy (name="search")
	private WebElement searchButton; 
	
	@FindBy (linkText="Testyantra55")
	private WebElement Organization;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	//initalization
	
	public CreateNewContactPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public WebElement getFirstName()
	{
		return firstName;
	}
	
	public WebElement getLastName()
	{
		return lastName;
	}
	public WebElement getSearchText()
	{
		return searchTextBar;
	}
	public WebElement getOrganization()
	{
		return Organization;
	}
	
	public WebElement getSaveButton()
	{
		return saveButton;
	}
	
	public void fillContactDetails(WebDriver driver,String firstN,String lastN,String window1,String window2)
	{
		firstName.sendKeys(firstN);
		lastName.sendKeys(lastN);
		selectOrganizationLkpImg.click();
		switchToWindowByUrl(driver,window1);
		searchTextBar.sendKeys("Testyantra");
		searchButton.click();
		Organization.click();
		switchToWindowByUrl(driver,window2);
		saveButton.click();
		
	}

}