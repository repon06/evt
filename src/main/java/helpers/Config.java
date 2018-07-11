package helpers;
//import ru.yandex.qatools.properties.PropertyLoader;
//import ru.yandex.qatools.properties.annotations.Property;
//import ru.yandex.qatools.properties.annotations.Resource;

import ru.qatools.properties.Property;
import ru.qatools.properties.Resource;

@Resource.Classpath("application.properties")
public interface Config {

    @Property("browser.name")
    public String getBrowser();

    @Property("site.url")
    public String getUrl();

    @Property("user.login")
    public String getLogin();

    @Property("user.password")
    public String getPassword();

}
