package tt.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import tt.ebay.pageElements.EbaySearchResultLocators;
import tt.utilities.SetupDrivers;

public class EbaySearchResultAction {

	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	public EbaySearchResultAction(){
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
	}
	
	public void verifyShoesItems(){
		//Option:1
		EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
		
		//Option:2
		Assert.assertEquals("shoes", EbaySearchResultLocatorsObj.txtShoes.getText());
		
		//Option:3
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
	}
	
	public void filterBrand(String brand) throws Exception{
		Thread.sleep(3000);
		if (brand.equals("addidas")){
			EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
		} else if (brand.equals("Nike")){
			EbaySearchResultLocatorsObj.cbxBrandNike.click();
		} else if (brand.equals("Unbranded")){
			EbaySearchResultLocatorsObj.cbxUnbranded.click();
		}
	}
	
	public void validateBrand(String brand) throws Exception{
		TimeUnit wait = TimeUnit.SECONDS;
		wait.sleep(3);
		if (brand.equals("addidas")){
			EbaySearchResultLocatorsObj.txtAdidas.isDisplayed();
		} else if (brand.equals("Nike")){
			EbaySearchResultLocatorsObj.txtNike.isDisplayed();
		} else if (brand.equals("Unbranded")){
			EbaySearchResultLocatorsObj.txtUnbranded.isDisplayed();
		}
	}
	
	public void selectBigTallCottonTee(){
		EbaySearchResultLocatorsObj.lnkShirtItems.click();
	}
}
