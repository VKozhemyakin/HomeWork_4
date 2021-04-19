package Tests.pageObjects.Scenarios;

import Tests.TestBase;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class HomeWork2_2 extends TestBase {

    RegisrationPage RegistrationPage;

    @Test
    void checkRegistrationForm(){
        RegistrationPage = new RegisrationPage();

        RegistrationPage.openPage();
        RegistrationPage.fillForm();
        RegistrationPage.checkData();


    }
}
