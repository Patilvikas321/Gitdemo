import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import static org.testng.Assert.*;


public class QuestionnairesPageTest extends BasePageTest {
    CreateProjectInCustomerFeedbackPage customFeedbackPage;
    QuestionnairesPage questionnairesPage;
    LoginPage loginPage;
    CommonsPage commonsPage;

    // Browser Initialization
    @BeforeClass
    public void inItObject(){
        questionnairesPage = new QuestionnairesPage(getDriver());
        loginPage = new LoginPage(getDriver());
        loginPage.login(getProp().getProperty("email"), getProp().getProperty("password"));
        customFeedbackPage = new CreateProjectInCustomerFeedbackPage(getDriver());
        commonsPage = new CommonsPage(getDriver());
    }

    //Verify the field is clikable
    @Test(priority = 0, enabled = false)
    public void verifyDataGarden() {
      assertTrue(questionnairesPage.clickDataCollection());
    }

    // Verify Data Collection Menu explorer when click on Data Collection
    @Test(priority = 1)
    public void verifyDataCollectionMenu(){
        List<String> expectedMenu=new ArrayList<>();
        expectedMenu.add("Customer Feedback");
        expectedMenu.add("Business\n(Audits, Forms & Checklists)");
        expectedMenu.add("Employee Feedback");
        assertEquals(questionnairesPage.getMenuListOfDataCollection(),expectedMenu);
    }

    //Verify Customer feedback is clikable
    @Test(priority = 2)
    public void verifyCustomerFeedback() {
       assertNotSame(questionnairesPage.clickCustomerFeedback(),7);
    }

    // Verify Data Collection Menu explorer when click on Data Collection
    @Test(priority = 3)
    public void verifyDataCollectionWidgetsList(){
        List<String> expectedMenu=new ArrayList<>();
        expectedMenu.add("Customer Feedback");
        expectedMenu.add("Business");
        expectedMenu.add(" ");
        assertNotEquals(questionnairesPage.getListOfWidgetsInDataCollection(),expectedMenu);
    }

    //Verify Add Project Button is Clickable
    @Test(priority = 4)
    public void veriftyAddProject() throws InterruptedException {
        assertTrue(questionnairesPage.clickAddProject());
    }

    //Verify Customer Project Template is Selected
    @Test(priority = 5)
    public void verifySelectCutomeTemplate() {
        assertTrue(questionnairesPage.clickCustomProjectTemplate());
    }

    //Verify Project name is Entered
    @Test(priority = 6)
    public void verifySetProjectName() {
        assertEquals(questionnairesPage.sendProjectName(getProp().getProperty("widgetForCustomerFeedback")),"CSS_CYS Automation","Project Title does not Match");
    }

    //Verify Project is Created Succesfully
    @Test(priority = 7)
    public void verifyAddButton() {
        assertTrue(questionnairesPage.clickAddButton());
    }

    // Verify Data Collection Widgets project Menu explorer
    @Test(priority = 8)
    public void verifyDataCollectionNewWidgetsList(){
        List<String> expectedMenu=new ArrayList<>();
        expectedMenu.add("Customer Feedback");
        expectedMenu.add("Business");
        expectedMenu.add(" ");
        assertNotEquals(questionnairesPage.getListOfWidgetsInDataCollection(),expectedMenu);
    }

    //Verify toggle button is ON Or OFF Status
    @Test(priority = 9)
    public void verifyToggleButton() throws InterruptedException {
         assertTrue(questionnairesPage.clickToggleButton());
    }

    // Test for click on Questionnaires button
    @Test(priority = 10)
    public void Questionnaire() throws InterruptedException {
        questionnairesPage.clickOnQuestionnairesButton();
    }

    // Click on start page of Questionnaires
    @Test(priority = 8)
    public void initialPage() throws InterruptedException {
        questionnairesPage.clickStartPage();
    }

    // Enetr the text of Welcome message on start page
    @Test(priority = 9)
    public void enterText() {
        questionnairesPage.sendText(questionnairesPage.txtArea, getProp().getProperty("Message"));
    }


/* Below code for writing to add the single response page in the questionnaire. In this user can give the multiple responses
 *  for the questions are asked */


    // Add new page in the Questionnaire
    @Test(priority = 10)
    public void verifyBtnAddPage2() throws InterruptedException {
        commonsPage.setPageTypesInQuestionnaires("Single Response");
    }

    // Search question page type
    @Test(priority = 11)
    public void verifyVerityPageType(){
        questionnairesPage.getPageTypeQuestionnaires();
    }

