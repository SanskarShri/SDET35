package testng;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.SDET35.genericutilities.BaseClass;
import com.crm.objectRepository.CreateNewPurchaseOrderPage;
import com.crm.objectRepository.CreatePurchaseOrderPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.PurchaseInfoPage;
@Listeners(com.crm.SDET35.genericutilities.ListnerImplementation.class)
public class CreatePurchaseSelectCopyBillingAddressCbTest extends BaseClass
{
	@Test
	public void createMethodPurchaseSelectCopyBillingAddressTest() throws Throwable
	{
		//TC-31
		
		
		//To get Random number
		int randum=jLib.getRandomNumber();
		
		//Fetching the data from excel file
		String filePath2="./src/test/resources/PurchaseOrder.xlsx";
		String poSubject=eLib.getExcelCellValue(filePath2, "PurchaseOrder",1,0);
		String tN=eLib.getExcelCellValue(filePath2,"PurchaseOrder",1,1);
	    String firstBillAddress=eLib.getExcelCellValue(filePath2,"PurchaseOrder",6,0);
		String firstshipAdd=eLib.getExcelCellValue(filePath2, "PurchaseOrder",6, 1);
		String prod=eLib.getExcelCellValue(filePath2,"PurchaseOrder",1,3);
		String value=eLib.getIntegerValueFromExcelCell(filePath2, "PurchaseOrder", 1, 2);
		
		
		String trackingNumber=tN+randum;
		
		//Clicking on the purchase order link
		HomePage hPage=new HomePage(driver);
		hPage.selectingPurchaseOrder(driver);
		
		//Clicking on the create purchaseOrder link
		CreatePurchaseOrderPage createpurchaseOrder=new CreatePurchaseOrderPage(driver);
		createpurchaseOrder.clickOnPurchaseOrderLkpImg();
		
		/*Assert.fail(); Added by me to fail the script ,to check whether it take the screenshot at the 
		  place where script get failed*/
		
		//Entering the purchase order details
		
		CreateNewPurchaseOrderPage createNewPurchase=new CreateNewPurchaseOrderPage(driver);
		createNewPurchase.fillPurchaseDetailsAndSelectCopyBillingAddress(poSubject, driver,firstBillAddress,firstshipAdd,prod,value);
		
         //Final Billing address
		PurchaseInfoPage purchaseInfo=new PurchaseInfoPage(driver);
		purchaseInfo.getFinalBillAdd();
         String finalBillAdd=purchaseInfo.getFinalBillAdd();
         String finalShipAdd=purchaseInfo.getFinalShippAdd();
         
         //Verifying Shipping address is not erased
         
         //Assert.assertTrue(finalBillAdd.contains("Rema sky view apartments"));
        //Verifying previous shipping address is erased and Billing address is copied
        
       // Assert.assertTrue(finalShipAdd.contains("Vijaywada,Benzcircle"));
	}

}
