/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.transportedeproducto.Dao;

import ec.edu.espoch.transportedeproducto.intefaces.VehiculoDAO;
import ec.edu.espoch.transportedeproducto.Modelo.Vehiculo;

/**
 *
 * @author AKRU
 */
public class VehiculoImpl implements VehiculoDAO {

    @Override
    public void mostrarDatos(Vehiculo vehiculo) {
        System.out.println("Nombre: " + vehiculo.getName());
        System.out.println("Capacidad maxima de carga: " + vehiculo.getCapx() + " kg");
        vehiculo.tranp();
    }

    @Override
    public void mostrarDistancias(Vehiculo vehiculo, double velocidad, double tiempo, double c) {
        System.out.println("La  velocidad: "
                + vehiculo.calcularDistancia(velocidad) + " km");

        System.out.println("Distancia con velocidad y tiempo: "
                + vehiculo.calcularDistancia(velocidad, tiempo) + " km");

        System.out.println("Distancia con constante: "
                + vehiculo.calcularDistancia(velocidad, tiempo, c) + " km");
    }
}
