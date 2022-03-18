# language: es

Característica: Ingreso a la pagina demoQA
  como un nuevo usuario
  quiero ingresar a la pagina www.demoQA.com
  para probar las funcionalidades

  @EscenarioIngresarEnTabla
  Escenario: ingresar datos en tabla de WebTable
    Dado que un usuario accede a demoQA
    Cuando el agrega Miguel en nombre, Ortega en apellido, prueba@mail.com en email, 25 en age, 1000 en salary, Bogotá D.C en department
    Entonces el ve su registro en la tabla

  @EscenarioDatePicker
  Escenario: ingresar fecha en datePicker
    Dado que un usuario accede a demoQA
    Cuando el agrega 08/12/2002 en SelectDate, January 15, 2005 en DateNTime
    Entonces el ve las fechas seleccionadas

  @EscenarioAlerts
  Escenario: ingresa a probar alertas
    Dado que un usuario accede a demoQA
    Cuando el agrega Miguel en nombre en Alerts
    Entonces el ve su ejecucion exitosa
