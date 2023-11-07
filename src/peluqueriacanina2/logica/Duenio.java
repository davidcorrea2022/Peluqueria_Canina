/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peluqueriacanina2.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    @Id
    @GeneratedValue (strategy =GenerationType.SEQUENCE)
    private int id_Duenio;
    private String nombre;
    private String CelDuenio;

    public Duenio() {
    }

    public Duenio(int id_Duenio, String nombre, String CelDuenio) {
        this.id_Duenio = id_Duenio;
        this.nombre = nombre;
        this.CelDuenio = CelDuenio;
    }

    public int getId_Duenio() {
        return id_Duenio;
    }

    public void setId_Duenio(int id_Duenio) {
        this.id_Duenio = id_Duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelDuenio() {
        return CelDuenio;
    }

    public void setCelDuenio(String CelDuenio) {
        this.CelDuenio = CelDuenio;
    }
    
    
    
}
