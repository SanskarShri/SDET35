package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.SDET35.genericutilities.WebDriverUtility;

public class CreateNewProductPage extends WebDriverUtility
{
	//Declaration
	@FindBy(name="productname")
	private WebElement productTextEdt;
	
	@FindBy(name="productcategory")
	private WebElement productCategoryListBox;
	
	@FindBy(name="manufacturer")
    private WebElement manufacturerList;
	
	@FindBy(xpath="//input[@type='radio' and @value='T']")
	private WebElement radioButton;
	
	@FindBy(name="assigned_group_id")
	private WebElement groupList;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	@FindBy(linkText="More")
	private WebElement MoreButton;
	
	public WebElement getMoreButton() {
		return MoreButton;
	}

	

	
	
	//Initalization
	
	public CreateNewProductPage(WebDriver driver)
	{
	 PageFactory.initElements(driver,this);	
	}

	public WebElement getProductTextEdt() {
		return productTextEdt;
	}

	public WebElement getProductCategoryListBox() {
		return productCategoryListBox;
	}

	public WebElement getManufacturerList() {
		return manufacturerList;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getGroupList() {
		return groupList;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void fillProductDetails(String productName,String productCategory,WebDriver driver)
	{
		productTextEdt.sendKeys(productName);	
		selectDropDownByValue(productCategoryListBox, productCategory);
		selectDropDownByValue(manufacturerList,"LexPon Inc.");
		radioButton.click();
		selectDropDownByVisibleText(groupList,"Support Group");
		saveButton.click();
		
		
		
	}
}
