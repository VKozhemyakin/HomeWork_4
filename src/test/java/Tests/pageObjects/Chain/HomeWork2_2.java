package Tests.pageObjects.Chain;

import Tests.TestBase;
import org.junit.jupiter.api.Test;

public class HomeWork2_2 extends TestBase {

    RegisrationPage RegistrationPage;

    @Test
    void checkRegistrationForm(){
        RegistrationPage = new RegisrationPage();

        RegistrationPage.openPage()
                        .fillForm()
                        .checkData();


    }
}
