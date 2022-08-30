import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.InputEvent;

public class CollectFeedbackByPersonnelInvitationPage extends BasePage {
    public CollectFeedbackByPersonnelInvitationPage(WebDriver driver) {
        super(driver);
    }

    // Declaration xpath of Collect Feedback Button
    @FindBy(xpath = "//button[text()=' Collect feedback']")
    private WebElement btnCollectFeedback;

    // Declaration xpath for Add Create new Scheduler
    @FindBy(xpath = "//button[text()=' Add collect feedback']")
    public WebElement btnAddCollectFeedback;

    // Link for Personnel Invitation to the Customer
    @FindBy(xpath = "//app-scheduler-type[1]//aside[1]//ul[1]//li[3]//div[1]//div[1]")
    public WebElement lnkPersonnelInvitation;

    // Select the email from Personnel Invitation
    @FindBy(xpath = "//button[contains(text(),'Select')]")
    public WebElement btnEmailSelected;

    // Type Name for Scheduler in Collect Feedback
    @FindBy(id = "Name")
    public WebElement inputName;

    // Path for Add Button for Add Scheduler
    @FindBy(xpath = "//*[@id='myModal']//form//button[2]")
    public WebElement btnAddScheduler;

    // Handle Toggle Button
    @FindBy(xpath = "//app-widget//bswitch//div//span[2]")
    public WebElement btnToggle;

    // Update Scheduler Click Edit Scheduler
    @FindBy(xpath = "//app-widget//div[2]//app-dynamic-component//div//app-email-invitation-scheduler-widget-content//div//div[2]//div//button")
    public WebElement btnEditScheduler;

    //Add Freauency for the Scheduler
    @FindBy(xpath = "//button[text()='Add frequency']")
    public WebElement btnAddFrequency;

    // Click on start Date
    @FindBy(xpath = "//*[@id='FromDate']/div/div/div/button")
    public WebElement getStartDate;

    // Select Date from Calender
    @FindBy(xpath = "//*[@id='FromDate']//table[1]//tbody//tr//td[2]//button")
    public WebElement setStartDate;

    @FindBy(xpath = "//label[contains(text(),'No end date')]")
    public WebElement chkBoxNoEndDate;

    // click on End Date
    @FindBy(xpath = "//*[@id='ToDate']/div/div/div/button")
    public WebElement getEndDate;

    // Set End date of Schedule
    @FindBy(xpath = "//*[@id='ToDate']/div/div[2]/table[2]/tbody/tr[5]/td[2]/div/span")
    public WebElement setEndDate;

    // Element Of Time Zone Is clicked
    @FindBy(xpath = "//div[text()=' Timezone ']")
    public WebElement btnSelectTimeZone;

    // Select the Time from the Time Zone link
    @FindBy(xpath = "//select-dropdown//div//div[2]//ul//li[46]//span")
    public WebElement lnkTimeZoneCountry;

    // Click on Select button for set the frequency
    @FindBy(xpath = "//*[@id='myModal']/div/div/form/div[3]/button[2]")
    public WebElement btnSetFrquency;

    // Scroll element
    @FindBy(xpath = "//app-scheduler-tab//app-loader-component//div//form/div/div[15]/div[2]/button")
    public WebElement getButtonSaveVisible;

    // Save the Scheduler of the project
    @FindBy(xpath = "//app-scheduler-tab//app-loader-component//div//form/div/div[15]/div[2]/button")
    public WebElement btnSave;

    // Scroll the window for
    @FindBy(xpath = "//a[text()=' Mail ']//i")
    public WebElement getScrollTabMail;

    // Edit Mail tab, So click on the Mail Tab for Create Mail
    @FindBy(xpath = "//a[text()=' Mail ']//i")
    public WebElement tabMail;

    // Click on field Picker to select the Sender name
    @FindBy(xpath = "//*[@id='main-scroll']//app-loader-component/div/div[2]/form/div[1]/div[1]/div[1]/div[1]/div/div/button")
    public WebElement btnFieldPicker;

    //
    @FindBy(xpath = "//div[@class='scrollable-content']//div[29]")
    public WebElement name;

    //
    @FindBy(id="senderName")
    public WebElement elementForMouseHover;

    //
    @FindBy(xpath = "//div[@class='scrollable-content']//div[29]")
    public WebElement selectSenderName;

    //
    @FindBy(xpath = "//app-mail-tab[1]//app-loader-component[1]//div[1]/div[1]//div[1]//input[1]")
    public WebElement txtReplyMail;

    //
    @FindBy(xpath = "//app-loader-component[1]//div[1]//div[2]//form[1]//div[2]//div[1]//div[1]//div[1]//button[1]")
    public WebElement btnFieldPickerTo;

    //
    @FindBy(xpath = "//div[@class='scrollable-content']//div[31]")
    public WebElement getEmailFieldMailSendTo;

    //
    @FindBy(xpath = "//div[text()='email']")
    public WebElement scrollForPickUpFieldEmail;

    //
    @FindBy(id = "emailSubject")
    public WebElement txtEmailSubjectValue;

    //
    @FindBy(xpath = "//*[@id='ngxEditor']/div/div")
    public WebElement txtAreaValue;

    //
    @FindBy(id="editorView")
    public WebElement txtAreaOfInvitation;

    //
    @FindBy(xpath = "//*[@id='editorView']//div//button")
    public WebElement btnFieldPickerForInvitation;

