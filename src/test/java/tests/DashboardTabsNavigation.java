package tests;

import org.junit.jupiter.api.Test;
import pages.Dashboard;
import pages.LoginPage;

import static io.qameta.allure.Allure.step;

public class DashboardTabsNavigation extends Dashboard {

    LoginPage loginPage=new LoginPage();

    @Test
    public void tabsNavigationTest(){

        step("login", () ->{
            loginPage.login();
        });
        step("navigate to Discuss tab", () -> {
            navigateToTabs("Discuss");
        });
        step("navigate to Calendar tab", () -> {
            navigateToTabs("Calendar");
        });
        step("navigate to Notes tab", () -> {
            navigateToTabs("Notes");
        });
        step("navigate to Contacts tab", () -> {
            navigateToTabs("Contacts");
        });
        step("navigate to CRM tab", () -> {
            navigateToTabs("CRM");
        });
        step("navigate to Sales tab", () -> {
            navigateToTabs("Sales");
        });
        step("navigate to Point of Sale tab", () -> {
            navigateToTabs("Point of Sale");
        });
        step("navigate to Purchases tab", () -> {
            navigateToTabs("Purchases");
        });

    }
}
