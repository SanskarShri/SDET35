package testng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.SDET35.genericutilities.BaseClass;
import com.crm.SDET35.genericutilities.IpathConstants;
import com.crm.objectRepository.CreateNewPurchaseOrderPage;
import com.crm.objectRepository.CreatePurchaseOrderPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.PurchaseInfoPage;

@Listeners(com.crm.SDET35.genericutilities.ListnerImplementation.class)
public class CreatePurchaseOrderSelCopyShippingAddBillingAddPresCbTest extends BaseClass
{
	@Test
	public void createMethodPurchaseOrderSelCopyShippingAddBillingAddPresCbTest() throws Throwable
	{
		//TC-30
		
		
		//To get Random number
		int randNum=jLib.getRandomNumber();
		
		//Fetching the data from excel file
		String filePath2=IpathConstants.puchaseOrderFilePath;
		
		String poSubject=eLib.getExcelCellValue(filePath2,"PurchaseOrder",1,0);
		String tN=eLib.getExcelCellValue(filePath2,"PurchaseOrder",1,1);
		String value=eLib.getIntegerValueFromExcelCell(filePath2, "PurchaseOrder",1, 2);
		String prod=eLib.getExcelCellValue(filePath2,"PurchaseOrder",1,3);
		String firstBillAddress=eLib.getExcelCellValue(filePath2,"PurchaseOrder",6,0);
		String shipAdd=eLib.getExcelCellValue(filePath2,"PurchaseOrder",6,1);
		String trackingNumber=tN+randNum;
		
		
		//Moving the mouse cursor to more button and selecting purchase order
		HomePage hPage=new HomePage(driver);
		hPage.selectingPurchaseOrder(driver);

		//Clicking on the create purchaseOrderlink
		CreatePurchaseOrderPage create=new CreatePurchaseOrderPage(driver);
		create.clickOnPurchaseOrderLkpImg();
		
		/*Assert.fail(); Added by me to fail the script ,to check whether it take the screenshot at the 
		  place where script get failed*/
		
		//Entering the purchase order details
		CreateNewPurchaseOrderPage createPurchase=new CreateNewPurchaseOrderPage(driver);
		createPurchase.fillPurchaseDetailsAndSelectCopyShippinhAddressBillingAddressPresent(poSubject, driver,firstBillAddress,shipAdd,prod, value);
       
		 //Fetching final billing address and shipping address text
		 PurchaseInfoPage pInfo=new PurchaseInfoPage(driver);
		 String finalBillAdd=pInfo.getFinalBillAdd();
        String finalShippAdd=pInfo.getFinalShippAdd();
         //Verifying Shipping address is not erased
         
         Assert.assertTrue(finalBillAdd.contains("Vijaywada,Benzcircle"));
        	
        Assert.assertTrue(finalBillAdd.equals(shipAdd));
         }
	

}
