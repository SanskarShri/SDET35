package com.crm.SDET35.genericutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 

{
	public static WebDriver sdriver;
	
	/*Above "public static WebDriver sdriver" i had added to 
	 take screenshot otherwise only public WebDriver driver is written
	 */
	public WebDriver driver;
	public JavaUtility jLib=new JavaUtility();
	public ExcelUtility eLib=new ExcelUtility();
	public FileUtility fLib=new FileUtility();
	public WebDriverUtility wLib=new WebDriverUtility();
	public DataBaseUtility dLib=new DataBaseUtility();
    
	String filePath1=IpathConstants.VtigerCredentialsPropertyFileAndUrlPath;
	/**
	 * connecting to database
	 */
	@BeforeSuite(groups= {"SmokeTest","RegressionTest"})
	public void dbConfig()
	{
		dLib.connectToDb();
		
	}
	
	/*Inside the parameter the value which i
	am passing must be same as that of TestNG_crossBrowser.XML
	*/
	
	//@Parameters("BROWSER")
	@BeforeClass(groups= {"SmokeTest","RegressionTest"})
	public void launchTheBrowser() throws Throwable
	{
		/*In the above method launchTheBrowser i had given the 'browser' as String
		  bcoz from XML file only string value we can get*/
		
		String browser=fLib.getProperty(filePath1,"Browser"); 
		String url=fLib.getProperty(filePath1,"URL");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		  WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
		 WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		}
		else
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		
		/* sdriver=driver i had given for the purpose of taking screenshot 
		   only bcoz above i had used 2 commands which are
		 * public static WebDriver sdriver;
		   public WebDriver driver
		 *  If i had used only public WebDriver driver then there is no need of using 
		   sdriver=driver
		 */
		sdriver=driver;
		//maximizing the window
		driver.manage().window().maximize();
				
		//using implicit Wait
		wLib.waitForWebElementsToLoad(driver, 10);
				
		//Enter the Url of the application
		driver.get(url);
		
		/**
		 * Login to application
		 */
		
	}
	
	@BeforeMethod(groups= {"SmokeTest","RegressionTest"})
	public void loginToApplication() throws Throwable
	{
		String Username=fLib.getProperty(filePath1,"User");		
		String password=fLib.getProperty(filePath1,"pwd");
		
		LoginPage lPage=new LoginPage(driver);
		lPage.loginToApp(Username, password);
	}
	/**
	 * logout from the application
	 */
	@AfterMethod(groups= {"SmokeTest","RegressionTest"})
	public void logoutFromApplication()
	{
		HomePage hPage=new HomePage(driver);
		hPage.getMouseCursorOverAdministratorIconANdClickOnSignOut(driver);
		
	}
	/**
	 * Close the browser
	 */
	@AfterClass(groups= {"SmokeTest","RegressionTest"})
	public void closeTheBrowser()
	{
		driver.close();
	}
	/**
	 * Close the database
	 */
	@AfterSuite(groups= {"SmokeTest","RegressionTest"})
	public void closeDbConfig()
	{
		dLib.closeDB();
	}
	
	
	    
		
		
	}


