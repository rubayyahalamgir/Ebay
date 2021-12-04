package tt.ebay.pageAction;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tt.ebay.pageElements.EbayCartLocators;
import tt.ebay.pageElements.EbayHomePageLocators;
import tt.utilities.ReadExcelSheet;
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
//		myDD.selectByVisibleText("Big & Tall");
		myDD.selectByVisibleText(ReadExcelSheet.getMapData("Size"));
		Thread.sleep(2000);
	}
	
	public void selectMenSizeFromDd() throws Exception{
		Thread.sleep(5000);
		Select myDD = new Select(EbayCartLocatorsObj.ddMenSize);
//		myDD.selectByVisibleText("6XLT");
		myDD.selectByVisibleText(ReadExcelSheet.getMapData("MenSize"));
		Thread.sleep(2000);
	}
	
	
	public void selectShadeFromDd() throws Exception{
		Select myDD = new Select(EbayCartLocatorsObj.ddShade);
//		myDD.selectByValue("14");
		myDD.selectByValue(ReadExcelSheet.getMapData("Shade"));
		Thread.sleep(2000);
	}
	
	public void shirtQuantity() throws Exception{
		EbayCartLocatorsObj.txtbxQty.clear();
//		EbayCartLocatorsObj.txtbxQty.sendKeys("5");
		EbayCartLocatorsObj.txtbxQty.sendKeys(ReadExcelSheet.getMapData("Quantity"));
		Thread.sleep(5000);
	}

	public void addToCart() throws Exception{
		EbayCartLocatorsObj.btnAddCart.click();
		Thread.sleep(5000);
	}
	
	public void switchNewWindow(){
		for(String winHandle : SetupDrivers.driver.getWindowHandles()){
			SetupDrivers.driver.switchTo().window(winHandle);
			
		/*	Set<String> AllWindowHandles = SetupDrivers.driver.getWindowHandles();
			String window1 = (String) AllWindowHandles.toArray()[0];
			String window2 = (String) AllWindowHandles.toArray()[1];
			String window5 = (String) AllWindowHandles.toArray()[4];
			SetupDrivers.driver.switchTo().window(window2);
		*/
		}
	}
	
	public void javaScriptExecutor(){
		JavascriptExecutor javascriptobj = (JavascriptExecutor) SetupDrivers.driver;
		String todisable = "document.getElementsByName('fname')[0].setAttribute('disabled', '');";
		javascriptobj.executeScript(todisable);
		String toenable = "document.getElementsByName('lname')[0].removeAttribute('disabled');";
		javascriptobj.executeScript(toenable);
		
		
		JavascriptExecutor JavaScriptExecutorObj = (JavascriptExecutor) SetupDrivers.driver;
		JavaScriptExecutorObj.executeScript("arguments[0].click();", EbayCartLocatorsObj.btnAddCart);
	}
	
	public void screenShot() throws Exception{
		//Screenshot: 
		File screenshot = ((TakesScreenshot)SetupDrivers.driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\TTSoftware\\Screenshots"));
	}
}
