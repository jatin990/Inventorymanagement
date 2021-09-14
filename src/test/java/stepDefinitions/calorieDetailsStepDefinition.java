package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class calorieDetailsStepDefinition {
//
//    @Given("the user in on the home page")
//    public void the_user_in_on_the_home_page() {
//        System.out.println("The user in on the home page");
//    }
//
//    @When("user clicks on BMI link")
//    public void user_clicks_on_bmi_link() {
//        System.out.println("User clicks on BMI link");
//    }
//
//    @When("the user provides the age as {int}")
//    public void the_user_provides_the_age_as(Integer int1) {
//        System.out.println("The user provides the age as " + int1);
//    }
//
//    @When("the user provides the height as {int}")
//    public void the_user_provides_the_height_meter_as(Integer int1) {
//        System.out.println("The user provides the height meter as " + int1);
//    }
//
//    @When("the user provides the weight as {int}")
//    public void the_user_provides_the_weight_as(Integer int1) {
//        System.out.println("The user provides the weight as " + int1);
//    }
//
//    @When("the user selects the gender as {string}")
//    public void the_user_selects_the_gender_as(String gender) {
//        System.out.println("The user selects the gender as " + gender);
//    }
//
//    @When("the user performs BMI Calculation")
//    public void the_user_performs_bmi_calculation() {
//        System.out.println("The user performs BMI Calculation");
//    }
//
//    @Then("the user should be given the BMI Value")
//    public void the_user_should_be_given_the_bmi_value() {
//        System.out.println("The user should be given the BMI Value");
//    }
//
//    @Then("the user should be given the BMI Category")
//    public void the_user_should_be_given_the_bmi_category() {
//        System.out.println("The user should be given the BMI Category");
//    }
//
//    @Then("the user verifies the BMI Category")
//    public void the_user_verifies_the_bmi_category() {
//        System.out.println("The user verifies the BMI Category");
//    }

    @Before
    public void BeforeEveryScenario() {
        System.out.println("-------------------------------------------------");
        System.out.println("Executing Before Every Scenario");
        System.out.println("-------------------------------------------------");
    }

    @After
    public void AfterEveryScenario() {
        System.out.println("-------------------------------------------------");
        System.out.println("Executing After Every Scenario");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("");
    }

    @Before("@fourArgs")
    public void BeforeFourArgsScenario() {
        System.out.println("-------------------------------------------------");
        System.out.println("Executing Before FourArgs Scenario");
        System.out.println("-------------------------------------------------");
    }

    @After("@fourArgs")
    public void AfterFourArgsScenario() {
        System.out.println("-------------------------------------------------");
        System.out.println("Executing After Execution of FourArgs");
        System.out.println("-------------------------------------------------");
    }

    @Given("^the user in on the home page$")
    public void the_user_launches_to_Calorie_home_Page() {
        System.out.println("The user launches to calorie home page");
    }

    @When("^user clicks on BMI link$")
    public void the_user_clicks_on_the_BMI_link() {
        System.out.println("The user clicks on the BMI Link");
    }

    @When("^the user provides the age as ([^\"]*)$")
    public void the_user_provides_the_age_as(String age) {
        System.out.println("The user provides age as " + age);
    }

    @When("^the user provides the height as ([^\"]*)$")
    public void the_user_provides_the_height_as(String height) {
        System.out.println("the user provides the height as " + height);
    }

    @When("^the user provides the weight as ([^\"]*)$")
    public void the_user_provides_the_weight_as(String weight) {
        System.out.println("the user provides the weight as " + weight);
    }

    @And("^the user selects the gender as \"([^\"]*)\"$")
    public void the_user_selects_the_gender_as(String gender) {
        System.out.println("the user selects the gender as " + gender);
    }

    @When("^the user performs BMI Calculation$")
    public void the_user_performs_BMI_Calculation() {
        System.out.println("the user performs BMI Calculation");
    }

    @Then("^the user should be given the BMI Value$")
    public void the_user_should_be_given_the_BMI_Value() {
        System.out.println("the user should be given the BMI Value");
    }

    @Then("^the user should be given the BMI Category$")
    public void the_user_should_be_given_the_BMI_Category() {
        System.out.println("the user should be given the BMI Category");
    }

    @Then("^the user verifies the BMI Category$")
    public void the_user_verifies_the_BMI_Category() {
        System.out.println("the user verifies the BMI Category");
    }

    @When("the user provides the following details")
    public void the_user_provides_the_following_details(DataTable table) {

        List<List<String>> rows = table.asLists(String.class);

        System.out.println("User Provided");
        for (List<String> columns : rows) {
            System.out.println(columns.get(0) + "  " + columns.get(1) + "  " + columns.get(2) + "  " + columns.get(3));
//            System.out.println("Age : " + columns.get(0) + "\nHeight : " + columns.get(1) + "\nWeight : " + columns.get(2) + "\nGender : " + columns.get(3));
        }


    }

}
