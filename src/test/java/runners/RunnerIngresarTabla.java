package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//INDICAR QUE LA PRUEBA SE VA  A EJECUTAR CON SERENITY
@RunWith(CucumberWithSerenity.class)





//RELACION DE DONDE ESTA UBICADA NUESTRA CONFIGURACION

@CucumberOptions(

        features = "src/test/resources/EjemploSemilleros.Feature",//UBICACION DE DONDE SE ENCUENTRA NUESTROS FEATURES
        glue = "stepDefinitions",//UBICACION  DE DONDE SE ENCUENTRA NUESTROS STEPS
        tags = "@EscenarioIngresarEnTabla",//UBICACION DE DONDE SE ENCUENTRA NUESTROS TEMAS
        snippets = CucumberOptions.SnippetType.CAMELCASE //INTERPRETA LA LECTURA DE LOS PASOS EN JAVA
)

public class RunnerIngresarTabla

{

}