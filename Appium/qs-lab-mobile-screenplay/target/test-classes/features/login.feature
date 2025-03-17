@login
Feature: Login en la aplicación mobile de Saucedemo

  @login_exitoso
  Scenario: Inicio de sesión exitoso

    Given que el usuario está en la aplicación de SwagLabs
    When el usuario ingresa sus credenciales usuario "standard_user" y passsword "secret_sauce"
    Then el inicio de sesión es satisfactorio

  @login_usuario_bloqueado
  Scenario: Inicio de sesión con usuario bloqueado

    Given que el usuario está en la aplicación de SwagLabs
    When el usuario ingresa sus credenciales usuario "locked_out_user" y passsword "secret_sauce"
    Then se muestra el mensaje "Sorry, this user has been locked out."