package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "uid")
    @CacheLookup
    private WebElement txtUserName;

    @FindBy(name="password")
    @CacheLookup
    private WebElement txtPassword;

    @FindBy(name="btnLogin")
    @CacheLookup
    private WebElement btnLogin;

    public void setUserName(String uname){
        txtUserName.sendKeys(uname);
    }
    public void setPassword(String pwd){
        txtPassword.sendKeys(pwd);
    }
    public void clickBtnLogin(){
        btnLogin.click();
    }
}
