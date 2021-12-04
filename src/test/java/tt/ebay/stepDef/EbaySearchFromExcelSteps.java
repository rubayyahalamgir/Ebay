package tt.ebay.stepDef;

import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomePageActions;

public class EbaySearchFromExcelSteps {
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	
	@When("^Search from Excel$")
	public void search_from_Excel() throws Throwable {
		EbayHomePageActionsObj.searchFromExcel();
	}
}