    @Test(priority = 12)
    public void verifyRefreshPage(){
        questionnairesPage.pageNavigation();
    }

    @Test(priority = 13)
    public void verifyRefershQuestionnairePage(){
        questionnairesPage.setPageUsingNavigation();
    }

    // Set Question on text area of Qiestionnaire
    @Test(priority = 14)
    public void verifyQuestionOneText() {
        questionnairesPage.setQuestionOnText(getProp().getProperty("Q1"));
    }

    // Set Answer for the question
    @Test(priority = 15)
    public void verifyAnswerOnetext() throws InterruptedException {
        questionnairesPage.setAnswerOneText(getProp().getProperty("Ans1"));

    }
    @Test(priority = 16)
    public void verifyRefreshPageForMultipleResponse(){
        questionnairesPage.pageNavigation();
    }

    // Update page by click refresh button
    @Test(priority = 17)
    public void verifyUpdatePage() throws InterruptedException {
        questionnairesPage.setBtnUpdatePage();
    }


/* Below code for writing to add the multiple response page in the questionnaire. In this user can give the multiple responses
 *  for the questions are asked */


    //
    @Test(priority = 16)
    public void verifyMultiResponceQuetion() throws InterruptedException {
        commonsPage.setPageTypesInQuestionnaires("Multi-Response");
    }

    //
    @Test(priority = 17)
    public void verifyMultiResoncePageSelected() {
        questionnairesPage.setMultiResponsePage();
    }

    @Test(priority = 18)
    public void verifyRefershMultiResponseQuestionnairePage(){
        questionnairesPage.setPageUsingNavigation();
    }


    //
    @Test(priority = 19)
    public void verifyMultiResponseQuetionAdded() {
        questionnairesPage.setQuestionOnText(getProp().getProperty("Q2"));

    }

    @Test(priority = 20)
    public void verifyAnswerFieldCreated() {
        questionnairesPage.setAnswerFieldInMultiResponseType();
    }

    //
    @Test(priority = 21)
    public void verifyMultiResponseAnswerAdded() {
        questionnairesPage.setAnswerOneText(getProp().getProperty("Ans2"));
        questionnairesPage.setAnswerOneText(getProp().getProperty("Ans3"));
        questionnairesPage.setAnswerOneText(getProp().getProperty("Ans4"));
        questionnairesPage.setAnswerOneText(getProp().getProperty("Ans5"));
    }






/* Below code for writing to add the X -Point Question response page in the questionnaire. In this user can give the
 *  X -Point Question responses for the questions are asked */


    // Set X -Point Question in Questionnaire Page
    @Test(priority = 25)
    public void verifyXPointQuetion() throws InterruptedException {
        commonsPage.setPageTypesInQuestionnaires(" X-Point Page");
    }

    // Select the X point page type by browse and click on select button
    @Test(priority = 26)
    public void verifyxPointPageSelected() {
        questionnairesPage.setXPointPageType();
    }

    //
    @Test(priority = 27)
    public void verifyXPointQuetionText() {
        questionnairesPage.setQuestionOnText( getProp().getProperty("Q3"));

    }

    @Test(priority = 28)
    public void setXPointGradeText() {
        questionnairesPage.setTextFieldOfMinAndMaxGrade(getProp().getProperty("Mingrade"),getProp().getProperty("Maxgrade"));
    }



/* Below code for writing to add the Comment box Question response page in the questionnaire. In this user can give the
 *  Comment box Question responses for the questions are asked */


    // Set Comment box Question in Questionnaire Page
    @Test(priority = 29)
    public void verifyCommentBoxQuetion() throws InterruptedException {
        commonsPage.setPageTypesInQuestionnaires(" Comment Box");
    }

    // Select the X point page type by browse and click on select button
    @Test(priority = 30)
    public void verifySetCommentBoxPage() throws InterruptedException {
        questionnairesPage.setCommentBoxPage();
    }

    // Write question in the question text area
    @Test(priority = 31)
    public void verifyCommentBoxQuestionAdded() {
        questionnairesPage.setQuestionOnText(getProp().getProperty("Q4"));
    }


    // Write comment in the text area of comment box
    @Test(priority = 32)
    public void verifyCommentBoxTextAreaFilled() {
        questionnairesPage.setCommentBoxMessage(getProp().getProperty("Comment"));
    }



/* Below code for writing to add the media & recording Question response page in the questionnaire. In this user can give the
 *  media & recording Question responses for the questions are asked */


    // Set media & recording Question type in questionnaire
    @Test(priority = 33)
    public void verifyMediaAndRecordinngQuestion() throws InterruptedException {
        commonsPage.setPageTypesInQuestionnaires("Media Recording");
    }

