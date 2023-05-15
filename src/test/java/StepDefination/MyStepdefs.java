package StepDefination;

import Objects.Product;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {




    @Given("a dummy test")
    public void aDummyTest() {
        System.out.println("Given");
    }
    @When("I perform action")
    public void iPerformAction() {
        System.out.println("When");
    }
    @Then("the {product} should appear as {int}")
    public void the_should_appear_as(Product product, Integer int1) {

        System.out.println("Sample product name is :" + product.getProduct());
        // Write code here that turns the phrase above into concrete actions

    }
}
