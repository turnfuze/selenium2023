package tests;

import appwebdriver.WebDriverUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class WebDriverTests {
    private static WebDriver driver = WebDriverUtils.getDriver();

    @Test
    public void testGerURL(){
        driver.get("https://www.jw.org/ru/");
        driver.close();
    }
}
