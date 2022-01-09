package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import utils.Hooks;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Dashboard extends Hooks {

    public void navigateToTabs(String tab){
        $("li").$(byText(tab)).click();
    }
}
