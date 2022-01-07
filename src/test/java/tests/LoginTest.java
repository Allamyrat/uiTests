package tests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class LoginTest {

    @Test
    public void Login(){
        step("Login", () -> {
            Selenide.open();
        });
    }


}
