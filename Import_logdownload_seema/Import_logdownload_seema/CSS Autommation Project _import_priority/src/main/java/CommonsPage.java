import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonsPage extends BasePage {
    public CommonsPage(WebDriver driver) {
        super(driver);
    }

    // Click on add page button for add page in questionnaires
    @FindBy(xpath = "//aside[1]//div[1]//div[1]//button[1]")
    public WebElement btnAddPage;

    // Enter page name in page name field
    @FindBy(xpath = "//app-add-new-page[1]//input[1]")
    public WebElement pageName;

    // Choose page type from the list of the page type
    @FindBy(xpath = "//form[1]//div[1]//ul[1]/li[1]")
    public WebElement lnkPageType;

    // button click add page
    @FindBy(xpath = "//app-questionnaire//div[2]//app-add-new-page//form//div[2]//button[2]")
    public WebElement btnAddPage2;


    public void setPageTypesInQuestionnaires(String value) throws InterruptedException {
        Thread.sleep(3000);
        click(btnAddPage);
        iWait();
        writeText(pageName, value);
        iWait();
        click(lnkPageType);
        Thread.sleep(2000);
        click(btnAddPage2);
    }

    public void getWidgetsFromRespectivePage(String pathElement){

    }
}
