/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Naves;

/**
 *
 * @author Christian
 */
public class Lanzadera extends nEspaciales{
    
    public Lanzadera(int velocidad){
    super(velocidad);
    
    }

    @Override
    public void acceleracion() {
          this.velocidad = this.velocidad + 30;
    }
    
    
}
