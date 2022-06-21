package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.SDET35.genericutilities.WebDriverUtility;

public class HomePage extends WebDriverUtility

{
	
	//Declaration
	
	@FindBy(linkText="Organizations")
	private WebElement organisationLnk;
	
	@FindBy(linkText="Contacts")
	private WebElement contactsLnk;
	
	@FindBy(linkText="More")
	private WebElement MoreButton;
	
	@FindBy(name="Purchase Order")
	private WebElement purchaseOrderLnk;
	
	@FindBy(linkText="Products")
	private WebElement productsLnk;
	

	@FindBy(linkText="Documents")
	private WebElement documentsLnk;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOut;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorIcon;
	
    public WebElement getOrganisationLnk() {
		return organisationLnk;
	}

	public WebElement getPurchaseOrderLnk() {
		return purchaseOrderLnk;
	}

	public WebElement getProductsLnk() {
		return productsLnk;
	}

	public WebElement getDocumentsLnk() {
		return documentsLnk;
	}

	public WebElement getSignOut() {
		return signOut;
	}

	public WebElement getAdministratorIcon() {
		return administratorIcon;
	}

	//Initalization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public WebElement getOrganizationLink() 
	{
	 return organisationLnk;
	}
	
	public WebElement getContactsLnk()
	{
		return contactsLnk;
	}
	public WebElement getMoreButton()
	{
		return MoreButton;
	}
	public void organizationLink()
	{
		organisationLnk.click();
	}
	public WebElement getPurchaseOrder()
	{
		 return purchaseOrderLnk;
	}
   
	public void clickOnContactLink()
	{
		contactsLnk.click();
	}
	
	public void selectingPurchaseOrder(WebDriver driver)
	{
	mouseOverElement(driver, MoreButton);
	purchaseOrderLnk.click();
	}
	public void selectingProductsLnk(WebDriver driver)
	{
		mouseOverElement(driver, MoreButton);
		productsLnk.click();
	}
	public void selectingDocumentsLnk(WebDriver driver)
	{
		mouseOverElement(driver, MoreButton);
		documentsLnk.click();
	}
	
	public void getMouseCursorOverAdministratorIconANdClickOnSignOut(WebDriver driver)
	{
		mouseOverElement(driver,administratorIcon);
		signOut.click();
	}
}
