package tests;

import appwebdriver.WebDriverUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class WebDriverTests {
    private static WebDriver driver = WebDriverUtils.getDriver();

    @Test
    public void testGerURL() throws InterruptedException {
        driver.get("https://www.jw.org/ru/");
        driver.wait(1000);
        driver.close();
    }
}
