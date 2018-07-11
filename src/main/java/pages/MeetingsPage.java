package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MeetingsPage extends AbstractPage {

    public boolean isTruePage() {
        $(By.cssSelector("")).shouldBe(Condition.appear);
        return $(By.cssSelector("")).isDisplayed();
    }

    public int getMeetingCount() {
        return $$(By.cssSelector("")).size();
    }

}
