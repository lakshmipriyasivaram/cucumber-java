package pageobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    WebDriver ldriver;
    By SEARCH = By.xpath("//input[@placeholder='Search']");

    public DashboardPage(WebDriver rdriver) {

        ldriver = rdriver;
    }

    public void search(String query) {
        ldriver.findElement(SEARCH).click();
        ldriver.findElement(SEARCH).sendKeys(query);
    }


    public void validateDashboard() {

        String login_url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        String expected_url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actual_url = ldriver.getCurrentUrl();

    }

}

