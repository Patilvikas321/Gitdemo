import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomePageTest extends BasePageTest{

    HomePage homePage;
    LoginPage loginPage;

    @BeforeClass
    public void inItBrowser(){
        homePage=new HomePage(getDriver());
        loginPage=new LoginPage(getDriver());
        loginPage.login(getProp().getProperty("email"), getProp().getProperty("password") );
    }

    @Test(priority =0)
    public void clickOnProfile() throws InterruptedException {
        Assert.assertTrue(homePage.clickOnMenuLink(homePage.lnkMenu));
    }
    }
