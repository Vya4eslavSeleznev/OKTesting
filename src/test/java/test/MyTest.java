package test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;
import page.*;
import values.OKValues;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MyTest {


    @BeforeClass
    public static void setup(){
        Configuration.baseUrl="https://ok.ru/";
    }
    @Test
    public void ok() {
        LoginPage login = new LoginPage();
        MainPage main = new MainPage();
        login.open().Authorization(OKValues.LOGIN,OKValues.PASSWORD);
        main.clickOnNote("Доброе утро");
        $(withText("Доброе утро")).shouldBe(Condition.visible);
        closeWebDriver();
    }
}
