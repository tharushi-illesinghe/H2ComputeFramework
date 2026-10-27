package testCases;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckoutOverview;
import pages.LogIn;
import pages.ViewCart;
import pages.ViewItems;

public class TC001_E2EPurchaseTest extends Base.BaseClass {

    private static final Logger logger = LogManager.getLogger(TC001_E2EPurchaseTest.class);

    // Test methods and logic for end-to-end purchase test will go here

    @Test
    public void testE2EPurchase() {
        logger.info("***Starting E2E Purchase Test***");

        logger.info("**Starting LogInTest**");
        LogIn login = new LogIn(driver);
        login.enterUserName("standard_user");
        logger.info("Entered username");
        login.enterPassword("secret_sauce");
        logger.info("Entered password");
        login.clickLoginButton();
        logger.info("Clicked login button");
        logger.info("**LogInTest Completed**");

        logger.info("**Starting ViewItemsTest**");
        ViewItems viewItems = new ViewItems(driver);
        viewItems.clickAddToCartButton(0); // Click the first "Add to cart" button
        logger.info("Clicked 'Add to cart' button for the first item");
        viewItems.clickAddToCartButton(1); // Click the second "Add to cart" button
        logger.info("Clicked 'Add to cart' button for the second item");
        viewItems.clickShoppingCartLink();
        logger.info("Clicked on shopping cart link");
        logger.info("**ViewItemsTest Completed**");

        logger.info("**Starting ViewCartTest**");
        ViewCart viewCart = new ViewCart(driver);

        viewCart.clickCheckoutButton();
        logger.info("Clicked on checkout button");
        logger.info("**ViewCartTest Completed**");

        logger.info("**Starting CheckoutTest**");
        pages.Checkout checkout = new pages.Checkout(driver);
        checkout.enterFirstName("John");
        logger.info("Entered first name");
        checkout.enterLastName("Doe");
        logger.info("Entered last name");
        checkout.enterPostalCode("12345");
        logger.info("Entered postal code");
        checkout.clickContinueButton();
        logger.info("Entered checkout information and clicked continue");
        logger.info("**CheckoutTest Completed**");

        logger.info("**Starting CheckoutOverviewTest**");
        CheckoutOverview checkoutOverview = new CheckoutOverview(driver);
        checkoutOverview.clickFinishButton();
        logger.info("Clicked finish button to complete the purchase");


        logger.info("***E2E Purchase Test Completed***");
    }


}
