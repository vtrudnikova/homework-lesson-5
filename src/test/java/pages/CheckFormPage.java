package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.demoqa.TestData.*;

public class CheckFormPage {
    private final static String RESULTS_TITLE = "Thanks for submitting the form";
    private SelenideElement modal = $("[role=dialog]");

    public void checkSuccessfulForm( String value ) {
        modal.$(".table-responsive").shouldHave(text(value));
        modal.$(".modal-title").shouldHave(text(RESULTS_TITLE));
    }
    public void checkForm(){
        checkSuccessfulForm(firstName + " " + lastName);
        checkSuccessfulForm(emailAddress);
        checkSuccessfulForm(gender);
        checkSuccessfulForm(mobilePhone);
        checkSuccessfulForm(day + " " + month + "," + year);
        checkSuccessfulForm(subject);
        checkSuccessfulForm(hobbies);
        checkSuccessfulForm(path);
        checkSuccessfulForm(address);
        checkSuccessfulForm(state + " " + city);

    }
}
