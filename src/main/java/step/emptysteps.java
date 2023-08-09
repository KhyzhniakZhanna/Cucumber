package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class emptysteps {
    @When("name")
    public void name(){}

    @And("surname")
    public void surname() {
        
    }

    @Then("age")
    public void age() {
        
    }

    @When("name {string}")
    public void name(String name) {
        System.out.println("My name is "+name);
    }




    @And("surname {string} and country {string}")
    public void surnameAndCountry(String surname, String country) {
        System.out.println("My surname is " + surname);
        System.out.println("country: " + country);
    }



}
