@hospital
Feature: Administracion de un hospital publico
  como usuario
  Quiero administrar un hospital
  A traves de la APP Sistema de administración de hospitales

  @registrarDoctor
  Scenario Outline: Registro de un nuevo doctor
    Given que el Usuario quiere registar un doctor
    When cuando el ingresa los datos solicitados
      |nombres|apellidos|telefono|tipodoc|nrodoc|
      |<nombres>|<apellidos>|<telefono>|<tipodoc>|<nrodoc>|
    Then el verifica el mensaje Datos guardados correctamente
    Examples:
    |nombres|apellidos|telefono|tipodoc|nrodoc|
    ##externaldata@.src/test/resources/Datadriven/dtDatos2.xlsx@datos

