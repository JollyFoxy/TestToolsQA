package Tests;

import Interfasces.IAll;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import tools.WebDrivers.WebDriver;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest implements IAll{
    @BeforeAll
    static void beforeConfig() {
        Configuration.browser= WebDriver.class.getName();
        Configuration.timeout = 10000;
    }
    @BeforeEach
    public void before() {
        open(homePage.getBaseUrl());
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
}