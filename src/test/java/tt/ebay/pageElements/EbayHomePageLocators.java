package tt.ebay.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import tt.utilities.SetupDrivers;

public class EbayHomePageLocators {
	
	//Search Button - Without Page factory
	WebElement btnSearch2 = SetupDrivers.driver.findElement(By.xpath("//input[contains(@value, 'Search')]"));
	
	//Search Button - Page Factory
	@FindBy(xpath="//input[contains(@value, 'Search')]")
	public WebElement btnSearch;

	//Search Text Box
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txtbxSearch;
	
	//My Ebay
	@FindBy(xpath="//a[@title='My eBay']")
	public WebElement linkMyEbay;
	
	//Summary
	@FindBy(xpath="//a[contains(text(),'Summary')]")
	public WebElement linkSummary;
}
