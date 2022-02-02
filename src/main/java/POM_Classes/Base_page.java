package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_page
{
    public WebDriver driver;
    public WebDriverWait wait;
    public Base_page(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

       public WebDriverWait only_wait()
        {
        return wait;
        }

        public WebDriverWait wait_time()
        {
             wait = new WebDriverWait(driver,30);
            return wait;
        }

        public void click_element(WebElement e)
        {
            wait_time().until(ExpectedConditions.visibilityOf(e));
            e.click();
        }

    public void enter_element(WebElement e, String value)
    {
        wait_time().until(ExpectedConditions.visibilityOf(e));
        e.sendKeys(value);
    }
}
