$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EbayBrandOutline.feature");
formatter.feature({
  "line": 2,
  "name": "Ebay Brand Outline",
  "description": "",
  "id": "ebay-brand-outline",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Search for items with Brands",
  "description": "",
  "id": "ebay-brand-outline;search-for-items-with-brands",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open Ebay Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Search for \"\u003cItems\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Filter by \"\u003cBrand\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Item list should have products of \"\u003cBrand\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "ebay-brand-outline;search-for-items-with-brands;",
  "rows": [
    {
      "cells": [
        "Items",
        "Brand"
      ],
      "line": 11,
      "id": "ebay-brand-outline;search-for-items-with-brands;;1"
    },
    {
      "cells": [
        "Shoes",
        "Nike"
      ],
      "line": 12,
      "id": "ebay-brand-outline;search-for-items-with-brands;;2"
    },
    {
      "cells": [
        "Shirts",
        "Adidas"
      ],
      "line": 13,
      "id": "ebay-brand-outline;search-for-items-with-brands;;3"
    },
    {
      "cells": [
        "Pants",
        "Unbranded"
      ],
      "line": 14,
      "id": "ebay-brand-outline;search-for-items-with-brands;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4065662300,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Search for items with Brands",
  "description": "",
  "id": "ebay-brand-outline;search-for-items-with-brands;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open Ebay Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Search for \"Shoes\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Filter by \"Nike\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Item list should have products of \"Nike\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "EbaySearchSteps.open_Ebay_Homepage()"
});
formatter.result({
  "duration": 875574400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shoes",
      "offset": 12
    }
  ],
  "location": "EbayBrandOutlineSteps.search_for(String)"
});
formatter.result({
  "duration": 3168604200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nike",
      "offset": 11
    }
  ],
  "location": "EbayBrandOutlineSteps.filter_by(String)"
});
formatter.result({
  "duration": 4703901900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nike",
      "offset": 35
    }
  ],
  "location": "EbayBrandOutlineSteps.item_list_should_have_products_of(String)"
});
formatter.result({
  "duration": 3060081900,
  "status": "passed"
});
formatter.after({
  "duration": 723959100,
  "status": "passed"
});
formatter.before({
  "duration": 3471044800,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Search for items with Brands",
  "description": "",
  "id": "ebay-brand-outline;search-for-items-with-brands;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open Ebay Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Search for \"Shirts\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Filter by \"Adidas\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Item list should have products of \"Adidas\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "EbaySearchSteps.open_Ebay_Homepage()"
});
formatter.result({
  "duration": 904074600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shirts",
      "offset": 12
    }
  ],
  "location": "EbayBrandOutlineSteps.search_for(String)"
});
formatter.result({
  "duration": 4476466200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adidas",
      "offset": 11
    }
  ],
  "location": "EbayBrandOutlineSteps.filter_by(String)"
});
formatter.result({
  "duration": 3007172700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adidas",
      "offset": 35
    }
  ],
  "location": "EbayBrandOutlineSteps.item_list_should_have_products_of(String)"
});
formatter.result({
  "duration": 3000497300,
  "status": "passed"
});
formatter.after({
  "duration": 682176900,
  "status": "passed"
});
formatter.before({
  "duration": 3127899100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Search for items with Brands",
  "description": "",
  "id": "ebay-brand-outline;search-for-items-with-brands;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open Ebay Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Search for \"Pants\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Filter by \"Unbranded\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Item list should have products of \"Unbranded\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "EbaySearchSteps.open_Ebay_Homepage()"
});
formatter.result({
  "duration": 762303100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pants",
      "offset": 12
    }
  ],
  "location": "EbayBrandOutlineSteps.search_for(String)"
});
formatter.result({
  "duration": 2932918000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Unbranded",
      "offset": 11
    }
  ],
  "location": "EbayBrandOutlineSteps.filter_by(String)"
});
formatter.result({
  "duration": 5005358700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Unbranded",
      "offset": 35
    }
  ],
  "location": "EbayBrandOutlineSteps.item_list_should_have_products_of(String)"
});
formatter.result({
  "duration": 3062985000,
  "status": "passed"
});
formatter.after({
  "duration": 656350800,
  "status": "passed"
});
formatter.uri("EbayCartDropDown.feature");
formatter.feature({
  "line": 2,
  "name": "Ebay Cart Functionality",
  "description": "",
  "id": "ebay-cart-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 2948508000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Add product to cart using drop down options",
  "description": "",
  "id": "ebay-cart-functionality;add-product-to-cart-using-drop-down-options",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open Ebay Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Search for shirt",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Select first shirt on item list",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select size",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Select men size",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Select shade",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Shirt Quantity",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Add to shopping cart",
  "keyword": "Then "
});
formatter.match({
  "location": "EbaySearchSteps.open_Ebay_Homepage()"
});
formatter.result({
  "duration": 743828300,
  "status": "passed"
});
formatter.match({
  "location": "EbayCartDropDownSteps.search_for_shirt()"
});
formatter.result({
  "duration": 2010370400,
  "status": "passed"
});
formatter.match({
  "location": "EbayCartDropDownSteps.select_first_shirt_on_item_list()"
});
formatter.result({
  "duration": 332500700,
  "status": "passed"
});
formatter.match({
  "location": "EbayCartDropDownSteps.select_size()"
});
formatter.result({
  "duration": 7187201900,
  "status": "passed"
});
formatter.match({
  "location": "EbayCartDropDownSteps.select_men_size()"
});
formatter.result({
  "duration": 7173584400,
  "status": "passed"
});
formatter.match({
  "location": "EbayCartDropDownSteps.select_shade()"
});
formatter.result({
  "duration": 2160177700,
  "status": "passed"
});
formatter.match({
  "location": "EbayCartDropDownSteps.shirt_Quantity()"
});
formatter.result({
  "duration": 5135435500,
  "status": "passed"
});
formatter.match({
  "location": "EbayCartDropDownSteps.add_to_shopping_cart()"
});
formatter.result({
  "duration": 5114297400,
  "status": "passed"
});
formatter.after({
  "duration": 693853300,
  "status": "passed"
});
formatter.uri("EbaySearch.feature");
formatter.feature({
  "line": 2,
  "name": "Ebay Search Functionality",
  "description": "",
  "id": "ebay-search-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 3177934400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Search for shoes",
  "description": "",
  "id": "ebay-search-functionality;search-for-shoes",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open Ebay Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Search for shoes",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Item list should have only shoes related products",
  "keyword": "Then "
});
formatter.match({
  "location": "EbaySearchSteps.open_Ebay_Homepage()"
});
formatter.result({
  "duration": 967969600,
  "status": "passed"
});
formatter.match({
  "location": "EbaySearchSteps.search_for_shoes()"
});
formatter.result({
  "duration": 3227170000,
  "status": "passed"
});
formatter.match({
  "location": "EbaySearchSteps.item_list_should_have_only_shoes_related_products()"
});
formatter.result({
  "duration": 308152100,
  "status": "passed"
});
formatter.after({
  "duration": 684089000,
  "status": "passed"
});
formatter.uri("EbaySummaryMouseHover.feature");
formatter.feature({
  "line": 2,
  "name": "Ebay Summary Mousehover",
  "description": "",
  "id": "ebay-summary-mousehover",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 2959813100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Ebay Summary Mousehover",
  "description": "",
  "id": "ebay-summary-mousehover;ebay-summary-mousehover",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open Ebay Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Mouse Hover to MyEbay Summary",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on Summary",
  "keyword": "Then "
});
formatter.match({
  "location": "EbaySearchSteps.open_Ebay_Homepage()"
});
formatter.result({
  "duration": 852585600,
  "status": "passed"
});
formatter.match({
  "location": "EbaySummaryMouseHoverSteps.mouse_Hover_to_MyEbay_Summary()"
});
formatter.result({
  "duration": 3364374600,
  "status": "passed"
});
formatter.match({
  "location": "EbaySummaryMouseHoverSteps.click_on_Summary()"
});
formatter.result({
  "duration": 6082176500,
  "status": "passed"
});
formatter.after({
  "duration": 690359100,
  "status": "passed"
});
});