/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaje;

/**
 *
 * @author JMart
 */
public abstract class Personaje {

    static protected int inicializador = 0;
    protected int codigo;
    protected int vida;

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"codigo: " + codigo + " vida: " + vida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if (vida<0){
            this.vida=0;
        } else
        this.vida = vida;
    }

}
