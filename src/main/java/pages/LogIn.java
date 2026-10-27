package pages;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.support.PageFactory;


public class LogIn extends BaseClass {

    private static final Logger logger = LogManager.getLogger(LogIn.class);

    public LogIn(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    public void enterUserName(String username) {
        userName.sendKeys(username);
        logger.info("Entered username: " + username);
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
        logger.info("Entered password: " + password);
    }

    public void clickLoginButton() {
        loginButton.click();
        logger.info("Clicked login button");
    }

}
