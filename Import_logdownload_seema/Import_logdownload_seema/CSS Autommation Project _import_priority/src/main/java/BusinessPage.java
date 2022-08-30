import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusinessPage extends BasePage{
    public BusinessPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Business ']")
    public WebElement lnkBusiness;
    


    public boolean clickBusinessLink(){
        click(lnkBusiness);
        return lnkBusiness.isDisplayed();
        //comment out vikas
    }
}
