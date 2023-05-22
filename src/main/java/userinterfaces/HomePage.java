package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

// //a//span[contains(.,'iPhone 13 Pro, 128GB, grafito')]
@DefaultUrl("https://www.amazon.com/-/es/ref=nav_logo")
public class HomePage extends PageObject {

    public static final Target INPUT_BUSCAR_OBJETO = Target.the("Input donde se realizara la busqueda").located(By.id("twotabsearchtextbox"));
    public static final Target LINK_OBJETO_ENCONTRADO = Target.the("Link del objeto encontrado").locatedBy("//a//span[contains(.,'{0}')]");

}
