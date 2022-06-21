package com.crm.SDET35.genericutilities;

public interface IpathConstants 
{   
	//Excel files Paths
    String puchaseOrderFilePath="./src/test/resources/PurchaseOrder.xlsx";
    String contactsFilePath="./src/test/resources/ContactsDetails.xlsx";
    String organizationFilePath="./src/test/resources/OrgDetails.xlsx";
    String productAndCampaignPath="./src/test/resources/Details.xlsx";
    String writeHereFilePath="./src/test/resources/WriteHere.xlsx";
    String dataProviderFetchingDataFromExcel="./src/test/resources/DataProviderFetchingDataFromExcel.xlsx";
    
    //Property files paths
    String VtigerCredentialsPropertyFileAndUrlPath="./src/test/resources/VtigerCredntials&browser.properties";
    
    //Driver executable files path and their keys
    String chromePath="./src/main/resources/chromedriver.exe";
	 String chromekey="webdriver.chrome.driver";
	 
    //JDBC
	 String JDBC_USERNAME="root";
	 String JDBC_PASSWORD="root";
			 
    //Images
	 String filePath1="./src/test/resources/Screenshot.png";
}
