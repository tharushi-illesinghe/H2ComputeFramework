package pages;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CheckoutOverview extends BaseClass{

    private static final Logger logger = LogManager.getLogger(CheckoutOverview.class);

    public CheckoutOverview(WebDriver driver) {
        // Constructor logic if needed
        this.driver = this.driver;
        PageFactory.initElements(this.driver, this);
    }

@FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]/text()[2]")
    public WebElement itemTotal;

@FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/text()[2]")
    public WebElement orderTotal;

@FindBy(id = "finish")
    public WebElement finishButton;

    public void clickFinishButton() {
        finishButton.click();
    }

}
