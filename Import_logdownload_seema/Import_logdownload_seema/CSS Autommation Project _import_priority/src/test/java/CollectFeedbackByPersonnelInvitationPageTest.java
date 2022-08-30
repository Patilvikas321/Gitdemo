import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

public class CollectFeedbackByPersonnelInvitationPageTest extends BasePageTest{
    CreateProjectInCustomerFeedbackPage customFeedbackPage;
    QuestionnairesPage questionnairesPage;
    LoginPage loginPage;
    CollectFeedbackByPersonnelInvitationPage collectFeedbackPage;

    // Browser Initialization and Object created of each individual page
    @BeforeClass
    public void inItObject(){

    //Object of Questionnaires Page and Get Driver
        questionnairesPage = new QuestionnairesPage(getDriver());

    //Object of Login Page
        loginPage = new LoginPage(getDriver());

    // Parameter pass ti the login page Email and Password
        loginPage.login(getProp().getProperty("email"), getProp().getProperty("password"));

    //Object of Customer Feedback Page
        customFeedbackPage =new CreateProjectInCustomerFeedbackPage(getDriver());

    //Object of Collect Feedback Page
        collectFeedbackPage=new CollectFeedbackByPersonnelInvitationPage(getDriver());
    }

    // Click on the Data Collection Menu
    @Test(priority = 0,enabled = false)
    public void verifyBtnDataCollection() {
        customFeedbackPage.clickDataCollection();
    }

    // Test Declaration for customer feedback sub menu
    @Test(priority = 1)
    public void verifyCustomerFeedback() {
        customFeedbackPage.clickCustomerFeedback();
    }

    // For Click on Collect Feedback button
    @Test(priority =2)
    public void verifyCollectFeedback() throws InterruptedException{
        collectFeedbackPage.setBtnCollectFeedback ();
    }

    // Press Add Collect feedback to Create Schedular
    @Test(priority = 3)
    public void verifysetNewCollectFeedback() throws InterruptedException {
        collectFeedbackPage.setNewCollectFeedback();
    }

    // Set Personnel Invitation
    @Test(priority = 4)
    public void verifysetLnkPersonnelInvitation(){
        collectFeedbackPage.setLnkPersonnelInvitation();
    }

    // Select Email Method for Send Personel Invitation
    @Test(priority = 5)
    public void verifySetEmailSelected(){
        collectFeedbackPage.SetEmailSelected();
    }

    // Set Schedular Name
    @Test(priority = 6)
    public void verifysetSchedulerName(){
        collectFeedbackPage.setSchedulerName();
    }

    // Set Scheduler by Pressing Add Button
    @Test(priority = 7)
    public void verifysetSchedulerByAdd(){
        collectFeedbackPage.setSchedulerByAdd();
    }

    // Handle the Toggle Button
    @Test(priority =8)
    public void verifyBtnToggle() throws InterruptedException {
        collectFeedbackPage.setBtnToggle();
    }

    // Update Scheduler Click Edit Scheduler
    @Test(priority = 9)
    public void verifySetEditScheduler() throws InterruptedException {
        collectFeedbackPage.setEditScheduler(collectFeedbackPage.btnEditScheduler);
    }

    // Set the frequency for the Scheduler
    @Test(priority = 10)
    public void verifysetBtnAddFrequency(){
        collectFeedbackPage.setBtnAddFrequency();
    }

    // Set Start Date from the calender
    @Test(priority = 11)
    public void verifysetClickOnDate() throws InterruptedException {
        collectFeedbackPage.setClickOnStartDate();
    }

    //Clear the default Check box to unmark
    @Test(priority = 12)
    public void verifyCheckBox() throws InterruptedException {
        collectFeedbackPage.clearCheckBoxNoEndDate();
    }

    // Select the end date from the calender
    @Test(priority = 13)
    public void verifysetClickOnEndDate() throws InterruptedException {
        collectFeedbackPage.setClickONEndDate();
    }

    // For Select the time zone click on the drop down list
    @Test(priority = 14)
    public void verifysetBtnSelectTimeZone() throws InterruptedException {
        collectFeedbackPage.setBtnSelectTimeZone();
    }

