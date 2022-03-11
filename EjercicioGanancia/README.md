# newTest
se recibe como parametro una lista de empleados con nombre y sueldo neto. se solicita que devuelva una lista con nombre, descuento y sueldo bruto.
solo aquellos sueldos que son superior a 50000.00
donde el descuento será el 7% del sueldo
el sueldo bruto será igual al sueldo neto - el descuento

Datos de ejemplo:
{
"empleados": [
{
"nombre" : "roberto",
"sueldoNeto": 55000.00
},
{
"nombre" : "ricardo",
"sueldoNeto": 80000.00
},
{
"nombre" : "pedro",
"sueldoNeto": 45000.00
}

]
}

Resultado Esperado

[
{
"nombre": "roberto",
"descuento": 3850.0000000000005,
"sueldoBruto": 51150.0
},
{
"nombre": "ricardo",
"descuento": 5600.000000000001,
"sueldoBruto": 74400.0
}
]