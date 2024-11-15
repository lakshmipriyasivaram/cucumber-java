
package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import utils.MyUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class LoginPage {

    WebDriver driver;
    MyUtils myUtils = new MyUtils();

    By USERNAME = By.name("username");
    By PASSWORD = By.cssSelector("input[placeholder='Password']");
    By LOGIN_BUTTON = By.tagName("button");
    By FORGOT_PASSORD = By.xpath("//p[normalize-space()='Forgot your password?']");


    public LoginPage(WebDriver rdriver) {
        driver = rdriver;
    }

    public void openApplication() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }


    public void enterUsername(String username) {
        WebElement inputUsername = driver.findElement(USERNAME);
        inputUsername.click();
        inputUsername.sendKeys(username);
    }

    public void enterInvalidUsername(String username) {
        WebElement inputUsername = driver.findElement(USERNAME);
        inputUsername.click();
        myUtils.waitFor(2);
        inputUsername.sendKeys(username);
        myUtils.waitFor(2);
    }

    public void enterPassword(String password) {
        WebElement inputPassword = driver.findElement(PASSWORD);
        inputPassword.click();
        myUtils.waitFor(2);
        inputPassword.sendKeys(password);
        myUtils.waitFor(2);

    }

    public void clickLogin() {
        WebElement loginButton = driver.findElement(LOGIN_BUTTON);
        loginButton.click();
        myUtils.waitFor(10);
    }

    public void clickForgotPassword(){
        driver.findElement(FORGOT_PASSORD).click();
        myUtils.waitFor(2);
    }

}
