
package ar11_2;

import java.io.*;


public class AR11_2 {


    public static void main(String[] args) {

        String cancion = """
                         Con diez cañones por banda,
                         viento en popa a toda vela,
                         no corta el mar si no vuela
                         un velero bergantín!.
                         
                         Bajel pirata que llaman
                         por su brabura el temido,
                         en todo el mar conocido,
                         del uno al otro confín.
                         
                         que es mi barco mi tesoro
                         que es mi dios la libertad
                         mi ley la fuerza del viento
                         mi única patria la mar. 
                         
                        navega velero mio
                         que sin temor ni enemigo navio                         
                         """;
    
        try (ObjectOutputStream out = new ObjectOutputStream (new FileOutputStream("cancionPirata.dat"))){
            out.writeObject(cancion);
        } catch (IOException ex){
            System.out.println(ex);
        }
    }
    
    
    
}
