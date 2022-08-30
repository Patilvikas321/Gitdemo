import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.file.WatchEvent;

public class CollectFeedbackByMAndTFormsAndCheckListPageTest extends BasePageTest{
    CollectFeedbackByPersonnelInvitationPage personnelInvitation;
    CollectFeedbackByMobileTabletInvitationPage mobileTableInvitationPage;
    LoginPage loginPage;
    CreateProjectInCustomerFeedbackPage createProject;
    CollectFeedbackByMAndTFormsAndCheckListPage feedbackByMAndTFormsAndCheckList;

    @BeforeClass
    public void inItObject(){
        loginPage=new LoginPage(getDriver());
        loginPage.login(getProp().getProperty("email"),getProp().getProperty("password"));
        feedbackByMAndTFormsAndCheckList=new CollectFeedbackByMAndTFormsAndCheckListPage(getDriver());
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
    public void verifyMobileAndTablet(){
        Assert.assertTrue(mobileTableInvitationPage.setLinkMobileAndTabletVisible(mobileTableInvitationPage.lnkMobileAndTablet));
    }

    //
    @Test(priority = 5)
    public void verifyFeedbackTypeInMobileAndTablet(){
        feedbackByMAndTFormsAndCheckList.setFeedbackTypeinMobileAndTablet(feedbackByMAndTFormsAndCheckList.arrowNavigateForward);
    }

    //
    @Test(priority = 6)
    public void verifySelectFormsAndCheckListTypes(){
        feedbackByMAndTFormsAndCheckList.setSelectFormsAndCheckListTypes(feedbackByMAndTFormsAndCheckList.btnSelectFormsAndCheckList);
    }

    //
    @Test(priority = 7)
    public void verifyNameForScheduler(){
        mobileTableInvitationPage.setSchedulerName(mobileTableInvitationPage.txtNameToScheduler,"Forms_CheckList_Feedback_Scheduler");
    }

    //
    @Test(priority = 8)
    public void verifyAddScheduler(){
        mobileTableInvitationPage.setSchedulerClickByAdd(mobileTableInvitationPage.btnAdd);
    }

    //
    @Test(priority = 9)
    public void verifyVisibilityOfToggleSwitch(){
        feedbackByMAndTFormsAndCheckList.scrollFindElemenet(feedbackByMAndTFormsAndCheckList.btnSwitchToggle);
    }

    //
    @Test(priority = 10)
    public void verifyToggleButtonClick() throws InterruptedException {
        feedbackByMAndTFormsAndCheckList.setToggleIsClickAndOn(feedbackByMAndTFormsAndCheckList.btnSwitchToggle);
    }

    //
    @Test(priority = 11)
    public void verifyEditSchedulerFormsAndCheckList() throws InterruptedException {
        feedbackByMAndTFormsAndCheckList.setEditSchedulerOfScheduler(feedbackByMAndTFormsAndCheckList.btnEditSchedulerFormsAndCheckList);
    }

    //
    @Test(priority = 12)
    public void verifyFieldMouseHover() throws InterruptedException {
        feedbackByMAndTFormsAndCheckList.setImageMouseHavorArea(feedbackByMAndTFormsAndCheckList.imgAreaMouseOver);
    }

    //
    @Test(priority = 13)
    public void verifyImageUploadButtonClick(){
        feedbackByMAndTFormsAndCheckList.setImageUploadBottonClick(feedbackByMAndTFormsAndCheckList.lnkImageUpload);
    }

    //
    @Test(priority = 14)
    public void verifyImageLoad(){
        feedbackByMAndTFormsAndCheckList.setLogoImage(feedbackByMAndTFormsAndCheckList.imgSelectedFromPanel);
    }

    //
    @Test(priority = 15)
    public void verifyAddButtonClick(){
        feedbackByMAndTFormsAndCheckList.setAddButtonToImageAdd(feedbackByMAndTFormsAndCheckList.btnAddImageClick);
    }

    //
    @Test(priority = 16)
    public void verifyTextAreaOfDiscription(){
        feedbackByMAndTFormsAndCheckList.setTextAreaOfDiscription(feedbackByMAndTFormsAndCheckList.txtAreaDescription,"Scheduler for the Forms and Check List in Collect Feedback");
    }

    //
    @Test(priority = 17)
    public void verifyDropDownListClick(){
        feedbackByMAndTFormsAndCheckList.setUserFromTheDropDown(feedbackByMAndTFormsAndCheckList.ddlSelectUsers);

    }

    //
    @Test(priority = 18)
    public void verifyGroupSelected(){
        mobileTableInvitationPage.setAllUSersInQuota(mobileTableInvitationPage.chkBoxUserSelectedForQuota);
    }

    //
    @Test(priority = 19)
    public void verifyAddGroup(){
        feedbackByMAndTFormsAndCheckList.setAddUsersFromList(feedbackByMAndTFormsAndCheckList.btnAddListOfUsers);
    }

    //
    @Test(priority = 20)
    public void verifySchedulerToClickOnSave(){
        feedbackByMAndTFormsAndCheckList.setSchedulerToClickOnSave(feedbackByMAndTFormsAndCheckList.btnSaveScheduler);
    }

}
