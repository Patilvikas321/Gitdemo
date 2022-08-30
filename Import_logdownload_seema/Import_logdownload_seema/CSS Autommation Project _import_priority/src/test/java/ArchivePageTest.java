import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ArchivePageTest extends BasePageTest{

    LoginPage loginPage;
    ImportFilePage importFilePage;
    ArchivePage archivePage;

    @BeforeClass
    public void inItBrowser(){
        loginPage=new LoginPage(getDriver());
        loginPage.login(getProp().getProperty("email"), getProp().getProperty("password") );
        importFilePage=new ImportFilePage(getDriver());
        archivePage=new ArchivePage(getDriver());
    }

// Sections are Tested the archive of import menu

    @Test(priority =0)
    public void verifyDataGardenClick() throws InterruptedException {
        ArrayList<String> expectedSubmenu=new ArrayList<>();
        expectedSubmenu.add("Import");
        expectedSubmenu.add("Database");
        expectedSubmenu.add("blacklist");
        expectedSubmenu.add("API Management");
        Assert.assertEquals(importFilePage.getDataGardenMenu(),expectedSubmenu);
    }

   /* @Test(priority = 1,enabled = false)
    public void verifyImportClick() throws InterruptedException {
        Assert.assertTrue(importFilePage.lnkImportSource());
    }*/

    @Test(priority = 2)
    public void verifyArchiveClick() throws InterruptedException {
        Assert.assertTrue(archivePage.clickOnArchive());
    }

    @Test(priority = 3)
    public void verifyBackClick() throws InterruptedException {
        Assert.assertTrue(archivePage.clickOnBack());
        
        
        //vikas patil
        
        @Test(priority = 4)
        public void verifyBackClick() throws InterruptedException {
            Assert.assertTrue(archivePage.clickOnBack());
        
    }


}
