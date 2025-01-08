package dojo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CocktailSteps {
    private Order order;
    @Given("{string} who wants to buy a drink")
    public void romeo_who_wants_to_buy_a_drink(String owner) {
         order = new Order();
         order.declareOwner(owner);
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for_juliette(String to) {
            order.declareTarget(to);
    }

    @Then("there is {int} cocktails in the order")
    public void there_is_cocktails_in_the_order(Integer nbcocktails) {
        List<String> cocktails =  order.getCocktails();
        Integer cocktailsSize = cocktails.size();
        assertEquals(nbcocktails, cocktailsSize);
    }

    @And("a message saying {string} is added")
    public void a_message_saying_is_added(String message) {
        order.declareMessage(message);
    }

    @Then("the ticket must say {string}")
    public void the_ticket_must_say(String message) {
        assertEquals(message, order.retreiveMessage());
    }
}