    // Click on the button for the set frequeny
    @Test(priority = 15)
    public void verifysetBtnSetFrquency() throws InterruptedException {
        collectFeedbackPage.setBtnSetFrquency();
    }

    //
    @Test(priority = 16)
    public void verifyScrollPage() throws InterruptedException {
        collectFeedbackPage.ScrollPage(collectFeedbackPage.getButtonSaveVisible);
    }

    // Save SCheduler of Project
    @Test(priority =17)
    public void verifysetButtonSave(){
        collectFeedbackPage.setButtonSave();
    }


    //
    @Test(priority = 18)
    public void verifySetPageUp() throws InterruptedException {
        collectFeedbackPage.setPageUpScrolling(collectFeedbackPage.getScrollTabMail);
    }

    // Click on Tab Mail
    @Test(priority = 19)
    public void verifysetTabMailClick(){
        collectFeedbackPage.setTabMailClick();
    }

    // Click on field Picker to select the name of Sender
    @Test(priority = 20)
    public void verifysetBtnFieldPicker() throws InterruptedException {
        collectFeedbackPage.setBtnFieldPicker();
    }

    // Scroll the page upto visible the element
    @Test(priority = 21)
    public void verifyFieldIsVisible() throws InterruptedException {
        collectFeedbackPage.scrollAlertWindow(collectFeedbackPage.name);
    }

    // Enter Sender Name by using field picker
    @Test(priority = 22)
    public void verifySenderNameSelected(){
        collectFeedbackPage.setSelectSenderName(collectFeedbackPage.selectSenderName);
    }

    // Enter email id of receiver name
    @Test(priority = 23)
    public void verifyReplyMail(){
        collectFeedbackPage.writeText(collectFeedbackPage.txtReplyMail,"vaibhav.chavan@cuembux.com");
    }

    // Mouse hover on sender address field
    @Test(priority = 24)
    public void verifysetEmailSendTo() throws InterruptedException {
        collectFeedbackPage.setEmailMouseOverSendTo();
    }

    //
    @Test(priority = 25)
    public void verifyScrollPageForSender() throws InterruptedException {
        collectFeedbackPage.scrollFindElemenet(collectFeedbackPage.scrollForPickUpFieldEmail);
    }

    //
    @Test(priority = 26)
    public void verifysetEmailFieldMailSendTo() throws InterruptedException {
        collectFeedbackPage.setEmailFieldMailSendTo();
    }

    // Write email subject text on text box
    @Test(priority = 27)
    public void verifyEmailSubjectText(){
        collectFeedbackPage.setEmailSubjectText();
    }

    //
    @Test(priority = 28)
    public void verifyTextAreaOfInvitation() throws InterruptedException {
        collectFeedbackPage.mouseHavorOnTextAreaofInvitation(collectFeedbackPage.txtAreaOfInvitation);
    }

    //
    @Test(priority = 29)
    public void verifySetFieldOfTextArea() throws AWTException, InterruptedException {
       collectFeedbackPage.setFieldOfTextArea();
    }

    //
    @Test(priority = 30,enabled = false)
    public void verifyFieldPickerForInvitation() throws InterruptedException {
        collectFeedbackPage.FieldPickerForInvitation();
    }

    //
    @Test(priority = 31,enabled = false)
    public void verfyScrollSourceWindow(){
        collectFeedbackPage.scrollFindElemenet(collectFeedbackPage.scrollForPickUpFieldEmail);
    }

    //
    @Test(priority = 32,enabled = false)
    public void verifySetValueForTextArea() throws InterruptedException {
        collectFeedbackPage.setSelectSenderName(collectFeedbackPage.name);
    }

    //
    @Test(priority = 33,enabled = false)
    public void verifySetSaveButtonForScheduler() throws InterruptedException {
        collectFeedbackPage.setSaveSchedulerForTriggerMail(collectFeedbackPage.btnSaveToSetScheduler);
    }

    //
    @Test(priority = 34,enabled = false)
    public void verifySetSendTestMail(){
        collectFeedbackPage.setSendTestMail(collectFeedbackPage.btnSendTestMail);
    }
}

