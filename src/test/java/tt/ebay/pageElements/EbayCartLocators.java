package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartLocators {

	//Shirt size
	@FindBy(xpath="//select[@name='Size Type']")
	public WebElement ddSize;
	
	//Shirt men size
	@FindBy(xpath="//select[@id='msku-sel-2']")
	public WebElement ddMenSize;
	
	//Shirt shade
	@FindBy(xpath="//select[@name='Shade']")
	public WebElement ddShade;
	
	//Shirt Quantity
	@FindBy(xpath="//input[@id='qtyTextBox']")
	public WebElement txtbxQty;
	
	//Add to Cart
	@FindBy(xpath="//a[@id='atcRedesignId_btn']")
	public WebElement btnAddCart;
	
	
}
