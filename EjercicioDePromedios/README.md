# newTest

La aplicacion cuenta con un controller estudiante, un servicio estudiante con un metodo resultado aprobacion
existen 3 clases de dominio:
	estudiante
	requestEstudiante
	estudianteResultado

cada clase tiene los siguientes atributos:
	estudiante:
		nombre;
		primerParcial;
		segundoParcial;
		tercerParcial;
	estudianteResultado:
		nombre;
		resultado;
		promedio;
	requestEstudiante:
		lista Estudiante;

se recibirá como parametro una lista de estudiantes (el objeto requestEstudiante) y se solicita que por cada estudiante
en la lista se calcule su promedio y si aprobó o quedó libre de la siguiente manera:
	promedio >= 6 resultado: "aprobó"
	promedio < 6 resultado: "libre"

devolver una lista de estudianteResultado que tenga el nombre de cada estudiante, su promedio y su resultado.
puede apoyarse en la clase definida estudianteResultado.
dado sus conocimientos, deberá definir en que paquete deberá realizar la lógica.



Datos de ejemplo: 

{
  "estudiantes": [
    {
      "nombre": "roberto",
      "primerParcial": 3,
      "segundoParcial": 4,
      "tercerParcial": 1
    },
    {
      "nombre": "diego",
      "primerParcial": 7,
      "segundoParcial": 2,
      "tercerParcial": 4
    },
    {
      "nombre": "miguel",
      "primerParcial": 9,
      "segundoParcial": 10,
      "tercerParcial": 1
    },
    {
      "nombre": "maria",
      "primerParcial": 6,
      "segundoParcial": 7,
      "tercerParcial": 6
    }
  ]
}

Resultado Esperado

{
  [
    {
      "nombre": "roberto",
      "resultado": "libre",
      "promedio": 2.66666
    },
    {
      "nombre": "diego",
      "resultado": "libre",
      "promedio": 4.33333333
    },
    {
      "nombre": "miguel",
      "resultado": "aprobo",
      "promedio": 6.6666666
    },
    {
      "nombre": "maria",
      "resultado": "aprobo",
      "promedio": 6.33333
    }
  ]
}