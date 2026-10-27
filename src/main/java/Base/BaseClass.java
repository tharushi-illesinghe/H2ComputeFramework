package Base;

import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.BaseClassFinder;
//import utility.PropertyFileReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class BaseClass  {

    public static final Logger logger = LogManager.getLogger(BaseClass.class);

    public WebDriver driver;

    @BeforeMethod
    public void SetUp() throws IOException {

        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+
                "\\src\\test\\resources\\config.properties");

        Properties properties = new Properties();
        properties.load(fileInputStream);

        String browser = properties.getProperty("browser");

        switch (browser.toLowerCase()){
            case "chrome" :
                driver = new ChromeDriver(); break;
            case "edge" :
                driver = new EdgeDriver(); break;
            case "firefox" :
                driver = new FirefoxDriver(); break;
            default:
                System.out.println("Browser not supported : " +browser);
                return;
        }
        logger.info("Browser Launched : " +browser);

        driver.manage().window().maximize();
//        driver.manage().timeouts().
//                implicitlyWait(Duration.ofSeconds
//                (Long.parseLong(properties.getProperty("implicit_wait"))));

        driver.get(properties.getProperty("App_URL"));
    }

    @AfterMethod
    public void CloseBrowser(){
        driver.quit();
        logger.info("Browser Closed");
    }

}
