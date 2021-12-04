package tt.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayCartPageActions;
import tt.ebay.pageAction.EbayHomePageActions;
import tt.ebay.pageAction.EbaySearchResultAction;

public class EbayCartDropDownSteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	EbaySearchResultAction EbaySearchResultActionObj = new EbaySearchResultAction();
	EbayCartPageActions EbayCartPageActionsObj = new EbayCartPageActions();

	@When("^Search for shirt$")
	public void search_for_shirt() throws Throwable {
		EbayHomePageActionsObj.searchShirts();
	}

	@When("^Select first shirt on item list$")
	public void select_first_shirt_on_item_list() throws Throwable {
		EbaySearchResultActionObj.selectBigTallCottonTee();
	}

	@When("^Select size$")
	public void select_size() throws Throwable {
		EbayCartPageActionsObj.switchNewWindow();
		EbayCartPageActionsObj.selectSizeFromDd();
	}
	

	@When("^Select men size$")
	public void select_men_size() throws Throwable {
		EbayCartPageActionsObj.selectMenSizeFromDd();
	}

	@When("^Select shade$")
	public void select_shade() throws Throwable {
		EbayCartPageActionsObj.selectShadeFromDd();
	}
	
	@When("^Shirt Quantity$")
	public void shirt_Quantity() throws Throwable {
		EbayCartPageActionsObj.shirtQuantity();
	}

	@Then("^Add to shopping cart$")
	public void add_to_shopping_cart() throws Throwable {
		EbayCartPageActionsObj.addToCart();
	}
	
}
