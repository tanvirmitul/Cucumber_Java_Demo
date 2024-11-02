package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.Utils.timeNap;

public class MyStepdefs{
    Setup setup= new Setup();
    WebDriver driver= setup.getDriver();


    @Given("user can visit website")
    public void userCanVisitWebsite() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        ReportManager.logActionWithScreenshot(driver, "Browser and URL Launched successfully");
        Thread.sleep(3000);
    }
    @And("User enter email num")
    public void userEnterEmailNum() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        ReportManager.logActionWithScreenshot(driver, "Entered username: ");
        timeNap(2);

    }
    @When("user clicks login button")
    public void userClicksLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
        Thread.sleep(2);
    }


    @Then("user can successfully login")
    public void userCanSuccessfullyLogin() {
    }


}
