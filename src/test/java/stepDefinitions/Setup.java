package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Setup {
    public static WebDriver driver;
    @Before
    public void Setup(){
        ReportManager.setupReport();
        ReportManager.createTest("Test Case: User can visit website");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @After
    public void closeDriver(){
        driver.close();
        ReportManager.flushReport();
    }
    public WebDriver getDriver() {
        return driver;
    }

}
