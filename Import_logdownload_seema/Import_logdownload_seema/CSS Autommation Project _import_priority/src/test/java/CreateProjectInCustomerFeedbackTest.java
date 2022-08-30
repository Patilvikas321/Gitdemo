import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateProjectInCustomerFeedbackTest extends BasePageTest {
    LoginPage loginPage;
    CreateProjectInCustomerFeedbackPage createProject;

    // Create the object of loginPage & CreateProjectInCustomerFeedback
    @BeforeClass
    public void setLoginPage() {
        loginPage=new LoginPage(getDriver());
        createProject=new CreateProjectInCustomerFeedbackPage(getDriver());
        loginPage.login(getProp().getProperty("email"), getProp().getProperty("password"));
    }

    //Verify the field is clikable
    @Test(priority =0,enabled = false)
    public void verifyDataGarden() throws InterruptedException {
        createProject.clickDataCollection();
    }

    //Verify Customer feedback is clikable
    @Test(priority =1)
    public void verifyCustomerFeedback(){
        createProject.clickCustomerFeedback();
    }

    //Verify Add Project Button is Clickable
    @Test(priority =2)
    public void veriftyAddProject() throws InterruptedException {
        createProject.clickAddProject();
    }

    //Verify Custome Project Template is Selected
    @Test(priority = 3)
    public void verifySelectCutomeTemplate() {
        createProject.clickCustomProjectTemplate();
    }

    //Verify Project name is Entered
    @Test(priority = 4)
    public void verifySetProjectName()  {
        createProject.sendProjectName();
    }

    //Verify Project is Created Succesfully
    @Test(priority = 5)
    public void verifyAddButton() {
        createProject.clickAddButton();
    }

    //Verify toggle button is ON Or OFF Status
    @Test(priority = 6)
    public void verifyToggleButton() throws InterruptedException {
        createProject.clickToggleButton();
    }


}
