import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='main-scroll']//app-navbar-cmp//nav//div//div[2]//div//ul//li[4]")
    WebElement lnkMenu;


    public boolean clickOnMenuLink(WebElement lnkMenu) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        click(lnkMenu);
        return lnkMenu.isDisplayed();
    }
}
