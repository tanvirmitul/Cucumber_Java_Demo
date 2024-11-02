package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
    @FindBy(xpath = "//a[text()='Create an Account']")
    public WebElement btnNavigateCreateAnAccount;
    @FindBy(xpath = "//span[contains(text(),'Create New Customer Account')]")
    public WebElement titleCreateNewAccount;
    public Signup(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
