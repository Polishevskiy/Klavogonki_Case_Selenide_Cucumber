package step;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;

public class AfterStep {

    @io.cucumber.java.AfterStep
    public void makeScreenshot(){
        Selenide.screenshot(System.currentTimeMillis() + "step");
    }
}