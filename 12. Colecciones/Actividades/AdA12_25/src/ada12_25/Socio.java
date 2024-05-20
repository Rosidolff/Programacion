/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ada12_25;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author JMart
 */
public class Socio implements Comparable<Socio>{
    String nombre;
    LocalDate fi;

    
    
    public Socio(String nombre, String fi) {
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.nombre = nombre;
        this.fi = LocalDate.parse(fi, form);
        
        
    }

    @Override
    public int compareTo(Socio o) {
       return  fi.compareTo(o.fi);
    }

    @Override
    public String toString() {
        return "nombre: "+nombre+" Fecha Inscripcion: "+fi+"\n";
    }
    
}
