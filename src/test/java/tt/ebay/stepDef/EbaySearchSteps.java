package tt.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomePageActions;
import tt.ebay.pageAction.EbaySearchResultAction;

public class EbaySearchSteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	EbaySearchResultAction EbaySearchResultActionObj = new EbaySearchResultAction();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage(){
		EbayHomePageActionsObj.loadEbayHomepage();
	}

	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		EbayHomePageActionsObj.searchShoes();
	}

	@Then("^Item list should have only shoes related products$")
	public void item_list_should_have_only_shoes_related_products() throws Throwable {
		EbaySearchResultActionObj.verifyShoesItems();
	}
}

