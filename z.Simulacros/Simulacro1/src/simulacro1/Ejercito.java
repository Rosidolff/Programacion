/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacro1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author JMart
 */
public class Ejercito {

    int iJ;
    List<Personaje> tropa = new ArrayList<>();

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
            if (pj instanceof Guerrero && pj.vida > 0) {
                vivo = true;
            }
        }
        return vivo;
    }

    public boolean derrotado() {
        boolean derrotado = false;
        Jefe boss = (Jefe) tropa.get(iJ);
        if (boss.vida == 0 && boss.extra == 0) {
            derrotado = true;
        }
        return derrotado;
    }

    public void ataque() {
        int golpe = (int) (Math.random() * 10);
        if (vivo()) {
            int guerrero = (int) (Math.random() * (tropa.size() - 1));
            if ((tropa.get(guerrero).vida - golpe) < 0) {
                tropa.get(guerrero).vida = 0;
            } else {
                tropa.get(guerrero).vida -= golpe;
            }
        } else if (!derrotado() && tropa.get(iJ).vida > 0) {
            if (tropa.get(iJ).vida - golpe > 0) {
                tropa.get(iJ).vida -= golpe;
            } else {
                tropa.get(iJ).vida = 0;
            }
        } else {
            if (((Jefe) tropa.get(iJ)).extra - golpe > 0) {
                ((Jefe) tropa.get(iJ)).extra -= golpe;
            } else {
                ((Jefe) tropa.get(iJ)).extra = 0;
            }
        }

    }
}
