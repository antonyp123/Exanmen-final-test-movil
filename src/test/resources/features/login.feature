Feature: Inicio de sesion



@test
Scenario: Iniciar sesión
Given que me encuentro en la pantalla de login de airbn
When inicio sesión con las credenciales usuario: "standard_user" y contraseña: "secret_sauce"
Then valido que debería aparecer el título de "PRODUCTS"
And también valido que al menos exista un item