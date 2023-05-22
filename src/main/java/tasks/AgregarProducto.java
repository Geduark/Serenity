package tasks;

import com.openhtmltopdf.css.constants.PageElementPosition;
import interactions.SelectOptions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.DetallesArticuloPage.*;

public class AgregarProducto implements Task {

    private String cantidad;

    public AgregarProducto(String cantidad){
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CANTIDAD),
                SelectOptions.elegirPorItem(CANTIDAD_ARTICULO,cantidad),
                Click.on(AGREGAR_CARRITO), // agregar al carrito
                Click.on(VER_CARRITO) //ver el carrito
        );
    }



    public static AgregarProducto cantidad(String cantidad) {
        return instrumented(AgregarProducto.class,cantidad);
    }

}
