package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import utils.Hooks;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Dashboard extends Hooks {


    public void navigateToTabs(String tab){
      $(byText(tab)).click();
    }

    @Test
    public void tttt() {
        LoginPage loginPage=new LoginPage();
        loginPage.login();
        $(".oe_menu_text").$(byText("Calendar")).click();
    }
}
