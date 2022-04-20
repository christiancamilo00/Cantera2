/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Planetario;

/**
 *
 * @author Christian
 */
public class Multiples extends SistemaPlanetario{

    public Multiples(int velocidad) {
        super(velocidad);
    }
    
    

    @Override
    public void estrellas() {
        this.velocidad = velocidad + 5;
    }
    
}
