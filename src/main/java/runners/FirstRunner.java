package runners;


import configuretions.BROWSERS;
import configuretions.BaseClass;
import configuretions.DriverConfig;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/features",//path to feature files
        glue = "steps",//package path
        tags = "@TestYoutubePage",//list feature files for run
        dryRun = false,
        monochrome = true)

public class FirstRunner {
    @BeforeClass
    public static void createDriver() {
       BaseClass.driver= DriverConfig.create(BROWSERS.CHROMEINCOGNITO);

    }
    @AfterClass
    public static void after(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        BaseClass.driver.quit();
    }

}
