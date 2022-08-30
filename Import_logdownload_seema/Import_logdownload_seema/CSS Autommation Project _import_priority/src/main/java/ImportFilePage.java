import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImportFilePage extends BasePage {
    WebDriverWait wait = new WebDriverWait(driver, 90);

List<String> globalArray ;
    public ImportFilePage(WebDriver driver) {
        super(driver);

    }

    // Click on Data Garden Menu
    @FindBy(xpath = "//span[text()='Data garden']")
    public WebElement lnkDataGarden;

    //
    @FindBy(xpath = "//span[text()='Data garden']//following::div[1]//ul//li//a//span")
    public List<WebElement> lnkSubmenu;

    // Path of Web Element Import Menu
    @FindBy(xpath = "//span[text()='Import']")
    public WebElement mnuImport;

    // Import Page is visible after click on import menu
    @FindBy(xpath = "//a[@class='navbar-brand']")
    private WebElement labImportPage;

    // Open project grid and list of project created on import submenu
    @FindBy(xpath = "//div[@class='gridster-content']//gridster//gridster-item//div[1]//app-header-name//div[1]//span")
    public List<WebElement> projectsNameGrids;

    // Display already created projects on import page and it's define as gridster
    @FindBy(xpath = "//gridster//gridster-item[1]//div//app-header-name[1]//div[1]//span")
    public WebElement projectsGrids;

// Section for create the new project or check archive project import sub menu

    // Path of web Element Add Import Button
    @FindBy(xpath = "//button[@class='btn btn-fill btn-gold m-r-5']")
    public WebElement btnAddImportSource;

    //
    // Below the path for forward & backward item to types of upload you choose
    @FindBy(xpath = "//div[@id='Carousel']//a//div[1]//i")
    public WebElement itemForwardBackward;

    // Path of Web Element Add Button
    @FindBy(xpath = "//app-source-sub-type[1]/section[1]//div[1]//div[1]//div[1]//div[1]//button[1]")
    public WebElement btnAdd;

    // Path for Enter text in Text Box
    @FindBy(id = "sourceName")
    public WebElement txtName;

    // Path for Add Button
    @FindBy(xpath = "//button[text()='Add ']")
    public WebElement btnAdd2;

    // Switch on project Tab
    @FindBy(xpath = "//gridster[@class='gridster fixed']//gridster-item[1]//app-widget[1]//div[1]//bswitch[1]//div[1]//div//span[2]")
    public WebElement btnToggleSwitch;

    // Edit Project to Import File
    @FindBy(xpath = "//button[text()='Edit import']")
    public WebElement btnEditImport;


    // This is for the display the available tab in the new created project
    @FindBy(xpath = "//div[@class='main-content']//tabset//ul//li")
    public List<WebElement> liTabImport;

    // Name Field shows the name of project in general tab in import file page
    @FindBy(id = "sourceName")
    public WebElement txtProjectName;

    // Path for text area description about the project in general tab
    @FindBy(xpath = "//div[@class='form-group padding-top-30']//textarea")
    public WebElement txtAreaDescription;

    // Path for the save button in general tab of the import file sub menu
    @FindBy(xpath = "//button[text()=' Save ']")
    public WebElement btnSaveGeneralTab;

    /* The below block is for the cover the functionality of the Defination tab in import sub menu
     *  Defination check the Import excel file from local system to the database
     *  Download sample CSV Excel file when user click on the download CSV/Excel File
     *  If user wants to add columns manually */
    /*******************************************************************************************************************************************************************************************/

    // Path for Definition Tab
    @FindBy(xpath = "//li[2][@class='nav-item']")
    public WebElement defTaB;

    // After click on defination tab it shows the upload file button and Label as a import source
    @FindBy(xpath = "//*[@id='main-scroll']/div[1]/app-parent-data-garden/app-import-tabs/div/div/tabset/div/tab[2]")
    public WebElement headerDefinationTab;

    // Path for Button Load
    @FindBy(xpath = "//div[text()='Click or drag a file to upload']")
    public WebElement btnUpload;

    // It's Diaplay the name of uploaded file
    @FindBy(xpath = "//span[text()='Sample_Dataset Excel.xlsx']")
    public WebElement labelUploadedFileName;

    // After uploading file it show the column of the uploded file
    @FindBy(xpath = "//div[@class='main-content']//tabset//ul//li")
    public List<WebElement> listTabHeaderName;

    // After uploading file the following card of header name/Column ID/Header Name/Risk Level menus are display
    @FindBy(xpath = "//*[@id='cdk-drop-list-0']")
    public WebElement menuOnCardDisplayAfterUploading;

    // Handle the radio list of risk level and select the any radio button according to risk level
    @FindBy(xpath = "//*[@id='verticalTab-3']//form//div[3]//div//div//div")
    public WebElement radioButtonRiskLevel;

    // If user wants to add other columns in the database
    @FindBy(xpath = "//*[@id='cdk-drop-list-0']//li[1]//a[1]")
    public WebElement liAddColumnDefination;

    // Open Pop Up Window to enter the name of header you want to insert
    @FindBy(xpath = "//*[@id='myModal']//div//div//form//div[1]//h4")
    public WebElement headerPageOpen;

    // Enter the header name in text field of header
    @FindBy(id = "headerName")
    public WebElement headerName;

    // Enter add button to set header name of the header
    @FindBy(xpath = "//*[@id='myModal']//div//div//form//div[3]//button[2]")
    public WebElement btnAddHeaderName;

    // Enter add button to set header name of the header
    @FindBy(xpath = "//*[@id='myModal']//div//div//form//div[3]//button[1]")
    public WebElement btnCancelHeaderName;

    /***************************************************************************************************************************************************************************************/
    /* The below block is for the cover the functionality of the Rules on Import tab in
     *  Rules on Import tab check the conditions check buttons
     *  Check the Action
     *  Manually switch the toggle switch off to and update the rules */


    // Path for Rule Import Tab
    @FindBy(xpath = "//app-import-tabs//div//div//tabset//ul//li[4]//a")
    public WebElement clickOnRulesImportTab;

    // Click on reules on Import it shows the list of element like information/Condition/Action
    @FindBy(id = "wizardTab")
    public WebElement rulesImportDisplay;

    // Click off toggle Switch
    @FindBy(xpath = "//div[@class='bootstrap-switch-container']//span")
    public WebElement btnOnOFF;

    @FindBy(xpath = "//span[@class='bootstrap-switch-label']")
    public WebElement btnOnOFF1;

    //Click on Update Button
    @FindBy(xpath = "//button[text()='Update']")
    public WebElement btnUpdate;
    /***********************************************************************************************************************************************************************************/
    // Click on File Source Tab
    @FindBy(xpath = "//ul[@class='nav nav-tabs']//li[3]//a")
    public WebElement clickFileSourceTab;

    // Retrieve the String Of Uploaded File
    @FindBy(xpath = "//div[@class='dz-filename']//span")
    public WebElement fileName;

    // Click Button File Source
    @FindBy(xpath = "//*[@id='main-scroll']//app-loader-component//div//div[2]//div[1]//div//div//a")
    public WebElement lnkAddSourceFileSourceTab;

    // Click forward arrow button to slelect next file import method
    @FindBy(xpath = "//*[@id='Carousel']/a[2]/div/i")
    public WebElement arrowButtonSelectSFTPUpload;

    //
    @FindBy(xpath = "//*[@id='Carousel']//div[2]//div//div[2]//div//button")
    public WebElement btnAddForSFTPUpload;

    // Select the Transfer protocol from drop down list
    @FindBy(xpath = "//div[text()=' Select Protocol ']")
    public WebElement selectProtocolDropDown;

    // Search area of drop down in FTP protocol filed
    @FindBy(xpath = "//*[@id='main-scroll']//app-select//div//ng-select//select-dropdown//div//div[1]//input")
    public WebElement txtSearchtransferMethod;

    //
    @FindBy(xpath = "//span[text()='FTP']")
    public WebElement ftpFileTransferProtocol;

    // Locate hostname/IP
    @FindBy(id="Host")
    public WebElement txtHostOrIPField;

    //
    @FindBy(id="port")
    public WebElement txtPort;

    //
    @FindBy(id="UserName")
    public WebElement txtUserName;

    //
    @FindBy(id="password")
    public WebElement txtPassword;

    //
    @FindBy(id="onTestConnection")
    public WebElement btnTestConnection;

    //
    @FindBy(id="defaultRemoteDirectory")
    public WebElement txtDefaultRemoteDirectory;

    //
    @FindBy(id="onTestFolder")
    public WebElement btnTestFolder;

    //
    @FindBy(xpath="//div[text()=' Select Additional Settings ']")
    public WebElement ddlAdditionalSetting;

    //
    @FindBy(id="undefined")
    public WebElement btnSaveProtocol;

    //
    @FindBy(xpath = "//select-dropdown//div[2]//ul//li")
    public List<WebElement> liFileTransferProtocolList;

    // Toggle Button is Clickable to change Mode ON & OFF
    @FindBy(xpath = "//gridster[@class='gridster fixed']//gridster-item[1]//bswitch//div[1]//div[1]//span[2]")
    public WebElement btnToggle;
    /********************************************************************************************************************************************************************************/
    // After Uploading File on File Source click on Data View
    @FindBy(xpath = "//app-import-tabs//tabset//ul//li[5]//a")
    public WebElement tabDataViewInImport;

    @FindBy(xpath = "//div[contains(text(),' vishal kadam ')]/parent::td//preceding-sibling::td//input[@class='k-checkbox']")
    public WebElement chkboxFromTheTable;

    @FindBy(xpath = "//div[contains(text(),'shirish bongale')]/parent::td//preceding-sibling::td//input[@class='k-checkbox']")
    public WebElement chkboxFromTheTableSecondValue;

    @FindBy(xpath = "//*[@id='main-scroll']//div[1]//app-import-tabs//tabset//tab[5]//app-import-dataview//div//ng-select/div/div")
    public WebElement btnActionisClicked;

    @FindBy(xpath = "//*[@id='main-scroll']//app-import-dataview//div/ng-select//select-dropdown//div//div//ul//li")
    public WebElement liDelete;

    @FindBy(xpath = "//div[@class='icon success']//div//following::h2")
    public WebElement headerDeletePage;

    @FindBy(xpath = "//button[text()='Yes']")
    public WebElement btnYesToDelete;

    // After click on data view kendo grid is display
    @FindBy(xpath = "//div[@class='table-wrapper']//kendo-grid//div")
    public WebElement tableDataViewDisplay;

    // get record count from the table of data view
    @FindBy(xpath = "//*[@id='main-scroll']//app-import-tabs//div//tab[5]//app-import-dataview//div/kendo-grid//kendo-pager//kendo-pager-info")
    public WebElement recordCountOfDataViewTable;

/* Browse the record by click the arrow button at bottom of table in data view */

    // Browse next page of record one by one
    @FindBy(xpath = "//*[@id='main-scroll']//tab[5]//kendo-grid//kendo-pager//kendo-pager-next-buttons//a[1]")
    public WebElement lnkBrowseNextRecordPageDataView;

    // Browse previous page of record one by one
    @FindBy(xpath = "//*[@id='main-scroll']//tab[5]//kendo-grid//kendo-pager//kendo-pager-prev-buttons//a[2]")
    public WebElement lnkBrowsePreviousRecordPageDataView;

    // Browse next page of Last page
    @FindBy(xpath = "//*[@id='main-scroll']//tab[5]//kendo-grid//kendo-pager//kendo-pager-next-buttons//a[2]")
    public WebElement lnkBrowseNextLastPageDataViewTable;

    // Browse previous first page of record
    @FindBy(xpath = "//*[@id='main-scroll']//tab[5]//kendo-grid//kendo-pager//kendo-pager-prev-buttons//a[1]")
    public WebElement lnkBrowsePreviousRecordFirstPageDataView;

 /* Click on the Log tab for the log related activity*/

    // Click on the Log Tab of in Import File Sub Menu
    @FindBy(xpath = "//app-import-tabs//div//div//tabset//ul//li[6]//a")
    public WebElement tabLog;

    //Check the visibility of element is visible of log tab
    @FindBy(xpath = "//tab[@class='tab-pane active']//app-import-log//kendo-grid//table[1]//thead")
    public WebElement grdTableOfLogTabDisplayed;

    // Label is display
    @FindBy(xpath = "//label[text()='Send log report']")
    public WebElement lblSendLogReport;

    // Check the status of uploaded file is success and failed
    @FindBy(xpath = "//kendo-grid-list[@class='k-grid-container']//table//tbody//tr//td[3]")
    public List<WebElement> tdStatusOfUploadedFile;

    // Click on send log report txt box for open drop down list
    @FindBy(xpath = "//div[text()='Select user']")
    public WebElement txtSendLogReport;

    @FindBy(xpath = "//input[@class='label-item']")
    public WebElement txtSendLogReport1;


    // List of user are displayed in the send report drop down
    @FindBy(xpath = "//app-import-log//ul//li//app-loader-component//ul/li[2]//perfect-scrollbar")
    public List<WebElement> ddlLogReceiverList;

    // Send search key in search area of log user search
    @FindBy(xpath = "//div[@class='input-group']//input")
    public WebElement txtSearchAreaOfLogList;

    // Click on check box of particular value
    @FindBy(xpath = "//label[contains(text(),'Vaibhav chavan')]")
    public WebElement chkBoxSelectedName;

   // @FindBy(xpath = "//label[text()='seema sankpal']")
   @FindBy(xpath = "//label[text()='seema sankpal']")
    public WebElement chkBoxSelectedName1;

    // Click on button of add/remove value
    @FindBy(xpath = "//button[text()=' Add/Remove ']")
    public WebElement btnAddRemoveUsers;

    // Table is display after log updated
    @FindBy(xpath ="//app-import-log//div//kendo-grid//div//table//thead//tr")
    public WebElement tableLogVisible;

    // For download the database excel file from the log tab

    @FindBy(xpath = "//div[@id='main-scroll']//tabset//kendo-grid//div//kendo-grid-list//table//tbody//tr//td[8]//a")
    public WebElement tdDownloadExcelFromLogTab;

    @FindBy(xpath="//td[@aria-colindex='1']")
    public WebElement tdName;

    @FindBy(xpath="//td[@aria-colindex='2']")
    public WebElement tdDateAndTime;

    @FindBy(xpath="//td[@aria-colindex='3']")
    public WebElement tdStatus;

    @FindBy(xpath="//td[@aria-colindex='4']")
    public WebElement tdSuccessRecords;

    @FindBy(xpath="//td[@aria-colindex='5']")
    public WebElement tdTotalNumberOfRecords;

    @FindBy(xpath="//td[@aria-colindex='6']")
    public WebElement tdImportType;

    @FindBy(xpath="//td[@aria-colindex='7']")
    public WebElement tdUserStamp;

    @FindBy(xpath="//li[@class='dropdown']//following::a[@class='dropdown-toggle']//i[@class='far fa-bell']")
    public WebElement notificationTab;

    @FindBy(xpath="//div[@id='main-scroll']//div[@class='ps-content']//div[1]//div[1]//p[1]")
    public WebElement notificationDetails;

    @FindBy(xpath ="//div[@class='ps-content']//div[1]//div[1]//p[2]//strong[1]")
    public WebElement notificationDetails1;

    /************************************************************************************************************************************************************************************/
    // Click on Data Garden Menu
    public boolean getDataGardenMenu() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Data garden']")));
        click(lnkDataGarden);
        return lnkDataGarden.isDisplayed();
    }

    // Data garden menu list is visible
    public List<String> getExplorerElementDataGeraden() {
        System.out.println("List of Menu in Data Garden :\n");
        List<String> subMenus = new ArrayList<>();
        for (WebElement element : lnkSubmenu) {
            subMenus.add(element.getText().trim());
        }
        System.out.println(subMenus);
        return subMenus;
    }


    // Click on Import Sub Menu of Data Garden
    public boolean lnkImportSource() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfAllElements(lnkSubmenu));
        click(mnuImport);
        return labImportPage.isDisplayed();

    }

    // List of widget are already present/newlly created in import menu
    public List<String> liProjectOnImportPage() {
        System.out.println("List of Widgets in Import Menu(Old/New) :\n");
        List<String> projectGrids = new ArrayList<>();
        for (WebElement element : projectsNameGrids) {
            projectGrids.add(element.getText().trim());
        }
        System.out.println(projectGrids);
        return projectGrids;
    }


    // Method for Click on Add Import Source
    public boolean importMenu() {
        System.out.println(btnAddImportSource.getText());
        click(btnAddImportSource);
        return btnAddImportSource.isDisplayed();
    }


    // Method for Click on Add Button
    public boolean addButton() {
        click(btnAdd);
        return txtName.isDisplayed();
    }

    // Method for Enter the Text in the TextBox and Click on Add Button 2
    public String txtValue(String value) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sourceName")));
        clear(txtName);
        writeText(txtName, value);
        return value;
    }

    // Click on the add button to add the project
    public boolean clickOnAddButtonToCreateProject() {
        click(btnAdd2);
        return btnAdd2.isDisplayed();
    }

    // Project grid created for the new project
    public String newProjectCreated() throws InterruptedException {
        eWait(projectsGrids);
        String projectName = projectsGrids.getText();
        return projectName;
    }

    //
    public boolean btnToggleClickable() throws InterruptedException {
        click(btnToggle);
        Thread.sleep(5000);
        return btnToggle.isEnabled();
    }

    //
    public List<String> setBtnEditImport() {
        eWait(btnEditImport);
        click(btnEditImport);
        List<String> tabList = new ArrayList<>();
        for (WebElement element : liTabImport) {
            tabList.add(element.getText().trim());
            System.out.println("element:"+element.getText());
        }
        return tabList;
    }

    /*********************************************************************************************************************************
     * *******************************************************************************************************************************/

    // We need to check the name of the project which we assign it shows in the filled of project name
    public boolean getProjectName() {
        iWait();
        String projectName = txtProjectName.getText().trim();
        System.out.println("projectNmae:"+projectName);
        return txtProjectName.isDisplayed();
    }

    // Write the description of project in text area of the general tab
    public boolean setProjectAreaDescription(String value) {
        eWait(txtAreaDescription);
        writeText(txtAreaDescription, value);
        return txtAreaDescription.isDisplayed();
    }

    // Click on save button of general tab of import menu
    public boolean clickSaveButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Save ']")));
        click(btnSaveGeneralTab);
        return btnSaveGeneralTab.isDisplayed();
    }

    /***********************************************************************************************************************************
     * *********************************************************************************************************************************/

    /* Here the method for Defination tab */
    public boolean getDefinationTab() {
        return defTaB.isDisplayed();
    }

    // Method for Click to Definition Tab
    public boolean clickOnDefinitionTab() {
        click(defTaB);
        System.out.println(headerDefinationTab.getText());
        return headerDefinationTab.isDisplayed();
    }

    // Method for Click on Buttons
    public boolean btnUploadFile() {
        iWait();
        click(btnUpload);
        return btnUpload.isDisplayed();
    }

    // Method for Upload the File on Definition Tab
    public List<String> uploadFileDocument() throws AWTException, InterruptedException {
        eWait(btnUpload);
        uploadFile();
        List<String> headerMenu = new ArrayList<>();
        for (WebElement element : listTabHeaderName) {
            headerMenu.add(element.getText().trim());
        }
        return headerMenu;

    }

    // Implementation for when import in uploaded sucessfully then card will display
    public boolean getCardElementOfUploadedImport() {
        System.out.println("Header of Imported File are:\n"+menuOnCardDisplayAfterUploading.getText());
        return menuOnCardDisplayAfterUploading.isDisplayed();
    }

    // Check the radio button is selected or not if enable user can change the risk level
    public boolean getRadioRiskLevel() {
        if (radioButtonRiskLevel.isEnabled()) {
            System.out.println("Radio button is enabled");
        } else {
            click(radioButtonRiskLevel);
        }
        return radioButtonRiskLevel.isEnabled();
    }

    // If user want to add new header in his database so click on add column defination
    public boolean getNewWindow() {
        click(liAddColumnDefination);
        return liAddColumnDefination.isDisplayed();
    }

    // User write header name in the text area field
    public String setHeaderName(String value) {
        writeText(headerName, value);
        return value;
    }

    // Click Add or cancel button for adding or cancel
    public boolean setHeaderAdd() {
        click(btnAddHeaderName);
        return btnAddHeaderName.isDisplayed();
    }

    // Click on cancel button to cancel adding header name
    public boolean cancelAddHeaderName() {
        click(btnCancelHeaderName);
        return btnCancelHeaderName.isDisplayed();
    }

    /****************************************************************************************************************************************************************************/

    // Method for Click on Rules Import Tab
    public boolean setClickOnRulesImportTab() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//app-import-tabs//div//div//tabset//ul//li[4]//a")));
        click(clickOnRulesImportTab);
        return clickOnRulesImportTab.isDisplayed();
    }

    //
    public boolean displayAllElementOfRulesOnImport() {
        eWait(rulesImportDisplay);
        System.out.println(rulesImportDisplay.getText());
        return rulesImportDisplay.isDisplayed();
    }

    //
    public boolean setClickOnOff() {
        click(btnOnOFF);
        eWait(btnOnOFF);

        return btnOnOFF.isDisplayed();
    }

    public boolean setClickOnOff1() {
        click(btnOnOFF1);
        eWait(btnOnOFF1);

        return btnOnOFF1.isDisplayed();
    }

    public boolean setUpdatePage() {
        click(btnUpdate);
        eWait(btnUpdate);
        return btnUpdate.isDisplayed();
    }

    /****************************************************************************************************************************************************************************/

    /* Below Test are related to the Import Rule Tab in that Apply certain condition and Action on the Imported Source
     * Three section display when click on Import rule tag,Information/Condition/Action
     * here we apply some conditions on import source and apply some action on import database */

    // Method for Click on File Source Tab
    public boolean setFileSourceTab() {
        eWait(clickFileSourceTab);
        click(clickFileSourceTab);
        return clickFileSourceTab.isDisplayed();

    }

    // Method for Click on File Source Tab
    public boolean setFileSourceUpload() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Click or drag a file to upload']")));
        click(btnUpload);
        return btnUpload.isDisplayed();
    }

    // Upload The File in File Source Tab
    public String setFileUploading() throws AWTException, InterruptedException {
        uploadFile();
        Thread.sleep(3000);
        String fileNameUploaded = labelUploadedFileName.getText();
        System.out.println(fileNameUploaded);
        return fileNameUploaded;
    }

    // For uploading another file user click on add source link
    public boolean setAddSourceFileSources() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main-scroll']//app-loader-component//div//div[2]//div[1]//div//div//a")));
        click(lnkAddSourceFileSourceTab);
        System.out.println(lnkAddSourceFileSourceTab.getText());
        return lnkAddSourceFileSourceTab.isDisplayed();
    }

    // Click on arrow button to select SFTP Upload
    public boolean setSftpUploadArrowButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Carousel']/a[2]/div/i")));
        click(arrowButtonSelectSFTPUpload);
        return arrowButtonSelectSFTPUpload.isEnabled();
    }

    // Click on SFTP upload method added by click on add button
    public boolean setSFTPUploadByClickOnAddButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='Carousel']//div[2]//div//div[2]//div//button")));
        click(btnAddForSFTPUpload);
        return btnAddForSFTPUpload.isDisplayed();
    }

    // Select the value from drop down list of protocol
    public boolean setProtocolDropDownClick(){
        iWait();
        click(selectProtocolDropDown);
        return selectProtocolDropDown.isDisplayed();
    }

    public List<String> getListOfProtocol(){
        List<String> protocolList=new ArrayList<>();
        for (WebElement element:liFileTransferProtocolList){
            protocolList.add(element.getText().trim());
        }
        System.out.println(protocolList);
        return protocolList;
    }


    public void setDropDownTransferMethod(String value) throws InterruptedException {
        Thread.sleep(5000);
        writeText(txtSearchtransferMethod, value);
    }

    public boolean setHostOrIPName(String value){
        writeText(txtHostOrIPField,value);
        return txtHostOrIPField.isDisplayed();
    }

    public boolean setPort(String value){
        writeText(txtPort,value);
        return txtPort.isDisplayed();
    }

    public boolean setUserName(String value){
        writeText(txtUserName,value);
        return txtUserName.isDisplayed();
    }

    public boolean setPassword(String value){
        writeText(txtPassword,value);
        return txtPassword.isDisplayed();
    }

    public boolean setTestConnection(){
        click(btnTestConnection);
        return btnTestConnection.isDisplayed();
    }

    public boolean setDefaultDirectory(String value){
        click(txtDefaultRemoteDirectory);
        return txtDefaultRemoteDirectory.isDisplayed();
    }

    public boolean setTestFolder(){
        click(btnTestFolder);
        return btnTestFolder.isDisplayed();
    }

    public boolean setAdditionalSetting(){
        click(ddlAdditionalSetting);
        return ddlAdditionalSetting.isDisplayed();
    }

    public boolean setSaveProtocol(){
        click(btnSaveProtocol);
        return btnSaveProtocol.isDisplayed();
    }

