package com.informaticonfig.spring.demoactividaduno.models;

public class Empleados {
    private String nombre, apellido, direccion, puesto;
    private int edad, telefono, id;

    public Empleados(String nombre, String apellido, String direccion, String puesto,
                        int edad, int telefono, int id  ) {

                            this.telefono = telefono;
                            this.nombre = nombre;
                            this.direccion = direccion;
                            this.apellido = apellido;
                            this.puesto = puesto ;
                            this.id =id;
                            this.edad = edad ; 
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
}
