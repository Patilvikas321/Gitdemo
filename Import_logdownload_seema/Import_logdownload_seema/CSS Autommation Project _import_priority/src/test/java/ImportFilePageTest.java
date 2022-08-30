
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


public class ImportFilePageTest extends BasePageTest {
    ImportFilePage importFilePage;
    LoginPage loginPage;

    // Browser Initialization
    @BeforeClass
    public void inItObject() {
        importFilePage = new ImportFilePage(getDriver());
        loginPage = new LoginPage(getDriver());
        loginPage.login(getProp().getProperty("email"), getProp().getProperty("password"));
    }

    @Test(priority = 0)

    public void verifyDataGardenClicked() {
        Assert.assertTrue(importFilePage.getDataGardenMenu());
    }

    // Verify Click on Menu Items
    @Test(priority = 1)
    public void getExplorerElementDataGeraden() throws InterruptedException {
        List<String> expectedSubmenu = new ArrayList<>();
        expectedSubmenu.add("Import");
        expectedSubmenu.add("Database");
        expectedSubmenu.add("Blacklist");
        expectedSubmenu.add("API Management");
        Assert.assertEquals(importFilePage.getExplorerElementDataGeraden(), expectedSubmenu);
    }

    // Verify Open Import Page is Dispalyed
    @Test(priority = 2)
    public void verifyImportPageVisible() throws InterruptedException {
        Assert.assertTrue(importFilePage.lnkImportSource());
    }


    // Again Click on Import Sub Menu
    @Test(priority = 3)
    public void verifyLinkImportSourceClickable() throws InterruptedException {
        List<String> expectedProjectList = new ArrayList<>();
        expectedProjectList.add("DN22");
        expectedProjectList.add("MB_Import_Users");
        expectedProjectList.add("");
        Assert.assertNotEquals(importFilePage.liProjectOnImportPage(), expectedProjectList);
    }

    // Verify click on Import Menu
    @Test(priority = 4)
    public void verifyImportMenu() throws InterruptedException {
        Assert.assertTrue(importFilePage.importMenu());
    }


    // Verify click on Add button
    @Test(priority = 5)
    public void verifyAddButton() throws InterruptedException {
        Assert.assertTrue(importFilePage.addButton());
    }


    // Verify Enter Value in Text Box
    @Test(priority = 6)
    public void verifyEnterValueTxt() throws InterruptedException {
        String expectedProjectName = getProp().getProperty("FileName");
        Assert.assertEquals(importFilePage.txtValue(getProp().getProperty("FileName")),expectedProjectName);
    }

    //
    @Test(priority = 7)
    public void verifyAddButtonClickToCreateProject() throws InterruptedException {
        Assert.assertTrue(importFilePage.clickOnAddButtonToCreateProject());
    }

    // Verify click on Import Menu
    @Test(priority =8)
    public void verifyImportMenuToCheckStatus() throws InterruptedException {
        Assert.assertTrue(importFilePage.lnkImportSource());
    }

    // Click again on import submenu for check the status of toggle button
    @Test(priority = 10)
    public void verifyNewWidgetCreated() throws InterruptedException {
        List<String> expectedProjectList = new ArrayList<>();
        expectedProjectList.add("Automation_Test");
        expectedProjectList.add("DN22");
        expectedProjectList.add("MB_Import_Users");
        Assert.assertNotEquals(importFilePage.liProjectOnImportPage(), expectedProjectList);
    }

    // project grid creted for new project
    @Test(priority = 11)
    public void verifyNewProjectCreated() throws InterruptedException {
        String expectedString = "Automation_Test_Seema";
        Assert.assertEquals(importFilePage.newProjectCreated(), expectedString);
    }


    // Handle the Project toggle button
    @Test(priority = 12)
    public void verifyToggleButtonClickable() throws InterruptedException {
        Assert.assertTrue(importFilePage.btnToggleClickable());

    }

    // Edit Project for Import File
    @Test(priority = 13)
    public void verifyEditImport() throws InterruptedException {
        ArrayList<String> expectedTabList = new ArrayList<>();
        expectedTabList.add("General");
        expectedTabList.add("Definitions");
        Assert.assertEquals(importFilePage.setBtnEditImport(), expectedTabList);
    }

 /*Below test are the related to the general tab in the new project in that we test project name add the description for
 that project and save the page*/

    @Test(priority = 14, enabled = false)
    public void verifyDefaultProjectName() {
        Assert.assertTrue(importFilePage.getProjectName());
    }