/*****************************************************************************************************************************************************************************/
   //
    public boolean setDataViewTab() throws InterruptedException {
        Thread.sleep(5000);
        click(tabDataViewInImport);
        System.out.println(tabDataViewInImport.getText());
        return tableDataViewDisplay.isDisplayed();
    }

    public String getRecordCountOfDataView(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//app-import-tabs//tabset//ul//li[5]//a")));
        String countData=recordCountOfDataViewTable.getText();
        System.out.println(countData);
        return countData;
    }
/* Browse the record by click the arrow button at bottom of table in data view */

    // Browse next page of record one by one
    public boolean browseNextRecordPages(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main-scroll']//tab[5]//kendo-grid//kendo-pager//kendo-pager-next-buttons//a[1]")));
        for (int i=1;i<6;i++) {
            click(lnkBrowseNextRecordPageDataView);
        }
        return lnkBrowseNextRecordPageDataView.isDisplayed();
    }

    // Browse previous page of record one by one
    public boolean browsePreviousRecordPages(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main-scroll']//tab[5]//kendo-grid//kendo-pager//kendo-pager-prev-buttons//a[2]")));
        for (int i=6;i>3;i--) {
            click(lnkBrowsePreviousRecordPageDataView);
                   }
        return lnkBrowsePreviousRecordPageDataView.isDisplayed();
    }

    // Browse next page of record one by one
    public boolean browseNextLastRecordPages(){
        click(lnkBrowseNextLastPageDataViewTable);
        return lnkBrowseNextLastPageDataViewTable.isDisplayed();
    }

    // Browse previous page of record one by one
    public boolean browsePreviousFirstRecordPages(){
        click(lnkBrowsePreviousRecordFirstPageDataView);
        return lnkBrowsePreviousRecordFirstPageDataView.isDisplayed();
    }


    public boolean setRecordClickFromTable() throws InterruptedException {
        Thread.sleep(5000);
        click(chkboxFromTheTable);
        click(chkboxFromTheTableSecondValue);
        return chkboxFromTheTable.isSelected();
    }

    public boolean setActionButtonClicked() throws InterruptedException {
        Thread.sleep(5000);
        click(btnActionisClicked);
        return btnActionisClicked.isDisplayed();
    }

    public boolean setDeleteButtonClicked() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main-scroll']//app-import-dataview//div/ng-select//select-dropdown//div//div//ul//li")));
        click(liDelete);
        return headerDeletePage.isDisplayed();
    }

    public boolean setYesButtonclicked() throws InterruptedException {
        Thread.sleep(5000);
        click(btnYesToDelete);
        return tableDataViewDisplay.isDisplayed();
    }

    /****************************************************************************************************************************************************************************/

    // Click on Tab Log for check the status file is uploaded and set the log for particular user
    public boolean setLogTab() throws InterruptedException {
        Thread.sleep(4000);
      //  wait.until(ExpectedConditions.elementToBeClickable(tabLog));
        System.out.println(tabLog.getText());

        click(tabLog);
        return tabLog.isDisplayed();
    }

    //Check the visibility of element is visible of log tab
    public boolean getLogTableVisible(){
        System.out.println("Following are Log Table Column Headers:\n"+grdTableOfLogTabDisplayed.getText());
        return grdTableOfLogTabDisplayed.isDisplayed();

    }

    //Check the visibility of element is visible of log tab
    public boolean getLabelSendLogReportVisible(){
        return lblSendLogReport.isDisplayed();

    }

    // List of file imported in log table record status check
    public List<String> getStatusOfUploadedFile(){
        List<String> status=new ArrayList<>();
        for (WebElement element:tdStatusOfUploadedFile){
            status.add(element.getText().trim());
        }
        System.out.println("Check the Database Status Sucess/Failed/Warning:\n"+status);
        return status;

    }

    // Click on send log report txt box for open drop down list
    public boolean  setSendLogReportTextBoxClicked(){
        click(txtSendLogReport);
        return txtSendLogReport.isDisplayed();
    }

    public boolean  setSendLogReportTextBoxClicked1(){
        click(txtSendLogReport1);
        return txtSendLogReport1.isDisplayed();
    }



   // get the List of log reciver drop down in log tab
    public List<String> setSendLogReportDropDown(){
        List<String> receiverList = new ArrayList<>();
        for (WebElement element : ddlLogReceiverList) {
            receiverList.add(element.getText().trim());
        }
        System.out.println("Get the List of Log Receiver in Log Tab:\n"+receiverList);
        return receiverList;
    }

    // Send search key in search area of log user search
    public boolean setSearchValueInSearchArea() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='input-group']//input")));
        writeText(txtSearchAreaOfLogList, "Vai");
        String username = txtSearchAreaOfLogList.getText();
        return txtSearchAreaOfLogList.isDisplayed();

    }
    public boolean setSearchValueInSearchArea1() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='input-group']//input")));
        clear(txtSearchAreaOfLogList);
        writeText(txtSearchAreaOfLogList, "See");
        String username = txtSearchAreaOfLogList.getText();
        return txtSearchAreaOfLogList.isDisplayed();

    }

    // Click on the check box to select the value
    public boolean setSearchValueInSearchAreaValue(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'Vaibhav chavan')]")));
            click(chkBoxSelectedName);
            return chkBoxSelectedName.isEnabled();
    }
    public boolean setSearchValueInSearchAreaValue1(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='seema sankpal']")));
        click(chkBoxSelectedName1);
        return chkBoxSelectedName1.isEnabled();
    }

    //Click on the add/remove user to send the log
    public boolean setSendLogReportToUser(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Add/Remove ']")));
        click(btnAddRemoveUsers);

        return tableLogVisible.isDisplayed();

    }
    public boolean setSendLogReportToUser1(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Add/Remove ']")));
        click(btnAddRemoveUsers);

        return tableLogVisible.isDisplayed();

    }

      //Click on the add/remove user to send the log
    public boolean setDownloadLogExcelFile() throws InterruptedException, ParseException, IOException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Add/Remove ']")));
       /* Date date12 = new Date();
        SimpleDateFormat formatter12 = new SimpleDateFormat("MMM dd yyyy HH:mm:ss.SSS zzz");
        String str12 = formatter12.format(date12);*/

       /* LocalDateTime localDateTime1 = LocalDateTime.now();
        DateTimeFormatter formatterr1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        ZonedDateTime dd1 = ZonedDateTime.of(localDateTime1, ZoneId.of("GMT+05:30"));
        ZonedDateTime zdt111 = ZonedDateTime.of(localDateTime1, ZoneId.systemDefault());
        System.out.println("zdt::"+zdt111.toInstant().toEpochMilli());
        System.out.println("dd::"+dd1.toInstant().toEpochMilli());
*/
        click(tdDownloadExcelFromLogTab);
        click(tdDownloadExcelFromLogTab);
        Thread.sleep(5000);
      /*  SimpleDateFormat df = new SimpleDateFormat("MMM dd yyyy HH:mm:ss.SSS zzz");
        Date date44 = df.parse(str12);
        long epoch = date44.getTime();
        System.out.println("epoch timestamp::"+epoch);
*/

        System.out.println("File is sucessfully Downloaded");


        String[] ss = System.getProperty("user.dir").split("IdeaProjects") ;
        System.out.println(ss[1]);
        List<String> adfile = new ArrayList<>();
        String comparefile1,comparefile2;
        File folder = new File(ss[0]+ "\\Downloads");
