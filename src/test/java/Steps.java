import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by mitchell on 30/10/16.
 */
public class Steps {

//    @Managed
    //WebDriver dr = new ChromeDriver();
   // System.setProperty("webdriver.gecko.driver","geckodriver.exe");
   // DesiredCapabilities capabilities=DesiredCapabilities.firefox();
   // capabilities.setCapability("marionette", true);
    WebDriver dr = new ChromeDriver();


    @Given("^the user has logged into the hotel management platform$")
    public void the_user_has_logged_into_the_hotel_management_platform() throws Throwable {


        dr.get("http://localhost:3003/#");
    }

    @Given("^All created entry are displayed$")
    public void all_created_entry_are_displayed() throws Throwable {

    }

    @Given("^the \"([^\"]*)\" is entered$")
    public void the_is_entered(String arg1) throws Throwable {

    }


    @When("^the following are entered:$")
    public void the_following_are_entered(DataTable arg1)  {

    }

    @When("^X associated with a particular is clicked$")
    public void x_associated_with_a_particular_is_clicked() throws Throwable {

    }

    @When("^the create button is clicked$")
    public void the_create_button_is_clicked() throws Throwable {

    }

    @Then("^the page is update with the new entry$")
    public void the_page_is_update_with_the_new_entry() throws Throwable {

    }

    @Then("^the entry is deleted$")
    public void the_entry_is_deleted() throws Throwable {

    }

}