    // Select the media & recording question from the list of Question type
    @Test(priority = 34)
    public void verifySetMediaAndRecording() throws InterruptedException {
        questionnairesPage.setMediaAndRecordingSelected();

    }

    // Write question in the question text area of media and recording Qestion type
    @Test(priority = 35)
    public void verifyMediaRecordingAdded() {
        questionnairesPage.setQuestionOnText(getProp().getProperty("Q5"));
    }

    // Select the oprtions from the check box of media and Recordinng Question
    @Test(priority = 36)
    public void verifyListOfMediaAndRecordingOprtionSelected() {
        questionnairesPage.setUncheckListItem();
    }



/* Below code for writing to add the single response matrix Question response page in the questionnaire. In this user can give the
 *  single response matrix Question responses for the questions are asked */


    // Set single response matrix page So click on add page and assign name
    @Test(priority = 37)
    public void verifySingleResponseMatrixPage() throws InterruptedException {
        commonsPage.setPageTypesInQuestionnaires("Single Response Matrix");
    }

    // select the Matrix type from the List of All type Question
    @Test(priority = 38)
    public void verifySingleResponceMatrix() {
        questionnairesPage.setSingleResponseMatrixPage();
    }

    // Select button click to get the page in questionnaire
    @Test(priority = 39)
    public void verifyClickSelectbuttonSingleMatrix() {
        questionnairesPage.setSingleResponsematrixPage();
    }

    // Add question in the text field of question
    @Test(priority = 40)
    public void verifyQuestionSetInTextField() {
        questionnairesPage.setQuestionOnText(getProp().getProperty("Q6"));
    }

    // Add sub Questions by click on plus sign in sub Question text field in single response matrix
    @Test(priority = 41,enabled = false)
    public void verfitySubQuestionsAdded() {
        questionnairesPage.setTextFieldForSubQuestions();
    }

    // Write questions on text field of Area of Single Responce Matrix
    @Test(priority = 42,enabled = false)
    public void verifySubQuestionSetOnTextArea() {
        questionnairesPage.setQuestionsInTextField(getProp().getProperty("SQ1"));
        questionnairesPage.setQuestionsInTextField(getProp().getProperty("SQ2"));
        questionnairesPage.setQuestionsInTextField(getProp().getProperty("SQ3"));
        questionnairesPage.setQuestionsInTextField(getProp().getProperty("SQ4"));
    }


/* Below code for writing to add the Multi response matrix Question response page in the questionnaire. In this user can give the
 *  Multi response matrix Question responses for the questions are asked */


    // Set Multi Response Matrix page So click on add page and assign name
    @Test(priority = 43)
    public void verifyMultiResponseMatrixPage() throws InterruptedException {
        commonsPage.setPageTypesInQuestionnaires("Multi Response Matrix");
    }

    // Set the page Multi Response Matrix from matrix pages
    @Test(priority = 44)
    public void verifyMultiResponseSelected() {
        questionnairesPage.setMultiResponseMatrix();
    }

    // Navigate and set the multiresponse page
    @Test(priority = 45)
    public void verifyNavigateMultResponsePage() {
        questionnairesPage.setNavigateMultiResponseMatrix();
    }

    // Add question in the text field of question
    @Test(priority = 46)
    public void verifyAddQuestionMultiResponseMatrix() {
        questionnairesPage.setQuestionOnText(getProp().getProperty("Q14"));
    }



/* Below code for writing to add the input form Question response page in the questionnaire. In this user can give the
 *  input form Question responses for the questions are asked */


    // Set the page name and type to input form page type
    @Test(priority = 47)
    public void verifySetNameToInputForm() throws InterruptedException {
        commonsPage.setPageTypesInQuestionnaires("Input Form");
    }

    // verify input form type is clicked
    @Test(priority = 48)
    public void verifyclickOnInputForm() {
        questionnairesPage.clickOnInputForm();
    }

    // Add question in the input from type of question
    @Test(priority = 49)
    public void verifyQuestionSetInputForm() {
        questionnairesPage.setQuestionOnText(getProp().getProperty("Q7"));
    }


/* Below code for writing to add the Root Cause Question response page in the questionnaire. In this user can give the
 *  Root Cause Question responses for the questions are asked */


    // Set the page name and type to Root Cause page type
    @Test(priority = 50)
    public void verifySetNameToRootCauseQuestion() throws InterruptedException {
        commonsPage.setPageTypesInQuestionnaires("Root Cause");
    }

    // verify Root Cause type is clicked
    @Test(priority = 51)
    public void verifyClickOnRootCauseQuestion() {
        questionnairesPage.clickOnRootCauseType();
    }