//List the files on that folder
        File[] listOfFiles = folder.listFiles();
        System.out.println("Length:"+listOfFiles.length);
        boolean found = false;
        File f = null;
        //Look for the file in the files
       int i=0;

        for (File listOfFile : listOfFiles) {
           // System.out.println(listOfFile);
            if (listOfFile.isFile()) {
                String fileName = listOfFile.getName();

               // System.out.println("File1234 " + listOfFile.getName());
                if (fileName.contains("Log_File_export_16")) {
                    f = new File(fileName);
                    System.out.println("Filename::"+f);

                    String[] filename1 =fileName.split("export_");
                    System.out.println(filename1[1]);

                    String [] filename2 = filename1[1].split(".xlsx");
                    System.out.println("time::"+filename2[0]);
                    LocalDateTime localDateTime = LocalDateTime.now();
                    DateTimeFormatter formatterr = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
                    ZonedDateTime dd = ZonedDateTime.of(localDateTime, ZoneId.of("GMT+05:30"));
                    ZonedDateTime zdt11 = ZonedDateTime.of(localDateTime, ZoneId.systemDefault());
                    System.out.println(zdt11.toInstant().toEpochMilli());
                    System.out.println(dd.toInstant().toEpochMilli());

                    long sd = zdt11.toInstant().toEpochMilli();
                    System.out.println(sd);
                    String aa =String.valueOf(sd);
                    System.out.println("aa"+aa.substring(0, 8));
                    if(filename2[0].contains(aa.substring(0, 8))) {
                        adfile.add(filename2[0]);
                        readDataFromAFile(filename2[0]);
                    }

                     System.out.println("adfile:"+adfile);

                    //Unix seconds
                    long unix_seconds = Long.parseLong(filename2[0]);
                    //convert seconds to milliseconds
                    /*Date date = new Date(unix_seconds*1000L);
                    // format of the date
                    SimpleDateFormat jdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss.mmm Z");
                    jdf.setTimeZone(TimeZone.getTimeZone("GMT+05:30"));
                    String java_date = jdf.format(date);
                    System.out.println("\n"+java_date+"\n");*/

                    Instant instant = Instant.ofEpochMilli(unix_seconds);
                    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS zzz");
                    System.out.println("Date:"+fmt.format(instant.atZone(ZoneId.of("GMT+05:30"))));



       /* Instant instant11 = Instant.parse(str12) ;
        long millisSinceEpoch = instant11.toEpochMilli() ;

        System.out.println("Lang Date11::"+millisSinceEpoch);*/

                   /* SimpleDateFormat df1 = new SimpleDateFormat("MMM dd yyyy HH:mm:ss.SSS zzz");
                    Date date441 = df1.parse(str12);
                    long epoch1 = date441.getTime();
                    System.out.println("epoch1::"+epoch1);


                    long epochTime = date44.getTime();
                    System.out.println("epochTime"+epochTime);
*/


                    found = true;
                }
            }
        }

        for(i=0;i<=adfile.size()-1;i++)
        {


          String file1 = adfile.get(i).substring(0, 8);
         // String file2 =adfile.get(i+1).substring(0, 8);

            System.out.println("file1"+file1);
          //  System.out.println("file2"+file2);

          /*if(file1){*/
           comparefile1=adfile.get(i);
          //  comparefile2=adfile.get(i+1);

             /* if(file1.contains(aa.substring(0, 8)) && file2.contains(aa.substring(0, 8)) ) {*/
                  System.out.println("Equal........................."+"\nfile1:"+comparefile1);
               //   readDataFromExcel(comparefile1, comparefile2);
                 // readDataFromAFile(comparefile1);
             // }
         /* }else{
              System.out.println("Not Equal..............................");

          }
*/
        }




        return tdDownloadExcelFromLogTab.isDisplayed();
    }

    public void readDataFromExcel(String f1,String f2) throws IOException {
        System.out.println("In comapre...........................");
        String path ,path1;
        String[] dirname = System.getProperty("user.dir").split("IdeaProjects") ;

        path=dirname[0]+"\\Downloads\\Log_File_export_"+f1+".xlsx";
        path1=dirname[0]+"\\Downloads\\Log_File_export_"+f2+".xlsx";

        System.out.println("path:"+path);
        System.out.println("path1:"+path1);



        FileInputStream fs =new FileInputStream(path);
        FileInputStream fs1 =new FileInputStream(path1);

       /* HSSFWorkbook wb = new HSSFWorkbook(fs);
        HSSFSheet sheet = wb.getSheet("data");

        HSSFRow row2 = sheet.getRow(1);
        HSSFCell cell = row2.getCell(1);
        String add = cell.getStringCellValue();

        System.out.println("cell value:"+add);
*/

       XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFWorkbook workbook1 = new XSSFWorkbook(fs1);
       // HSSFWorkbook wb1 = new HSSFWorkbook(fs1);
      //  HSSFSheet sheet1 = wb.getSheet("data");

        /*HSSFRow row21= sheet1.getRow(1);
        HSSFCell cell1 = row21.getCell(1);
        String add1 = cell1.getStringCellValue();

        System.out.println("cell value2:"+add1);
*/




       /* Workbook wb1 = WorkbookFactory.create(fs);
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFWorkbook workbook1 = new XSSFWorkbook();
*/
        XSSFSheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);

        System.out.println("bbbbbbbbbbbbbbbb"+sheet.getRow(1).getCell(0));
        System.out.println("bbbbbbbbbbbbbbbb"+sheet.getRow(1).getCell(1));
        System.out.println("bbbbbbbbbbbbbbbb"+sheet.getRow(1).getCell(2));
        System.out.println("bbbbbbbbbbbbbbbb"+sheet.getRow(1).getCell(3));
        System.out.println("bbbbbbbbbbbbbbbb"+sheet.getRow(1).getCell(4));
        System.out.println("bbbbbbbbbbbbbbbb"+sheet.getRow(1).getCell(5));
        System.out.println("bbbbbbbbbbbbbbbb"+sheet.getRow(1).getCell(6));
        System.out.println("bbbbbbbbbbbbbbbb"+sheet.getRow(1).getCell(7));
        System.out.println("bbbbbbbbbbbbbbbb"+sheet.getRow(1).getCell(8));

        XSSFSheet sheet1 = workbook.getSheet("data");
        Row row1 = sheet1.getRow(0);
        Cell cell1 = row1.getCell(0);
        System.out.println("aaaaaaaaaaa"+sheet1.getRow(1).getCell(0));
        System.out.println("aaaaaaaaaaa"+sheet1.getRow(1).getCell(1));
        System.out.println("aaaaaaaaaaa"+sheet1.getRow(1).getCell(2));
        System.out.println("aaaaaaaaaaa"+sheet1.getRow(1).getCell(3));
        System.out.println("aaaaaaaaaaa"+sheet1.getRow(1).getCell(4));
        System.out.println("aaaaaaaaaaa"+sheet1.getRow(1).getCell(5));
        System.out.println("aaaaaaaaaaa"+sheet1.getRow(1).getCell(6));
        System.out.println("aaaaaaaaaaa"+sheet1.getRow(1).getCell(7));
        System.out.println("aaaaaaaaaaa"+sheet1.getRow(1).getCell(8));


    }
    public void readDataFromAFile(String file) throws IOException, ParseException {
        globalArray =new ArrayList<>();
        String path ,path1;
        String[] dirname = System.getProperty("user.dir").split("IdeaProjects") ;
        List<String> getData = liLogFileContent();

        path=dirname[0]+"\\Downloads\\Log_File_export_"+file+".xlsx";

        FileInputStream fs =new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);

        String cell1 = String.valueOf(sheet.getRow(1).getCell(0));
        String cell2 = String.valueOf(sheet.getRow(1).getCell(1));
        String cell3 = String.valueOf(sheet.getRow(1).getCell(2));
        String cell4 = String.valueOf(sheet.getRow(1).getCell(3));
        String cell5 = String.valueOf(sheet.getRow(1).getCell(4));
        String cell6 = String.valueOf(sheet.getRow(1).getCell(5));
        String cell7 = String.valueOf(sheet.getRow(1).getCell(6));
        String cell8 = String.valueOf(sheet.getRow(1).getCell(7));
        String cell9 = String.valueOf(sheet.getRow(1).getCell(8));

        globalArray.add(cell1);
        globalArray.add(cell6);
        globalArray.add(cell2);
       globalArray.add(cell3);
       // globalArray.add(cell4);
       // globalArray.add(cell5);

        //globalArray.add(cell7);
        globalArray.add(cell8);
        globalArray.add(cell9);

