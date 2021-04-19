package docs;

import org.junit.jupiter.api.Test;

import static utils.RandomUtils.*;


public class RandomExamples {

    @Test
    void randomExample() {
        String randomString = getRandomString(22);
        //  $("#id").setValue(randomString); - использование полученной рандомной строки
        System.out.println(randomString);


        String randemMessage = getRandomMessage(22, 99);
        System.out.println(randemMessage);

        int randomInt = getRandomInt(1000, 1003);
        System.out.println(randomInt);

        String randomPhone = getRandomPhone();
        System.out.println(randomPhone);

        String randomPhoneWithPrefix = getRandomPhone("+7");
        System.out.println(randomPhoneWithPrefix);

        String difficultRandomPhoneWithPrefix = getDifficultRandomPhone("+8");
        System.out.println(difficultRandomPhoneWithPrefix);

        String randomEmail = getRandomEmail();
        System.out.println(randomEmail);

    }
}