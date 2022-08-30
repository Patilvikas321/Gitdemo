import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends BasePageTest {

    // Created Object of LoginPage
    LoginPage loginPage;
    String excelPath = "C:\\Users\\Vaibhav Chavan\\IdeaProjects\\CSS Autommation Project\\util_files\\User Details.xlsx";
    String sheetName ="UserName";



    // Object Initialization
    @BeforeClass
    public void inItObject() {
        loginPage = new LoginPage(getDriver());
    }

    //Test for Login on Web Page by Valid Credentials
    @Test(priority = 0)
    public void verifyLogin() {
        loginPage.login(getProp().getProperty("email"), getProp().getProperty("password"));
        loginPage.btnSignIn.click();
    }

    @Test(dataProvider = "loginData",enabled = false)
    public void verifyDataProviderExcel(){
        loginPage.login(getProp().getProperty("email"), getProp().getProperty("password"));
        loginPage.btnSignIn.click();
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() throws IOException {
        Object[][] data=loginPage.readExcelFile(excelPath,sheetName);
        return data;
    }

}





