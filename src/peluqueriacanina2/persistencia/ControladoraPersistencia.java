/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peluqueriacanina2.persistencia;

import peluqueriacanina2.logica.Duenio;
import peluqueriacanina2.logica.Mascota;


public class ControladoraPersistencia {
    DuenioJpaController duenioJpa = new DuenioJpaController ();
    MascotaJpaController mascoJpa = new MascotaJpaController ();

    public void guardar(Duenio duenio, Mascota masco) {
    
        //con este metodo creamos en la base de datos el dueño
        duenioJpa.create(duenio);
        
        //con este metodo creamos en la base de datos el dueño
        mascoJpa.create(masco);
    }
    
    
}
