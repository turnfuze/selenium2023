package appwebdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtils {
    public static WebDriver getDriver(){
        System.setProperty("webdriverchrome","src/test/resource/chromedriver.exe");
        return new ChromeDriver();
        }
}