    // Add question in the Root Cause type of question
    @Test(priority = 52)
    public void verifyQuestionSetRootCause() {
        questionnairesPage.setQuestionOnText(getProp().getProperty("Q8"));
    }



/* Below code for writing to add the NPS page type Question response page in the questionnaire. In this user can give the
 *  NPS page type Question responses for the questions are asked */

    // Set the page name and type to NPS page type
    @Test(priority = 53)
    public void verifySetNameToNpsPageType() throws InterruptedException {
        commonsPage.setPageTypesInQuestionnaires("NPS Page");
    }

    // verify NPS type is clicked
    @Test(priority = 54)
    public void verifyClickOnNpsPage() {
        questionnairesPage.clickOnKPIAndNpsType();
    }

    // Add question in the NPS type of question
    @Test(priority = 55)
    public void verifyQuestionSetNpsPage() {
        questionnairesPage.setQuestionOnText(getProp().getProperty("Q9"));
    }

    @Test(priority = 56)
    public void setNpsPageGradeText() {
        questionnairesPage.setTextFieldOfMinAndMaxGradeKPI(getProp().getProperty("Mingrade"),getProp().getProperty("Maxgrade"));
    }

/* Below code for writing to add the CES page type Question response page in the questionnaire. In this user can give the
 *  CES page type Question responses for the questions are asked */

    // Set the page name and type to CES page type
    @Test(priority = 57)
    public void verifySetNameToCesPageType() throws InterruptedException {
        commonsPage.setPageTypesInQuestionnaires("CES Page");
    }

    // verify CES type is clicked
    @Test(priority = 58)
    public void verifyClickOnCesPage() {
        questionnairesPage.clickOnKPIAndCesType();
    }

    // Add question in the CES type of question
    @Test(priority = 59)
    public void verifyQuestionSetCesPage() {
        questionnairesPage.setQuestionOnText(getProp().getProperty("Q10"));
    }

    // Set the grade text box for CES Question type
    @Test(priority = 60)
    public void setNpsPageGradeCesPage() {
        questionnairesPage.setTextFieldOfMinAndMaxGradeKPI(getProp().getProperty("Mingrade"),getProp().getProperty("Maxgrade"));
    }


/* Below code for writing to add the CSAT page type Question response page in the questionnaire. In this user can give the
 *  CSAT page type Question responses for the questions are asked */

    // Set the page name and type to CSAT page type
    @Test(priority = 61)
    public void verifySetNameToCsatPageType() throws InterruptedException {
        commonsPage.setPageTypesInQuestionnaires("CSAT Page");
    }

    // verify CSAT type is clicked
    @Test(priority = 62)
    public void verifyClickOnCsatPage() throws InterruptedException {
        questionnairesPage.clickOnKPIAndCSAType();
    }

    // Add question in the CSAT type of question
    @Test(priority = 63)
    public void verifyQuestionSetCsatPage() {
        questionnairesPage.setQuestionOnText(getProp().getProperty("Q11"));
    }

    // Set the grade in text box of CSAT Question type
    @Test(priority = 64)
    public void setNpsPageGradeCsatPage() {
        questionnairesPage.setTextFieldOfMinAndMaxGradeKPI(getProp().getProperty("Mingrade"),getProp().getProperty("Maxgrade"));
    }

/* Below code for writing to add the EPS page type Question response page in the questionnaire. In this user can give the
 *  EPS page type Question responses for the questions are asked */

    // Set the page name and type to EPS page type
    @Test(priority = 65)
    public void verifySetNameToEPSPageType() throws InterruptedException {
        commonsPage.setPageTypesInQuestionnaires("EPS Page");
    }

    // verify EPS type is clicked
    @Test(priority = 66)
    public void verifyClickOnEPSPage() throws InterruptedException {
        questionnairesPage.clickOnKPIAndEPSType();
    }

    // Add question in the EPS type of question
    @Test(priority = 67)
    public void verifyQuestionSetEPSPage() {
        questionnairesPage.setQuestionOnText(getProp().getProperty("Q12"));
    }

    // Set the grade in text box of EPS Question type
    @Test(priority = 69)
    public void setNpsPageGradeEPSPage() {
        questionnairesPage.setTextFieldOfMinAndMaxGradeKPI(getProp().getProperty("Mingrade"),getProp().getProperty("Maxgrade"));
    }

/* Below code for writing to add the Check List Question response page in the questionnaire. In this user can give the
 *  Check List Question responses for the questions are asked */

