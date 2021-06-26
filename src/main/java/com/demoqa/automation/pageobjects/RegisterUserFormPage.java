package com.demoqa.automation.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import java.io.File;

import static org.junit.Assert.assertEquals;

@DefaultUrl("https://www.demoqa.com/automation-practice-form")
public class RegisterUserFormPage extends PageObject {

   public By firstNameInput = By.id("firstName");
   public By lastNameInput = By.id("lastName");
   public By userEmailInput = By.id("userEmail");
   public By genderRadioInput = By.xpath("//label[@for='gender-radio-1']");
   public By userNumberInput = By.id("userNumber");
   //public By dateOfBirthInput = By.id("dateOfBirthInput");
   public By dateOfBirthInput = By.id("dateOfBirthInput");
   public By monthSelectList = By.xpath("//select[@class='react-datepicker__month-select']");
   public By monthOption = By.xpath("//*[@value='1' and text()='February']");
   public By yearSelectList = By.xpath("//*[@class='react-datepicker__year-select']");
   public By yearOption = By.xpath("//*[@value='1999' and text()='1999']");
   public By dayOption = By.xpath("//*[@class='react-datepicker__day react-datepicker__day--001' and text()='1']");
   public By subjectsContainerList = By.id("subjectsInput");
   public By hobbiesCheckbox = By.xpath("//label[@for='hobbies-checkbox-1']");
   public By uploadPictureInput = By.id("uploadPicture");
   public By currentAddressInput = By.id("currentAddress");
   public By stateInput = By.xpath("//*[@id='react-select-3-input' and @type='text']");
   public By cityInput = By.xpath("//*[@id='react-select-4-input' and @type='text']");
   public By submitButton = By.id("submit");
   public By validationOfSubmittingForm = By.xpath("//*[@id='example-modal-sizes-title-lg' and text()='Thanks for submitting the form']");
   public By closeButton = By.xpath("//*[@id='closeLargeModal' and @type='button']");


   public void sendFirstNameInput (String string){
      getDriver().findElement(firstNameInput).sendKeys(string);
   }
   public void sendLastNameInput (String string){
      getDriver().findElement(lastNameInput).sendKeys(string);
   }
   public void sendUserEmailInput (String string){
      getDriver().findElement(userEmailInput).sendKeys(string);
   }
   public void sendGenderRadioClick(){
      getDriver().findElement(genderRadioInput).click();
   }
   public void sendUserNumberInput (String string){
      getDriver().findElement(userNumberInput).sendKeys(string);
   }
   public void clickDateOfBirthInput (){
       getDriver().findElement(dateOfBirthInput).click();
   }
   public void clickSelectMonthsList(){
       getDriver().findElement(monthSelectList).click();
   }
   public void clickMonthOption(){
       getDriver().findElement(monthOption).click();
   }
   public void clickSelectYear(){
       getDriver().findElement(yearSelectList).click();
   }
   public void clickYearOption(){
       getDriver().findElement(yearOption).click();
   }
   public void clickDayOption(){
       getDriver().findElement(dayOption).click();
   }
   public void sendSubjectsContainerList(String string){
      getDriver().findElement(subjectsContainerList).sendKeys(string);
   }
   public void enterSubject() {
      getDriver().findElement(subjectsContainerList).sendKeys(Keys.ENTER);
   }
   public void clickHobbiesCheckbox (){
      getDriver().findElement(hobbiesCheckbox).click();
   }
   public void clickSelectPicture(String string){
      getDriver().findElement(uploadPictureInput).sendKeys(string);
   }
   /*public void sendUploadPictureInput(String string){
      //String path = file.getAbsolutePath();
      getDriver().findElement(u)
   }*/
   public void sendCurrentAddressInput(String string){
      getDriver().findElement(currentAddressInput).sendKeys(string);
   }
   public void sendStateInput(String string){
      getDriver().findElement(stateInput).sendKeys(string);
   }
   public void enterStateInput(){
      getDriver().findElement(stateInput).sendKeys(Keys.ENTER);
   }
   public void sendCityInput(String string){
      getDriver().findElement(cityInput).sendKeys(string);
   }
   public void enterCityInput(){
      getDriver().findElement(cityInput).sendKeys(Keys.ENTER);
   }
   public void validations (String expectSubmittingForm){
      assertEquals(getDriver().findElement(validationOfSubmittingForm).getText(), expectSubmittingForm);
   }
   public void clickCloseButton(){
      getDriver().findElement(closeButton).click();
   }



}