    @Test(priority = 15)
    public void verifyProjectDescription() {
        Assert.assertTrue(importFilePage.setProjectAreaDescription(getProp().getProperty("Project_Description")));
    }

    @Test(priority = 16)
    public void verifySaveButtonClick() throws InterruptedException {
        Assert.assertTrue(importFilePage.clickSaveButton());
    }


/* Below test are the related to the Defination tab in that we Import Source file either upload/Drag & Drop button
   then Add header manually in the database */



    // Verify Click on Definition Tab
    @Test(priority = 17)
    public void verifyDefinitionTabClicked() {
        Assert.assertTrue(importFilePage.clickOnDefinitionTab());
    }

    // Verify Click on Upload File Button
    @Test(priority = 18)
    public void verifyClickOnUploadFile() {
        Assert.assertTrue(importFilePage.btnUploadFile());
        ;
    }

    // Verify File is Uploaded it shows the all header Tab are active
    @Test(priority = 19)
    public void verifyFileIsUploaded() throws AWTException, InterruptedException {
        List<String> expectedHeaderName = new ArrayList<>();
        expectedHeaderName.add("General");
        expectedHeaderName.add("Definations");
        expectedHeaderName.add("File Sources");
        expectedHeaderName.add("Rules on Import");
        expectedHeaderName.add("Data View");
        expectedHeaderName.add("Log");
        Assert.assertNotEquals(importFilePage.uploadFileDocument(), expectedHeaderName);
    }

    // verify the file importad sucessfully and card element is display
    @Test(priority = 20)
    public void verifyCardElementOfUploadedImport() {
        Assert.assertTrue(importFilePage.getCardElementOfUploadedImport());
    }

    // Check the risk level by using radio button of Risk level
    @Test(priority = 21)
    public void verifyRiskLevelRadioButton() {
        Assert.assertTrue(importFilePage.getRadioRiskLevel());
    }

    // If user want to add new header in his database so click on add column defination
    @Test(priority = 21)
    public void verifyGetNewWindow() {
        Assert.assertTrue(importFilePage.getNewWindow());
    }

    // Set the new header name in the database table
    @Test(priority = 22)
    public void varifySetHeaderName() {
        Assert.assertEquals(importFilePage.setHeaderName(getProp().getProperty("headerName")), "City");
    }

    // User Want to add header name in the list or either cancel
    @Test(priority = 21, enabled = false)
    public void verifyHeaderNameAdded() {
        Assert.assertTrue(importFilePage.setHeaderAdd());
    }

    // User can cancel to add external header into main database
    @Test(priority = 23)
    public void verifyCancelToAddHeader() {
        Assert.assertTrue(importFilePage.cancelAddHeaderName());
    }

/***********************************************************************************************************************************
     ***********************************************************************************************************************************/



/* Below Test are related to the Import Rule Tab in that Apply certain condition and Action on the Imported Source
     *  Three section display when click on Import rule tag,Information/Condition/Action
     *   here we apply some conditions on import source and apply some action on import database */


    // Verify click Import Rule Tab
    @Test(priority = 24)
    public void verifyOnClickImportRuleTab() {
        Assert.assertTrue(importFilePage.setClickOnRulesImportTab());
    }

    //
    @Test(priority = 25)
    public void verifyAllElementDispaly() {
        Assert.assertTrue(importFilePage.displayAllElementOfRulesOnImport());
    }

    @Test(priority = 26)
    public void verifySetClickOnOff() {
        Assert.assertTrue(importFilePage.setClickOnOff());
    }

    @Test(priority = 27)
    public void verifySetUpdatePage() {
        Assert.assertTrue(importFilePage.setUpdatePage());
    }

/*********************************************************************************************************************************/

/* This field of file Source tab in this tab we include same database file upload which uploaded in defination tab. So we are able to upload the
     *  multiple file in this tab. File source tab are uploading import file */

   // Verify Click on File Source Tab
    @Test(priority = 28)
    public void verifyClickOnFileSource() {
        Assert.assertTrue(importFilePage.setFileSourceTab());
    }

    // Verify Upload File Source
    @Test(priority = 29)
    public void verifyUploadFileSource() {
        Assert.assertTrue(importFilePage.setFileSourceUpload());

    }

