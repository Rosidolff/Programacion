/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar12_14;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 *
 * @author JMart
 */
public class Registro implements Serializable {
     double temperatura;
     LocalTime hora;

    public Registro(double t) {
        this.temperatura = t;
        this.hora = LocalTime.now();
    }

    @Override
    public boolean equals(Object obj) {
        return hora.equals(((Registro)obj).hora);
    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
        return "Registro(" + "hora=" + hora.format(f) + ", temperatura=" + temperatura + "ºC)\n";
    }
    
    
    
    
}