System.out.println("getData:"+getData.get(0));
        System.out.println("getData:"+getData.get(1));
        System.out.println("getData:"+getData.get(2));
        System.out.println("getData:"+getData.get(3));


        if(cell1.equals(getData.get(0)) && cell2.equals(getData.get(1)) && cell3.equals(getData.get(2)) && cell4.equals(getData.get(3)) && cell5.equals(getData.get(4)) && cell6.equals(getData.get(5)))
        {
            System.out.println("Test pass..................");
        }
        System.out.println("cccc:"+sheet.getRow(1).getCell(0));
        System.out.println("cccc:"+sheet.getRow(1).getCell(1));
        System.out.println("cccc:"+sheet.getRow(1).getCell(2));
        System.out.println("cccc:"+sheet.getRow(1).getCell(3));
        System.out.println("cccc:"+sheet.getRow(1).getCell(4));
        System.out.println("cccc:"+sheet.getRow(1).getCell(5));
        System.out.println("cccc:"+sheet.getRow(1).getCell(6));
        System.out.println("cccc:"+sheet.getRow(1).getCell(7));
        System.out.println("cccc:"+sheet.getRow(1).getCell(8));

    }

    public List<String> liLogFileContent() throws ParseException {
        System.out.println("List of Widgets in Import Menu(Old/New) :\n");
       //SimpleDateFormat df1 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
        List<String> projectGridsforLog = new ArrayList<>();
        projectGridsforLog.add(tdName.getText());


        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date dat =sdf.parse(tdDateAndTime.getText());
        System.out.println(dat);

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

        System.out.println(sdf1.format(sdf.parse(tdDateAndTime.getText())));
         projectGridsforLog.add(sdf1.format(sdf.parse(tdDateAndTime.getText())));
       // projectGridsforLog.add(tdStatus.getText());
        System.out.println(Float.valueOf(tdTotalNumberOfRecords.getText()));
        projectGridsforLog.add(Float.toString(Float.valueOf(tdSuccessRecords.getText())));
        projectGridsforLog.add(Float.toString(Float.valueOf(tdTotalNumberOfRecords.getText())));
        projectGridsforLog.add(tdImportType.getText());
        projectGridsforLog.add(tdUserStamp.getText());

        return projectGridsforLog;
    }

    public boolean clickOnNotification(){
        eWait(notificationTab);
        click(notificationTab);

        /*eWait(notificationDetails);
        click(notificationDetails);
        System.out.println("Text:"+notificationDetails.getText() + notificationDetails1.getText());*/
        return  notificationTab.isDisplayed();
    }

    public String getNotificationDetails() throws InterruptedException {
       // eWait(notificationDetails);
       // click(notificationDetails);
        Thread.sleep(3000);
        System.out.println("Text:"+notificationDetails.getText() + notificationDetails1.getText());
        String str=notificationDetails.getText()+" " + notificationDetails1.getText();
        System.out.println(str);
        return str;
    }

}


