package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import utils.Hooks;
import static io.qameta.allure.Allure.step;


public class LoginTest extends Hooks {

    @Test
    public void Login(){
        step("Execute Login method", () -> {
            LoginPage.login();
        });
        step("Verify that the browser navigates to Dashboard", () ->{
            String title=Selenide.title();
            Assertions.assertTrue(title.contains("Odoo"));
        });
    }


}
