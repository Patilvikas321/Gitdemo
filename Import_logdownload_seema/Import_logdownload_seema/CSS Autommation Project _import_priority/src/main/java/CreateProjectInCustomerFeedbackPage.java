import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateProjectInCustomerFeedbackPage extends BasePage {


    public CreateProjectInCustomerFeedbackPage(WebDriver driver) {
        super(driver);
    }
    //Click on DataCollection Menu
    @FindBy(xpath = "//span[text()='Data collection']")
    public WebElement dataCollection;

    //Click on Customer Feedback Submenu
    @FindBy(xpath = "//span[text()='Customer feedback']")
    public WebElement customerFeedback;

    // Click on the Add Project to Create new Project
    @FindBy(xpath = "//button[1][@class='btn btn-fill btn-gold m-r-5']//i")
    public WebElement addProject;

    // Click on Custom Project div tag
    @FindBy(xpath = "//div[@class='content-box'][2]")
    public WebElement customProject;

    // Enter the name of project in text field
    @FindBy(id = "name")
    public WebElement getAddProject;

    //Click on Add button to create project
    @FindBy(xpath = "//button[text()='Add ']")
    public WebElement clickAddButton;

    //Click on the toggle button to Activate Project
    @FindBy(xpath = "//app-widget[1]//bswitch[1]/div[1]//div[1]")
    public WebElement ClickToggleButton;

    //Click on Data Collection Menu
    public void clickDataCollection(){
        iWait();
        click(dataCollection);
    }

    //Click on Customer Feedback Submenu
    public void clickCustomerFeedback(){
        iWait();
        click(customerFeedback);
    }

    //Click on Add Project to Create Project
    public void clickAddProject() throws InterruptedException {
       //iWait();
        Thread.sleep(20000);
        click(addProject);
    }

    //Click on Custome Project Template
    public void clickCustomProjectTemplate(){
        iWait();
        click(customProject);
    }

    //Write the name of project into name text field
    public void sendProjectName(){
        iWait();
        getAddProject.sendKeys("CSD_Ticket_736");
    }

    //Click button add to create Project
    public void clickAddButton() {
        iWait();
        click(clickAddButton);
    }

    //Click on toggle button to Activate Project
    public void clickToggleButton() throws InterruptedException {
        Thread.sleep(20000);
        click(ClickToggleButton);
    }

}




