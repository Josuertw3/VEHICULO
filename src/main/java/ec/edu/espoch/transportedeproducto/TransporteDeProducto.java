/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.transportedeproducto;

import ec.edu.espoch.transportedeproducto.Modelo.Carro;
import ec.edu.espoch.transportedeproducto.Modelo.Moto;
import ec.edu.espoch.transportedeproducto.Modelo.Avion;

/**
 *
 * @author AKRU
 */
public class TransporteDeProducto {

    public static void main(String[] args) {
        Carro carro = new Carro(" Camioneta Ford125", 710);
        Moto moto = new Moto("tricimoto", 200);
        Avion avion = new Avion("Avion", 250000);

        System.out.println("Nombre: " + carro.getName());
        System.out.println("La capacidad maxima de carga: " + carro.getCapx() + " kg");
        carro.tranp();
        System.out.println("La velocidad es: " + carro.calcularDistancia(80) + " km");
        //System.out.println(La velocidad * tiempo es: " + carro.calcularDistancia(80, 2) + " km");
        //System.out.println("La velocidad  con constante es: " + carro.calcularDistancia(80, 2, 0.9) + " km");

        System.out.println("Nombre: " + moto.getName());
        System.out.println("La capacidad maxima de carga: " + moto.getCapx() + " kg");
        moto.tranp();
        System.out.println("La velocidad es: " + moto.calcularDistancia(60) + " km");
        System.out.println("La velocidad * tiempo es: " + moto.calcularDistancia(60, 1.5) + " km");
        System.out.println("La velocidad con constante es : " + moto.calcularDistancia(60, 1.5, 0.8) + " km");

        System.out.println("Nombre: " + avion.getName());
        System.out.println("La capacidad maxima de carga: " + avion.getCapx() + " kg");
        avion.tranp();
        System.out.println("La velocidad es: " + avion.calcularDistancia(700) + " km");
        //System.out.println("La velocidad * tiempo es: " + avion.calcularDistancia(700, 3) + " km");
        //System.out.println("La velocidad con constate es: " + avion.calcularDistancia(700, 3, 0.95) + " km");
    }
}
