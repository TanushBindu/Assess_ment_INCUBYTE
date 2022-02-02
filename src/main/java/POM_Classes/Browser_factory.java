package POM_Classes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_factory
{
    private WebDriver driver;
    public WebDriver browser_factory_initilization(String browser)
    {
        if (driver==null)
        {
            if (browser.equalsIgnoreCase("chrome"))
            {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }else if (browser.equalsIgnoreCase("firefox"))
            {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
        }
        return driver;
    }
}
