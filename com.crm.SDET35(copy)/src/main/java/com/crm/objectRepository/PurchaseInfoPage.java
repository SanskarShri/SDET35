package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.SDET35.genericutilities.WebDriverUtility;

public class PurchaseInfoPage extends WebDriverUtility
{
	//Declaration
	@FindBy(id="dtlview_Billing Address")
	public WebElement finalBillAdd;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorIcon;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOutButton;
	
	@FindBy(id="mouseArea_Shipping Address")
	private WebElement finalShippAdd;
	
	//initalization
	
    public  PurchaseInfoPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
    
   //Utilization
	public String getFinalBillAdd() {
		return finalBillAdd.getText();
	}

	public WebElement getAdministratorIcon() {
		return administratorIcon;
	}

	public WebElement getSignOutButton() {
		return signOutButton;
	}

	public String getFinalShippAdd() {
		return finalShippAdd.getText();
	}
    
	public void getMouseCursorOverAdministratorIconANdClickOnSignOut(WebDriver driver)
	{
		mouseOverElement(driver,administratorIcon);
		signOutButton.click();
	}
    
}
