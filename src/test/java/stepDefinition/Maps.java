package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import java.util.Map;

public class Maps
{
    @Given("user is on registration page")

    public void user_is_on_registration_page()
    {
        System.out.println("user is on registration page");
    }
    @When("user enters following details")

    public void user_enters_following_details(DataTable dataTable)
    {
        java.util.List<java.util.List<String>> userList = dataTable.asLists(String.class);
        for(java.util.List<String> e : userList)
        {
            System.out.println(e);
        }

    }
    @When("user enters following details with columns")

    public void user_enters_following_details_with_columns(DataTable dataTable)
    {
        List<Map<String, String>> userList = dataTable.asMaps(String.class, String.class);
        for(Map<String, String> e : userList)
        {
            System.out.println(e.get("name"));
            System.out.println(e.get("email"));
            System.out.println(e.get("dob"));

        }
    }

    @Then("user registration should be successful")

    public void user_registration_should_be_successful()
    {
        System.out.println("user registration should be successful");
    }

}