    // Verify File Uploading
    @Test(priority = 30)
    public void verifyFileUploading() throws AWTException, InterruptedException {
        Assert.assertEquals(importFilePage.setFileUploading(), "Sample_Dataset Excel.xlsx");
    }

/*
    // User want to upload aother file by click on add source is clicked
    @Test(priority = 31)
    public void verifyAddSourceClicked() {
        Assert.assertTrue(importFilePage.setAddSourceFileSources());
    }

    // Click on forward arrow for Select the SFTP Upload
    @Test(priority = 32)
    public void verifyForwardArrowClicked() {
        Assert.assertTrue(importFilePage.setSftpUploadArrowButton());
    }

    // Use Add button to add the sftp File upload
    @Test(priority = 33)
    public void verifyAddButtonClickSFTPUpload() {
        Assert.assertTrue(importFilePage.setSFTPUploadByClickOnAddButton());
    }

    //
    @Test(priority = 34)
    public void verifySelectProtocolClicked() {
        Assert.assertTrue(importFilePage.setProtocolDropDownClick());
    }

    //
    @Test(priority = 35)
    public void verifyGetListOfProtocol() {
        List<String> expectedProtocolList = new ArrayList<>();
        expectedProtocolList.add("SSH");
        expectedProtocolList.add("SFTP");
        expectedProtocolList.add("FTP");
        expectedProtocolList.add("FTPS explicit");
        expectedProtocolList.add("FTPS implicit");
        Assert.assertEquals(importFilePage.getListOfProtocol(), expectedProtocolList);
    }

    //
    @Test(priority = 36)
    public void verifySelectValueFromDropDown() throws InterruptedException {

        importFilePage.setDropDownTransferMethod(getProp().getProperty("protocol"));
    }

    //
    @Test(priority = 37)
    public void verifyHostNameOrIP() {
        importFilePage.setHostOrIPName(getProp().getProperty("hostNameOrIP"));
    }

    //
    @Test(priority = 38)
    public void verifySelectPort() throws InterruptedException {

        importFilePage.setPort(getProp().getProperty("port"));
    }

    //
    @Test(priority = 39)
    public void verifySelectusername() throws InterruptedException {

        importFilePage.setUserName(getProp().getProperty("username"));
    }

    //
    @Test(priority = 40)
    public void verifySelectpassword1() throws InterruptedException {

        importFilePage.setPassword(getProp().getProperty("passwordsftp"));
    }

    @Test(priority = 41)
    public void verifyTestConnection() throws InterruptedException {

        importFilePage.setTestConnection();
    }

    @Test(priority = 42)
    public void verifyDefaultDirectory() throws InterruptedException {

        importFilePage.setDefaultDirectory(getProp().getProperty("directory"));
    }

    @Test(priority = 43)
    public void verifyTestFolder() throws InterruptedException {

        importFilePage.setTestFolder();
    }

    @Test(priority = 43)
    public void verifyAdditionalSettings() throws InterruptedException {

        importFilePage.setAdditionalSetting();
    }

    @Test(priority = 44)
    public void verifySaveProtocol() throws InterruptedException {

        importFilePage.setSaveProtocol();
    }

/******************************************************************************************************************************************/

    //
    @Test(priority = 45)
    public void verifySetDataViewTab() throws InterruptedException {
        Assert.assertTrue(importFilePage.setDataViewTab());
    }

    @Test(priority = 46)
    public void verifyPageRefresh() throws InterruptedException {
       Assert.assertFalse(importFilePage.pageNavigation());
       Assert.assertTrue(importFilePage.setDataViewTab());
    }

    @Test(priority=47)
    public void verifyCountRecordDataView(){
        Assert.assertNotEquals(importFilePage.getRecordCountOfDataView(),56000);
    }

    @Test(priority = 48)
    public void verifygetRecordEachPage(){
        Assert.assertTrue(importFilePage.browseNextRecordPages());
        System.out.println("Record on Sixth page Count \n");
        Assert.assertNotEquals(importFilePage.getRecordCountOfDataView(),56000);

    }

    @Test(priority = 49)
    public void verifygetRecordPrevoiusPage(){
        Assert.assertTrue(importFilePage.browsePreviousRecordPages());
        System.out.println("Record on Third page Count \n");
        Assert.assertNotEquals(importFilePage.getRecordCountOfDataView(),56000);

    }

    @Test(priority = 50)
    public void verifygetRecordLastPage(){
        Assert.assertTrue(importFilePage.browseNextLastRecordPages());
        System.out.println("Record on Last page Count \n");
        Assert.assertNotEquals(importFilePage.getRecordCountOfDataView(),56000);

    }

