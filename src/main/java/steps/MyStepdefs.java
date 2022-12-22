package steps;

import configuretions.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.TableRow;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pageobjects.HillelCertificateTest;

import java.util.List;
import java.util.Map;

public class MyStepdefs extends BaseClass {
        static HillelCertificateTest hillelCertificateTest= PageFactory.initElements(driver, HillelCertificateTest.class);
    @And("Sent certificate number {string}")
    public void sentCertificateNumber(String number) {
        hillelCertificateTest.sendKeysToSearchField(number);
    }

    @Then("Print text massage")
    public void printTextMassage() {
        System.out.println(hillelCertificateTest.getMessage());
    }

    @When("print list")
    public void printList(DataTable dataTable) {
        List<String> table = dataTable.asList(String.class);
        System.out.println(table);
    }


    @When("print listTT")
    public void printListTT(DataTable dataTable) {
        List<Map<String, String>> table = dataTable.asMaps(String.class, String.class);
        for(Map<String,String> l:table){
            for(String s:l.values()){
             //   System.out.println(s);
            }
        }

    }

    @When("print listTTT")
    public void printListTTT(DataTable dataTable) {

        List<List<String>> data = dataTable.asLists();
        System.out.println(data.get(0).get(3));

        for(List<String> l:data){
            System.out.println(l.get(0)); //sout cilum 0
        }

        System.out.println(data.get(0));
        for (String s:data.get(0)){
            System.out.println(s);
        }
    }
    @Before("@SomeAnotation")
public void print (){
        System.out.println("before print");
}
    @And("Check massage {string}")
    public void checkMassage(String text) {
        Assert.assertEquals(text,hillelCertificateTest.getMessage());
    }
}
