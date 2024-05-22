/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaejemploejercicio5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author pc
 */
public class JavaEjemploEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Crearndo objetos Persona, Usuario, Empleado, Pago, Tramite, FAQ, Notificacion
         
        Persona persona1 = new Persona(1, "Juan", "Pérez", "12345678A", "juan@example.com", "123456789", "password123", new Date(), "usuario", new Date());

        Usuario usuario1 = new Usuario(1, "María", "Gómez", "23456789B", "maria@example.com", "987654321", "clave123", new Date(), "usuario", new Date(), 1);

        Empleado empleado1 = new Empleado(2, "Ana", "Sánchez", "45678901D", "ana@example.com", "654321987", "password456", new Date(), "admin", new Date(), 2);

        Pago pago1 = new Pago(1, new Date(), true);

        Tramite tramite1 = new Tramite(1, new Date(), new Date(), "tipo1", 100.0f);

        Faq faq1 = new Faq(1, "¿Cómo crear cuenta?", "En la página de registro.");

        Notificacion notificacion1 = new Notificacion(1, new Date(), "Su solicitud ha sido aprobada.");

        // Mostrar algunos datos para verificar
        System.out.println("Persona: " + persona1.getNombre() + " " + persona1.getApellidos());
        System.out.println("Usuario: " + usuario1.getNombre() + " " + usuario1.getApellidos());
        System.out.println("Empleado: " + empleado1.getNombre() + " " + empleado1.getApellidos());
        System.out.println("Pago: " + pago1.getFechaPago());
        System.out.println("Trámite: " + tramite1.getTipoTramite());
        System.out.println("FAQ: " + faq1.getPregunta());
        System.out.println("Notificación: " + notificacion1.getTextoNotificacion());
    }
    
}
