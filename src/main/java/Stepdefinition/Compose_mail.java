package Stepdefinition;

import POM_Classes.Browser_factory;
import POM_Classes.Base_page;
import POM_Classes.Compose_page;
import POM_Classes.Login_page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Compose_mail
{
    WebDriver driver;
    Browser_factory bff = new Browser_factory();
    Login_page lp;
    Base_page bp;
    Compose_page cp;

    @Before(order = 0)
    public void setUp()
    {
        driver = bff.browser_factory_initilization("chrome");
        lp = new Login_page(driver);
        bp = new Base_page(driver);
        cp = new Compose_page(driver);
    }

    @After(order = 0)
    public void tearDown(Scenario scenario)
    {
        driver.quit();
    }


    Login_page l1;
    @Given("User enter the gmail URL")
    public void user_enter_the_gmail_url()
    {
        driver.get("https://gmail.com");
        driver.manage().window().maximize();

    }
    @When("User enter the email id and password")
    public void user_enter_the_email_id_and_password()
    {
        lp.enter_email("tttestauto123@gmail.com");
        lp.click_nextButton_email();
        lp.enter_password("Test@123");
        lp.click_nextButton_password();
    }
    @When("Click on Compose button")
    public void click_on_compose_button() throws InterruptedException {
        cp.compose_mail_button();

    }
    @When("User enter the TO email id")
    public void user_enter_the_to_email_id() throws InterruptedException {
        cp.enter_to_mailid("tanub.0509@gmail.com");
    }
    @When("User enter the Subject")
    public void user_enter_the_subject()
    {
        cp.enter_to_mailSubject("Incubyte");
    }
    @When("User enter the content in the body of the mail")
    public void user_enter_the_content_in_the_body_of_the_mail()
    {
        cp.enter_mail_body("Automation QA test for Incubyte");
    }
    @Then("User click on send button")
    public void user_click_on_send_button() {
        cp.click_send_mail();
        cp.Sending_toaster();
        cp.Sent_toaster();
    }

}
