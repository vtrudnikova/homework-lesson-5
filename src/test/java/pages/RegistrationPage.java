package pages;

import com.codeborne.selenide.Selenide;
import components.Calendar;

import java.io.File;
import java.util.Date;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.demoqa.TestData.*;

public class RegistrationPage {
    private final static String FORM_TITLE = "Student Registration Form";
    private Calendar calendar = new Calendar();

    public void openRegistrationPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(FORM_TITLE));
    }
    public RegistrationPage  enterFirstNameAndLastName(String firstName, String lastName) {
        $("#firstName").setValue(firstName);
        $(byId("lastName")).setValue(lastName);
        return this;
    }
    public RegistrationPage enterEmail(String email) {
        $(byId("userEmail")).setValue(email);
        return this;
    }

    public RegistrationPage selectGender(String gender) {
        $("#genterWrapper").$(byText(gender)).click();
        return this;
    }

    public RegistrationPage enterMobilePhone(String mobilePhone) {
        $(byId("userNumber")).setValue(mobilePhone);
        return this;
    }

    public RegistrationPage selectDatOfBirth(String day, String month, String year) {
        calendar.setDate(day, month, year);
        return this;
    }

    public RegistrationPage selectSubject(String subject) {
        $("#subjectsInput").setValue(subject).pressEnter();
        return this;
    }

    public RegistrationPage selectHobbies(String hobbies) {
        $("#hobbiesWrapper").$(byText(hobbies)).click();
        return this;
    }

    public RegistrationPage uploadPicture() {
        File file = new File("src/test/resources/test.png");
        $("#uploadPicture").uploadFile(file);
        return this;
    }

    public RegistrationPage enterAddress(String address) {
        $(byId("currentAddress")).setValue(address);
        return this;
    }

    public RegistrationPage selectStateAndCity(String state, String city) {
        $("#stateCity-wrapper").$(byText("Select State")).scrollTo().click();
        $("#state").$(byText(state)).click();
        $("#stateCity-wrapper").$(byText("Select City")).click();
        $("#city").$(byText(city)).click();
        return this;
    }

    public RegistrationPage pressSubmit() {
        $(byId("submit")).click();
        return this;
    }
    public void fillRegistrationForm(){
        enterFirstNameAndLastName(firstName,lastName);
        enterEmail(emailAddress);
        selectGender(gender);
        enterMobilePhone(mobilePhone);
        selectDatOfBirth(day, month, year);
        selectSubject(subject);
        selectHobbies(hobbies);
        uploadPicture();
        enterAddress(address);
        selectStateAndCity(state, city);
        pressSubmit();



    }

}
