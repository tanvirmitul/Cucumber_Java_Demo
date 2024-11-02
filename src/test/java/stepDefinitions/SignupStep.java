package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.Signup;

import static constant.CommonConstants.WEBSITE_URL;
import static utils.Utils.visitUrl;
import static utils.Utils.timeNap;

public class SignupStep {
    Setup setup= new Setup();
    WebDriver driver= setup.getDriver();

    Signup signup;
//    @Before
    public void beforeMethod(){
        signup= new Signup(driver);
    }
    @Given("User visits the url")
    public void userVisitsTheUrl() throws InterruptedException {
       visitUrl(driver,WEBSITE_URL);
       timeNap(1);
    }

    @When("user clicks create an account button")
    public void userClicksCreateAnAccountButton() throws InterruptedException {
        signup.btnNavigateCreateAnAccount.click();
        timeNap(1);
    }

    @Then("It navigate to the signup page")
    public void itNavigateToTheSignupPage() {
       Assert.assertEquals(signup.titleCreateNewAccount.getText(),"Create New Customer Account");
    }


    @And("User enter password num")
    public void userEnterPasswordNum() throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
        ReportManager.logActionWithScreenshot(driver, "Entered username: ");
        timeNap(2);
    }
}
