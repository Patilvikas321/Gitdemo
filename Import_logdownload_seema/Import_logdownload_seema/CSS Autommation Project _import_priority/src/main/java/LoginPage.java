import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LoginPage extends BasePage {
    String excelPath = "C:\\Users\\Vaibhav Chavan\\IdeaProjects\\CSS Autommation Project\\util_files\\User Details.xlsx";
    String sheetName ="UserName";
    public LoginPage(WebDriver driver) {
        super(driver);
    }



    // Path of Locator Email ID
    @FindBy(id = "logonIdentifier")
    private WebElement txtEmail;

    // Path of Locator Password
    @FindBy(id = "password")
    private WebElement txtPassword;

    // Path of Click on Sign-In Button
    @FindBy(id = "next")
    public WebElement btnSignIn;


    //Method Declaration for Login Page
    public void login(String email, String password){
        iWait();
        writeText(txtEmail, email);
        iWait();
        writeText(txtPassword, password);
        iWait();
        click(btnSignIn);
    }

    public Object[][] readExcelFile(String filePath, String sheetName) throws IOException {
        File excelFile = new File(excelPath);
        FileInputStream fileInputStream = new FileInputStream(excelFile);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        HSSFWorkbook workbook1 = new HSSFWorkbook(fileInputStream);
        Workbook Excel = null;
        if (fileInputStream.equals(".xlsx")) {
            Excel = new XSSFWorkbook(fileInputStream);
        } else if (fileInputStream.equals(".xls")) {
            Excel = new HSSFWorkbook(fileInputStream);
        }
        Sheet sheet = Excel.getSheet("Username");
        int rowcount = sheet.getLastRowNum();
        int columncount = sheet.getFirstRowNum();
        for (int i = 0; i < rowcount + 1; i++) {
            XSSFRow row = (XSSFRow) sheet.getRow(i);
            HSSFRow row1 = (HSSFRow) sheet.getRow(i);
            for (int j = 0; j < columncount; j++) {
                XSSFCell cell = row.getCell(j);
                HSSFCell cell1 = row1.getCell(j);
            }
            System.out.println(" ");
        }
        return new Object[0][];
    }

}
