Feature: Yo como un usuario de Utest
  quiero crear un nuevo registro
  para acceder como usuario

  Scenario: Usuario Creado correctamente
    Given usuario en la pagina principal
    When El usuario crea una cuenta llenando todos los campos
    Then El usuario ve su nombre de usuario