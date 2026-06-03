/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.transportedeproducto.Modelo;

/**
 *
 * @author AKRU
 */
public abstract class Vehiculo {

    private String Name;
    private double Capx;

    public Vehiculo(String Name, double Capx) {
        this.Name = Name;
        this.Capx = Capx;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getCapx() {
        return Capx;
    }

    public void setCapx(double Capx) {
        this.Capx = Capx;
    }

    public abstract void tranp();

    public double calcularDistancia(double velocidad) {
       
        return velocidad*1;
    }

    public double calcularDistancia(double velocidad, double tp) {

        return velocidad*tp;
    }

    public double calcularDistancia(double velocidad, double tp, double c) {

        return velocidad*tp*c;
    }

}