    @Test(priority = 51)
    public void verifygetRecordFirstPage(){
        Assert.assertTrue(importFilePage.browsePreviousFirstRecordPages());
        System.out.println("Record on First page Count \n");
        Assert.assertNotEquals(importFilePage.getRecordCountOfDataView(),56000);

    }

    @Test(priority = 52)
    public void verifyRecordClicked() throws InterruptedException {
        Assert.assertTrue(importFilePage.setRecordClickFromTable());
    }

    @Test(priority = 53)
    public void verifyActionButtonclicked() throws InterruptedException {
        Assert.assertTrue(importFilePage.setActionButtonClicked());
    }

    @Test(priority = 54)
    public void verifyDeleteClicked() throws InterruptedException {
        Assert.assertTrue(importFilePage.setDeleteButtonClicked());
    }

    @Test(priority = 55)
    public void verifyDeleteYesClick() throws InterruptedException {
        Assert.assertTrue(importFilePage.setYesButtonclicked());
    }

    // Again count the record after deleted record from table
    @Test(priority = 56)
    public void verifyRecordCountDeleted(){
        Assert.assertNotEquals(importFilePage.getRecordCountOfDataView(),55998);
    }

/******************************************************************************************************************************************/

    //
    @Test(priority = 57)
    public void verifySetLogTab() throws InterruptedException {
        Assert.assertTrue(importFilePage.setLogTab(), "Logging Tab Visible");
    }

    // Check the visibility of element is visible of log tab
    @Test(priority = 58)
    public void verifyCheckLogTableVisible() {
        Assert.assertTrue(importFilePage.getLogTableVisible());
    }

    // Check the visibility of element is visible of log tab
    @Test(priority = 59)
    public void varifyCheckSendLogReportLabelVisible() {
        Assert.assertTrue(importFilePage.getLabelSendLogReportVisible());
    }

    // Get status of file upload
    @Test(priority = 60)
    public void verifyStatusOfUploadedFile() {
        Assert.assertNotEquals(importFilePage.getStatusOfUploadedFile(),true);
    }

    @Test(priority =61)
    public void verifySendLogReportClicked(){
        Assert.assertTrue(importFilePage.setSendLogReportTextBoxClicked());
    }

    @Test(priority =62)
    public void verifyListOfLogReceiver(){
        List<String> expectedName=new ArrayList<>();
        expectedName.add("ABC");
        Assert.assertNotEquals(importFilePage.setSendLogReportDropDown(),expectedName);
    }

    @Test(priority =63)
    public void verifySearchUserNameCheckBoxSelected() throws InterruptedException {
       Assert.assertTrue(importFilePage.setSearchValueInSearchArea());
      //  Assert.assertTrue(importFilePage.setSearchValueInSearchArea1());
    }

    @Test(priority =64)
    public void verifyValueSelectedDropDown(){
        Assert.assertTrue(importFilePage.setSearchValueInSearchAreaValue());
    //    Assert.assertTrue(importFilePage.setSearchValueInSearchAreaValue1());
    }

    @Test(priority =65)
    public void verifysendLogreport(){
        Assert.assertTrue(importFilePage.setSendLogReportToUser());
    }

    @Test(priority =66)
    public void verifySendLogReportClicked1(){
        Assert.assertTrue(importFilePage.setSendLogReportTextBoxClicked1());
    }

    @Test(priority =67)
    public void verifySearchUserNameCheckBoxSelected1() throws InterruptedException {
        Thread.sleep(5000);
       // Assert.assertTrue(importFilePage.setSearchValueInSearchArea());
        Assert.assertTrue(importFilePage.setSearchValueInSearchArea1());
    }

    @Test(priority =68)
    public void verifyValueSelectedDropDown1(){
       // Assert.assertTrue(importFilePage.setSearchValueInSearchAreaValue());
        Assert.assertTrue(importFilePage.setSearchValueInSearchAreaValue1());
    }

    @Test(priority =69)
    public void verifysendLogreport1(){
        Assert.assertTrue(importFilePage.setSendLogReportToUser1());
    }


    // Download uploaded ecxel file from Database
    @Test(priority =70)
    public void verifyExcelFileDownload() throws InterruptedException, ParseException, IOException {
        Assert.assertTrue(importFilePage.setDownloadLogExcelFile());

        List<String> expectedLogDetails = importFilePage.liLogFileContent();
        System.out.println("Array Size:"+expectedLogDetails.size()+"\n liLogFileContent:"+expectedLogDetails);
        System.out.println("globalArray Size:"+importFilePage.globalArray.size()+"\n globalArray:"+ importFilePage.globalArray);
       /* for(int i=0;i<=importFilePage.globalArray.size();i++){
            System.out.println("Array:"+importFilePage.globalArray.get(i));
        }
*/
        Assert.assertSame(importFilePage.liLogFileContent(), importFilePage.globalArray);

        System.out.println("Log report is accurate and it is clear");
        importFilePage.globalArray.clear();
    }

