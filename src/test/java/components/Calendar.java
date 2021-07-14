package components;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class Calendar {
    public void setDate(String day, String month, String year) {
        $(byId("dateOfBirthInput")).click();
        $(".react-datepicker__month-select").selectOption(month);
        $(byClassName("react-datepicker__year-select")).selectOption(year);
        Selenide.$x("//*[@class= 'react-datepicker__week']/*[text()="+ day +"]").click();
    }
}
