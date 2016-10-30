import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * Created by mitchell on 30/10/16.
 */
public class Steps {
   // WedDriver dr = new fireFoxDriver()

    @Given("^the user has logged into the hotel management platform$")
    public void the_user_has_logged_into_the_hotel_management_platform(){

    }
    @Given("^the \"([^\"]*)\" is entered$")
    public void the_following_is_entered (String arg1) {}

    @Given("^All created entry are displayed$")
    public void All_created_entry_are_displayed(){}


    @When("^the following are entered:$")
    public void the_following_are_entered(DataTable arg1){}

    @When("^X associated with a particular is clicked$")
        public void X_associated_with_a_particular_is_clicked(){}

    @When("^the create button is clicked$")
        public void the_create_button_is_clicked(){}



    @Then("^the page is update with the new entry$")
    public void the_page_is_update_with_the_new_entry(){}

    @Then("^the entry is deleted$")
    public void the_entry_is_deleted(){}
}
