package tt.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tt.ebay.pageElements.EbayCartLocators;
import tt.ebay.pageElements.EbayHomePageLocators;
import tt.utilities.SetupDrivers;

public class EbayCartPageActions {
	
	EbayCartLocators EbayCartLocatorsObj;
	
	public EbayCartPageActions(){
		EbayCartLocatorsObj = new EbayCartLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartLocatorsObj);
	}
	
	public void selectSizeFromDd() throws Exception{
		Thread.sleep(5000);
		Select myDD = new Select(EbayCartLocatorsObj.ddSize);
		myDD.selectByVisibleText("Big & Tall");
		Thread.sleep(2000);
	}
	
	public void selectShadeFromDd() throws Exception{
		Select myDD = new Select(EbayCartLocatorsObj.ddShade);
		myDD.selectByValue("14");
		Thread.sleep(2000);
	}

	public void addToCart() throws Exception{
		EbayCartLocatorsObj.btnAddCart.click();
		Thread.sleep(5000);
	}
	
	public void switchNewWindow(){
		for(String winHandle : SetupDrivers.driver.getWindowHandles()){
			SetupDrivers.driver.switchTo().window(winHandle);
		}
	}
}
