package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Login_page extends Base_page
{
    WebDriver driver;
    public Login_page(WebDriver driver) {
        super(driver);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@type='email']")
    WebElement email_id;

    @CacheLookup
    @FindBy(xpath = "//input[@name='password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b']")
    WebElement next_button_email;

    @CacheLookup
    @FindBy(xpath = "//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc lw1w4b']")
    WebElement next_button_password;

    @CacheLookup
    @FindBy(xpath = "//a[.='Sign in']")
    WebElement sign_in_button;

    public void enter_email(String email)
    {
        enter_element(email_id,email);
    }

    public void enter_password(String pwd)
    {
        enter_element(password,pwd);
    }

    public void click_sign()
    {
        sign_in_button.click();
    }

    public void click_nextButton_email()
    {
        click_element(next_button_email);
    }

    public void click_nextButton_password()
    {
        click_element(next_button_password);
    }
}
