package pages;
import Base.BaseClass;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ViewItems extends BaseClass {

    private static final Logger logger = LogManager.getLogger(ViewItems.class);

    public ViewItems(WebDriver driver) {
        // Constructor logic if needed
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),\"Add to cart\")]")
    public List<WebElement> addToCartButtons;

    public void clickAddToCartButton(int index) {
        if (index >= 0 && index < addToCartButtons.size()) {
            addToCartButtons.get(index).click();
            logger.info("Clicked 'Add to cart' button at index: " + index);
        } else {
            logger.error("Invalid index for 'Add to cart' button: " + index);
        }
    }


    @FindBy(className = "shopping_cart_link")
    public WebElement shoppingCartLink;

    public void clickShoppingCartLink() {
        shoppingCartLink.click();
        logger.info("Clicked on shopping cart link");
    }
}
