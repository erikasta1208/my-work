package co.com.fincaraiz.certificacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.fincaraiz.certificacion.exceptions.StartException;
import co.com.fincaraiz.certificacion.interactions.ClickElement;
import co.com.fincaraiz.certificacion.utils.GetFromMap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

public class SelectDepartment implements Task{

	private String department;
	
	public SelectDepartment(String department) {
		this.department = department;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		Target element = GetFromMap.byName(department);
		actor.attemptsTo(ClickElement.validatingA(element, StartException.MESSAGE_DEPARTMENT_NOT_EXIST));
	}

	public static SelectDepartment from(String department) {
		return instrumented(SelectDepartment.class, department);
	}
	
}
