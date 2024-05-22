/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaejemploejercicio5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author pc
 */

//Clase Usuario hereda de Persona
class Usuario extends Persona {
    private int usuarioId;

    public Usuario(int personaId, String nombre, String apellidos, String dni, String correo, String telefono, String contrasena, Date fechaNacimiento, String rol, Date fechaCreacion, int usuarioId) {
        super(personaId, nombre, apellidos, dni, correo, telefono, contrasena, fechaNacimiento, rol, fechaCreacion);
        this.usuarioId = usuarioId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }
}