package com.demoqa.test.stepdefinitions;

import com.demoqa.automation.steps.RegisterUserFormSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterUserFormStepDefinition {

    @Steps
    RegisterUserFormSteps registerUserFormSteps;

    @Given("^That a web user i want to register in the form$")
    public void thatAWebUserIWantToRegisterInTheForm() {
        registerUserFormSteps.openBrowser();
    }

    @When("^fill all the requested fields in the form$")
    public void fillAllTheRequestedFieldsInTheForm() throws InterruptedException {
        registerUserFormSteps.fillAllFieldsForm();
    }

    @Then("^we can see the form with our information$")
    public void weCanSeeTheFormWithOurInformation() throws InterruptedException {
        registerUserFormSteps.validationSubmittingSuccessful();

    }
}
