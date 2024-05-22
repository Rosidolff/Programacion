/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercitov2;

import personaje.Jefe;
import personaje.Guerrero;
import personaje.Personaje;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author JMart
 */
public class Ejercito {

    private int iJ;
    private List<Personaje> tropa = new ArrayList<>();

    public Ejercito() {
        int miembros = (int) (Math.random() * 4) + 3;
        for (int i = 1; i < miembros; i++) {
            tropa.add(new Guerrero());
        }
        tropa.add(new Jefe());
        iJ = tropa.size() - 1;
    }

    public boolean vivo() {
        boolean vivo = false;
        Personaje pj;
        Iterator<Personaje> it = tropa.iterator();
        while (!vivo && it.hasNext()) {
            pj = it.next();
            if (pj instanceof Guerrero && pj.getVida() > 0) {
                vivo = true;
            }
        }
        return vivo;
    }

    public boolean derrotado() {
        boolean derrotado = false;
        Jefe boss = (Jefe) tropa.get(iJ);
        if (boss.getVida() == 0 && boss.getExtra() == 0) {
            derrotado = true;
        }
        return derrotado;
    }

    public List<Personaje> getTropa() {
        return tropa;
    }

    public void setTropa(List<Personaje> tropa) {
        this.tropa = tropa;
    }

    public void ataque() {
        int golpe = (int) (Math.random() * 10);
        if (vivo()) {
            int guerrero = (int) (Math.random() * (tropa.size() - 1));
            if ((tropa.get(guerrero).getVida() - golpe) < 0) {
                tropa.get(guerrero).setVida(0);
            } else {
                tropa.get(guerrero).setVida(tropa.get(guerrero).getVida()-golpe);
            }
        } else if (!derrotado() && tropa.get(iJ).getVida() > 0) {
            if (tropa.get(iJ).getVida() - golpe > 0) {
                tropa.get(iJ).setVida(tropa.get(iJ).getVida()-golpe);
            } else {
                tropa.get(iJ).setVida(0);
            }
        } else {
            if (((Jefe) tropa.get(iJ)).getExtra() - golpe > 0) {
                ((Jefe) tropa.get(iJ)).setExtra(((Jefe) tropa.get(iJ)).getExtra()-golpe);
            } else {
                ((Jefe) tropa.get(iJ)).setExtra(0);
            }
        }

    }
}
