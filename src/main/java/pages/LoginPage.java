package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class LoginPage extends AbstractPage {

    public boolean isTruePage() {
        return $$(By.cssSelector("div.header-menu .header-menu__item")).size() == 4;
    }

    public boolean isTruePage(boolean isAdmin) {
        return $(By.className("admin-label")).shouldHave(Condition.text("Для администратора")).isDisplayed();

    }

    public LoginPage choiseTypeAuthorization(String inputType) {

        switch (inputType) {
            case "Войти с помощью логина и пароля":
                $(By.cssSelector("a[href='#/local']")).click();
                break;

            case "Войти с помощью moex":
                $(By.cssSelector("a[href='#/moex']")).click();
                break;

            case "Войти с помощью квалифицированной ЭП (Крипто ПРО)":
                $(By.cssSelector("a[href='#/csp']")).click();
                break;

            case "Войти с помощью неквалифицированной ЭП":
                $(By.cssSelector("a[href='#/dig']")).click();
                break;
        }

        $(By.id("login-username")).shouldBe(Condition.appear);

        return this;
    }

    public LoginPage setLogin(String value) {
        $(By.id("login-username")).val(value);
        return this;
    }

    public LoginPage setPassword(String value) {
        $(By.id("login-password")).val(value);
        return this;
    }

    public MeetingsPage submit() {
        $(By.cssSelector("button.btn-e-voting")).click();
        return page(MeetingsPage.class);
    }

}
