package pages;

import com.codeborne.selenide.SelenideElement;
import utils.OwnerProperties;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class HomePage {

    SelenideElement LoginButton=$(byText("Log In"));

    public void navigateToLoginPage(){
        step("Navigate to Homepage", () -> {
            OwnerProperties.credentials.homePageUrl();
        });
        step("Click on Login button", () ->{
            LoginButton.click();
        });
    }
}
