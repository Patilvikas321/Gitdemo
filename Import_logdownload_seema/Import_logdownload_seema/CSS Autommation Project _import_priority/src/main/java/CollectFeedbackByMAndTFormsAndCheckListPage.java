import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CollectFeedbackByMAndTFormsAndCheckListPage extends BasePage {
    public CollectFeedbackByMAndTFormsAndCheckListPage(WebDriver driver) {
        super(driver);
    }
    //
    @FindBy(xpath = "//app-scheduler-type//aside//ul//li[1]//div//div")
    public WebElement lnkMobileAndTablet;

    //
    @FindBy(xpath = "//*[@id='Carousel']/a[2]")
    public WebElement arrowNavigateForward;

    //
    @FindBy(xpath = "//*[@id='Carousel']//div[1]//div[2]//div//div[2]//div//button")
    public WebElement btnSelectFormsAndCheckList;

    //
    @FindBy(xpath = "//gridster-item[4]//app-widget[1]//bswitch[1]//div[1]//div[1]//span[2]")
    public WebElement btnSwitchToggle;

    //
    @FindBy(xpath = "//gridster-item[4]//button[text()='Edit scheduler']")
    public WebElement btnEditSchedulerFormsAndCheckList;

    //
    @FindBy(xpath = "//tabset[1]//div[1]//tab[1]//app-general-tab[1]//div[1]//form[1]//div[1]//div[1]//figure[1]")
    public WebElement imgAreaMouseOver;

    //
    @FindBy(xpath = "//app-general-tab//div//form//div[1]//div//figure//div//span[1]//a")
    public WebElement lnkImageUpload;

    //
    @FindBy(xpath = "//span[contains(text(),'.jpg')]")
    public WebElement imgSelectedFromPanel;

    //
    @FindBy(xpath = "//modal-container//div//div//div[2]//div//div//button[2]")
    public WebElement btnAddImageClick;

    //
    @FindBy(id = "Description")
    public WebElement txtAreaDescription;

    //
    @FindBy(xpath = "//button[text()=' Select group ']")
    public WebElement ddlSelectUsers;

    //
    @FindBy(xpath = "//app-general-tab//div//form//div[2]//div[3]/div/button")
    public WebElement btnAddListOfUsers;

    //
    @FindBy(xpath = "//app-general-tab//div//form//div[2]//div[6]//button")
    public WebElement btnSaveScheduler;


    //
    public boolean setLinkMobileAndTabletVisible(WebElement lnkMobileAndTablet ){
        click(lnkMobileAndTablet);
        return lnkMobileAndTablet.isDisplayed();
    }

    //
    public void setFeedbackTypeinMobileAndTablet(WebElement arrowNavigateForward){
        iWait();
        click(arrowNavigateForward);
    }

    //
    public void setSelectFormsAndCheckListTypes(WebElement btnSelectFormsAndCheckList){
        iWait();
        click(btnSelectFormsAndCheckList);
    }

    //
    public void setVisibilityOfToggleSwitch(WebElement btnSwitchToggle){
        scrollFindElemenet(btnSwitchToggle);
    }

    //
    public void setToggleIsClickAndOn(WebElement btnSwitchToggle) throws InterruptedException {
        Thread.sleep(5000);
        click(btnSwitchToggle);
    }

    //
    public void setEditSchedulerOfScheduler(WebElement btnEditSchedulerFormsAndCheckList) throws InterruptedException {
        Thread.sleep(3000);
        click(btnEditSchedulerFormsAndCheckList);
    }

    //
    public void setImageMouseHavorArea(WebElement imgAreaMouseOver) throws InterruptedException {
        Thread.sleep(4000);
        mouseHover(imgAreaMouseOver);
    }

    //
    public void setImageUploadBottonClick(WebElement lnkImageUpload){
        iWait();
        click(lnkImageUpload);
    }

    //
    public void setLogoImage(WebElement imgSelectedFromPanel){
        iWait();
        click(imgSelectedFromPanel);
    }

    //
    public void setAddButtonToImageAdd(WebElement btnAddImageClick) {
        iWait();
        scrollFindElemenet(btnAddImageClick);
        iWait();
        click(btnAddImageClick);
    }

    //
    public void setTextAreaOfDiscription(WebElement txtAreaDescription,String value){
        iWait();
        writeText(txtAreaDescription,value);
    }

    //
    public void setUserFromTheDropDown(WebElement ddlSelectUsers){
        iWait();
        click(ddlSelectUsers);
    }

    //
    public void setAddUsersFromList(WebElement btnAddListOfUsers){
        iWait();
        click(btnAddListOfUsers);
    }

    //
    public void setSchedulerToClickOnSave(WebElement btnSaveScheduler){
        iWait();
        click(btnSaveScheduler);

    }
}
