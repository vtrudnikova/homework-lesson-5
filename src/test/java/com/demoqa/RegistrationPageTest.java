package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.CheckFormPage;
import pages.RegistrationPage;

import static com.demoqa.TestData.*;

public class RegistrationPageTest {
    RegistrationPage registrationPage = new RegistrationPage();
    CheckFormPage checkFormPage = new CheckFormPage();


    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.startMaximized = true;
    }

    @Test
    void registerUser() {
        registrationPage.openRegistrationPage();
        registrationPage.fillRegistrationForm(firstName, lastName, emailAddress,
                gender, mobilePhone, day, month, year,
                subject, hobbies, path, address, state, city);
        checkFormPage.checkForm(firstName, lastName, emailAddress,
                gender, mobilePhone, day, month, year,
                subject, hobbies, path, address, state, city);
    }
}