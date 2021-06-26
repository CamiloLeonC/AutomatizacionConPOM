package com.demoqa.automation.models;

import com.github.javafaker.Faker;


import javax.swing.*;
import java.io.File;
import java.util.Locale;

public class DataInjection {

    Faker faker = new Faker(new Locale("en-US"));


    private String firstName, lastName, email, numberMobile,  subjects, currentAddress, state, city, extensionSubmittingForm, uploadPicture;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getNumberMobile() {
        return numberMobile;
    }

    public String getSubjects() {
        return subjects;
    }

    public String getUploadPicture() {
        return uploadPicture;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }
    public String getExtensionSubmittingForm() {
        return extensionSubmittingForm;
    }

    public DataInjection() {
        this.firstName = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.numberMobile = Integer.toString(faker.number().numberBetween(1000000000,1999999999));
        this.currentAddress = faker.address().fullAddress();
        this.subjects = "Arts";
        this.state = "NCR";
        this.city = "Delhi";
        this.extensionSubmittingForm = "Thanks for submitting the form";
        this.uploadPicture = "C:\\Users\\camil\\Downloads\\FB_IMG_1606176054106.jpg";





    }
}
