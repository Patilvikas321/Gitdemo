import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CollectFeedbackByMobileTabletInvitationPage extends BasePage{
    public CollectFeedbackByMobileTabletInvitationPage(WebDriver driver) {
        super(driver);
    }

    //
    @FindBy(xpath = "//app-scheduler-type//aside//ul//li[1]//div//div")
    public WebElement lnkMobileAndTablet;

    //
    @FindBy(xpath = "//*[@id='Carousel']//div//div[1]//div//div[2]//div//button")
    public WebElement btnSelectProjectPlanner;

    //
    @FindBy(id = "Name")
    public WebElement txtNameToScheduler;

    //
    @FindBy(xpath = "//div[@id='myModal']//div[3]//button[2]")
    public WebElement btnAdd;

    //
    @FindBy(xpath = "//gridster-item[2]//app-widget[1]//bswitch[1]//div[1]//div[1]//span[2]")
    public WebElement btnToggleSwitch;

    //
    @FindBy(xpath = "//gridster-item[2]//button[text()='Edit scheduler']")
    public WebElement btnEditScheduler;

    //
    @FindBy(xpath = "//*[@id='StartDate']//button")
    public WebElement btnCalenderClick;

    //
    @FindBy(xpath = "//*[@id='StartDate']//div[2]/table[1]/tbody/tr/td[2]/button")
    public WebElement  btnSpanToday;

    //
    @FindBy(xpath = "//*[@id='EndDate']//button")
    public WebElement btnSetEndDate;

    //
    @FindBy(xpath = "//*[@id='EndDate']//table[2]//tbody//tr[5]//td[2]")
    public WebElement btnPutEndDate;

    //
    @FindBy(xpath = "//app-scheduler-tab-project-management//app-loader-component//form//div[1]//div[5]//bswitch//span[2]")
    public WebElement btnListViewOnProjectAndPlanning;

    //
    @FindBy(xpath = "//button//span[text()='Save ']")
    public WebElement btnSaveInProjectAndPlanning;

    //
    @FindBy(xpath = "//app-project-planner-tab[1]//div[1]//div[1]//tabset[1]//ul[1]//li[2]")
    public WebElement lnkUsersTab;

    //
    @FindBy(xpath = "//app-loader-component[1]//div[1]//div[1]//div[1]//div[1]/div[1]/button[1]")
    public WebElement btnDropDownSelectGroup;

    //
    @FindBy(xpath = "//*[@id='tree2']/tree-viewport/div/div/tree-node-collection/div/tree-node/div/div/label")
    public WebElement labelGroupSelected;

    //
    @FindBy(xpath = "//button//span[text()=' Add ']")
    public WebElement btnAddGroup;

    //
    @FindBy(xpath = "//div[@class='row']//div//button//span[text()=' Add ']")
    public WebElement btnAddManageUsers;

    //
    @FindBy(xpath = "//app-project-planner-tab[1]//div[1]//tabset[1]//ul[1]//li[3]//a[1]")
    public WebElement lnkTabQuotaManagement;

    //
    @FindBy(xpath = "//span[text()='Add quota']")
    public WebElement btnAddQuota;

    //
    @FindBy(id = "quotaNum")
    public WebElement txtEnterQuota;

    //
    @FindBy(xpath= "//*[@id='groupsList']//perfect-scrollbar//div[1]//app-loader-component//div[2]//kendo-treeview//ul//li/div//kendo-checkbox//input")
    public WebElement chkBoxOfGroup;

    //
    @FindBy(xpath = "//my-date-picker[1]//div[1]//div[1]//div[1]//button[1]")
    public WebElement btnStartDateCalenderClick;

    //
    @FindBy(xpath = "//tbody//tr[1]//td[2]//button[1]")
    public WebElement btnSelectStartDate;

    //
    @FindBy(xpath = "//*[@id='endDate']//div//div[1]//div/button")
    public WebElement btnEndDateClick;

    //
    @FindBy(xpath = "//span[contains(text(),'30')]")
    public WebElement btnSelectEndDate;

    //
    @FindBy(xpath = "//*[@id='myModal']//perfect-scrollbar//div//div//div[4]//app-ms-drop-down//div//div")
    public WebElement ddlSelectUsers;

    //
    @FindBy(xpath = "//label[text()='Select all']")
    public WebElement chkBoxUserSelectedForQuota;

    //
    @FindBy(xpath = "//button[@type='submit']//span[1]")
    public WebElement btnAddQuotaData;

    //
    public boolean setLinkMobileAndTabletVisible(WebElement lnkMobileAndTablet ){
        click(lnkMobileAndTablet);
        return lnkMobileAndTablet.isDisplayed();
    }

    //
    public void setProjectPlanner(WebElement btnSelectProjectPlanner){
        click(btnSelectProjectPlanner);

    }

    //
    public boolean setSchedulerName(WebElement txtNameToScheduler,String value){
        writeText(txtNameToScheduler,value);
        return txtNameToScheduler.isDisplayed();
    }

    //
    public void setSchedulerClickByAdd(WebElement btnAdd){
        click(btnAdd);

    }

    //
    public boolean setToggleSwitch(WebElement btnToggleSwitch) throws InterruptedException {
        click(btnToggleSwitch);
        iWait();
        String s= btnToggleSwitch.getText();
        System.out.println(s);
        return btnToggleSwitch.isEnabled();
    }

    //
    public void setEditScheduler(WebElement btnEditScheduler) throws InterruptedException {
        Thread.sleep(5000);
        click(btnEditScheduler);
    }

    //
    public boolean setDateForScheduler(WebElement btnCalenderClick){

        click(btnCalenderClick);
        return btnCalenderClick.isDisplayed();
    }

    //
    public void setSatrtDateToday(WebElement btnSpanToday){
        iWait();
        click(btnSpanToday);

    }

    //
    public void setEndDateOfScheduler(WebElement btnSetEndDate){
        iWait();
        click(btnSetEndDate);
    }

    //
    public void setEndDateOfSchedulerClick(WebElement btnPutEndDate){
        iWait();
        click(btnPutEndDate);
    }

    //
    public void setToggleOfListView(WebElement btnListViewOnProjectAndPlanning){
        click(btnListViewOnProjectAndPlanning);
    }

    //
    public void setProjectAndPlanningTab(WebElement btnSaveInProjectAndPlanning){
        click(btnSaveInProjectAndPlanning);
    }

    //
    public void setTabUsers(WebElement lnkUsersTab){
        iWait();
        click(lnkUsersTab);
    }

    //
    public void setGroupValueFromDropDown(WebElement btnDropDownSelectGroup){
        iWait();
        click(btnDropDownSelectGroup);
    }

    //
    public void setLabelFromDropDownGropus(WebElement labelGroupSelected) throws InterruptedException {
        Thread.sleep(1000);
        click(labelGroupSelected);

    }

    //
    public void setAddButton(WebElement btnAddGroup){
        iWait();
        click(btnAddGroup);
    }

    //
    public void setBtnAddManageUsers(WebElement btnAddManageUsers) throws InterruptedException {
        Thread.sleep(1000);
        click(btnAddManageUsers);

    }

    //
    public void setQuotaManagementTab(WebElement lnkTabQuotaManagement) throws InterruptedException {
        Thread.sleep(5000);
        click(lnkTabQuotaManagement);
    }

    //
    public void setAddQuota(WebElement btnAddQuota) throws InterruptedException {
        Thread.sleep(2000);
        click(btnAddQuota);
    }

    //
    public void setQuotaValue(WebElement txtEnterQuota) throws InterruptedException {
        Thread.sleep(1000);
        writeText(txtEnterQuota,"3");
    }

    //
    public void setClickChekBox(WebElement chkBoxOfGroup) throws InterruptedException {
        Thread.sleep(1000);
        click(chkBoxOfGroup);
    }

    //
    public void setStartDateIsSelected() throws InterruptedException {
        Thread.sleep(2000);
        click(btnStartDateCalenderClick);
        Thread.sleep(1000);
        click(btnSelectStartDate);
    }

    //
    public void setEndDateIsSelected() throws InterruptedException {
        Thread.sleep(2000);
        click(btnEndDateClick);
        Thread.sleep(1000);
        click(btnSelectEndDate);
    }

    //
    public void setSelectUsers(WebElement ddlSelectUsers){
        iWait();
        click(ddlSelectUsers);
    }

    //
    public void setAllUSersInQuota(WebElement chkBoxUserSelectedForQuota){
        iWait();
        click(chkBoxUserSelectedForQuota);
    }

    //
    public void setQuotaForUsers(WebElement btnAddQuotaData) throws InterruptedException {
        Thread.sleep(3000);
        click(btnAddQuotaData);

    }

}
