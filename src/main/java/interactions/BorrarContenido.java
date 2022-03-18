package interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.lang.annotation.Target;

public class BorrarContenido implements Interaction{

    Target target;

    public BorrarContenido (Target target){this.target=target;}

    @Override
    public <T extends Actor> void performAs(T actor) {
//        while (target.toString()!=""){
//            Hit.the(Keys.BACK_SPACE);
//        }

        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_A);
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
        } catch (AWTException e) {
            e.printStackTrace();
        }

//            robot.keyPress(KeyEvent.VK_BACK_SPACE);

        //Hit.the(Keys.CONTROL);
        //Hit.the(Keys.BACK_SPACE);
    }

    public static BorrarContenido borrar (Target target){
        return Instrumented.instanceOf(BorrarContenido.class).withProperties(target);
    }
}
