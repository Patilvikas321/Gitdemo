import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BusinessPageTest extends BasePageTest{

    LoginPage loginPage;
    BusinessPage businessPage;


    @BeforeClass
    public void inItBrowser(){
        loginPage=new LoginPage(getDriver());
        loginPage.login(getProp().getProperty("email"), getProp().getProperty("password") );
        businessPage=new BusinessPage(getDriver());
    }

    @Test(priority = 0)
    public void verifyBusinessLinkClick(){
        Assert.assertTrue(businessPage.clickBusinessLink());
    }
}
