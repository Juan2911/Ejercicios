package com.feguzman.eg.Service;
import com.Medisoft.Medisoft.Domain.Empleado;
import com.Medisoft.Medisoft.Domain.EmpleadoSueldo;
import com.Medisoft.Medisoft.Domain.Request;
import com.Medisoft.Medisoft.Services.impl.EmpleadoServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestEmpleadoSueldo {
    @Test
    void DeberiaDevolverLaListaCuandoSueldoNetoSeaMayorA50000() {
        EmpleadoServiceImpl empleadoService = new EmpleadoServiceImpl();
        Request request = new Request();
        List<Empleado> empleados = new ArrayList<>();
        Empleado empleado = new Empleado();
        empleado.setNombre("Federico");
        empleado.setSueldoNeto(70000.00);
        empleados.add(empleado);
        request.setEmpleados(empleados);
        List<EmpleadoSueldo> resultado = empleadoService.calcularSueldo(request);
        Assert.assertEquals(resultado.get(0).getNombre(), "Federico");
        Assertions.assertEquals(resultado.get(0).getDescuento(), 4900);
        Assertions.assertEquals(resultado.get(0).getSueldoBruto(), 65100);

    }
}
