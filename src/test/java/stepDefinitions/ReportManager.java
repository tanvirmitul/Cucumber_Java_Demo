package stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ReportManager {
    private static ExtentReports extent;
    private static ExtentTest test;
    private static ExtentSparkReporter spark;

    public static void setupReport() {
        spark = new ExtentSparkReporter("extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    public static ExtentTest createTest(String name) {
        test = extent.createTest(name);
        return test;
    }

    public static void logActionWithScreenshot(WebDriver driver, String action) {
        try {
            test.info(action); // Log the action description
            test.addScreenCaptureFromPath(takeScreenshot(driver)); // Add the screenshot
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String takeScreenshot(WebDriver driver) {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = "screenshots/" + System.currentTimeMillis() + ".png";
        try {
            FileUtils.copyFile(srcFile, new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return path;
    }

    public static void flushReport() {
        extent.flush();
    }
}
