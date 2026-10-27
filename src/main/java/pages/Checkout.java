package pages;

import Base.BaseClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout extends BaseClass {

    private static final Logger logger = LogManager.getLogger(Checkout.class);

    public Checkout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "first-name")
    public WebElement firstName;

    public void enterFirstName(String enterFirstName) {
        //this.firstName.sendKeys(firstName);
        firstName.sendKeys(enterFirstName);
        logger.info("Entered first name: " + enterFirstName);
    }

    @FindBy(id = "last-name")
    public WebElement lastName;

    public void enterLastName(String enterLastName) {
        //this.lastName.sendKeys(lastName);
        lastName.sendKeys(enterLastName);
        logger.info("Entered last name: " + enterLastName);
    }

    @FindBy(id = "postal-code")
    public WebElement postalCode;

    public void enterPostalCode(String postalCode) {
        this.postalCode.sendKeys(postalCode);
        logger.info("Entered postal code: " + postalCode);
    }

    @FindBy(id = "continue")
    public WebElement continueButton;

    public void clickContinueButton() {
        continueButton.click();
        logger.info("Clicked on continue button");
    }
}
