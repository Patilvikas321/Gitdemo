import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public WebDriver driver;
    public WebElement ScrollForPickUpFieldEmail;
    public static WebDriverWait wait;


    // Driver Declaration and Initialization
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Global Method to Write Value in Text Boxes/Area
    public void writeText(WebElement element, String value) {
        element.sendKeys(value);
    }

    // Method for clear the text Box/area
    public void clear(WebElement element) {
        element.clear();
    }

    // Method Click on the Buttons/link/text Area
    public void click(WebElement element) {
        LocalDateTime localDateTime1 = LocalDateTime.now();
        DateTimeFormatter formatterr1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        ZonedDateTime dd1 = ZonedDateTime.of(localDateTime1, ZoneId.of("GMT+05:30"));
        ZonedDateTime zdt111 = ZonedDateTime.of(localDateTime1, ZoneId.systemDefault());
        System.out.println(zdt111.toInstant().toEpochMilli());
        System.out.println("click3333:"+dd1.toInstant().toEpochMilli());
        element.click();
    }

    // Implement Implicit Wait for webDriver
    public void iWait() {
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    }


    // Explicit Wait for the wait until the element is visible
    public void eWait( WebElement element) {
        wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOf((element)));
    }

    // Refresh page navigation method
    public boolean pageNavigation() {
        driver.navigate().refresh();
        return false;

    }

    // Alert handling using dismiss method
    public void alertDismiss() {

        driver.switchTo().alert().dismiss();
    }

    // Accept the alert
    public void alertAccept() {
        driver.switchTo().alert().accept();
    }

    // For uploading file in file browsing dialog box
    public String uploadFile() throws AWTException, InterruptedException {
        Thread.sleep(3000);
        String filePath1 =System.getProperty("user.dir") +"\\resources\\Sample_Dataset Excel.xlsx";
        StringSelection clipboard = new StringSelection(filePath1);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(clipboard, null);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        return filePath1.trim();
    }

    // For Mouse over Event
    public void mouseHover(WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();

    }

    // For Drag And Drop Opeartion On the Import Source Field and Database Field
    public void setDragAndDrop(WebElement dragElement,WebElement dropElement){
        Actions actions=new Actions(driver);
        actions.dragAndDrop(dragElement,dropElement);
    }

    // Mouse over event to select email field for send to email
    public void mouseHoverSecond() {
        WebElement element1 = driver.findElement(By.id("emailTo"));
        Actions action = new Actions(driver);
        action.moveToElement(element1).build().perform();

    }

    //
    public void scrollFindElemenet(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
    }

    //
    public void scrollingforQuestionnair(){
        WebElement endElement=driver.findElement(By.xpath("//div[text()=' End page ']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",endElement);
    }

    /*//
    public void scrollPageTestAndPublishToLive(){
        WebElement TandPElement=driver.findElement(By.id("button-container"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",TandPElement);
    }*/

    //
    public void scrollPageTestAndPublishToRefresh(){
        WebElement testPublishElement=driver.findElement(By.xpath("//a[text()=' Test & Publish ']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",testPublishElement);
    }

    //
    public void clickRefreshPage(){
        driver.navigate().refresh();
    }

    // Handling Multiple window to focus the driver from parent window to child window and perform the operation on child window
    public void getWindowHandle() throws InterruptedException {
        Thread.sleep(3000);
        // It will return the parent window name as a String
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator<String> i1 = s.iterator();
        while (i1.hasNext()) {
            String child_window = i1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getTitle());
            }
        }
    }

}


