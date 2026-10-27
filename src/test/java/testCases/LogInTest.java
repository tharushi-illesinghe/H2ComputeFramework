package testCases;

import Base.BaseClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pages.LogIn;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LogInTest extends BaseClass {

    private static final Logger logger = LogManager.getLogger(LogInTest.class);

//    public static Logger getLogger() {
//        return logger;
//    }

    @Test
    public void testLogIn() {
        logger.info("***Starting LogInTest***");

        LogIn login = new LogIn(driver);

        login.enterUserName("standard_user");
        logger.info("Entered username");

        login.enterPassword("secret_sauce");
        logger.info("Entered password");

        login.clickLoginButton();
        logger.info("Clicked login button");
        logger.info("***LogInTest Completed***");

    }
}
