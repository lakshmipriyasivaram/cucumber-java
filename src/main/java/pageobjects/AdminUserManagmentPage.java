package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.MyUtils;

import java.util.List;


public class AdminUserManagmentPage {
    WebDriver ldriver;
    MyUtils commonActions = new MyUtils();
    By USERNAME = By.xpath("//label[text()='Username']/../..//input");
    By SEARCH = By.xpath("//button[normalize-space()='Search']");
    public AdminUserManagmentPage(WebDriver rdriver) {
        ldriver = rdriver;

    }
   public void validateAdminPage()
   {
       String excepted_url="https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
       String actual_url = ldriver.getCurrentUrl();

   }

    public void typeUserName(String systemusername)
    {
        ldriver.findElement(USERNAME).sendKeys(systemusername);

    }

     public void clickSearchButton()
     {
         WebElement searchButton = ldriver.findElement(SEARCH);
         searchButton.click();
         commonActions.waitFor(10);

     }

     public int getcount()
     {
         List<WebElement> searchResult= ldriver.findElements(By.xpath("//div[@class='oxd-table-card']//div[@role='row']"));
         return searchResult.size();
     }

}

