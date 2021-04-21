package tests.pageObjects.steps;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class RegisrationPage {

    private SelenideElement pageHeader = $x("//div[@class='practice-form-wrapper']"),
                    firstNameInput =  $x("//input[@id='firstName']");

    public void checkPageHeader(String value) { pageHeader.shouldHave(text(value)); }

    public void setFirstNameInput(String value) { firstNameInput.setValue(value); }

    public void setBirthDate(String year, String month, String day) {

    $x("//select[@class='react-datepicker__year-select']").selectOption(year);
    $x("//select[@class='react-datepicker__month-select']").selectOption(month);
    $x("//div[contains(@class,'react-datepicker__day--0"+day+"')]").click();

    }
}

