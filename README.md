# Practica_Despliegue

Desplegar usando Docker nuestra App Java sabiendo que usaremos una compilación multi etapa y usando un proxy inverso:

/ apuntará a un Nginx con presentación del proyecto y enlace al resto de secciones que se describen
/doc apuntará a un servidor Apache con la documentación
/test apuntará a un servidor Nginx con el informe de tests unitarios
/coverage apuntará a un servidor Nginx con el informe de cobertura.
Nuestro dominio será app.com y tendrá SSL/TSL. 
