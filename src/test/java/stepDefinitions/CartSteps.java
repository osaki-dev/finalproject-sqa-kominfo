package stepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

public class CartSteps {
    WebDriver driver;

    @When("I add a product to the cart")
    public void i_add_a_product_to_the_cart() {
        driver.findElement(By.cssSelector(".btn_inventory")).click();
    }

    @Then("I should see the product in my cart")
    public void i_should_see_the_product_in_my_cart() {
        Assert.assertTrue(driver.findElement(By.cssSelector(".shopping_cart_badge")).getText().equals("1"));
        driver.quit();
    }
}
