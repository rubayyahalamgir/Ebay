package tt.ebay.pageAction;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import tt.ebay.pageElements.EbayHomePageLocators;
import tt.utilities.ReadExcelSheet;
import tt.utilities.SetupDrivers;

public class EbayHomePageActions {
	
	EbayHomePageLocators EbayHomePageLocatorsObj;
	
	public EbayHomePageActions(){
		EbayHomePageLocatorsObj = new EbayHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomePageLocatorsObj);
	}
	
	public void loadEbayHomepage(){
		SetupDrivers.driver.get("https://www.ebay.com");
		
		/*
		//Implicit wait
		SetupDrivers.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		SetupDrivers.driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
	
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(SetupDrivers.driver, 10);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//input[contains(@value, 'Search')]"), "Search"));
		 */
	}
	
	public void searchShoes(){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shoes");
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	
	public void searchShirts(){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Big & Tall Cotton Tee");
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	
	public void searchShoes(String items){
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(items);
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	
	public void mouseHoverMyEbay() throws Exception{
		Actions actions =new Actions (SetupDrivers.driver);
		actions.moveToElement(EbayHomePageLocatorsObj.linkMyEbay);
		actions.perform();
		Thread.sleep(3000);
	}

	public void clickSummary() throws Exception{
		EbayHomePageLocatorsObj.linkSummary.click();
		Thread.sleep(5000);
	}

	public void searchFromExcel() throws Exception {
		String xlData = ReadExcelSheet.getMapData("Search");
		System.out.println("Excel Data ------->>>>>>>>>>>> "+ xlData);
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(xlData);
		EbayHomePageLocatorsObj.btnSearch.click();
		Thread.sleep(5000);
	}
}
