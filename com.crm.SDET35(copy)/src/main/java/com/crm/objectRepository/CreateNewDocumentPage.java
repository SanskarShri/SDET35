package com.crm.objectRepository;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.SDET35.genericutilities.IpathConstants;
import com.crm.SDET35.genericutilities.WebDriverUtility;

public class CreateNewDocumentPage extends WebDriverUtility

{
	//Declaration
	@FindBy(name="notes_title")
	private WebElement documentTitleText;
	
	@FindBy(xpath="//input[@value='T']")
	private WebElement groupRadioButton;
	
	@FindBy(name="assigned_group_id")
	private WebElement listBox;
	
	@FindBy(xpath="//iframe[@allowtransparency='true']")
	private WebElement frame;
	
	@FindBy(xpath="//input[@type='file']")
	private WebElement chooseFileButton;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	//Initalization
	public CreateNewDocumentPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getDocumentTitleText() {
		return documentTitleText;
	}

	public WebElement getGroupRadioButton() {
		return groupRadioButton;
	}

	public WebElement getListBox() {
		return listBox;
	}

	public WebElement getFrame() {
		return frame;
	}
	
    //Utilization
	
	public void fillDocumentsDetails(WebDriver driver) 
	{
		documentTitleText.sendKeys("Artificial Intelligence");
		groupRadioButton.click();
		selectDropDownByVisibleText(listBox,"Team Selling");
		frame.sendKeys("AI is the future");
		//Fetching the screenshot.png from src/test/resources and storing it in the choose file button
		
		File f=new File(IpathConstants.filePath1);
		String path=f.getAbsolutePath();
		chooseFileButton.sendKeys(path);
		saveButton.click();
	}
	

}
