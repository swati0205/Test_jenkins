package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static WebDriver driver;

    @org.testng.annotations.Test
    public void initialize(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/swatisingh/Documents/DevTools/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://www.amazon.ca");
        driver.manage().window().maximize();
    }
}
