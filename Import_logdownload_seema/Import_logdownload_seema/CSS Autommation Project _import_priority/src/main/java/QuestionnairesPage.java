import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class QuestionnairesPage extends BasePage {
    WebDriverWait wait=new WebDriverWait(driver,90);

    public QuestionnairesPage(WebDriver driver) {
        super(driver);
    }

    //Click on DataCollection Menu
    @FindBy(xpath = "//span[text()='Data collection']")
    public WebElement dataCollection;

    // List of Menu of Data Collection is explorer
    @FindBy(xpath = "//div[@class='sub-items collapse in show']//ul//li")
    public List<WebElement> listItemsDataCollection;

    //Click on Customer Feedback Submenu
    @FindBy(xpath = "//span[text()='Customer feedback']")
    public WebElement customerFeedback;

    //List of widgets are display
    @FindBy(xpath = "//div[@class='gridster-content']//gridster//gridster-item//div[1]//app-header-name//div[1]//span")
    public List<WebElement> gridsterItem;

    // Click on the Add Project to Create new Project
    @FindBy(xpath = "//button[1][@class='btn btn-fill btn-gold m-r-5']//i")
    public WebElement addProject;

    // Click on Custom Project div tag
    @FindBy(xpath = "//div[@class='content-box'][2]")
    public WebElement customProject;

    // Enter the name of project in text field
    @FindBy(id = "name")
    public WebElement getAddProject;

    //Click on Add button to create project
    @FindBy(xpath = "//button[text()='Add ']")
    public WebElement clickAddButton;

    //Click on Add button to create project New Project
    @FindBy(xpath = "//div[@class='gridster-content']//gridster[1]//gridster-item[1]//div[1]//app-header-name//div[1]//span")
    public WebElement newProjectWidgetTitle;

    //Click on the toggle button to Activate Project
    @FindBy(xpath = "//gridster//gridster-item[1]//app-widget[1]//bswitch[1]/div[1]//div[1]//span[2]")
    public WebElement clickToggleButton;

    // Click on Questionnaires button
    @FindBy(xpath = "//button[text()=' Questionnaire']")
    public WebElement questionButton;

    // path of click on start page of Questionnaires
    @FindBy(xpath = "//perfect-scrollbar[1]//app-loader-component[1]//app-page-list[1]//div[1]")
    public WebElement startPage;

    // Write the Welcome message on start page
    @FindBy(xpath = "//*[@id='ngxEditor']/div/div")
    public WebElement txtArea;

    // Make text position on center of the page
    @FindBy(xpath = "//button[@title='Justify Center']")
    public WebElement textCenter;

    // Navigate quetion type from list of page type
    @FindBy(xpath = "//app-question-type[1]/section[1]//div[1]//a[2]//i[1]")
    public WebElement btnSearchQuestionType;

    // Select single quetion type from the list of quetion type
    @FindBy(xpath = "//app-question-type[1]/section[1]//div[1]/button[1]")
    public WebElement btnSelectSingleQuestionType;

    // Select Multi Response Quetion Type
    @FindBy(xpath = "//*[@id='Carousel']/div/div[2]/div/div[2]/div/button")
    public WebElement btnMultiResponseQT;

    // Select X Ponit Question type
    @FindBy(xpath = "//*[@id='Carousel']/div/div[3]/div/div[2]/div/button")
    public WebElement btnXPointQT;

    // Select text area in the x Point page min Grade set
    @FindBy(id = "pagepage7_minScaleLabel")
    public WebElement txtXPointMinGradeText;

    // Select text area of X point page max grade set
    @FindBy(id = "pagepage7_maxScaleLabel")
    public WebElement txtXPointMaxGradeText;

    // Select the comment box question type from the list of Questionnaire
    @FindBy(xpath = "//*[@id='Carousel']/div/div[4]/div/div[2]/div/button")
    public WebElement btnCommentBox;

    // Select the page Media And Recording by clicking Select button
    @FindBy(xpath = "//*[@id='Carousel']/div/div[5]/div/div[2]/div/button")
    public WebElement btnMediaAndRecording;

    // Select the options from the list of options in media and recording oprtions
    @FindBy(xpath = "//div[@id='[object Object]']//div[2]//div//div")
    public WebElement chkMediaAndRecording;

    // Select the Single Respose matrix page type from all list item of page type
    @FindBy(xpath = "//*[@id='myModal']//div//app-sub-page//aside//ul//li[2]")
    public WebElement liMatrixPageType;

    // button for select the single response matrix button
    @FindBy(xpath = "//*[@id='Carousel']/div/div[1]/div/div[2]/div/button")
    public WebElement btnSingleResponseMatrix;

    // Adding multiple sub questions by clicking on plus sign on single response matrix
    @FindBy(xpath = "//*[@id='[object Object]']//app-matrix-question-page//div//div//div//aside/div[2]")
    public WebElement btnplusSignToAddSubQuestions;

    // Write sub question of the text field in single matrix question
    @FindBy(xpath = "//div[@dragula='MATRIX_FORM_QUESTIONS']//div")
    public WebElement txtSubQuestionInSRM;


    // Click on the Matrix Type page from All types

    // Select page Multi Response Matrix by clicking on select button
    @FindBy(xpath = "//*[@id='Carousel']//div[2]//div[2]//div//button")
    public WebElement btnMultiResponseMatrix;

    // Path for input form type question from all type list
    @FindBy(xpath = "//*[@id='myModal']//app-sub-page//aside//ul//li[3]")
    public WebElement liInputFrom;

    // click on the select button to select input page type
    @FindBy(xpath = "//*[@id='Carousel']//div//div//div//div[2]//div//button")
    public WebElement btnselectInputPage;

    // Click on the root Cause type from the all types of questionnaire List
    @FindBy(xpath = "//*[@id='myModal']//div[2]//div//app-sub-page//aside//ul//li[4]//div")
    public WebElement liRootCause;

    // Click on select button of Root Cause
    @FindBy(xpath = "//*[@id='Carousel']//div//div[2]//div//button")
    public WebElement btnSelectRootCause;


    // Click on KPI type of Questions from all types
    @FindBy(xpath = "//*[@id='myModal']//div[2]//div//aside//ul//li[5]")
    public WebElement liKPIQuestion;

    // Click on Select Button of NPSQuestion type
    @FindBy(xpath = "//*[@id='Carousel']//div//div[1]//div//div[2]//div//button")
    public WebElement btnNPSQuestionType;

    // Select text area in the NPS min Grade set
    @FindBy(xpath = "//div[@class='col-md-3 padding-top-5']//div[1]//div")
    public WebElement txtMinGradeKPI;

    // Select text area of NPS max grade set
    @FindBy(xpath = "//div[@class='col-md-3 pull-right padding-top-5']//div[1]//div")
    public WebElement txtMaxGradeKPI;


    // Click on Select Button of CESQuestion type
    @FindBy(xpath = "//*[@id='Carousel']//div[2]//div[2]//div//button")
    public WebElement btnCESQuestionType;

    // Navigation button for search KPI question type from the list of questionnaire
    @FindBy(xpath = "//*[@id='Carousel']/a[2]/i")
    public WebElement btnNavigateKPIPage;


    // Click select button to select the CSAT type question page
    @FindBy(xpath = "//*[@id='Carousel']//div[3]//div[2]//div//button")
    public WebElement btnSelectCSATPage;

    // Click select button to add EPS type page
    @FindBy(xpath = "//*[@id='Carousel']//div[4]//div[2]//div//button")
    public WebElement btnSelectEPSPage;


    // Click on Check List page type from the list of question page type
    @FindBy(xpath = "//*[@id='myModal']//div[2]//app-sub-page//aside//ul//li[6]//div")
    public WebElement liCheckList;


    // Click on select Check List page type from the list of question page type
    @FindBy(xpath = " //*[@id='Carousel']//div[1]//div[2]//div//button")
    public WebElement btnSelectCheckList;

    // Click on select Conditional Check List page type from the list of question page type
    @FindBy(xpath = " //*[@id='Carousel']//div[2]//div[2]//div//button")
    public WebElement btnSelectConditionalCheckList;

    // Write the quetion on question text field
    @FindBy(xpath = "//div[@data-text='Type your question here']")
    public WebElement txtWriteQuestion;

    // Write answer on the answer field
    @FindBy(id = "NaN")
    public WebElement txtAnswerText;

    // Click to add multiple text fileld in multi Response Answer
    @FindBy(xpath = "//app-single-question-layout//app-dynamic-component/div//app-single-response-answer//div//div[1]//div//div//div")
    public WebElement btnPlusSignAddTextField;

    // Select text Area of Comment Box Question type
    @FindBy(xpath = "//app-single-question-layout//app-dynamic-component//div//app-comment-answer//div//textarea")
    public WebElement txtAreaCommentBox;

    // Update page by clicking on update button
    @FindBy(xpath = "//*[@id='main-scroll']/div[1]/app-questionnaire/div/div/div/div/div/tabset/div/tab[1]/div/div[1]/div/button")
    public WebElement btnUpdatePage;

    // Web Element for Second Page Type
    @FindBy(xpath = "//app-add-new-page//div[2]//form//ul//li[2]")
    public WebElement lnkSecondPageType;

    // Adding New Page in Group Page
    @FindBy(xpath = "//app-dynamic-component/div//app-group//section//div[1]//div//div[1]//div")
    public WebElement btnAddPageInGroupPageType;


    // Click on End Page
    @FindBy(xpath = "//div[text()=' End page ']")
    public WebElement setEndPageMessage;

    // Set text in the End Page Text Area
    @FindBy(xpath = "//*[@id='ngxEditor']/div/div")
    public WebElement txtEndPageMessage;

    // Click on tab Test and Publish
    @FindBy(xpath = "//div[@class='card']//tabset//ul//li[3]//a")
    public WebElement tabClickTestPublish;

    // Click on button to Test Mode
    @FindBy(id = "button-container")
    public WebElement btnContainer;

    //Project Goes in Live section
    @FindBy(xpath = "//li[@role='menuitem']//span[3]")
    public WebElement lnkLive;

    // Click on Yes button for acceptance
    @FindBy(xpath = "//button[contains(text(),'Yes')]")
    public WebElement btnYes;

    // Write comment in text area in pop-up window after click on yes button
    @FindBy(xpath = "//app-loader-component[1]//div[1]//div[2]//div[1]//textarea[1]")
    public WebElement txtAreaComment;

    // Close comment window by clicking on close button of winndow
    @FindBy(xpath = "//*[@id='myModal']/div/div/div[1]/button/span")
    public WebElement btnCloseCommentWindow;

    // Refresh the page for create the new version for Test Project to live Project
    @FindBy(xpath = "//*[@id='myModal']/div/div/div[2]/div/div[2]/button/span[1]")
    public WebElement btnRefresh;

    // Once again click refresh page for create new version
    @FindBy(xpath = "//app-test-and-publish//app-loader-component//div/div[2]//div[1]//div[1]//button[1]")
    public WebElement btnRefreshSecond;

    // Click on the link to see the preview of page
    @FindBy(xpath = "//a[text()='Link']")
    public WebElement lnkLink;

    // Navigate the page click on progress button
    @FindBy(xpath = "//span[contains(@class,'fas fa-chevron-circle-right')]")
    public WebElement btnNavigatePreview;




    //Click on Data Collection Menu
    public boolean clickDataCollection() {
        eWait(dataCollection);
        click(dataCollection);
        return dataCollection.isDisplayed();
    }

    public List<String> getMenuListOfDataCollection() {
        List<String> dataGardenMenu = new ArrayList<>();
        for (WebElement dataGardenMenuElement : listItemsDataCollection) {
            dataGardenMenu.add(dataGardenMenuElement.getText().trim());
        }
        System.out.println("Menu Element of Data Collection : \n"+dataGardenMenu);
        return dataGardenMenu;
    }

    //Click on Customer Feedback Submenu
    public boolean clickCustomerFeedback() {
        eWait(customerFeedback);
        click(customerFeedback);
        return customerFeedback.isDisplayed();
    }

    public List<String> getListOfWidgetsInDataCollection() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='gridster-content']//gridster//gridster-item//div[1]//app-header-name//div[1]//span")));
        System.out.println("List of Widgets in Data Collection Menu(Old/New) :\n");
        List<String> projectGrids = new ArrayList<>();
        for (WebElement element : gridsterItem) {
            projectGrids.add(element.getText().trim());

        }
        System.out.println(projectGrids);
        return projectGrids;
    }

    //Click on Add Project to Create Project
    public boolean clickAddProject() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//gridster//gridster-item")));
        click(addProject);
        return addProject.isDisplayed();
    }

    //Click on Customer Project Template
    public boolean clickCustomProjectTemplate() {
        eWait(customProject);
        click(customProject);
        return getAddProject.isDisplayed();
    }

    //Write the name of project into name text field
    public String sendProjectName(String value) {
        eWait(getAddProject);
        writeText(getAddProject,value);
        System.out.println("Project Widget is : \n "+value);
        return value;
    }

    //Click button add to create Project
    public boolean clickAddButton() {
        eWait(clickAddButton);
        click(clickAddButton);
        return newProjectWidgetTitle.isDisplayed();
    }

    //Click on toggle button to Activate Project
    public boolean clickToggleButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfAllElements(gridsterItem));
        click(clickToggleButton);
        return clickToggleButton.isDisplayed();


    }

    // To Create Questionnaires by clicking on questionnaire
    public void clickOnQuestionnairesButton() throws InterruptedException {
        Thread.sleep(25000);
        click(questionButton);
    }

    // For enter the welcome click on click start page
    public void clickStartPage() {
        eWait(startPage);
        click(startPage);
    }

    // Clear text,writing value in text area on start page
    public boolean sendText(WebElement txtArea, String value) {
        iWait();
        clear(txtArea);
        iWait();
        click(textCenter);
        iWait();
        writeText(txtArea, value);
        return txtArea.isDisplayed();
    }

    // Select the questionnaires page type
    public void getPageTypeQuestionnaires() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//app-question-type[1]/section[1]//div[1]/button[1]")));
        click(btnSelectSingleQuestionType);

    }

    // Page Navigation and alert dismiss from
    public void setPageUsingNavigation() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-text='Type your question here']")));
        pageNavigation();
        iWait();
        alertDismiss();
    }

    // Clear text area  and enter the question in the text area of questionnaires
    public void setQuestionOnText(String value) {
        wait.until(ExpectedConditions.visibilityOf(txtWriteQuestion));
        clear(txtWriteQuestion);
        writeText(txtWriteQuestion,value);
    }

    // Enter the Answer for question of Questionnaires
    public void setAnswerOneText(String value) {
        wait.until(ExpectedConditions.visibilityOf(txtAnswerText));
        writeText(txtAnswerText, value);
    }

    // Create multiple answer text box in multi Response Question
    public void setAnswerFieldInMultiResponseType(){
        for (int i = 1; i < 4; i++) {
            click(btnPlusSignAddTextField);
        }
    }

    // Update page by clicking update page
    public void setBtnUpdatePage()  {
        eWait(btnUpdatePage);
        click(btnUpdatePage);

    }

    //Method for add multi Response Page
    public void setMultiResponsePage() {
        iWait();
        click(btnSearchQuestionType);
        iWait();
        click(btnMultiResponseQT);
    }

    // Method to set X point page set questionnaire page
    public void setXPointPageType() {
        for (int i = 0; i < 2; i++) {
            click(btnSearchQuestionType);
        }
        click(btnXPointQT);
    }

    // Set the text field of x point page min text and max text Grade in text field
    public void setTextFieldOfMinAndMaxGrade(String value1,String value2) {
        iWait();
        writeText(txtXPointMinGradeText, value1);
        iWait();
        writeText(txtXPointMaxGradeText, value2);
    }

    // Select the comment box page text from list of pages
    public void setCommentBoxPage() throws InterruptedException {
        Thread.sleep(2000);
        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            click(btnSearchQuestionType);
        }
        click(btnCommentBox);
    }

    // Write the comment in text area of comment box
    public void setCommentBoxMessage(String value) {
        writeText(txtAreaCommentBox, value);
    }

    // Select the Media and Recordinng Page from list of pages
    public void setMediaAndRecordingSelected() throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < 4; i++) {
            Thread.sleep(1000);
            click(btnSearchQuestionType);
        }
        click(btnMediaAndRecording);
    }

    // Unselect check box by default all check box are enable
    public void setUncheckListItem() {
        click(chkMediaAndRecording);

    }

    // Select the Single Response Matrix Page from list of pages
    public void setSingleResponseMatrixPage() {
        iWait();
        click(liMatrixPageType);
    }

    // Select Single response matrix page
    public void setSingleResponsematrixPage() {
        iWait();
        click(btnSingleResponseMatrix);
    }

    // Click on plus sign to add multiple sub questions in text field of single response matrix page
    public void setTextFieldForSubQuestions() {
        iWait();
        for (int i = 0; i < 3; i++) {
            iWait();
            click(btnplusSignToAddSubQuestions);
        }
    }

    // Set the sub question in the text field of single response matrix
    public void setQuestionsInTextField(String value) {
        writeText(txtSubQuestionInSRM,value);
    }


    // Click on the Matrix Page type from the list of page type
    public void setMultiResponseMatrix(){
        iWait();
        click(liMatrixPageType);

    }

    // Click on the Matrix Page type from the list of page type
    public void setNavigateMultiResponseMatrix(){
        iWait();
        for (int i = 0; i < 2 ; i++){
            iWait();
            click(btnNavigateKPIPage);
        }
        click(btnMultiResponseMatrix);
    }

    // Set the input form type from the list of all types.
    public void clickOnInputForm(){
        iWait();
        click(liInputFrom);
        iWait();
        click(btnselectInputPage);
    }


    // Set the Root Cause Question Types
    public void clickOnRootCauseType(){
        iWait();
        click(liRootCause);
        iWait();
        click(btnSelectRootCause);
    }

    // set the NPS question type from KPI type
    public void clickOnKPIAndNpsType(){
        iWait();
        click(liKPIQuestion);
        iWait();
        click(btnNPSQuestionType);
    }


    // Set the text field of All pages of KPI min text and max text Grade in text field of
    public void setTextFieldOfMinAndMaxGradeKPI( String value1, String value2) {
        iWait();
        writeText(txtMinGradeKPI, value1);
        iWait();
        writeText(txtMaxGradeKPI, value2);
    }


    // Set the CES Question type from the all types
    public void clickOnKPIAndCesType(){
        iWait();
        click(liKPIQuestion);
        iWait();
        for (int i = 0 ; i < 1 ; i++) {
            click(btnNavigateKPIPage);
        }
        click(btnCESQuestionType);
    }


    // Set the CSAT Question type from the all types
    public void clickOnKPIAndCSAType() throws InterruptedException {
        iWait();
        click(liKPIQuestion);
        Thread.sleep(3000);
        for (int i = 0 ; i < 2 ; i++) {
            Thread.sleep(1000);
            click(btnNavigateKPIPage);
        }
        click(btnSelectCSATPage);
    }


    // Set the CSAT Question type from the all types
    public void clickOnKPIAndEPSType() throws InterruptedException {
        iWait();
        click(liKPIQuestion);
        Thread.sleep(3000);
        for (int i = 0 ; i < 3 ; i++) {
            Thread.sleep(1000);
            click(btnNavigateKPIPage);
        }
        click(btnSelectEPSPage);
    }

    // set the Check List question type from KPI type
    public void clickOnCheckList(){
        iWait();
        click(liCheckList);
        iWait();
        click(btnSelectCheckList);
    }

    //Set the page Conditional Check list Question type page
    public void clickOnConditionalCheckList(){
        iWait();
        click(liCheckList);
        iWait();
        click(btnSelectConditionalCheckList);
    }

    //
    public void setEndPage() throws InterruptedException {
        iWait();
        click(setEndPageMessage);
    }

    //
    public void scrollingPage() {
        scrollingforQuestionnair();
    }

    //
    public void setEndPageMessage() {
        iWait();
        clear(txtEndPageMessage);
        iWait();
        writeText(txtEndPageMessage, "Thanks for Visit....!");
    }

    //
    public void scrollpageUpward(){
        iWait();
        scrollFindElemenet(tabClickTestPublish);
    }

    //
    public void setTabClickTestPublish() throws InterruptedException {
        Thread.sleep(10000);
        click(tabClickTestPublish);
    }

    //
    public void setScrollPageTestAndPublish() {
        iWait();
        scrollFindElemenet(btnContainer);
    }

    //
    public void setBtnContainer(){
        iWait();
        click(btnContainer);

    }

    //
    public void setLinkLive(){
        eWait(lnkLive);
        click(lnkLive);
    }

    //
    public void btnYesIsClickable() throws InterruptedException {
        Thread.sleep(2000);
        click(btnYes);
    }

    // Method to comment in text area in pop-up window after click on yes button
    public void setTextAreaComment() throws InterruptedException {
        Thread.sleep(2000);
        clear(txtAreaComment);
        writeText(txtAreaComment, "Project Goes Live");
    }

    // Close comment window by clicking on close button of window
    public void btnCloseComment() throws InterruptedException {
        Thread.sleep(2000);
        click(btnCloseCommentWindow);
    }


    // Refresh the page for create the new version for Test Project to live Project
    public void setBtnRefresh() throws InterruptedException {
        Thread.sleep(3000);
        click(btnRefresh);
        iWait();
        scrollPageTestAndPublishToRefresh();
        iWait();
        for (int i = 0; i < 4; i++) {
            iWait();
            click(btnRefreshSecond);
        }
    }

    public void setLinkToGoPreviewProject() throws InterruptedException {
        Thread.sleep(2000);
        click(lnkLink);
    }

    //
    public void setWindowHandleSwitchToChildWindow() throws InterruptedException {
        getWindowHandle();
    }

    public void NavigationForPreviewQuestionnaire() throws InterruptedException {
        for (int i = 0; i < 15; i++) {
        Thread.sleep(2000);
           click(btnNavigatePreview);
        }

    }
}
