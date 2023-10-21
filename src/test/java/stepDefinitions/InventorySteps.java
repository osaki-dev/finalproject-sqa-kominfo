package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class InventorySteps {
    WebDriver driver;

    @Given("I am logged in to SauceDemo in InventorySteps")
    public void i_am_logged_in_to_SauceDemo() {
        System.setProperty("webdriver.chrome.driver", "D:/chrome-testing/chrome.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @When("I add a product to the cart in InventorySteps")
    public void i_add_a_product_to_the_cart() {
        driver.findElement(By.cssSelector(".btn_inventory")).click();
    }

    @Then("I should see the product in my cart in InventorySteps")
    public void i_should_see_the_product_in_my_cart() {
        Assert.assertTrue(driver.findElement(By.cssSelector(".shopping_cart_badge")).getText().equals("1"));
        driver.quit();
    }
}
