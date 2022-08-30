import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CollectFeedbackByMobileTabletInvitationPageTest extends BasePageTest{
    CollectFeedbackByPersonnelInvitationPage personnelInvitation;
    CollectFeedbackByMobileTabletInvitationPage mobileTableInvitationPage;
    LoginPage loginPage;
    CreateProjectInCustomerFeedbackPage createProject;

    @BeforeClass
    public void inItObject(){
        loginPage=new LoginPage(getDriver());
        loginPage.login(getProp().getProperty("email"),getProp().getProperty("password"));
        personnelInvitation=new CollectFeedbackByPersonnelInvitationPage(getDriver());
        mobileTableInvitationPage=new CollectFeedbackByMobileTabletInvitationPage(getDriver());
        createProject=new CreateProjectInCustomerFeedbackPage(getDriver());

    }
    //
    @Test(priority = 0,enabled = false)
    public void verifyClickCustomerFeedback(){
        createProject.clickDataCollection();
    }

    //
    @Test(priority =1)
    public void verifyCustomerFeedback(){
        createProject.clickCustomerFeedback();
    }

    //
    @Test(priority = 2)
    public void verifyCollectFeedback() throws InterruptedException {
        personnelInvitation.setBtnCollectFeedback();
    }

    //
    @Test(priority = 3)
    public void verifyAddCollectFeedback() throws InterruptedException {
        personnelInvitation.setNewCollectFeedback();
    }

    //
    @Test(priority = 4)
    public void verifyMobileAndTable(){
        Assert.assertTrue(mobileTableInvitationPage.setLinkMobileAndTabletVisible(mobileTableInvitationPage.lnkMobileAndTablet));
    }

    //
    @Test(priority = 5)
    public void verifyProjectPlanner(){
        mobileTableInvitationPage.setProjectPlanner(mobileTableInvitationPage.btnSelectProjectPlanner);
    }

    //
    @Test(priority = 6)
    public void verifySetSchedulerName(){
        Assert.assertTrue(mobileTableInvitationPage.setSchedulerName(mobileTableInvitationPage.txtNameToScheduler,"MobileAndTablet_Scheduler"));
    }

    //
    @Test(priority = 7)
    public void verifySetSchedulerClickByAdd(){
       mobileTableInvitationPage.setSchedulerClickByAdd(mobileTableInvitationPage.btnAdd);
    }

    //
    @Test(priority = 8)
    public void verifyToggleButton() throws InterruptedException {
        Assert.assertTrue(mobileTableInvitationPage.setToggleSwitch(mobileTableInvitationPage.btnToggleSwitch));
    }

    //
    @Test(priority = 9)
    public void verifyEditScheduler() throws InterruptedException {
        mobileTableInvitationPage.setEditScheduler(mobileTableInvitationPage.btnEditScheduler);
    }

    //
    @Test(priority = 10)
    public void verifySetDateForScheduler(){
        mobileTableInvitationPage.setSchedulerClickByAdd(mobileTableInvitationPage.btnCalenderClick);
    }

    //
    @Test(priority = 11)
    public void verifySetStartDateToday(){
       mobileTableInvitationPage.setSatrtDateToday(mobileTableInvitationPage.btnSpanToday);
    }

    //
    @Test(priority = 12)
    public void verifySetEndDateOfScheduler(){
       mobileTableInvitationPage.setEndDateOfScheduler(mobileTableInvitationPage.btnSetEndDate);
    }

    //
    @Test(priority = 13)
    public void verifySetEndDateOfSchedulerClick(){
       mobileTableInvitationPage.setEndDateOfSchedulerClick(mobileTableInvitationPage.btnPutEndDate);
    }

    //
    @Test(priority = 14)
    public void verifySetToggleOfListView(){
        mobileTableInvitationPage.setToggleOfListView(mobileTableInvitationPage.btnListViewOnProjectAndPlanning);
    }

    //
    @Test(priority = 15)
    public void verifySetProjectAndPlanningTab(){
        mobileTableInvitationPage.setProjectAndPlanningTab(mobileTableInvitationPage.btnSaveInProjectAndPlanning);
    }

    //
    @Test(priority = 16)
    public void verifySetTabUsers(){
        mobileTableInvitationPage.setTabUsers(mobileTableInvitationPage.lnkUsersTab);
    }

    //
    @Test(priority = 17)
    public void verifyDropDownForSelectGroup(){
        mobileTableInvitationPage.setGroupValueFromDropDown(mobileTableInvitationPage.btnDropDownSelectGroup);
    }

    //
    @Test(priority = 18)
    public void verifyValueSelectedFromGroupList() throws InterruptedException {
        mobileTableInvitationPage.setLabelFromDropDownGropus(mobileTableInvitationPage.labelGroupSelected);
    }

    //
    @Test(priority = 19)
    public void verifyAddButtonClick(){
        mobileTableInvitationPage.setAddButton(mobileTableInvitationPage.btnAddGroup);
    }

    //
    @Test(priority = 20)
    public void verifyAddManageUsersAddClick() throws InterruptedException {
        mobileTableInvitationPage.setBtnAddManageUsers(mobileTableInvitationPage.btnAddManageUsers);
    }

    //
    @Test(priority = 21)
    public void verifyQuotaManagementTab() throws InterruptedException {
        mobileTableInvitationPage.setQuotaManagementTab(mobileTableInvitationPage.lnkTabQuotaManagement);
    }

    //
    @Test(priority = 22)
    public void verifyAddQuotaClick() throws InterruptedException {
        mobileTableInvitationPage.setAddQuota(mobileTableInvitationPage.btnAddQuota);
    }

    //
    @Test(priority = 23)
    public void verifyQuotaValueEnter() throws InterruptedException {
        mobileTableInvitationPage.setQuotaValue(mobileTableInvitationPage.txtEnterQuota);
    }

    //
    @Test(priority = 24)
    public void verifyCheckBoxClick() throws InterruptedException {
        mobileTableInvitationPage.setClickChekBox(mobileTableInvitationPage.chkBoxOfGroup);
    }
    //
    @Test(priority = 25)
    public void verifySetStartDateClick() throws InterruptedException {
        mobileTableInvitationPage.setStartDateIsSelected();
    }

    //
    @Test(priority = 26)
    public void verifySetEndDateClick() throws InterruptedException {
        mobileTableInvitationPage.setEndDateIsSelected();
    }

    //
    @Test(priority = 27)
    public void verifyUserSelectClick(){
        mobileTableInvitationPage.setSelectUsers(mobileTableInvitationPage.ddlSelectUsers);
    }

    //
    @Test(priority = 28)
    public void verifyUserSelectedFromDropDownList(){
        mobileTableInvitationPage.setAllUSersInQuota(mobileTableInvitationPage.chkBoxUserSelectedForQuota);
    }

    //
    @Test(priority = 29)
    public void verifyDataAddedInQuota() throws InterruptedException {
        mobileTableInvitationPage.setQuotaForUsers(mobileTableInvitationPage.btnAddQuotaData);
    }
}
