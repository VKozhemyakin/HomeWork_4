package Tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static utils.RandomUtils.*;

public class HomeWork2_2GetRandomUtilsTests extends TestBase {

    String firstName = getRandomString(10),
            lastName = getRandomString(10),
            userEmail = getRandomEmail(),
            gender = "Male",
            userNumber = getRandomPhone(),
            dateOfBirthDay = "12",
            dateOfBirthMonth = "May",
            dateOfBirthYear = "1989",
            subject1 = "Computer Science",
            subject2 = "Arts",
            subject3 = "History",
            hobby1 = "Sports",
            hobby2 = "Reading",
            hobby3 = "Music",
            picture = "1.png",
            currentAddress = getRandomMessage(20, 100),
            state = "NCR",
            city = "Noida";

    @Test
    void checkRegistrationForm(){


        $x("//div[@class='practice-form-wrapper']").shouldHave(text("Student Registration Form"));

        $x("//input[@id='firstName']").val(firstName);
        $x("//input[@id='lastName']").val(lastName);
        $x("//input[@id='userEmail']").val(userEmail);

        $x("//input[@name='gender'][@value='"+gender+"']/following-sibling::label").click();


        $x("//input[@id='userNumber']").val(userNumber);
        $x("//input[@id='dateOfBirthInput']").click();

        if (dateOfBirthDay.length() == 1) dateOfBirthDay = "0" + dateOfBirthDay;
        $x("//select[@class='react-datepicker__year-select']").selectOption(dateOfBirthYear);
        $x("//select[@class='react-datepicker__month-select']").selectOption(dateOfBirthMonth);
        $x("//div[contains(@class,'react-datepicker__day--0"+dateOfBirthDay+"')]").click();


        $x("//input[@id='subjectsInput']").val(subject1).pressEnter();
        $x("//input[@id='subjectsInput']").val(subject2).pressEnter();
        $x("//input[@id='subjectsInput']").val(subject3).pressEnter();

        $x("//div[@id='hobbiesWrapper']//label[text()='"+hobby1+"']").click();
        $x("//div[@id='hobbiesWrapper']//label[text()='"+hobby2+"']").click();
        $x("//div[@id='hobbiesWrapper']//label[text()='"+hobby3+"']").click();

        $x("//input[@id='uploadPicture']").uploadFromClasspath("img/" + picture);

        $x("//textarea[@id='currentAddress']").val(currentAddress);

        $x("//div[@id='state']").click();
        $x("//div[contains(@id,'react-select')][text()='"+state+"']").click();
        $x("//div[@id='city']").click();
        $x("//div[contains(@id,'react-select')][text()='"+city+"']").click();

        $x("//button[@id='submit']").click();
        $x("//div[@id='example-modal-sizes-title-lg']").shouldHave(text("Thanks for submitting the form"));

        $x("//td[text()='Student Name']").parent().shouldHave(text(firstName + " " + lastName));
        $x("//td[text()='Student Email']").parent().shouldHave(text(userEmail));
        $x("//td[text()='Gender']").parent().shouldHave(text(gender));
        $x("//td[text()='Mobile']").parent().shouldHave(text(userNumber));
        $x("//td[text()='Date of Birth']").parent().shouldHave(text(dateOfBirthDay + " " + dateOfBirthMonth + "," + dateOfBirthYear));
        $x("//td[text()='Subjects']").parent().shouldHave(text(subject1 + ", " + subject2 + ", " + subject3));
        $x("//td[text()='Hobbies']").parent().shouldHave(text(hobby1 + ", " + hobby2 + ", " + hobby3));
        $x("//td[text()='Picture']").parent().shouldHave(text(picture));
        $x("//td[text()='Address']").parent().shouldHave(text(currentAddress));
        $x("//td[text()='State and City']").parent().shouldHave(text(state + " " + city));



    }
}
