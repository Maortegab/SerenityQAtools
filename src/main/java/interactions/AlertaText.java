package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;

public class AlertaText implements Interaction {
    String Text;

    public AlertaText(String Text){
        this.Text = Text;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(TiempoEspera.unMomento(2));
        Alert alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
        alert.sendKeys(Text);
        alert.accept();
    }

    public static AlertaText enVsmart(String Text){
        return Instrumented.instanceOf(AlertaText.class).withProperties(Text);
    }
}
