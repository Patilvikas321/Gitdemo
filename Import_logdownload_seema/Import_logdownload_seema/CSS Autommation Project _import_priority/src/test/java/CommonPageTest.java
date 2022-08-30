import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CommonPageTest extends BasePageTest {

    CommonsPage commonsPage;
    LoginPage loginPage;

    @BeforeClass
    public void inItBrowser() {
        commonsPage = new CommonsPage(getDriver());
        loginPage = new LoginPage(getDriver());
        loginPage.login(getProp().getProperty("email"), getProp().getProperty("password"));
    }
}
