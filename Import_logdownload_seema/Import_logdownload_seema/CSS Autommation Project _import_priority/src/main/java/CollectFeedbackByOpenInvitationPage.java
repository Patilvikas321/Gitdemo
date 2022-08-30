import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CollectFeedbackByOpenInvitationPage extends BasePage {
    public CollectFeedbackByOpenInvitationPage(WebDriver driver) {
        super(driver);
    }
    // Declaration xpath of Customer Feedback Button
    @FindBy(xpath = "//span[text()='Customer feedback']")
    public WebElement btnCustomerFeedback;

    //Path for Collect Feedback Button
    @FindBy(xpath = "//button[text()=' Collect feedback']")
    public WebElement btnCollectFeedback;

    //path for Add Collect feedback
    @FindBy(xpath ="//button[text()=' Add collect feedback']")
    public WebElement btnAddCollectFeedback;

    //Path for Open Invitation
    @FindBy(xpath = "//*[text()=' Open invitation ']")
    public WebElement btnOpenInvitation;

    //path for select Open link invitation & QR code
    @FindBy(xpath ="//button[text()=' Select ']")
    public WebElement btnOpenLink;

    //path for Add Text Collect Feedback
    @FindBy(xpath = "//*[@id='Name']")
    public WebElement txtName1;

    //path for click on Add Feedback
    @FindBy(xpath="//button[text()='Add ']")
    public WebElement btnAdd3;

    //path for Toggle Button Clickable to change Mode ON & OFF
    @FindBy(xpath ="//gridster-item[3]//bswitch//span[2]")
    public WebElement btnToggle;

    //path for Edit Scheduler Click
    @FindBy(xpath ="//gridster-item[3]//button[text()='Edit scheduler']")
    public WebElement btnEditScheduler;

    //path for  Open Invitation List click
    @FindBy(xpath ="//a[text()=' Open Invitation List ']")
    public WebElement btnOpenInList;

    //path for Add open invitation click
    @FindBy(xpath = "//*[text()=' Add open invitation ']")
    public WebElement btnAddInvitation;

    //path for open invitation in that Name
    @FindBy(xpath ="//*[@formcontrolname='Name']")
    public WebElement txtOpenInvName;

    //path for From date in open invitation
    @FindBy(xpath = "//span[@class='mydpicon icon-mydpcalendar']")
    public WebElement SelectFrmDate;

    //path for From date Select
    @FindBy(xpath ="//table[2]//tr[2]//span")
    public WebElement selectFDate;

    //path for To date in open invitation
    @FindBy(xpath = "//perfect-scrollbar[1]//div[2]//my-date-picker[1]//div[1]//div[1]//button[1]")
    public WebElement selectToDate;

    //
    @FindBy(id = "//*[@id='myModal']//perfect-scrollbar//div[6]//div[2]//div//div//label")
    public WebElement chkBoxQrCode;

    //path for To date Select
    @FindBy(xpath ="//table[2]//tr[2]/td[6]//span")
    public WebElement selectTDate;

    //path for Create open invitation button
    @FindBy(xpath ="//*[@type='submit']")
    public WebElement btnCreateOI;

    //
    @FindBy(xpath = "//bswitch//div//div//span[2]")
    public WebElement btnBSwitch;

    //
    @FindBy(xpath = "//a[text()='Link']")
    public WebElement lnkClick;

    //
    @FindBy(id ="k-grid0-checkbox0")
    public WebElement chkBoxListOfOpenInvitation;

    //
    @FindBy(xpath = "//button[contains(text(),'Export to excel')]")
    public WebElement btnExportToExcel;

    //Method for Customer Feedback
    public void setBtnCustomerFeedback() {
        iWait();
        click(btnCustomerFeedback);
    }

    //Method for Customer Feedback
    public void setBtnCollectFeedback() throws InterruptedException {
        Thread.sleep(5000);
        click(btnCollectFeedback);
    }

    //Method for Collect Feedback
    public void setBtnAddCollectFeedback() throws InterruptedException {
        Thread.sleep(3000);
        click(btnAddCollectFeedback);
    }

    //Method for open Invitation
    public void setBtnOpenInvitation()  {
        iWait();
        click(btnOpenInvitation);
    }

    //Method for Open link invitation & QR code
    public void setBtnOpenLink() {
        iWait();
        click(btnOpenLink);
    }

    // Method for Enter Blacklist Name
    public void EnterValueTxt(WebElement txtName1,String str) {
        iWait();
        writeText(txtName1, str);
    }

    // Add Open Invitation Scheduler
    public void setSchedulerForOpenInvitation(WebElement btnAdd3){
        iWait();
        click(btnAdd3);
    }

    //Method For Toggle Button On & Off
    public void setBtnToggle(WebElement btnToggle) {
        iWait();
        click(btnToggle);
    }

    //Method For Edit scheduler Clickable
    public void setBtnEditScheduler(WebElement btnEditScheduler) throws InterruptedException {
        Thread.sleep(5000);
        click(btnEditScheduler);
    }

    //Method For Open Invitation List click
    public void setBtnOpenInvitationLink(WebElement btnOpenInList){
        iWait();
        click(btnOpenInList);
    }

    //Method for Add open invitation click
    public void setBtnAddInvitation(WebElement btnAddInvitation){
        iWait();
        click(btnAddInvitation);
    }

    //Method for Open Invitation Name
    public void setTxtOpenInvName( WebElement txtOpenInvName,String str){
        iWait();
        writeText(txtOpenInvName,str);
    }

    //Method for From Date Select
    public void setSelectFrmDate(WebElement selectFrmDate){
        iWait();
        click(SelectFrmDate);
    }

    //Method for Click on Select From date
    public void setSelectFDate(WebElement selectFDate){
        iWait();
        click(selectFDate);
    }

    //Method for From Date Select
    public void setSelectToDate(WebElement selectToDate ){
        iWait();
        click(selectToDate);
    }

    //Method for Click on Select From date
    public void setSelectTDate(WebElement selectTDate ){
        iWait();
        click(selectTDate);
    }

    //
    public void setQrCode(WebElement chkBoxQrCode) throws InterruptedException {
        Thread.sleep(5000);
        click(chkBoxQrCode);

    }

    //
    public void ScrollPageToViewCreateButton(){
        iWait();
        scrollFindElemenet(btnCreateOI);
    }

    //Method for Click on Open Invitation btnCreateOI
    public void setBtnCreateOI(){
        iWait();
        click(btnCreateOI);
    }

    //
    public void setSwitchButton(){
        iWait();
        click(btnBSwitch);
    }

    //
    public void setLinkForFeedback(){
        iWait();
        click(lnkClick);
    }

    //
    public void setFocusOnChildWindow() throws InterruptedException {
        getWindowHandle();
    }

    public void setOpenInvitationCheckBox() throws InterruptedException {
        Thread.sleep(5000);
        click(chkBoxListOfOpenInvitation);
    }

    public void setExportToExcelClick() throws InterruptedException {
        Thread.sleep(5000);
        click(btnExportToExcel);
    }
}
