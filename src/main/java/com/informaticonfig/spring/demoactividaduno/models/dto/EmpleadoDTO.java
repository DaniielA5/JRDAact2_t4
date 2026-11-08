package com.informaticonfig.spring.demoactividaduno.models.dto;

public class EmpleadoDTO {
    private Integer id;
    private String nombre;
    private String apellido;
    private String puesto;
    private Integer edad;

    public EmpleadoDTO() {

    }

    public EmpleadoDTO(Integer id, String nombre, String apellido, String puesto , Integer edad) {
        this.id =id ;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.edad = edad;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    
}
