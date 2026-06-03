/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.transportedeproducto.Modelo;

/**
 *
 * @author AKRU
 */
public class Avion  extends Vehiculo {
    
    public Avion(String Name, double Capx) {
        super(Name, Capx);
    }
    @Override
    public void tranp(){
        System.out.println("El avion transporta productos grandes o internacionales por el aire ");
    
    }
}
