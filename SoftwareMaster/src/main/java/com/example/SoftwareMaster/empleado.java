package com.example.SoftwareMaster



public class empleado{

    private String nombre;

    private String correo;

    private String  empresaEpleado;

    private String rolEmpleado;

    public empleado(String nombre, String correo, String empresaEpleado, String rolEmpleado) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresaEpleado = empresaEpleado;
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

    public String getEmpresaEpleado() {
        return empresaEpleado;
    }

    public void setEmpresaEpleado(String empresaEpleado) {
        this.empresaEpleado = empresaEpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
}