package io.cucumber.skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class EatAppleStepdefs {

    private int appleCount = 0;

    @Given("^有(\\d+)个苹果$")
    public void has_apples(int count) {
        appleCount = count;
    }

    @When("^吃了(\\d+)个苹果$")
    public void eat_apples(int eatenCount) {
        appleCount = appleCount - eatenCount;
    }

    @Then("^应该剩下(\\d+)个苹果$")
    public void should_have_apples(int expectedCount) {
        assertEquals(expectedCount, appleCount);
    }
}
