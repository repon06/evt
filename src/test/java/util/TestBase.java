package util;

import com.codeborne.selenide.Configuration;
import helpers.Config;
import org.testng.annotations.BeforeSuite;
import ru.qatools.properties.PropertyLoader;

import java.io.IOException;


public class TestBase {


    @BeforeSuite
    public void initTestSuite() throws IOException {
        // необходимо наличие ключей в переменных средах - пути к chromedriver
        // System.setProperty("webdriver.chrome.driver", "D:\\program_kui\\chromedriver.exe");
        Config config = PropertyLoader.newInstance().populate(Config.class);
        Configuration.baseUrl = config.getUrl();
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = "67.0";
        Configuration.timeout = 10;
    }


}