package pages;

import com.codeborne.selenide.SelenideElement;
import utils.OwnerProperties;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class LoginPage extends HomePage{

    SelenideElement username=$("#login");
    SelenideElement password=$("#password");
    SelenideElement submit=$(byText("Log in"));


    public void login(){
        step("Navigate to Loginpage",() ->{
            navigateToLoginPage();
        });
        step("Enter username",() ->{
                username.setValue(OwnerProperties.credentials.username());
        });
        step("Enter password",() ->{
                password.setValue(OwnerProperties.credentials.password());
        });
        step("Click on submit",() ->{
                submit.click();
        });
    }
}
