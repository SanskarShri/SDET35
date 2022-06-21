package com.crm.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.SDET35.genericutilities.WebDriverUtility;

public class CreateNewPurchaseOrderPage extends WebDriverUtility
{
	//Declaration
	
	@FindBy(name="subject")
	private WebElement subjectNameTextEdt;
	
	@FindBy(name="tracking_no")
	private WebElement trackingNumber;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement selectVendorLkpImg;
	
	@FindBy (id="search_txt")
	private WebElement vendorSearchTextBar;
	
	@FindBy (name="search")
	private WebElement vendorSearchButton; 
	
	@FindBy(linkText="Rajesh38")
	private WebElement Vendor;
	
	@FindBy(name="bill_street")
	private WebElement billAddress;
	
	@FindBy(name="ship_street")
	private WebElement shipAddress;
	
	@FindBy(xpath="//input[contains(@onclick,'return copyAddressLeft(EditView)')]")
	private WebElement copyShippingAddressRadioButton;
	
	@FindBy(xpath="//input[contains(@onclick,'return copyAddressRight(EditView)')]")
	private WebElement copyBillingAddressRadioButton;
	
	@FindBy(id="searchIcon1")
	private WebElement icon;
	
	@FindBy(name="search_text")
	private WebElement productSearchTextBar;
	
	@FindBy(name="search")
	private WebElement productSearchButton;
	
	@FindBy(linkText="Toys496")
	private WebElement productSelect;
	
	@FindBy(id="qty1")
	private WebElement quantity;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	
	//Initalization
	public CreateNewPurchaseOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public WebElement getVendorSearchTextBar() {
		return vendorSearchTextBar;
	}
	

	public WebElement getCopyBillingAddressRadioButton() {
		return copyBillingAddressRadioButton;
	}

	public WebElement getVendorSearchButton() {
		return vendorSearchButton;
	}

	public WebElement getProductSearchTextBar() {
		return productSearchTextBar;
	}

	public WebElement getProductSearchButton() {
		return productSearchButton;
	}

	public WebElement getProductSelect() {
		return productSelect;
	}

	public WebElement getSearchTextBar() {
		return vendorSearchTextBar;
	}

	public WebElement getSearchButton() {
		return vendorSearchButton;
	}

	public WebElement getVendor() {
		return Vendor;
	}

	public WebElement getSubjectNameTextEdt() {
		return subjectNameTextEdt;
	}

	public WebElement getTrackingNumber() {
		return trackingNumber;
	}

	public WebElement getSelectVendorLkpImg() {
		return selectVendorLkpImg;
	}
	
	public WebElement getBillAddress() {
		return billAddress;
	}

	public WebElement getShipAddress() {
		return shipAddress;
	}

	public WebElement getCopyShippingAddressRadioButton() {
		return copyShippingAddressRadioButton;
	}

	public WebElement getIcon() 
	{
		return icon;
	}
	
	public WebElement getQuantity() 
	{
		return quantity;
	}

	public WebElement getSaveButton() 
	{
		return saveButton;
	}
	
	public void fillPurchaseDetailsAndSelectCopyShippingAddress(String subject,WebDriver driver,String otherWindowUrl,String firstBillAddress,String shipAdd,String product,String value)
	{
		subjectNameTextEdt.sendKeys(subject);
		selectVendorLkpImg.click();
		switchToWindowByUrl(driver,"Vendors&action");
		vendorSearchTextBar.sendKeys("Rajesh");
		vendorSearchButton.click();
		Vendor.click();
		switchToWindow(driver,"Administrator - Purchase Order");
		billAddress.sendKeys(firstBillAddress);
		shipAddress.sendKeys(shipAdd);
		copyShippingAddressRadioButton.click();
		icon.click();
		switchToWindowByUrl(driver,"Products&action");
		productSearchTextBar.sendKeys(product);
		productSearchButton.click();
		productSelect.click();
		switchToWindow(driver,"Administrator - Purchase Order");
		quantity.sendKeys(value);
		saveButton.click();
		
	}
	
	public void fillPurchaseDetailsAndSelectCopyBillingAddress(String subject,WebDriver driver,String firstBillAddress,String product,String value)
	{
		subjectNameTextEdt.sendKeys(subject);
		selectVendorLkpImg.click();
		switchToWindowByUrl(driver,"Vendors&action");
		vendorSearchTextBar.sendKeys("Rajesh");
		vendorSearchButton.click();
		Vendor.click();
		switchToWindow(driver,"Administrator - Purchase Order");
		billAddress.sendKeys(firstBillAddress);
		copyBillingAddressRadioButton.click();
		icon.click();
		switchToWindowByUrl(driver,"Products&action");
		productSearchTextBar.sendKeys(product);
		productSearchButton.click();
		productSelect.click();
		switchToWindow(driver,"Administrator - Purchase Order");
		quantity.sendKeys(value);
		saveButton.click();
	}
	
	public void fillPurchaseDetailsAndSelectCopyBillingAddress(String subject,WebDriver driver,String firstBillAddress,String shipAdd,String product,String value)
	{
		//Tc-31
		subjectNameTextEdt.sendKeys(subject);
		selectVendorLkpImg.click();
		switchToWindowByUrl(driver,"Vendors&action");
		vendorSearchTextBar.sendKeys("Rajesh");
		vendorSearchButton.click();
		Vendor.click();
		switchToWindow(driver,"Administrator - Purchase Order");
		shipAddress.sendKeys(shipAdd);
		billAddress.sendKeys(firstBillAddress);
		copyBillingAddressRadioButton.click();
		icon.click();
		switchToWindowByUrl(driver,"Products&action");
		productSearchTextBar.sendKeys(product);
		productSearchButton.click();
		productSelect.click();
		switchToWindow(driver,"Administrator - Purchase Order");
		quantity.sendKeys(value);
		saveButton.click();
		
	}

	public void fillPurchaseDetailsAndSelectCopyShippinhAddressBillingAddressPresent(String subject,WebDriver driver,String firstBillAddress,String shipAdd,String product,String value)
	{
		//Tc-30
		subjectNameTextEdt.sendKeys(subject);
		selectVendorLkpImg.click();
		switchToWindowByUrl(driver,"Vendors&action");
		vendorSearchTextBar.sendKeys("Rajesh");
		vendorSearchButton.click();
		Vendor.click();
		switchToWindow(driver,"Administrator - Purchase Order");
		billAddress.sendKeys(firstBillAddress);
		shipAddress.sendKeys(shipAdd);
		
		copyShippingAddressRadioButton.click();
		icon.click();
		switchToWindowByUrl(driver,"Products&action");
		productSearchTextBar.sendKeys(product);
		productSearchButton.click();
		productSelect.click();
		switchToWindow(driver,"Administrator - Purchase Order");
		quantity.sendKeys(value);
		saveButton.click();
		
	}
	

}
