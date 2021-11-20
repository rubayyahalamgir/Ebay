package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {

	//Search result validation locators
	@FindBy(xpath="//span[2][contains(text(), 'shoes')]")
	public WebElement txtShoes;
	
	//Brand Addidas
	@FindBy(xpath="//*[@aria-label='adidas']")
	public WebElement cbxBrandAdidas;
	
	//Brand Nike
	@FindBy(xpath="//*[@aria-label='Nike']")
	public WebElement cbxBrandNike;
	
	//Unbranded
	@FindBy(xpath="//*[@aria-label='Unbranded']")
	public WebElement cbxUnbranded;
	
	//Validate Addidas
	@FindBy(xpath="//*[contains(text(),'Adidas')]")
	public WebElement txtAdidas;
	
	//Validate Nike
	@FindBy(xpath="//*[contains(text(),'Nike')]")
	public WebElement txtNike;
	
	//Validate Unbranded
	@FindBy(xpath="//*[contains(text(),'Unbranded')]")
	public WebElement txtUnbranded;
	
	//Validate Unbranded
	@FindBy(xpath="//*[contains(text(),'Big & Tall Cotton Tee')]")
	public WebElement lnkShirtItems;
	
}
