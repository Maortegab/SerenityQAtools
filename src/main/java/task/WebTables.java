package task;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.jetbrains.annotations.NotNull;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class WebTables implements Task
{
    // CREAR VARIABLE
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String age;
    private  String salary;
    private  String department;




    public static WebTables conDescripcion (String nombre,String apellido,String email,String edad,String salario, String departamento)
    {

        return instrumented(WebTables.class,nombre,apellido,email,edad,salario,departamento);


    }

    //CREAR NUESTRO CONSTRUCTOR
    public WebTables(String firstName,String lastName,String email,String age,String salary,String department )

    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.age=age;
        this.salary=salary;
        this.department=department;
    }

    //METODO QUE HEREDA AL OBJETO ACTOR DE LA CLASE EJEMPLOSEMILLEROSTEPS
    @Override
    public <T extends Actor> void performAs(@NotNull T actor)
    {
              //EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO
        actor.attemptsTo(

                TiempoEspera.unMomento(1),
                Click.on(BUTTON_ELEMENTS),
                TiempoEspera.unMomento(1),
                Click.on(BUTTON_WEB_TABLE),
                TiempoEspera.unMomento(1),
                Click.on(BUTTON_ADD),
                TiempoEspera.unMomento(1),
                Enter.theValue(firstName).into(TEXT_FIRST_NAME),
                Enter.theValue(lastName).into(TEXT_LAST_NAME),
                Enter.theValue(email).into(TEXT_EMAIL),
                Enter.theValue(age).into(TEXT_AGE),
                Enter.theValue(salary).into(TEXT_SALARY),
                Enter.theValue(department).into(TEXT_DEPARTMENT),
                TiempoEspera.unMomento(1),
                Click.on(BUTTON_SUBMIT),
                TiempoEspera.unMomento(3),
                Click.on(BUTTON_DELETE),
                TiempoEspera.unMomento(3),
                Click.on(BUTTON_HOME)
        );
 //               Enter.theValue(description).into(INPUT_TXT_BUSQUEDA), //RECIBIR UN VALOR, DILIGENCIA CAMPO BUSQUEDA
 //               Hit.the(Keys.ENTER).into(INPUT_TXT_BUSQUEDA), // REALIZA UN ENTER SOBRE EL CAMPO DE BUSQUEDA


    }
}
