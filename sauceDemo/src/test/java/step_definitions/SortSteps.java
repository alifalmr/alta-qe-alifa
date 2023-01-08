package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.pageObject.InventoryPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SortSteps {
    private WebDriver webDriver;

    public SortSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("user choose \"(.*)\" as option for sorting the items")
    public void sortItem(String option) throws InterruptedException {
        InventoryPage inventoryPage = new InventoryPage(webDriver);
        inventoryPage.selectOption(option);

        Thread.sleep(3000);
    }
}
