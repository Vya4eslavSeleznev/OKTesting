package page;

import values.OKValues;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    public MainPage clickOnNote(String message){
        $(OKValues.NOTE).click();
        $(OKValues.BACKGROUNDS).click();
        $(OKValues.BACKGROUND).click();
        $(OKValues.NOTEMESSAGE).setValue(message);
        $(OKValues.NOTEBUTTON).click();
        return this;
    }
}