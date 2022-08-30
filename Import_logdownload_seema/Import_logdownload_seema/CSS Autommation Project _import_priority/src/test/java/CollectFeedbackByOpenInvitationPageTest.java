import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CollectFeedbackByOpenInvitationPageTest extends BasePageTest {

//
    CollectFeedbackByOpenInvitationPage openInvitationPage;
    LoginPage loginPage;
    QuestionnairesPage questionnairesPage;

    // Browser Initialization
    @BeforeClass
    public void inItObject(){
        questionnairesPage=new QuestionnairesPage(getDriver());
        openInvitationPage = new CollectFeedbackByOpenInvitationPage(getDriver());
        loginPage = new LoginPage(getDriver());
        loginPage.login(getProp().getProperty("email"), getProp().getProperty("password"));
    }
    // Test for click on customer feedback
    @Test(priority = 0)
    public void setBtnCustomerFeedback(){
        openInvitationPage.setBtnCustomerFeedback( );
    }

    // Test for click on customer feedback button
    @Test(priority = 1)
    public void setBtnCollectFeedback() throws InterruptedException {
        openInvitationPage.setBtnCollectFeedback();
    }

    //Test for click on Add Collect Feedback
    @Test(priority = 2)
    public void setBtnAddCollectFeedback() throws InterruptedException {
         openInvitationPage.setBtnAddCollectFeedback();
    }

    //Test for click Open Invitation
    @Test(priority = 3)
    public void setOpenInvitation() {
        openInvitationPage.setBtnOpenInvitation();
    }
    //Test of Open link invitation & QR code
    @Test(priority = 4)
    public void setBtnOpenLink(){
        openInvitationPage.setBtnOpenLink();
    }
    //Test of Add Collect Feedback
    @Test(priority = 5)
    public void EnterValueTxt()  {
        openInvitationPage.EnterValueTxt(openInvitationPage.txtName1,"Open Invitation_Scheduler");

    }

    //
    @Test(priority = 6)
    public void verifySetSchedulerForOpenInvitation(){
        openInvitationPage.setSchedulerForOpenInvitation(openInvitationPage.btnAdd3);
    }
    //Test of click on Toggle Button On & Off
    @Test(priority = 7)
    public void setBtnToggle() {
        openInvitationPage.setBtnToggle(openInvitationPage.btnToggle);
    }

    //Test for Edit Scheduler click
    @Test(priority = 8)
    public void setBtnEditScheduler() throws InterruptedException {
        openInvitationPage.setBtnEditScheduler(openInvitationPage.btnEditScheduler);
    }

    //Test For Open Invitation Link clickable
    @Test(priority = 9)
    public void setOpenInvitationLink(){
        openInvitationPage.setBtnOpenInvitationLink(openInvitationPage.btnOpenInList);
    }

    //Test of Add open invitation click
    @Test(priority = 10)
    public void setBtnAddInvitation(){
        openInvitationPage.setBtnAddInvitation(openInvitationPage.btnAddInvitation);
    }

    //Test for Open Invitation Name
    @Test(priority = 11)
    public void setTxtOpenInvName(){
        openInvitationPage.setTxtOpenInvName(openInvitationPage.txtOpenInvName, "Open Invitation");
    }
    //Test for Select From Date
    @Test(priority = 12)
    public void setSelectFrmDate(){
        openInvitationPage.setSelectFrmDate(openInvitationPage.SelectFrmDate);
    }
    //Test for Click on Select From date
    @Test(priority = 13)
    public void setSelectFDate(){
        openInvitationPage.setSelectFDate(openInvitationPage.selectFDate);
    }

    //Test for Select To Date
    @Test(priority = 14)
    public void setSelectToDate(){
        openInvitationPage.setSelectToDate(openInvitationPage.selectToDate);
    }
    //Test for Click on Select From date
    @Test(priority = 15)
    public void setSelectTDate(){
        openInvitationPage.setSelectTDate(openInvitationPage.selectTDate);
    }

    //
    @Test(priority = 16,enabled = false)
    public void verifySetQrCodeDownloadVisible() throws InterruptedException {
        openInvitationPage.setQrCode(openInvitationPage.chkBoxQrCode);
    }

    //
    @Test(priority = 17)
    public void verifyScrollingElementVisible(){
        openInvitationPage.scrollFindElemenet(openInvitationPage.btnCreateOI);
    }

    //Test for Create Open Invitation
    @Test(priority = 18)
    public void setBtnCreateOI(){
        openInvitationPage.setBtnCreateOI();
    }

    //
    @Test(priority = 19)
    public void verifySwitchClick(){
        openInvitationPage.setSwitchButton();
    }

    //
    @Test(priority = 20)
    public void verifyFeebackLinkClick(){
        openInvitationPage.setLinkForFeedback();
    }

    //
    @Test(priority = 21)
    public void verifyGetWindowHandle() throws InterruptedException {
        openInvitationPage.getWindowHandle();
    }

    //
    @Test(priority = 22)
    public void verifyNavigatePreviewWindow() throws InterruptedException {
        questionnairesPage.NavigationForPreviewQuestionnaire();
    }

    //
    @Test(priority = 23,enabled = false)
    public void verifySetInvitationCheckBox() throws InterruptedException {
        openInvitationPage.setOpenInvitationCheckBox();
    }

    //
    @Test(priority = 24,enabled = false)
    public void verifysetExportToExcelClick() throws InterruptedException {
        openInvitationPage.setExportToExcelClick();
    }





}
