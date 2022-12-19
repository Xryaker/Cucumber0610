package steps;

import io.cucumber.java.en.When;

public class SomeTests {
    @When("Print some Text {string}")
    public void printSomeText(String arg0) {
        System.out.println(arg0);
    }
}
