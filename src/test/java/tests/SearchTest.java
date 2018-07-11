package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MeetingsPage;
import util.TestBase;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.*;
//import static org.testng.Assert.assertTrue;

public class SearchTest extends TestBase {
    @Test
    public void SearchTest() {
        assertEquals("123", "123", "msg");
    }

    @Test
    public void SearchSecondTest() {
        assertEquals("123", "321", "msg");
    }

    @Test
    public void userCanSearch() {
        LoginPage page = open("https://ya.ru", LoginPage.class);
        assertTrue(page.isTruePage(), "Должна быть страница авторизации е-вотинг");

        MeetingsPage meetingsPage = page.choiseTypeAuthorization("login").setLogin("admin_nsd").setPassword("admin").submit();
        assertEquals(meetingsPage.getMeetingCount(), 5, "Должно быть собраний");
        //results.getResult(0).shouldHave(text("Selenide: concise UI tests in Java"));
    }
}
