Feature: Iniciar sesión
  Yo como usuario de la pagina
  Quiero iniciar sesión en mi cuenta
  Para acceder a la pagina y poder comprar

  @InicioSesion
  Scenario: Iniciar sesion exitoso
    Given que el usuario esta en la pagina de inicio
    When navega hasta la opcion de iniciar sesion envia las credenciales
    Then el usuario debera ver un texto que ha iniciado sesion "My Account"