    // Set the page name and type to Check List page type
    @Test(priority = 70)
    public void verifySetNameToCheckListPageType() throws InterruptedException {
        commonsPage.setPageTypesInQuestionnaires("Check List Page");
    }

    // verify Check List type is clicked
    @Test(priority = 71)
    public void verifyClickOnCheckListPage() {
        questionnairesPage.clickOnCheckList();
    }


    // Add question in the EPS type of question
    @Test(priority = 72)
    public void verifyQuestionSetCheckListPage() {
        questionnairesPage.setQuestionOnText(getProp().getProperty("Q13"));
    }

/* Below code for writing to add the Conditional Check List Question response page in the questionnaire. In this section user can give the
 *  Conditional Check List Question responses for the questions are asked */

    // Set the page name and type to Conditional Check List page type
    @Test(priority = 73)
    public void verifySetNameToConditionalCheckListPageType() throws InterruptedException {
        commonsPage.setPageTypesInQuestionnaires("Conditional Check List Page");
    }

    // verify Check List type is clicked
    @Test(priority = 74)
    public void verifyClickOnConditionalCheckListPage() {
        questionnairesPage.clickOnCheckList();
    }


    // Add question in the EPS type of question
    @Test(priority = 75)
    public void verifyQuestionSetConditionalCheckListPage() {
        questionnairesPage.setQuestionOnText(getProp().getProperty("Q15"));
    }

    //
    @Test(priority = 76)
    public void verifybtnUpdateClikable() throws InterruptedException {
        questionnairesPage.setBtnUpdatePage();
    }

    // Scroll the panel upto end page is visible
    @Test(priority = 77)
    public void verifyPageIsScrollUptoEndPage() {
        questionnairesPage.scrollFindElemenet(questionnairesPage.btnUpdatePage);
    }

    //
    @Test(priority = 78)
    public void verifyEndMessgeSet() throws InterruptedException {
        questionnairesPage.setEndPage();
    }

    //
    @Test(priority = 79)
    public void verifyEndPageClikable() throws InterruptedException {
        questionnairesPage.setEndPageMessage();
    }

    //
    @Test(priority = 80)
    public void verifyScrollingPageUpward() throws InterruptedException {
        questionnairesPage.scrollFindElemenet(questionnairesPage.txtEndPageMessage);
    }

    //
    @Test(priority = 81)
    public void verifybtnUpdateButtonClickable() throws InterruptedException {
        questionnairesPage.setBtnUpdatePage();
    }


    //
    @Test(priority = 82)
    public void verifysetTabClickTestPublish() throws InterruptedException {
        questionnairesPage.setTabClickTestPublish();
    }

    //
    @Test(priority = 83)
    public void verifyScrollTestPublishPage() throws InterruptedException {
        questionnairesPage.scrollFindElemenet(questionnairesPage.btnContainer);
    }


    //
    @Test(priority = 84)
    public void verifysetBtnContainer() throws InterruptedException {
        questionnairesPage.setBtnContainer();
    }

    //
    @Test(priority = 85)
    public void verifysetLinkLive() throws InterruptedException {
        questionnairesPage.setLinkLive();
    }

    //
    @Test(priority = 86)
    public void verifybtnYesIsClickable() throws InterruptedException {
        questionnairesPage.btnYesIsClickable();
    }

    // Test comment in text area in pop-up window after click on yes button
    @Test(priority = 87)
    public void verifysettxtAreaComment() throws InterruptedException {
        questionnairesPage.setTextAreaComment();
    }

    // Close comment window by clicking on close button of winndow
    @Test(priority = 88)
    public void verifybtnCloseComment() throws InterruptedException {
        questionnairesPage.btnCloseComment();
    }

    //
    @Test(priority = 89)
    public void verifyScrollTestPublishPageUpward() throws InterruptedException {
        questionnairesPage.scrollFindElemenet(questionnairesPage.btnContainer);
    }

    //
    @Test(priority = 90)
    public void verifysetBtnRefresh() throws InterruptedException {
        questionnairesPage.setBtnRefresh();
    }

    //
    @Test(priority = 91)
    public void vserifysetLinkToGoPreviewProject() throws InterruptedException {
        questionnairesPage.setLinkToGoPreviewProject();
    }

    @Test(priority = 92)
    public void verifysetWindowHadleSwitchToChildWindow() throws InterruptedException {
        questionnairesPage.setWindowHandleSwitchToChildWindow();
    }

    //
    @Test(priority = 93)
    public void verifyNavigationForPreviewQuestionnaire() throws InterruptedException {
        questionnairesPage.NavigationForPreviewQuestionnaire();
    }

}