    //
    @FindBy(xpath = "//app-loader-component//div//div[2]//form//div[9]//div//button")
    public WebElement btnSaveToSetScheduler;

    //
    @FindBy(xpath = "//button[text()=' Send test mail ']")
    public WebElement btnSendTestMail;



    // Methods and logic for makes the various action and event on Web Page and its Web Element.

    // Method for Collect feedback Menu Button
    public void setBtnCollectFeedback() throws InterruptedException {
        Thread.sleep(5000);
        click(btnCollectFeedback);
    }

    // Press Add New Collect Feedback
    public void setNewCollectFeedback() throws InterruptedException {
        Thread.sleep(5000);
        click(btnAddCollectFeedback);
    }

    // Set Personnel Invitation through link
    public void setLnkPersonnelInvitation(){
        click(lnkPersonnelInvitation);
    }

    // Selected Email for Personnel Invitation
    public void SetEmailSelected(){
        click(btnEmailSelected);
    }

    // Write the Name of Scheduler for Collect Feedback
    public void setSchedulerName(){
        writeText(inputName,"eMail_Scheduler");
    }

    // Add Scheduler by clicking on Add Button
    public void setSchedulerByAdd(){
        iWait();
        click(btnAddScheduler);
    }

    // Check the Status of Toggle button
    public void setBtnToggle(){
        iWait();
        click(btnToggle);
    }


    // Update Scheduler Click Edit Scheduler
    public void setEditScheduler(WebElement btnEditScheduler)throws InterruptedException {
        Thread.sleep(4000);
        click(this.btnEditScheduler);
    }

    // Add Frequency
    public void setBtnAddFrequency(){
        click(btnAddFrequency);
    }

    // Click and Select On start Date
    public void setClickOnStartDate() throws InterruptedException {
        Thread.sleep(2000);
        click(getStartDate);
        iWait();
        click(setStartDate);
    }

    // Click on check box for set end date
    public void clearCheckBoxNoEndDate()throws InterruptedException{
        Thread.sleep(2000);
        click(chkBoxNoEndDate);
    }


    // Click and Select End Date
    public void setClickONEndDate() throws InterruptedException {
        Thread.sleep(2000);
        click(getEndDate);
        iWait();
        click(setEndDate);

    }

    // Select time zone according to the current place
    public void setBtnSelectTimeZone() throws InterruptedException{
        click(btnSelectTimeZone);
        Thread.sleep(2000);
        click(lnkTimeZoneCountry);
    }

    //
    public void setBtnSetFrquency()throws InterruptedException{
        Thread.sleep(3000);
        click(btnSetFrquency);
    }

    //
    public void ScrollPage(WebElement getButtonSaveVisible)throws InterruptedException{
        Thread.sleep(7000);
        scrollFindElemenet(getButtonSaveVisible);
    }

    //
    public void setButtonSave(){
        iWait();
        click(btnSave);
    }

    //
    public void setPageUpScrolling(WebElement getScrollTabMail)throws InterruptedException{
        Thread.sleep(5000);
        scrollFindElemenet(getScrollTabMail);
    }


    // Click on the Mail Tab of Collect Feedback
    public void setTabMailClick(){
        iWait();
        click(tabMail);
    }

    //
    public void setBtnFieldPicker() throws InterruptedException{
        Thread.sleep(4000);
        mouseHover(elementForMouseHover);
        Thread.sleep(2000);
        click(btnFieldPicker);
    }

    //
    public void scrollAlertWindow(WebElement name)throws InterruptedException{
        Thread.sleep(5000);
        scrollFindElemenet(name);
    }

    //
    public void setSelectSenderName(WebElement selectSenderName){
        iWait();
        click(selectSenderName);
    }

    //
    public void setReplyMail(WebElement txtReplyMail,String value){
        iWait();
        writeText(txtReplyMail,value);
    }

    //
    public void setEmailMouseOverSendTo()throws InterruptedException{
        Thread.sleep(5000);
        mouseHoverSecond();
        Thread.sleep(3000);
        click(btnFieldPickerTo);
    }

    //
    public void getFieldForToEmail()throws InterruptedException{
        Thread.sleep(3000);
        scrollFindElemenet(scrollForPickUpFieldEmail);

    }

    //
    public void setEmailFieldMailSendTo()throws InterruptedException{
        Thread.sleep(3000);
        click(getEmailFieldMailSendTo);
    }

    //
    public void setEmailSubjectText(){
        iWait();
        writeText(txtEmailSubjectValue,"Invitation For Customer Feedback");
    }
    //
    public void mouseHavorOnTextAreaofInvitation(WebElement txtAreaOfInvitation)throws InterruptedException{
        Thread.sleep(3000);
        mouseHover(txtAreaOfInvitation);
    }

    //
    public void setFieldOfTextArea()throws AWTException, InterruptedException {
        iWait();
        click(txtAreaValue);
    }

    //
    public void mouseHavorOnTextAreaofInvitation()throws InterruptedException{
        Thread.sleep(3000);
        mouseHover(txtAreaOfInvitation);
    }

    //
    public void FieldPickerForInvitation()throws InterruptedException{
        Thread.sleep(3000);
        click(btnFieldPickerForInvitation);
    }

    //
    public void setSaveSchedulerForTriggerMail(WebElement btnSaveToSetScheduler)throws InterruptedException{
        Thread.sleep(30000);
        click(btnSaveToSetScheduler);
    }

    //
    public void setSendTestMail(WebElement btnSendTestMail){
        iWait();
        click(btnSendTestMail);
    }


}
























