package com.crm.SDET35.genericutilities;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * It contains all reusable actions of WebDriver
 * @author Sanskar Shrivastava
 *
 */

public class WebDriverUtility 
{
	
    /**
     * 
     * It's an implicitly wait,always wait for element in DOM document & release the control if element is available.
     * @param driver
     * @param time
     */
	public void waitForWebElementsToLoad(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	/**
	 * It will wait for js element
	 * @param driver
	 */
	public void waitForPageToLoadForJsElement(WebDriver driver)
	{
		driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
	}
	/**
	 * It is an explicit Wait,here it will always wait for element to be clickable
	 * @param driver
	 */
	public void waitForElementToBeClickable(WebDriver driver,int time,WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	/**
	 * It is an explicitWait,it will always wait to check whether the title is loaded or not
	 * @param driver
	 * @param time
	 */
	public void waitForTitleContains(WebDriver driver,int time,String title)
	{
    WebDriverWait wait=new WebDriverWait(driver,time);
    wait.until(ExpectedConditions.titleContains(title));
	}
	/**
	 * It is an fluentWait,by this method we can change the polling time to our required polling time
	 * @param driver
	 * @param pollingTime
	 * @param ele
	 */
	public void waitForElementToCustom(WebDriver driver,int pollingTime,WebElement ele)
	{
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(pollingTime,TimeUnit.SECONDS);
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	/**
	 * It is a customWait,it will check whether the element is oaded within 10 seconds or not
	 * @throws InterruptedException 
	 * 
	 */
	public void waitAndClick(WebElement ele) throws InterruptedException
	{
		int count=0;
		while(count<10) 
		{
		try
		{
			ele.click();
		}
		catch(Exception e)
		{
			Thread.sleep(1000);
			count++;
		}
		}
	}
	/**
	 * It is used to switch to  any window based on window title
	 * @param driver
	 * @param partialWindow
	 */
	public void switchToWindow(WebDriver driver,String partialWindow)
	{
		Set<String>allWindowIds=driver.getWindowHandles();
		Iterator<String> it=allWindowIds.iterator();
		while(it.hasNext())
		{
			String wTle=it.next();
			driver.switchTo().window(wTle);
			String currentWindow=driver.getTitle();
			if(currentWindow.contains(partialWindow))
			{
				break;
				
			}
		}
	}
	/**
	 * It is used to switch the driver control from one window to another based on Url
	 * @param driver
	 * @param otherWindowUrl
	 */
	public void switchToWindowByUrl(WebDriver driver,String otherWindowUrl)
	{
		Set<String>allWindowIds=driver.getWindowHandles();
		for(String windowId:allWindowIds)
		{
			driver.switchTo().window(windowId);
			if(driver.getCurrentUrl().contains(otherWindowUrl))
			{
				break;
			}
		}
	}
	/**
	 * It is used to switch from one frame to another using index
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver,int index)
	{
	driver.switchTo().frame(index);
	}
	/**
	 * It is used to switch from one frame to another using id or name attribute
	 * @param driver
	 * @param id_attribute
	 */
	public void switchToFrame(WebDriver driver,String id_name_attribute)
	{
		driver.switchTo().frame(id_name_attribute);
	}
	/**
	 * It is used to switch from one frame to another using webelement
	 * @param driver
	 * @param ele
	 */
	public void switchToFrame(WebDriver driver,WebElement ele)
	{
		driver.switchTo().frame(ele);
	}
	/**
	 * It is used to switch from frame to main page of the webpage.
	 * @param driver
	 */
	public void switchToMainPage(WebDriver driver)
	{
		driver.switchTo().defaultContent();	
	}
	/**
	 * It is used to switch to alert popup and accept
	 * @param driver
	 */
	public void switchToAlertPopupAndAccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	/**
	 * It is used to switch to alert popup and Dismiss
	 * @param driver
	 */
	public void switchToAlertPopupAndDismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();	
	}
	/**
	 * It is used to select drop down option using index
	 * @param ele
	 * @param index
	 */
	public void selectDropDown(WebElement ele,int index)
	{
		Select select=new Select(ele);
		select.selectByIndex(index);
	}
	/**
	 * It is used to select drop down by using value
	 */
	public void selectDropDownByValue(WebElement ele,String value)
	{
		Select select=new Select(ele);
		select.selectByValue(value);
	}
	/**
	 * It is used to select drop down by using visible Text
	 * @param ele
	 * @param visibleText
	 */
	public void selectDropDownByVisibleText(WebElement ele,String visibleText)
	{
		Select select=new Select(ele);
		select.selectByVisibleText(visibleText);
	}
	/**
	 * It is used to bring mouse pointer over an element
	 * @param driver
	 * @param ele
	 */
	public void mouseOverElement(WebDriver driver,WebElement ele)
	{
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
	}
	/**
	 * It is used to perform right click over an element
	 * @param driver
	 * @param ele
	 */
	public void rightClick(WebDriver driver,WebElement ele)
	{
		Actions action=new Actions(driver);
		action.contextClick(ele).perform();
	}
	/**
	 * It is used to click on enter button
	 * @param driver
	 */
	public void clickEnter(WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
	}
	/**
	 * 
	 * @param driver
	 * @param screenShotName
	 * @throws IOException 
	 */
	public void takeScreenshot(WebDriver driver,String screenShotName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempFile=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./errorshots/"+screenShotName+".png");
		Files.copy(tempFile, dest);
		
	}
	/**
	 * It is used to scroll down the page
	 * @param driver
	 */
	public void scrollBarDown(WebElement driver,int a)
	{
		JavascriptExecutor jsE=(JavascriptExecutor)driver;
		jsE.executeScript("window.scrollBy(0,a)");
	}
	
	
	
}
