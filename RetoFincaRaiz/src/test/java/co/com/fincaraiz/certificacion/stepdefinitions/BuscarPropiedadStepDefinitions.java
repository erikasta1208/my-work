package co.com.fincaraiz.certificacion.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.openqa.selenium.WebDriver;

import co.com.fincaraiz.certificacion.questions.TheProperty;
import co.com.fincaraiz.certificacion.tasks.OpenBrowser;
import co.com.fincaraiz.certificacion.tasks.SelectCity;
import co.com.fincaraiz.certificacion.tasks.SelectDepartment;
import co.com.fincaraiz.certificacion.tasks.SelectProperty;
import co.com.fincaraiz.certificacion.userinterfaces.FincaRaizHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class BuscarPropiedadStepDefinitions {
	
	@Managed
	private WebDriver herBrowser;

	private Actor user = Actor.named("actor");
	
	private FincaRaizHomePage fincaraizhomepage;
	
	@Before
	public void setUp() {
		user.can(BrowseTheWeb.with(herBrowser));
	}

	@Given("^that Erika navigate in the Fincaraiz page$")
	public void thatErikaNavigateInTheFincaraizPage() throws Exception {
		user.wasAbleTo(OpenBrowser.on(fincaraizhomepage));
	}

	@When("^she selects the department \"([^\"]*)\"$")
	public void sheSelectsTheDepartment(String department) throws Exception {
		user.attemptsTo(SelectDepartment.from(department));
	}

	@When("^she select the city \"([^\"]*)\"$")
	public void sheSelectTheCity(String city) throws Exception {
		user.attemptsTo(SelectCity.from(city));
	}

	@When("^she select any property from the list$")
	public void sheSelectAnyPropertyFromTheList() throws Exception {
		user.attemptsTo(SelectProperty.fromList());
	}

	@Then("^she should see the detail of the property$")
	public void sheShouldSeeTheDetailOfTheProperty() throws Exception {
		user.should(seeThat(TheProperty.isVisible(), equalTo("Exitoso")));
	}
	
}
