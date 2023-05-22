package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetallesArticuloPage {

    public static final Target COLOR_ARTICULO = Target.the("Caracteristicas del articulo").located(By.name("0"));
    public static final Target BOTON_CANTIDAD = Target.the("Caracteristicas del articulo").locatedBy("//span[contains(text(),'Cantidad:')]");
    public static final Target CANTIDAD_ARTICULO = Target.the("Caracteristicas del articulo").locatedBy("//div//ul//li[@role='option']");
    public static final Target AGREGAR_CARRITO = Target.the("Caracteristicas del articulo").located(By.id("add-to-cart-button"));   //a//span[contains(.,'{0}')]")
    public static final Target VER_CARRITO = Target.the("Detalle del carrito").locatedBy("//span[@id='attach-sidesheet-view-cart-button']");   //a//span[contains(.,'{0}')]")
}
