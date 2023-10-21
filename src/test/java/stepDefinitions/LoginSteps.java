package stepDefinitions;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class LoginSteps {
    WebDriver driver;

    @Given("I am on the SauceDemo login page")
    public void i_am_on_the_SauceDemo_login_page() {
        System.setProperty("webdriver.chrome.driver", "D:/chrome-testing/chrome.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @When("I enter invalid credentials")
    public void i_enter_invalid_credentials() {
        driver.findElement(By.id("user-name")).sendKeys("invalid_user");
        driver.findElement(By.id("password")).sendKeys("invalid_password");
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"));
        driver.quit();
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        Assert.assertTrue(driver.findElement(By.cssSelector(".error-button")).isDisplayed());
        driver.quit();
    }
}
