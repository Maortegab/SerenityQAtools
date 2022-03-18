package task;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;


public class DatePicker implements Task

{
    // CREAR VARIABLE
    private  String selectDate;
    private  String DateNTime;

    public static DatePicker conDescripcion (String selectDate,String DateNTime)
    {
        return instrumented(DatePicker.class,selectDate,DateNTime);
    }

    //CREAR NUESTRO CONSTRUCTOR
    public DatePicker(String selectDate,String DateNTime)

    {
        this.selectDate=selectDate;
        this.DateNTime=DateNTime;

    }

    //METODO QUE HEREDA AL OBJETO ACTOR DE LA CLASE EJEMPLOSEMILLEROSTEPS
    @Override
    public <T extends Actor> void performAs(@NotNull T actor)
    {
        //EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO
        actor.attemptsTo(

                TiempoEspera.unMomento(1),
                Click.on(BUTTON_WIDGETS),
                Click.on(BUTTON_DATE_PICKER),
                TiempoEspera.unMomento(1),

                Hit.the(Keys.SHIFT,Keys.HOME).into(BUTTON_SELECT_DATE),
                Hit.the(Keys.BACK_SPACE).into(BUTTON_SELECT_DATE),

                TiempoEspera.unMomento(1),
                Enter.theValue(selectDate).into(BUTTON_SELECT_DATE).thenHit(Keys.ENTER),
                TiempoEspera.unMomento(1),

                Hit.the(Keys.SHIFT,Keys.HOME).into(BUTTON_DATE_TIME),
                Hit.the(Keys.BACK_SPACE).into(BUTTON_DATE_TIME),

                TiempoEspera.unMomento(1),
                Enter.theValue(DateNTime).into(BUTTON_DATE_TIME),
                TiempoEspera.unMomento(1),
                Click.on(BUTTON_HORA),
                TiempoEspera.unMomento(2),

                Click.on(BUTTON_HOME),
                TiempoEspera.unMomento(2)
                );
    }

}