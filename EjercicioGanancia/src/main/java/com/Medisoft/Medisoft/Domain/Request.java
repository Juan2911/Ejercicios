package com.Medisoft.Medisoft.Domain;

import java.util.List;

public class Request {
    List<Empleado> empleados;

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