    @Test(priority = 71)
    public void verifyImportPageVisible1() throws InterruptedException {
        Assert.assertTrue(importFilePage.lnkImportSource());
    }

    /*@Test(priority = 72)
    public void verifyImportMenu1() throws InterruptedException {
        Assert.assertTrue(importFilePage.importMenu());
    }*/

   /* @Test(priority = 73)
    public void verifyNewWidgetCreated1() throws InterruptedException {
        List<String> expectedProjectList = new ArrayList<>();
        expectedProjectList.add("Automation_Test");
        expectedProjectList.add("Automation_Test_Seema");
        expectedProjectList.add("Automation_Import2");
        expectedProjectList.add("DN22");
        expectedProjectList.add("MB_Import_Users");
        Assert.assertNotEquals(importFilePage.liProjectOnImportPage(), expectedProjectList);
    }*/
//   @Test(priority = 74)
//   public void verifyDefaultProjectName1() {
//       Assert.assertTrue(importFilePage.getProjectName());
//   }

    @Test(priority = 75)
    public void verifyEditImport1() throws InterruptedException {
        ArrayList<String> expectedTabList = new ArrayList<>();
        expectedTabList.add("General");
        expectedTabList.add("Definitions");
        expectedTabList.add("File Sources");
        expectedTabList.add("Rules on Import");
        expectedTabList.add("Data View");
        expectedTabList.add("Log");
        Assert.assertEquals(importFilePage.setBtnEditImport(), expectedTabList);
    }

    // Verify click Import Rule Tab
    @Test(priority = 76)
    public void verifyOnClickImportRuleTab1() {
        Assert.assertTrue(importFilePage.setClickOnRulesImportTab());
    }

    //
    @Test(priority = 77)
    public void verifyAllElementDispaly1() {
        Assert.assertTrue(importFilePage.displayAllElementOfRulesOnImport());
    }

    @Test(priority = 78)
    public void verifySetClickOnOff1() {
        Assert.assertTrue(importFilePage.setClickOnOff1());
    }
    @Test(priority = 79)
    public void verifySetUpdatePage1() {
        Assert.assertTrue(importFilePage.setUpdatePage());
    }

    @Test(priority = 80)
    public void verifyClickOnFileSource1() {
        Assert.assertTrue(importFilePage.setFileSourceTab());
    }

    // Verify Upload File Source
    @Test(priority = 81)
    public void verifyUploadFileSource1() {
        Assert.assertTrue(importFilePage.setFileSourceUpload());

    }

    // Verify File Uploading
    @Test(priority = 82)
    public void verifyFileUploading1() throws AWTException, InterruptedException {
        Assert.assertEquals(importFilePage.setFileUploading(), "Sample_Dataset Excel.xlsx");
    }


    @Test(priority = 83)
    public void verifySetLogTab1() throws InterruptedException {
        Assert.assertTrue(importFilePage.setLogTab(), "Logging Tab Visible");
    }


    // Check the visibility of element is visible of log tab
    @Test(priority = 84)
    public void verifyCheckLogTableVisible1() {
        Assert.assertTrue(importFilePage.getLogTableVisible());
    }

    @Test(priority = 85)
    public void verifyPageRefresh1() throws InterruptedException {
        Assert.assertFalse(importFilePage.pageNavigation());
        Assert.assertTrue(importFilePage.setLogTab());
    }

    @Test(priority = 86)
    public void verifySetClickOnNotificationTab() {
        Assert.assertTrue(importFilePage.clickOnNotification());
    }

    @Test(priority = 87)
    public void verifySetClickOnNotificationDetails() throws InterruptedException {

        String expectedStr = "Seema Sankpal Source Import Failed";
        String actualStr =importFilePage.getNotificationDetails();

        System.out.println("actualStr"+actualStr);
        System.out.println("expectedStr"+expectedStr);

       Assert.assertEquals(actualStr, expectedStr);
       System.out.println("Getting Accurate notification.........");
    }

}

/*************************************************************************************************************************************************************************/
/*//Verify downloaded log and log page.
@Test(priority = 10)
public void verifyDownloadedLog() throws InterruptedException {


}*/




