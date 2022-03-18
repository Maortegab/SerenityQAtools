package stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import task.Alerts;
import task.DatePicker;
import task.WebTables;
import userinterfaces.HomePage;

public class EjemploSemilleroSteps {

    Alert alert;

    public WebDriver getDriver() {
        return driver;
    }

    @Managed(driver = "chrome")
    // CREAR VARIABLES DE NAVEGADOR Y ACTOR
    private WebDriver driver;
    private Actor actor=Actor.named("Global");
    //INSTANCIAR LA CLASE HOMEPAGE
    private HomePage homePage=new HomePage();

    @Dado("que un usuario accede a demoQA")
    public void queUnUsuarioAccedeADemoQA()
    {

        //INDICANDO AL ACTOR QUE PUEDE ACCEDER A UN NAVEGADOR
        actor.can(BrowseTheWeb.with(driver));
        //MAXIMIZAR PANTALLA
        driver.manage().window().maximize();
        //EL ACTOR FUE CAPAZ DE ABRIR
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @Cuando("^el agrega (.*) en nombre, (.*) en apellido, (.*) en email, (.*) en age, (.*) en salary, (.*) en department$")
    public void elAgregaUnProductoAlCarrito(String nombre,String apellido,String email,String edad,String salario, String departamento)
    {
        actor.wasAbleTo(WebTables.conDescripcion(nombre,apellido,email,edad,salario,departamento));

    }

    @Entonces("el ve su registro en la tabla")
    public  void elVeSuRegistroEnLaTabla()
    {

    }

    //-----------------------------------



    @Cuando("^el agrega (.*) en SelectDate, (.*) en DateNTime$")
    public void elAgregaLasFechas(String SelectDate,String DateNTime)
    {
        actor.wasAbleTo(DatePicker.conDescripcion(SelectDate,DateNTime));
    }

    @Entonces("el ve las fechas seleccionadas")
    public  void elVeLasFechasSeleccionadas()
    {

    }

    //-----------------------------------



    @Cuando("^el agrega (.*) en nombre en Alerts$")
    public void elAgregaNombreEnAlerts(String nombre)
    {
        actor.wasAbleTo(Alerts.conDescripcion(nombre));
    }

    @Entonces("el ve su ejecucion exitosa")
    public  void elVeSuEjecucionExitosa()
    {

    }
}
