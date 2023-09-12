package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.en.*;

public class _01_LoginSteps {

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        //System.out.println("site açıldı");
        GWD.getDriver().get("https://test.mersys.io/");

    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
        //System.out.println("username ve password girildi");
        GWD.getDriver().findElement("username").sendKeys("turkeyts");
        GWD.getDriver().findElement("password").sendKeys("TechnoStudy123");
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        System.out.println("girildiği test edildi");
    }

}
