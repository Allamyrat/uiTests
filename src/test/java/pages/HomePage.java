package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import utils.OwnerProperties;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class HomePage {

    SelenideElement LoginButton=$(byText("Log In"));

    public void navigateToLoginPage(){
        step("Navigate to Homepage", () -> {
           open(OwnerProperties.credentials.homePageUrl());
        });
        step("Click on Login button", () ->{
            LoginButton.click();
        });
        step("Verify the title", () ->{
            Assertions.assertEquals("Login | Best solution for startups",title());
        });
    }
}
