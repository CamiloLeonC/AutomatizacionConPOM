package com.demoqa.automation.steps;

import com.demoqa.automation.models.DataInjection;
import com.demoqa.automation.pageobjects.RegisterUserFormPage;
import com.demoqa.automation.utils.JavaScript;
import com.demoqa.automation.utils.Times;
import net.thucydides.core.annotations.Step;


import java.util.concurrent.TimeUnit;

public class RegisterUserFormSteps {
   RegisterUserFormPage registerUserFormPage = new RegisterUserFormPage();
   DataInjection dataInjection = new DataInjection();
    @Step
    public void openBrowser(){
        registerUserFormPage.open();
    }
    @Step
    public void fillAllFieldsForm() throws InterruptedException {
        registerUserFormPage.getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        Times.waitFor(2000);
        registerUserFormPage.sendFirstNameInput(dataInjection.getFirstName());
        registerUserFormPage.sendLastNameInput(dataInjection.getLastName());
        registerUserFormPage.sendUserEmailInput(dataInjection.getEmail());
        registerUserFormPage.sendGenderRadioClick();
        registerUserFormPage.sendUserNumberInput(dataInjection.getNumberMobile());
        //JavaScript.clickJS(registerUserFormPage.getDriver(),registerUserFormPage.dateOfBirthInput);
        registerUserFormPage.clickDateOfBirthInput();
        registerUserFormPage.clickSelectMonthsList();
        registerUserFormPage.clickMonthOption();
        registerUserFormPage.clickSelectYear();
        registerUserFormPage.clickYearOption();
        registerUserFormPage.clickDayOption();
        registerUserFormPage.sendSubjectsContainerList(dataInjection.getSubjects());
        registerUserFormPage.enterSubject();
        JavaScript.scrollVertical(registerUserFormPage.getDriver());
        Times.waitFor(1000);
        registerUserFormPage.clickHobbiesCheckbox();
        registerUserFormPage.clickSelectPicture(dataInjection.getUploadPicture());
        registerUserFormPage.sendCurrentAddressInput(dataInjection.getCurrentAddress());
        registerUserFormPage.sendStateInput(dataInjection.getState());
        registerUserFormPage.enterStateInput();
        registerUserFormPage.sendCityInput(dataInjection.getCity());
        registerUserFormPage.enterCityInput();
        Times.waitFor(2000);
        JavaScript.clickJS(registerUserFormPage.getDriver(), registerUserFormPage.submitButton);
    }

    @Step
    public void validationSubmittingSuccessful() throws InterruptedException {
        Times.waitFor(2000);
        registerUserFormPage.validations(dataInjection.getExtensionSubmittingForm());
        JavaScript.scrollVertical(registerUserFormPage.getDriver());
        JavaScript.clickJS(registerUserFormPage.getDriver(), registerUserFormPage.closeButton);
        Times.waitFor(3000);

    }

}
