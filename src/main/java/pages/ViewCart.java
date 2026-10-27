package pages;

import Base.BaseClass;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCart extends BaseClass {
    private static final Logger logger = LogManager.getLogger(ViewCart.class);

    public ViewCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "checkout")
    public WebElement checkoutButton;

    public void clickCheckoutButton() {
        checkoutButton.click();
        logger.info("Clicked on checkout button");
    }

    @FindBy(xpath = "//div[contains(text(),'Sauce Labs Backpack')]")
    public WebElement firstItemInCart;

}
