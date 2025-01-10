package hellocucumber;

import io.cucumber.java.en.*;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.platform.suite.api.ConfigurationParameter;

@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "json:target/cucumber.json")
public class IsItFriday {
    public String today;
    public String response;

    static String isItFriday(String today) {
        if (today.equals("Friday")) {
            return "TGIF";
        } else {
            return "Nope";
        }
    }

    @Given("today is {string}")
    public void today_is(String day) {
        this.today = day;
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        this.response = isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, this.response);
    }

    @Given("today is Friday")
    public void today_is_Friday() {
        this.today = "Friday";
    }
}
