import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class DatabasePage extends BasePage {
    public DatabasePage(WebDriver driver) {
        super(driver);
    }

    /* This Section for click databse menu amd edit the widget in that
     *  When click on database menu the About,data view,import sources,defination,rules,logging tabs are display
     *  */
    // Click action perform to click on database Menu from data Garden
    @FindBy(xpath = "//span[text()='Database']")
    public WebElement databaseMenu;

    // Open project grid and list of project created on import submenu
    @FindBy(xpath = "//div[@class='gridster-content']//gridster//gridster-item//div[1]//app-header-name//div[1]//span")
    public List<WebElement> projectsNameGrids;

    // Edit Database Project from the list.
    @FindBy(xpath = "//app-data-project-widget-content//button")
    public WebElement btnEditDatabase;

    // This shows all tabs are visible when click on edit button of project
    @FindBy(xpath = "//*[@id='main-scroll']//app-parent-data-garden//div//div//tabset//ul//li//a")
    public List<WebElement> liDatabaseTab;
    /*********************************************************************************************************************************/
/* This section check when user click on edit button the about tab is already enabled and display the Name,Main type,
subtype,discription of the database we are imported*/

    // In database About tab is open in that  Name,Main type,subtype,discription is visible

    // List of element display in tha about us tab
    @FindBy(xpath = "//*[@id='main-scroll']//app-loader-component//div//div[2]//div[1]//div//div")
    public WebElement elementListAboutTab;

    // Import the source From Import Uploaded
    @FindBy(xpath = "//a[text()=' Import Sources ']")
    public WebElement lnkImportSource;

    // Click link for adding the Source File form External Source
    @FindBy(xpath = "//app-project-importsources/app-loader-component/div/div[2]/div[1]/div/div/a")
    public WebElement lnkFileSelectPlusSign;

    // Add source page is display to select the source file
    @FindBy(xpath = "//app-add-project-source//div//div//div//div[1]//h4")
    public WebElement headerWindowPageName;

    // Select source from Drop Down List
    @FindBy(xpath = "//app-project-importsources//app-add-project-source//div[2]//div[2]//ng-select//div")
    public WebElement ddlForSelectSource;

    // Select the dropdown list of database element
    @FindBy(xpath = "//app-add-project-source//div[2]//div[2]//ng-select//div//ul//li//span")
    public List<WebElement> liDatabaseElement;

    // Cliick on Input the file name one Data Source item
    @FindBy(xpath = "//div[@class='options']//ul//li[1]")
    public WebElement linkAreaDataSourceName;

    @FindBy(xpath = "//div[@class='modal-body']//div[2]//ng-select//div//div//div")
    public WebElement liSelectedItem;

    // Adding the Source file in to File Source
    @FindBy(xpath = "//button[text()='Add ']")
    public WebElement btnAdd;

    // If user want to add another import file then click on the add source link
    @FindBy(xpath = "//div[@class='col-md-2 add-circle cursor']")
    public WebElement btnAddSource;

    // Click on the text box to extract the list of data source element dropdown
    @FindBy(xpath = "//ng-select[@name='SourceId']")
    public WebElement txtSourceFileDropDown;

    // Get the list of database import file available in dropdown
    @FindBy(xpath = "//div[@class='options']//ul//li")
    public List<WebElement> liImportDropDownListMenu;

    // Click the value you want to select
    @FindBy(xpath = "//div[@class='options']//ul//li[2]")
    public WebElement liSelectedImportSource;

    // Check the database file selected and its visible text box
    @FindBy(xpath = "//div[@class='modal-body']//div[2]//div//div//div")
    private WebElement txtCantainSelectedValue;

    // If text contain value the click on add otherwise cancel
    @FindBy(xpath = "//div[@class='modal-footer']//button[2]")
    public WebElement btnAddImportSource;

    // If text contain value the click on add otherwise cancel
    @FindBy(xpath = "//div[@class='modal-footer']//button[1]")
    public WebElement btnCancelImportSource;


    // Imported source id display file name
    @FindBy(xpath = "//div[@class='import-sources']//tabset//ul//li//a")
    public WebElement liFileName;

    // To click Definition Tab to Creating the field of Database in Definition Tab
    @FindBy(xpath = "//a[text()=' Definitions ']")
    public WebElement lnkDefinitionTab;

    // Create Field available in database table for mapping
    @FindBy(xpath = "//span[text()='Add column definition']")
    public WebElement addColumnDefinition;

    // Write Header name is equals to corresponding database field
    @FindBy(id = "headerName")
    public WebElement headerName;

    // Add Field on Click on Add button
    @FindBy(xpath = "//form//div[3]//button[2]")
    public WebElement btnAddField;

    // It is used to select the Main type of header field
    @FindBy(xpath = "//div[text()=' Select type ']")
    public WebElement ddlMainType;

    // Select Data as a sub type
    @FindBy(xpath = "//li[text()=' Data ']")
    public WebElement ddlDataMainType;

    // Select the Sub type of data field
    @FindBy(xpath = "//div[text()=' Select subtype ']")
    public WebElement ddlSubType;

    // Select the Data type
    @FindBy(xpath = "//*[@id='subType']/select-dropdown/div/div[2]/ul/li[1]")
    public WebElement ddlSubtypeDataType;

    // Select field for Mapping the Column fiels with database
    @FindBy(xpath = "//div[@id='left']//div//div")
    public WebElement dragFieldSr_No;

    @FindBy(xpath = "//*[@id='main-scroll']//app-loader-component//div//div[2]//div[1]//div[2]//div[6]")
    public WebElement dropFieldSr_No;

    // Select Field Second Filed for Mapping
    @FindBy(xpath = "//app-loader-component[1]//div[1]//div[2]/div[2]")
    public WebElement dragFieldName;

    @FindBy(xpath = "//*[@id='main-scroll']//tabset//app-loader-component//div//div[2]//div[1]//div[2]//div[7]")
    public WebElement dropFieldName;

    @FindBy(xpath = "//app-loader-component[1]/div[1]//tab[1]//app-loader-component[1]/div[1]//div[2]//div[3]")
    public WebElement dragFieldSurname;

    @FindBy(xpath = "//*[@id='main-scroll']//tabset//app-loader-component//div//div[2]//div[1]//div[2]//div[38]")
    public WebElement dropFieldSurname;

    @FindBy(xpath = "//app-loader-component[1]//app-loader-component[1]//div[1]//div[2]//div[4]")
    public WebElement dragFieldEmail;

    @FindBy(xpath = "//*[@id='main-scroll']//tabset//app-loader-component//div//div[2]//div[1]//div[2]//div[27]")
    public WebElement dropFieldEmail;

    @FindBy(xpath = "//app-loader-component[1]//div[1]//div[2]//div[1]//div[1]//div[2]/div[5]")
    public WebElement dragFieldContact;

    @FindBy(xpath = "//*[@id='main-scroll']//tabset//app-loader-component//div//div[2]//div[1]//div[2]//div[8]")
    public WebElement dropFieldContact;

    /***********************************************************************************************************************************
     * *********************************************************************************************************************************/

    // Click on tab Data View in database submenu
    @FindBy(xpath = "//*[@id='main-scroll']//app-parent-data-garden//app-project-tabs//div//tabset//ul//li[2]")
    private WebElement liDataViewDisplay;

    // Check the table is visible after click on data view tab
    @FindBy(xpath = "//div[@class='table-wrapper']//kendo-grid//table")
    public WebElement tableDataView;

    // To Select the checkbox from the list of records
    @FindBy(id = "k-grid0-checkbox0")
    public WebElement gridCheckBox;

    // Click on the action button of the data view tab
    @FindBy(xpath = "//div[text()=' Actions ']//parent::div")
    public WebElement btnActionsDataView;

    // List of actions element explore by clicking on actions button in data view
    @FindBy(xpath ="//div[@class='options']//ul//li")
    private List<WebElement> ddActionOptionsElement;

    // Click on the drop down list first option that change status
    @FindBy(xpath = "//div[@class='options']//ul//li[1]")
    private WebElement liChangeStatus;

    // Select option(radio) button popup page is open for change status
    @FindBy(xpath = "//*[@id='selectAllModal']//div//div//form//div[1]//h4")
    private  WebElement formSelectOption;


    /***********************************************************************************************************************************
     * *********************************************************************************************************************************/
    // Click on tab Rules in database submenu
    @FindBy(xpath = "//*[@id='main-scroll']//app-parent-data-garden//app-project-tabs//div//tabset//ul//li[5]")
    public WebElement tabRulesDatabase;



    /***********************************************************************************************************************************
     * *********************************************************************************************************************************/
    // Click on tab Logging in database submenu
    // Click on tab Rules in database submenu
    @FindBy(xpath = "//*[@id='main-scroll']//app-parent-data-garden//app-project-tabs//div//tabset//ul//li[6]")
    public WebElement tabLoggingDatabase;



    /***********************************************************************************************************************************/
/* This section check when user click on edit button the about tab is already enabled and display the Name,Main type,
subtype,discription of the database we are imported*/

    // Create Database field

    // Declaration of Method for the operations on database Menu from DataGarden.
    public List<String> setDatabaseMenu() throws InterruptedException {
        Thread.sleep(3000);
        click(databaseMenu);
        Thread.sleep(4000);
        List<String> projectGrids = new ArrayList<>();
        for (WebElement element : projectsNameGrids) {
            projectGrids.add(element.getText().trim());
        }
        return projectGrids;
    }

    // Click on the Edit Database Button
    public List<String> setBtnEditDatabase() throws InterruptedException {
        Thread.sleep(3000);
        click(btnEditDatabase);
        Thread.sleep(4000);
        List<String> tabList = new ArrayList<>();
        for (WebElement element : liDatabaseTab) {
            tabList.add(element.getText().trim());
        }
        return tabList;
    }

    /*********************************************************************************************************************************/
/* This section check when user click on edit button the about tab is already enabled and display the Name,Main type,
subtype,discription of the database we are imported*/

    // In database About tab is open in that  Name,Main type,subtype,discription is visible
    public boolean getListItemIsVisible() {
        iWait();
        System.out.println(elementListAboutTab.getText());
        return elementListAboutTab.isDisplayed();
    }


    /*********************************************************************************************************************************/
    /* This functionality related to the Import Database from the available set of databases tab */
    public boolean setLnkImportSource() throws InterruptedException {
        Thread.sleep(5000);
        click(lnkImportSource);
        System.out.println(lnkImportSource.getText());
        return lnkImportSource.isDisplayed();
    }


    // Click on the plus Sign link to Add New Source File
    public boolean setLnkFileSelectPlusSign() {
        iWait();
        click(lnkFileSelectPlusSign);
        System.out.println(lnkFileSelectPlusSign.getText());
        return lnkFileSelectPlusSign.isDisplayed();
    }

    // Pop window display to the user to select the source file
    public String getPopPageIsVisible() throws InterruptedException {
        Thread.sleep(2000);
        String pageName = headerWindowPageName.getText();
        System.out.println(pageName);
        return pageName;

    }

    // Select the Value from the dropdown list
    public List<String> setDdlForSelectSource() {
        iWait();
        click(ddlForSelectSource);
        List<String> elementDatabaseList = new ArrayList<>();
        for (WebElement element : liDatabaseElement) {
            elementDatabaseList.add(element.getText().trim());
        }
        System.out.println(elementDatabaseList);
        return elementDatabaseList;

    }

    // Enter the name you use the data Source for mapping
    public boolean getTextAreaDataSourceName() throws InterruptedException {
        Thread.sleep(3000);
        click(linkAreaDataSourceName);
        System.out.println(liSelectedItem.getText());
        return liSelectedItem.isDisplayed();
    }

    // Add File Source in the Source Area
    public boolean setButtonAddIsVisible() {
        return btnAdd.isDisplayed();
    }

    public boolean setAddButtonClick() {
        click(btnAdd);
        System.out.println(liFileName.getText());
        return liFileName.isDisplayed();
    }

    // Click on the link display add source on the top of the source file name
    public boolean addSourceClickToAddOtherDatabaseSource() {
        click(btnAddSource);
        return btnAddSource.isDisplayed();
    }

    // Click on text field to select source from the extract list of source Item
    public boolean sourceFileNameSearchFieldClick() {
        click(txtSourceFileDropDown);
        return txtSourceFileDropDown.isDisplayed();
    }

    // Select list of Item in drop down
    public List<String> listOfDatabaseElement() {
        List<String> databaseItem = new ArrayList<>();
        for (WebElement element : liImportDropDownListMenu) {
            databaseItem.add(element.getText().trim());
        }
        System.out.println(databaseItem);
        return databaseItem;
    }


    // Click on the selected new import source file
    public boolean setSelectedImportNewSource() {
        click(liSelectedImportSource);
        return txtCantainSelectedValue.isDisplayed();
    }

    // Click on add or cancel button for Importing file
    public boolean setNewImportAddOrCancel() {
        System.out.println(txtCantainSelectedValue.getText().trim());
        if (txtCantainSelectedValue.getText().equals("MB_Import_Users")){
            click(btnAddImportSource);
        } else {
            click(btnCancelImportSource);
        }
        return btnAddSource.isDisplayed();

    }

/*********************************************************************************************************************************/
/* This section click on the definition tab and add the column header and its type and check weather the same header available or not */


    // Click on the definition tab
    public boolean setLnkDefinitionTab() {
        click(lnkDefinitionTab);
        return lnkDefinitionTab.isDisplayed();
    }



    // Click on the Add column Definition Link
    public boolean setAddColumnDefinitionIsVisible(WebElement headerName,String value) throws InterruptedException {
            Thread.sleep(2000);
            click(addColumnDefinition);
            Thread.sleep(2000);
            writeText(headerName,value);
            Thread.sleep(2000);
            click(btnAddField);
            return btnAddField.isDisplayed();
        }

    // Function Perform the operation for Drag Field And Drop on Same Field
    public void SetMappingFieldwithDataSrNo(WebElement dragFieldSr_No,WebElement dropFieldSr_No) throws InterruptedException {
        Thread.sleep(5000);
        setDragAndDrop(dragFieldSr_No,dropFieldSr_No);
    }
    public void SetMappingFieldwithDataName(WebElement dragFieldName,WebElement dropFieldName) throws InterruptedException {
        Thread.sleep(5000);
        setDragAndDrop(dragFieldName,dropFieldName);
    }
    public void SetMappingFieldwithDataSurname(WebElement dragFieldSurname,WebElement dropFieldSurname) throws InterruptedException {
        Thread.sleep(5000);
        setDragAndDrop(dragFieldSurname,dropFieldSurname);
    }
    public void SetMappingFieldwithDataEmail(WebElement dragFieldEmail,WebElement dropFieldEmail) throws InterruptedException {
        Thread.sleep(5000);
        setDragAndDrop(dragFieldEmail,dropFieldEmail);
    }
    public void SetMappingFieldwithDataContact(WebElement dragFieldContact,WebElement dropFieldContact) throws InterruptedException {
        Thread.sleep(5000);
        setDragAndDrop(dragFieldContact,dropFieldContact);
    }

    /***********************************************************************************************************************************
     * *********************************************************************************************************************************/
    // Check the visibility of tab Data View in database submenu
    public boolean setDataViewIsVisible() throws InterruptedException {
        return liDataViewDisplay.isDisplayed();
    }

    // Click on the Data View Tab
    public boolean setDataViewIsClickable(){
        click(liDataViewDisplay);
        System.out.println(liDataViewDisplay.getText().trim());
        return tableDataView.isDisplayed();
    }

    // Click on the check box from the list of record in data view table
    public boolean setDataGridValueClikable() throws InterruptedException {
        click(gridCheckBox);
        System.out.println(gridCheckBox.getText().trim());
        return gridCheckBox.isSelected();
    }

    // Click on the action button of the data view tab
    public boolean setActionsDataViewTable(){
        click(btnActionsDataView);
        System.out.println(btnActionsDataView.getText().trim());
        return btnActionsDataView.isDisplayed();
    }

    // Get the list of options are explore after click on actions button
    public List<String> getActionOptionDropDown(){
        List<String> actionOptions=new ArrayList<>();
        for (WebElement element:ddActionOptionsElement){
            actionOptions.add(element.getText().trim());
        }
        System.out.println(actionOptions);
        return actionOptions;
    }

    // Click on the drop down list first option that change status
    public boolean setChangeStatusClickable(){
        click(liChangeStatus);
        System.out.println(liChangeStatus.getText().trim());
        System.out.println(formSelectOption.getText());
        return formSelectOption.isDisplayed();
    }

    /***********************************************************************************************************************************
     * *********************************************************************************************************************************/

    // Check the visibility of tab Rules in database submenu
    public boolean setRulesTabVisible(){
        return tabRulesDatabase.isDisplayed();
    }

    // Click on the Data View Tab
    public boolean setRulesIsClickable(){
        click(tabRulesDatabase);
        System.out.println(tabRulesDatabase.getText().trim());
        return tabRulesDatabase.isDisplayed();
    }


    /***********************************************************************************************************************************
     * *********************************************************************************************************************************/
    // Check the visibility of tab Logging in database submenu
    public boolean setLoggingDatabaseIsVisible()  {
        return tabLoggingDatabase.isDisplayed();
    }

    // Click on the Data View Tab
    public boolean setLoggingDatabaseIsClickable() {
        click(tabLoggingDatabase);
        System.out.println(tabLoggingDatabase.getText().trim());
        return tabLoggingDatabase.isDisplayed();

    }

}







