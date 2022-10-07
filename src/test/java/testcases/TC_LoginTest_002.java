package testcases;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_002 extends BaseTest {
    private String expectedTitle = "Guru99 Bank Manager HomePag";

    @Test
    public void loginTest002() throws InterruptedException {

        loginPage.setUserName(txtUserName);
        loginPage.setPassword(txtPasword);
        Thread.sleep(2000);
        loginPage.clickBtnLogin();
        String actualTitle = driver.getTitle();
        System.out.println(expectedTitle);
        System.out.println(actualTitle);
        if (driver.getTitle().equals(expectedTitle)) {
            Assert.assertTrue(true,"Test Passed");
            logger.info("Test has Passed");
        } else {
            Assert.assertTrue(false,"Test Failed");
            logger.info("Test has Passed");
        }
    }
}
