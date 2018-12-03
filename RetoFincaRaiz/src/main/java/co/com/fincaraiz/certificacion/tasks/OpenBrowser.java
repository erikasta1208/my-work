package co.com.fincaraiz.certificacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.fincaraiz.certificacion.exceptions.StartException;
import co.com.fincaraiz.certificacion.userinterfaces.FincaRaizHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenBrowser implements Task{
	
	private PageObject page;
	
	public OpenBrowser(PageObject page) {
		this.page = page;
	}

	@Override
	@Step("{0} open the browser")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
		if(!FincaRaizHomePage.MESSAGE_INITIAL_PAGE.resolveFor(actor).isPresent()) {
			throw new StartException(StartException.MESSAGE_PAGE_NOT_LOADED);
		}
	}
	
	public static OpenBrowser on(PageObject page) {
		return instrumented(OpenBrowser.class, page);
	}

}
