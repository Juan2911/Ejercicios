package com.Medisoft.Medisoft.Services.impl;

import com.Medisoft.Medisoft.Domain.Empleado;
import com.Medisoft.Medisoft.Domain.EmpleadoSueldo;
import com.Medisoft.Medisoft.Domain.Request;
import com.Medisoft.Medisoft.Services.EmpleadoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Override
    public List<EmpleadoSueldo> calcularSueldo(Request request) {
        List<Empleado> trabajadores = request.getEmpleados();
        List<EmpleadoSueldo> valores = new ArrayList<>();
        for (Empleado trabajador: trabajadores) {
            double A = trabajador.getSueldoNeto();
            if (A > 50000.00) {
                EmpleadoSueldo empleadoSueldo = new EmpleadoSueldo();
                double descuento;
                descuento = A * 7 / 100;
                double sueldoBruto;
                sueldoBruto = A - descuento;
                empleadoSueldo.setNombre(trabajador.getNombre());
                empleadoSueldo.setDescuento(descuento);
                empleadoSueldo.setSueldoBruto(sueldoBruto);
                valores.add(empleadoSueldo);
            }
        }


        return valores;
    }
}
