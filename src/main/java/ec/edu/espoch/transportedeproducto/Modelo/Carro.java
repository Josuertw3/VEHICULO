/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.transportedeproducto.Modelo;

import ec.edu.espoch.transportedeproducto.Modelo.Vehiculo;

/**
 *
 * @author AKRU
 */
public class Carro  extends Vehiculo {
    
    public Carro(String Name, double Capx) {
        super(Name, Capx);
    }

    @Override
   public void tranp(){
        System.out.println("La camioneta for transporta correctamente por la carretera de forma eficiente");
   }
    
}
