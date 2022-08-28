package com.example.projectciclo3;

public class Empleado {

    private String nombre;

    private String correo;

    private String empresaEmpleado;

    private String rolEmpleado;

    public Empleado(String nombre, String correo, String empresaEmpleado, String rolEmpleado) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresaEmpleado = empresaEmpleado;
        this.rolEmpleado = rolEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}
