package task;

import interactions.Alerta;
import interactions.AlertaText;
import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.jetbrains.annotations.NotNull;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;



public class Alerts implements Task

{
    // CREAR VARIABLE
    private  String nombre;





    public static Alerts conDescripcion (String nombre)
    {
        return instrumented(Alerts.class,nombre);
    }

    //CREAR NUESTRO CONSTRUCTOR
    public Alerts(String nombre)

    {
        this.nombre=nombre;
    }

    //METODO QUE HEREDA AL OBJETO ACTOR DE LA CLASE EJEMPLOSEMILLEROSTEPS
    @Override
    public <T extends Actor> void performAs(@NotNull T actor)
    {

        //EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO



        actor.attemptsTo(
                TiempoEspera.unMomento(1),
                Click.on(BUTTON_ALERTS_FRAME),
                Click.on(BUTTON_ALERTS),
                TiempoEspera.unMomento(1),
                Click.on(BUTTON_SEE_ALERT),
                Alerta.enVsmart(),
                Click.on(BUTTON_TIME_ALERT),
                TiempoEspera.unMomento(5),
                Alerta.enVsmart(),
                Click.on(BUTTON_CONF_ALERT),
                Alerta.enVsmart(),
                Click.on(BUTTON_BOX_ALERT),
                AlertaText.enVsmart(nombre),
                //alert.accept());

                //wait(ExpectedConditions.alertIsPresent(Click.on(finalize()))),
                //Enter.theValue(nombre).into(BUTTON_SELECT_DATE).thenHit(Keys.ENTER),

                TiempoEspera.unMomento(3),
                Click.on(BUTTON_HOME),
                TiempoEspera.unMomento(3)
        );
        //               Enter.theValue(description).into(INPUT_TXT_BUSQUEDA), //RECIBIR UN VALOR, DILIGENCIA CAMPO BUSQUEDA
        //               Hit.the(Keys.ENTER).into(INPUT_TXT_BUSQUEDA), // REALIZA UN ENTER SOBRE EL CAMPO DE BUSQUEDA


    }
}