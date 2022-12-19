package steps;

import configuretions.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pageobjects.YoutubePageObject;

public class YoutubeSteps  extends BaseClass {
    static YoutubePageObject youtubePageObject = PageFactory.initElements(driver, YoutubePageObject.class);
    @When("I open page {string}")
    public void iOpenPage(String url) {
        driver.get(url);
    }

    @And("Enter keys {string} in search field")
    public void enterKeysInSearchField(String word) {
        youtubePageObject.sendKeysToSearchField(word);
    }

    @Then("Get first link of list")
    public void getFirstLinkOfList() {
        youtubePageObject.printLinks();
    }
}
