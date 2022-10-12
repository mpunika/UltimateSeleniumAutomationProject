package basetest;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;

    public LoginPage loginPage;
    public String  strURL = "https://demo.guru99.com/V4/";
    public String  txtUserName = "mngr443152";
    public String  txtPasword = "byhEmyp";

    public static Logger logger ;

    @BeforeMethod
    public void setUp(){


      System.setProperty("webdriver.chrome.driver",".//Drivers//chromedriver.exe");
      driver = new ChromeDriver();
      driver.get(strURL);
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      loginPage = new LoginPage(driver);


    }

    @AfterMethod
    public void tearDown(){
      driver.quit();

    }
}
