# newTest
En este ejercicio se puede acceder a cualquier ejercicio previo para poder realizarlo, sepa que se le realizarán preguntas para fundamentar lo que esta realizado
puede copiar codigo, pero hacemos la misma aclaración, habrá preguntas sobre el código.

El ejercicio se trata de una agencia de viajes, donde solo se realizará la funcionalidad de buscar detalles de vuelos agendados.

se recibe como parametros un grupo de pasajeros (lease lista), cada elemento del grupo tendrá:
    cadena nombre
    entero tipoDeTarifa
se solicita que se devuelva un grupo de elementos que tenga:
    cadena nombre
    cadena descripcionDeTarifa
    flotante/decimales tarifa (recuerde que en java, los flotantes terminan en F ej: 5.0F; en decimales no es necesario ninguna letra)

Intente definir las clases lo mas significativos posible (Por mas grande que sean las funciones, o clases, que traten de decir lo que hace, o para que sirve)


siendo
    tipoDeTarifa 1 ; DescripcionDeTarifa = Niño      ; Tarifa = 7500.00
    tipoDeTarifa 2 ; DescripcionDeTarifa = Adulto    ; Tarifa = TarifaNiño + 30 % de TarifaNiño 
    tipoDeTarifa 3 ; DescripcionDeTarifa = Jubilado  ; Tarifa = TarifaNiño - 10 %  

Datos de ejemplo:
{
  "pasajeros": [
    {
      "nombre": "teo",
      "tipoTarifa": 1
    },
    {
      "nombre": "gloria",
      "tipoTarifa": 2
    },
    {
      "nombre": "manolo",
      "tipoTarifa": 2
    },
    {
      "nombre": "mauricio",
      "tipoTarifa": 3
    },
    {
      "nombre": "virgilio",
      "tipoTarifa": 1
    },
    {
      "nombre": "joaquin",
      "tipoTarifa": 3
    }
  ]
}

Resultado Esperado

[
    {
        "nombre": "teo",
        "descripcionDeTarifa": "Niño",
        "tarifa": 7500.0
    },
    {
        "nombre": "gloria",
        "descripcionDeTarifa": "Adulto",
        "tarifa": 9750.0
    },
    {
        "nombre": "manolo",
        "descripcionDeTarifa": "Adulto",
        "tarifa": 9750.0
    },
    {
        "nombre": "mauricio",
        "descripcionDeTarifa": "Jubilado",
        "tarifa": 6750.0
    },
    {
        "nombre": "virgilio",
        "descripcionDeTarifa": "Niño",
        "tarifa": 7500.0
    },
    {
        "nombre": "joaquin",
        "descripcionDeTarifa": "Jubilado",
        "tarifa": 6750.0
    }
]

