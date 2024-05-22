/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejemploejercicio5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Clase Persona
class Persona {
    private int personaId;
    private String nombre;
    private String apellidos;
    private String dni;
    private String correo;
    private String telefono;
    private String contrasena;
    private Date fechaNacimiento;
    private String rol;
    private Date fechaCreacion;

// Constructor
    public Persona(int personaId, String nombre, String apellidos, String dni, String correo, String telefono, String contrasena, Date fechaNacimiento, String rol, Date fechaCreacion) {
        this.personaId = personaId;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.correo = correo;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
        this.fechaCreacion = fechaCreacion;
    }

// Getters and setters
    public int getPersonaId() {
        return personaId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getRol() {
        return rol;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }
}