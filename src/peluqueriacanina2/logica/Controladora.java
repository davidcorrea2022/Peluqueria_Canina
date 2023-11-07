/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peluqueriacanina2.logica;

import peluqueriacanina2.persistencia.ControladoraPersistencia;


public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia ();

    public void guardar(String nombreMasco, String raza, String Color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String CelDuenio) {
      
        //creamos el dueño y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(CelDuenio);
        
        //creamos la mascota y asignamos sus valores
        Mascota masco = new Mascota ();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(Color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio);
        
        controlPersis.guardar (duenio, masco);
        
        
        
        
    }
    
    
    
}
