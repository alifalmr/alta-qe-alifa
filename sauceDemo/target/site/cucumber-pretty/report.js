$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Checkout.feature");
formatter.feature({
  "line": 2,
  "name": "Checkout",
  "description": "As a user I want to checkout my shopping cart",
  "id": "checkout",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Checkout"
    }
  ]
});
formatter.before({
  "duration": 5146722000,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Checkout items with removing one item on cart page",
  "description": "",
  "id": "checkout;checkout-items-with-removing-one-item-on-cart-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user open the website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user is redirected to inventory page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click add to cart button for \"Sauce Labs Bike Light\" as productName",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user choose \"Name (Z to A)\" as option for sorting the items",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user click add to cart button for \"Sauce Labs Onesie\" as productName",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click add to cart button for \"Test.allTheThings() T-Shirt (Red)\" as productName",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user see the cart badge appeared",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user click cart button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user is redirected to cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "\"Sauce Labs Bike Light\" as productName appeared on card page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "\"Sauce Labs Onesie\" as productName appeared on card page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "\"Test.allTheThings() T-Shirt (Red)\" as productName appeared on card page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user click remove item for \"Test.allTheThings() T-Shirt (Red)\" as productName",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user click checkout button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user is redirected to checkout step one page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user input \"Alifa\" as firstName and input \"Almira\" as lastName and input \"41235\" as zipCode for shipping information",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user is redirected to checkout step two page",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "user get the correct tax",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user get the correct total",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "user click finish button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user is redirected to checkout complete",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "user get \"THANK YOU FOR YOUR ORDER\" as gratMessage for gratitude message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyDisplay()"
});
formatter.result({
  "duration": 1723116700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 1338123900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verifyDisplayed()"
});
formatter.result({
  "duration": 1043444500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sauce Labs Bike Light",
      "offset": 35
    }
  ],
  "location": "CheckoutSteps.addToCart(String)"
});
formatter.result({
  "duration": 3075017400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z to A)",
      "offset": 13
    }
  ],
  "location": "SortSteps.sortItem(String)"
});
formatter.result({
  "duration": 3232087000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sauce Labs Onesie",
      "offset": 35
    }
  ],
  "location": "CheckoutSteps.addToCart(String)"
});
formatter.result({
  "duration": 3080301000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test.allTheThings() T-Shirt (Red)",
      "offset": 35
    }
  ],
  "location": "CheckoutSteps.addToCart(String)"
});
formatter.result({
  "duration": 3067519300,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.verifyBedge()"
});
formatter.result({
  "duration": 1550165400,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.clickCartBtn()"
});
formatter.result({
  "duration": 3098621300,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.verifyPage()"
});
formatter.result({
  "duration": 1596535400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sauce Labs Bike Light",
      "offset": 1
    }
  ],
  "location": "CheckoutSteps.verifyItems(String)"
});
formatter.result({
  "duration": 1558635700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sauce Labs Onesie",
      "offset": 1
    }
  ],
  "location": "CheckoutSteps.verifyItems(String)"
});
formatter.result({
  "duration": 1552639500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test.allTheThings() T-Shirt (Red)",
      "offset": 1
    }
  ],
  "location": "CheckoutSteps.verifyItems(String)"
});
formatter.result({
  "duration": 1563258700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Test.allTheThings() T-Shirt (Red)",
      "offset": 28
    }
  ],
  "location": "CheckoutSteps.removeItem(String)"
});
formatter.result({
  "duration": 3078580000,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.clickCheckout()"
});
formatter.result({
  "duration": 3081946300,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.verifyCOPage()"
});
formatter.result({
  "duration": 1551501800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Alifa",
      "offset": 12
    },
    {
      "val": "Almira",
      "offset": 43
    },
    {
      "val": "41235",
      "offset": 74
    }
  ],
  "location": "CheckoutSteps.inputInformation(String,String,String)"
});
formatter.result({
  "duration": 3409781200,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.verifyCTPage()"
});
formatter.result({
  "duration": 1545618100,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.verifyTax()"
});
formatter.result({
  "duration": 1586756800,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.verifyTotal()"
});
formatter.result({
  "duration": 1599492100,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.clickFnsBtn()"
});
formatter.result({
  "duration": 3101149800,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutSteps.verifyCCPage()"
});
formatter.result({
  "duration": 1534981300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "THANK YOU FOR YOUR ORDER",
      "offset": 10
    }
  ],
  "location": "CheckoutSteps.verifyMessage(String)"
});
formatter.result({
  "duration": 3042765500,
  "status": "passed"
});
formatter.after({
  "duration": 775240200,
  "status": "passed"
});
});