package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources",
    glue = {"stepDefinitions"},
    plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {
    public static WebDriver driver;

    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:/chrome-testing/chrome.exe");
        driver = new ChromeDriver();
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
