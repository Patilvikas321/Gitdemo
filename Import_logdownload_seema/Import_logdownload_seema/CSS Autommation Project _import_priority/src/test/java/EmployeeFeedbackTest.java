import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EmployeeFeedbackTest extends BasePageTest{

    LoginPage loginPage;

    @BeforeClass
    public void inItBrowser(){
        loginPage.login(getProp().getProperty("email"), getProp().getProperty("password"));
    }

    @Test(priority = 0)
    public void verifyBusinessLinkClick(){

    }

}
