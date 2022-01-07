package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import static io.qameta.allure.Allure.step;


public class LoginTest extends LoginPage {

    @Test
    public void Login(){
        step("Execute Login method", () -> {
            login();
        });
        step("Verify that the browser navigates to Dashboard", () ->{
            String title=Selenide.title();
            Assertions.assertTrue(title.contains("Odoo"));
        });
    }


}
