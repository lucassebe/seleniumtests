import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

    private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

    /*
     * Factory method for getting browsers
     */
    public static WebDriver getBrowser(String browserName) {
        WebDriver driver = null;

        switch (browserName) {
            case "Firefox":
                driver = drivers.get("Firefox");
                if (driver == null) {
                    System.setProperty("webdriver.firefox.driver",
                            "C:/Users/Lucas Sebe/Desktop/projetos/seleniumtests/drivers/firefoxdriver.exe");
                    driver = new FirefoxDriver();
                    drivers.put("Firefox", driver);
                }
                break;
            // case "IE":
            // driver = drivers.get("IE");
            // if (driver == null) {
            // System.setProperty("webdriver.ie.driver",
            // "C:\\Users\\abc\\Desktop\\Server\\IEDriverServer.exe");
            // driver = new InternetExplorerDriver();
            // drivers.put("IE", driver);
            // }
            // break;
            case "Chrome":
                driver = drivers.get("Chrome");
                if (driver == null) {
                    System.setProperty("webdriver.chrome.driver",
                            "C:/Users/Lucas Sebe/Desktop/projetos/seleniumtests/drivers/chromedriver.exe");
                    driver = new ChromeDriver();
                    drivers.put("Chrome", driver);
                }
                break;
        }
        return driver;
    }
}