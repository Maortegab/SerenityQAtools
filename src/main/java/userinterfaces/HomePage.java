package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://demoqa.com/")
public class HomePage extends PageObject
{

    private static String targetElementName;


    //-----------------------WebTables------------------------

    public static final Target BUTTON_ELEMENTS =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[1]"));
    public static final Target BUTTON_WEB_TABLE =Target.the("CLICK EN BOTON WEB TABLE").located(By.xpath("//span[normalize-space()='Web Tables']"));
    public static final Target BUTTON_ADD =Target.the("CLICK EN BOTON ADD").located(By.xpath("//button[@id='addNewRecordButton']"));
    public static final Target TEXT_FIRST_NAME =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("//input[@id='firstName']"));
    public static final Target TEXT_LAST_NAME =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("//input[@id='lastName']"));
    public static final Target TEXT_EMAIL =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("//input[@id='userEmail']"));
    public static final Target TEXT_AGE =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("(//input[@id='age'])[1]"));
    public static final Target TEXT_SALARY =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("(//input[@id='salary'])[1]"));
    public static final Target TEXT_DEPARTMENT =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("(//input[@id='department'])[1]"));
    public static final Target BUTTON_SUBMIT =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("(//button[normalize-space()='Submit'])[1]"));

    //Elementos para eliminar un registro de la tabla en DemoQA/elements

    public static final Target BUTTON_DELETE =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("(//*[name()='path'])[57]"));
    public static final Target BUTTON_HOME =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("(//img[@src='/images/Toolsqa.jpg'])[1]"));

    //-----------------------DatePicker------------------------

    public static final Target BUTTON_WIDGETS =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("(//h5[normalize-space()='Widgets'])[1]"));
    public static final Target BUTTON_DATE_PICKER =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("//div[@class='element-list collapse show']//li[@id='item-2']"));
    public static final Target BUTTON_SELECT_DATE =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("(//input[@id='datePickerMonthYearInput'])[1]"));
    public static final Target BUTTON_DATE_TIME =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("(//input[@id='dateAndTimePickerInput'])[1]"));
    public static final Target BUTTON_HORA =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("//li[normalize-space()='09:45']"));

    //-----------------------Alerts------------------------

    public static final Target BUTTON_ALERTS_FRAME =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("//div[3]//div[1]//div[2]//*[name()='svg']"));
    public static final Target BUTTON_ALERTS =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("//span[normalize-space()='Alerts']"));
    public static final Target BUTTON_SEE_ALERT =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("(//button[@id='alertButton'])[1]"));
    public static final Target BUTTON_TIME_ALERT =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("//button[@id='timerAlertButton']"));
    public static final Target BUTTON_CONF_ALERT =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("(//button[@id='confirmButton'])[1]"));
    public static final Target BUTTON_BOX_ALERT =Target.the("CLICK EN BOTON ELEMENTS").located(By.xpath("(//button[@id='promtButton'])[1]"));
}
