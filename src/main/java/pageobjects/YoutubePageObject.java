package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YoutubePageObject {
    @FindBy(xpath = "//input[@id=\"search\"]")
    WebElement searchField;
    @FindBy(xpath = "//div[contains(@id,\"contents\") and contains(@class,\"style-scope\") and contains(@class,\"ytd-item-section-renderer\")]")
    WebElement elementLinks;

    public void sendKeysToSearchField(String str){
        searchField.sendKeys(str);
        searchField.submit();
    }

    public void printLinks(){
        List<WebElement> listVideosLinks=elementLinks.findElements(By.xpath("//a[@id=\"thumbnail\"]"));
        System.out.println(listVideosLinks.get(0).getAttribute("href"));
    }
}
