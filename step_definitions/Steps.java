package nicebank;

import io.cucumber.java.en.*;
import io.cucumber.java.PendingException;

public class Steps {
    @Given("^I have deposited \\$(\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(int amount) throws Throwable {
        // write code here that turns the phrase above into concrete actions
	throw new PendingException();
    }
}
