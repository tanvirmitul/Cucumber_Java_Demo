package stepDefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.Utils.timeNap;

public class ClickSteps {
    Setup setup= new Setup();
    WebDriver driver= setup.getDriver();
    @And("Click on login button")
    public void clickOnLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        timeNap(2);
        ReportManager.logActionWithScreenshot(driver, "Click on login button: ");
    }
}
