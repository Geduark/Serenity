package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.INPUT_BUSCAR_OBJETO;
import static userinterfaces.HomePage.LINK_OBJETO_ENCONTRADO;

public class BuscarProcucto implements Task {

    private String descripcion;

    public BuscarProcucto(String descripcion){
        this.descripcion = descripcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(descripcion).into(INPUT_BUSCAR_OBJETO),
             //   SelectFromOptions.byVisibleText(tipoCategoria).from(),
                Hit.the(Keys.ENTER).into(INPUT_BUSCAR_OBJETO),
                Click.on(LINK_OBJETO_ENCONTRADO.of(descripcion))
        );
    }

    public static BuscarProcucto conDescripcion(String descripcion) {
        return instrumented(BuscarProcucto.class, descripcion);
    }

}
