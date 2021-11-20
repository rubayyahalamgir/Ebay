package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartLocators {

	//Shirt size
	@FindBy(xpath="//select[@name='Size Type']")
	public WebElement ddSize;
	
	//Shirt shade
	@FindBy(xpath="//select[@name='Shade']")
	public WebElement ddShade;
	
	//Add to Cart
	@FindBy(xpath="//a[@id='atcRedesignId_btn']")
	public WebElement btnAddCart;
	
	
}
