#language:es
  Característica: registro de usuario
    yo como usuario quiero validar un registro
    de usuario
  Escenario: Inicio de sesion exitoso

    Dado que el usuario abra el navegador en la URL
      Y se pose sobre la opcion perfil
      Y de click en el boton Registrar
      Y de click en la opcion ingresar a HACEB
      Y se debe llenar los campos
      Y seleccionar el campo de terminos y condiciones
      Y seleccionar el campo de autorizacion de datos
      Y dar click en registrarme
    Cuando puede visualizar la pestaña de perfil
