import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArchivePage extends BasePage {

    public ArchivePage(WebDriver driver) {
        super(driver);
    }

    // To check the archive project so click on the archive for import sub menu
    @FindBy(xpath = "//button[@class='btn btn-fill btn-gold m-r-5'][2]")
    public WebElement btnArchive;


    // For click button back of archive
    @FindBy(xpath = "//button[text()=' Back']")
    public WebElement btnBack;



    public boolean clickOnArchive() throws InterruptedException {
        Thread.sleep(5000);
        click(btnArchive);
        System.out.println(btnArchive.getText());
        return btnArchive.isDisplayed();
    }

    public boolean clickOnBack() throws InterruptedException {
        Thread.sleep(2000);
        click(btnBack);
        return btnArchive.isDisplayed();
        System.out.println("this for vikas")
        System.out.println("this for vaibhav")
        System.out.println("this for deepali")

    }

}
