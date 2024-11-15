package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.MyUtils;

public class NavigationBarPage  {
    WebDriver ldriver;
    MyUtils commonActions = new MyUtils();

    private By SEARCH_INPUT = By.xpath("//input[@placeholder='Search']");
    private By ADMIN_SECTION = By.xpath("//span[text()='Admin']");


    public  NavigationBarPage(WebDriver rdriver) {
        ldriver = rdriver;
    }

    public void searchSection(String sectionName) {
        commonActions.waitFor(2);
        ldriver.findElement(SEARCH_INPUT).sendKeys(sectionName);
        commonActions.waitFor(2);

    }
    public void openAdminSection()
    {
        commonActions.waitFor(2);
        ldriver.findElement(ADMIN_SECTION).click();
        commonActions.waitFor(2);
    }

    public void validateResult(String expectedName)
    {
        WebElement result = ldriver.findElement(By.xpath("//a[@class='oxd-main-menu-item']"));
         String actualName = result.getText();


    }
}
