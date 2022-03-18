package interactions;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;

public class Alerta implements Interaction {
    private Alert alert;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(TiempoEspera.unMomento(2));
        alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
        alert.accept();
    }

    public static Alerta enVsmart(){
        return Instrumented.instanceOf(Alerta.class).withProperties();
    }
}
