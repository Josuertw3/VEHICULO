/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espoch.transportedeproducto.intefaces;

import ec.edu.espoch.transportedeproducto.Modelo.Vehiculo;

/**
 *
 * @author AKRU
 */


public interface VehiculoDAO {

   public void mostrarDatos(Vehiculo vehiculo);

    public void mostrarDistancias(Vehiculo vehiculo, double velocidad, double tiempo, double c);
}