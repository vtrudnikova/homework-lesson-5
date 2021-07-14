package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.CheckFormPage;
import pages.RegistrationPage;

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
        registrationPage.fillRegistrationForm();
        checkFormPage.checkForm();
    }
}