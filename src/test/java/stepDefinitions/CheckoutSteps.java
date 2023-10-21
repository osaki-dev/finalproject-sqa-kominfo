package stepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;

public class CheckoutSteps {
    WebDriver driver;

    @When("I proceed to checkout")
    public void i_proceed_to_checkout() {
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        driver.findElement(By.cssSelector(".btn_action.checkout_button")).click();
    }

    @Then("I should see the checkout information")
    public void i_should_see_the_checkout_information() {
        Assert.assertTrue(driver.findElement(By.cssSelector(".checkout_info")).isDisplayed());
        driver.quit();
    }
}
