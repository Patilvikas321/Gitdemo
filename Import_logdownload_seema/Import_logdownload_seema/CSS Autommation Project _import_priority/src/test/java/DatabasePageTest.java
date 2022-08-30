import com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class DatabasePageTest extends BasePageTest{
    DatabasePage databasePage;
    LoginPage loginPage;
    ImportFilePage importFilePage;

    @BeforeClass
    public void inItObject(){
        //Object created for the databasePage
        databasePage = new DatabasePage(getDriver());

        //Object of Login Page
        loginPage = new LoginPage(getDriver());
        loginPage.login(getProp().getProperty("email"),getProp().getProperty("password"));

        // object of import Page
        importFilePage = new ImportFilePage(getDriver());
    }

/* This Section for click databse menu amd edit the widget in that when click on database menu the About,data view,import sources,
   defination,rules,logging tabs are display*/

    // Access the method from ImportPage, to click on Data Garden menu

    @Test(priority = 0)
    public void verifyDataGardenMenuClick(){
        Assert.assertTrue(importFilePage.getDataGardenMenu());
    }


    @Test(priority = 1)
    public void verifyLinkDataGardenMenuClickable() throws InterruptedException {
        List<String> expectedSubmenu = new ArrayList<>();
        expectedSubmenu.add("Import");
        expectedSubmenu.add("Database");
        expectedSubmenu.add("Blacklist");
        expectedSubmenu.add("API Management");
        Assert.assertEquals(importFilePage.getExplorerElementDataGeraden(), expectedSubmenu);
    }

    // Click on Database Menu
    @Test(priority = 2)
    public void verifySetDatabaseMenu() throws InterruptedException {
        List<String> expectedProjectList = new ArrayList<>();
        expectedProjectList.add("EMP_Automation");
        expectedProjectList.add("Automation_CYS");
        expectedProjectList.add("");
        Assert.assertNotEquals(databasePage.setDatabaseMenu(), expectedProjectList);
    }

    //Edit Database from the list of Databases
    @Test(priority = 3)
    public void verifysetBtnEditDatabase() throws InterruptedException {
        List<String> expectedProjectList = new ArrayList<>();
        expectedProjectList.add("About");
        expectedProjectList.add("Data View");
        expectedProjectList.add("Import Sources");
        expectedProjectList.add("Definitions");
        expectedProjectList.add("Rules");
        expectedProjectList.add("Logging");
        Assert.assertEquals(databasePage.setBtnEditDatabase(),expectedProjectList);
    }

/*************************************************************************************************************************************/
/* This section check when user click on edit button the about tab is already enabled and display the Name,Main type,
subtype,discription of the database we are imported*/

    // In database About tab is open in that  Name,Main type,subtype,discription is visible
    @Test(priority =4)
    public void verifyListItemIsVisible(){
        Assert.assertTrue(databasePage.getListItemIsVisible());
    }

/*************************************************************************************************************************************/
/* This functionality related to the Import Database from the available set of databases tab */
   // Import external Source into Database

    @Test(priority = 5)
    public void verifysetLnkImportSource() throws InterruptedException {
       Assert.assertTrue(databasePage.setLnkImportSource());
    }
/*
    // Click on the plus sign to add file source
    @Test(priority = 6)
    public void verifysetLnkFileSelectPlusSign(){
      Assert.assertTrue(databasePage.setLnkFileSelectPlusSign());
    }

    // Page display for the select the source file from the drop down
    @Test(priority = 7)
    public void verifyPopPageIsVisible() throws InterruptedException {
        String expectedString="Add source";
        Assert.assertEquals(databasePage.getPopPageIsVisible(),expectedString);
    }

    // Select the value of Visible text from the dropdown list
    @Test(priority = 8)
    public void verifysetDdlForSelectSource() {
        List<String> expectedDatabaseElement=new ArrayList<>();
        expectedDatabaseElement.add("Automation_Test");
        expectedDatabaseElement.add("DN22");
        expectedDatabaseElement.add("MB_Import_Users");
        Assert.assertEquals(databasePage.setDdlForSelectSource(),expectedDatabaseElement);
    }

    // Enter the name of Data Source you are Imported
    @Test(priority = 9)
    public void verifysetTextAreaDataSourceName() throws InterruptedException {
       Assert.assertTrue(databasePage.getTextAreaDataSourceName());
    }

    // Click omn the Add button to add to source file
    @Test(priority =10)
    public void verifybtnAdd(){
       Assert.assertTrue(databasePage.setButtonAddIsVisible());
    }

    // Click on Add button to add dataset into Import source
    @Test(priority = 11)
    public void verifyAddButtonClick(){
        Assert.assertTrue(databasePage.setAddButtonClick());
    }*/

/*

    //  Click on the link display add source on the top of the source file name
    @Test(priority = 12)
    public void verifyAddSourceFile(){
        Assert.assertTrue(databasePage.addSourceClickToAddOtherDatabaseSource());
    }

    // Click on the search the file name to add the database source
    @Test(priority = 13)
    public void verifySearchToAddNewImport(){
        Assert.assertTrue(databasePage.sourceFileNameSearchFieldClick());
    }

    // Click on value of source import from the list of drop down
    @Test(priority = 14)
    public void verifyValueFromDropDownSelected(){
        List<String> expectedDropDownList=new ArrayList<>();
        expectedDropDownList.add("DN22");
        expectedDropDownList.add("MB_Import_Users");
        Assert.assertEquals(databasePage.listOfDatabaseElement(),expectedDropDownList);
    }

    @Test(priority = 15)
    public void verifyDatabseFileSelected(){
        Assert.assertTrue(databasePage.setSelectedImportNewSource());
    }

    @Test(priority = 16)
    public void verifySetNewImportAddOrCancel(){
        Assert.assertTrue(databasePage.setNewImportAddOrCancel());
    }

    // Click on the Defination Tab
    @Test(priority = 17)
    public void verifysetLnkDefinitionTab() throws InterruptedException {
        Assert.assertTrue(databasePage.setLnkDefinitionTab());
    }

    // Click and Validate Add Column Defination Link Is Visible
    @Test(priority = 18)
    public void verifyAddColumnDefinition() throws InterruptedException {
        Assert.assertTrue(databasePage.setAddColumnDefinitionIsVisible(databasePage.headerName, getProp().getProperty("value1")));
    }

    //
    @Test(priority = 19)
    public void verifySetFieldName() throws InterruptedException {
        Assert.assertTrue(databasePage.setAddColumnDefinitionIsVisible(databasePage.headerName, getProp().getProperty("value2")));
    }

    //
    @Test(priority = 20)
    public void verifySetFieldSurname() throws InterruptedException {
        Assert.assertTrue(databasePage.setAddColumnDefinitionIsVisible(databasePage.headerName, getProp().getProperty("value3")));
    }

    //
    @Test(priority = 21)
    public void verifySetFieldEmail() throws InterruptedException {
        Assert.assertTrue(databasePage.setAddColumnDefinitionIsVisible(databasePage.headerName, getProp().getProperty("value4")));
    }

    //
    @Test(priority = 22)
    public void verifySetFieldContact() throws InterruptedException {
        Assert.assertTrue(databasePage.setAddColumnDefinitionIsVisible(databasePage.headerName,getProp().getProperty("value5")));
    }


    //
    @Test(priority = 23)
    public void verifysetLinkImportSource() throws InterruptedException {
        Assert.assertTrue(databasePage.setLnkImportSource());
    }

    //
    @Test(priority =24)
    public void VerifyDragAndDropSrNoElement() throws InterruptedException {
        databasePage.SetMappingFieldwithDataSrNo(databasePage.dragFieldSr_No, databasePage.dropFieldSr_No);
    }

    //
    @Test(priority = 25)
    public void verifyDragAndDropNameElement() throws InterruptedException {
        databasePage.SetMappingFieldwithDataName(databasePage.dragFieldName, databasePage.dropFieldName);
    }

    //
    @Test(priority = 26)
    public void verifyDragAndDropSurnameElement() throws InterruptedException {
        databasePage.SetMappingFieldwithDataSurname(databasePage.dragFieldSurname, databasePage.dragFieldSurname);
    }

    //
    @Test(priority = 27)
    public void verifyDragAndDropEmailElement() throws InterruptedException {
        databasePage.SetMappingFieldwithDataEmail(databasePage.dragFieldEmail, databasePage.dragFieldEmail);
    }

    //
    @Test(priority = 28)
    public void verifyDragAndDropContactElement() throws InterruptedException {
        databasePage.SetMappingFieldwithDataContact(databasePage.dragFieldContact, databasePage.dropFieldContact);
    }
*/
/**************************************************************************************************************************************
 * *************************************************************************************************************************************/
    // Below test are related to data view tab in database menu
    @Test(priority =29)
    public void verifyClickOnDataView() throws InterruptedException {
       Assert.assertTrue(databasePage.setDataViewIsVisible());
    }

    // Click on the Data View Tab
    @Test(priority = 30)
        public void verifyDataViewIsDisplay(){
        Assert.assertTrue(databasePage.setDataViewIsClickable());
    }

    // Click on the check box from the list of record in data view table
    @Test(priority = 31)
    public void verifyDataViewtableRecords() throws InterruptedException {
         Assert.assertTrue(databasePage.setDataGridValueClikable());
    }

    // Click on the action button of the data view tab
    @Test(priority =32)
    public void verifySetActionsDataViewClicked(){
         Assert.assertTrue(databasePage.setActionsDataViewTable());
    }

    // Get the list of options are explore after click on actions button
    @Test(priority = 33)
    public void verifyDropDownOptionsIsVisible(){
        List<String> expectedActionElement=new ArrayList<>();
        expectedActionElement.add("Change status");
        expectedActionElement.add("Add blacklist");
        expectedActionElement.add("Export to excel");
        Assert.assertEquals(databasePage.getActionOptionDropDown(),expectedActionElement);
    }

    // Click on the drop down list first option that change status
    @Test(priority = 34)
    public void verifySetChangeStatus(){
        Assert.assertTrue(databasePage.setChangeStatusClickable());
    }
    /**************************************************************************************************************************************
     * *************************************************************************************************************************************/
    // Below test are related to Rules tab in database menu
/*

    // Check the visibility of the Rules tab in database
    @Test(priority = 3)
    public void verifyRulesTabVisible(){
        Assert.assertTrue(databasePage.setRulesTabVisible());
    }

    // Click on Rules teb on database Sub menu
    @Test(priority =3)
    public void verrifyRulesClickable(){
        Assert.assertTrue(databasePage.setRulesIsClickable());
    }


    */
/**************************************************************************************************************************************
     * *************************************************************************************************************************************//*

    // Below test are related to Logging tab in database menu
    // Check the visibility of the Rules tab in database
    @Test(priority = 33)
    public void verifyLoggingTabVisible() {
        Assert.assertTrue(databasePage.setLoggingDatabaseIsVisible());
    }

    // Click on Rules teb on database Sub menu
    @Test(priority =34)
    public void verrifyLoggingClickable(){
        Assert.assertTrue(databasePage. setLoggingDatabaseIsClickable());
    }
*/




}
