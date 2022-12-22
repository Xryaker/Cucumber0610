package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SomeTests {
    @When("Print some Text {string}")
    public void printSomeText(String arg0) {
        System.out.println(arg0);
    }

    @When("open browser")
    public void openBrowser() {
        System.out.println("khvjhgc");
    }

    @And("Some text {string}")
    public void someText(String str) {
        System.out.println(str);
    }

    @And("Enter keys {string} in search field google")
    public void enterKeysInSearchFieldGoogle(String url) {
        System.out.println(url);
    }
}
