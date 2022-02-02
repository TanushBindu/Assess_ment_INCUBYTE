package POM_Classes;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Compose_page extends Base_page
{
    WebDriver driver;
    public Compose_page(WebDriver driver) {
        super(driver);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@jsaction='click:dlrqf; clickmod:dlrqf']")
    WebElement compose_button;

    public void compose_mail_button()
    {
        click_element(compose_button);
    }

    @CacheLookup
    @FindBy(name = "to")
    WebElement to_mailid;

    public void enter_to_mailid(String mail_id)
    {
        click_element(to_mailid);
        enter_element(to_mailid,mail_id);
        to_mailid.sendKeys(Keys.ENTER);
    }

    @CacheLookup
    @FindBy(name = "subjectbox")
    WebElement subject_mail;

    public void enter_to_mailSubject(String subject1)
    {
        click_element(subject_mail);
        enter_element(subject_mail,subject1);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='Am Al editable LW-avf tS-tW']")
    WebElement mail_body;

    public void enter_mail_body(String mail1)
    {
        click_element(mail_body);
        enter_element(mail_body,mail1);
    }

    @CacheLookup
    @FindBy(xpath = "//td[@class='gU Up']")
    WebElement send_mail_button;

    @CacheLookup
    @FindBy(xpath = "//span[.='Sending...']")
    WebElement sending_toaster;

    public void Sending_toaster()
    {
        only_wait().until(ExpectedConditions.textToBePresentInElement(sending_toaster,"Sending..."));
        System.out.println(sending_toaster.getText());
    }

    @CacheLookup
    @FindBy(xpath = "//span[.='Message sent']")
    WebElement sent_toaster;

    public void Sent_toaster()
    {
        only_wait().until(ExpectedConditions.textToBePresentInElement(sent_toaster,"Message sent"));
        System.out.println(sent_toaster.getText());
    }

    public void click_send_mail()
    {
        click_element(send_mail_button);
    }
}
