package Base;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_J {
    public static WebDriver driver;

    @Test
    public void initialize() {

        System.setProperty("webdriver.chrome.driver", "/Users/swatisingh/Documents/DevTools/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://www.amazon.ca");
        driver.manage().window().maximize();
    }
}
