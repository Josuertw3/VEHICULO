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
public class Moto extends Vehiculo {
    
    public Moto(String Name, double Capx) {
        super(Name, Capx);
    }
    @Override
    public void tranp(){
        System.out.println("La tricimoto transporta los productos pequenos en las areas urbanas del maleccon 2000 ");
    
    }
}
