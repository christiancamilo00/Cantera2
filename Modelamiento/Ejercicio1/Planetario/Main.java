/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Planetario;

/**
 *
 * @author Christian
 */
public class Main {
     public static void main(String args[]) {
       
             ExtraSolar solar1 = new ExtraSolar(30);
             Multiples solar2 = new Multiples(50);
             SistemaPlanetario solar3 = new SistemaPlanetario(58) {
                 @Override
                 public void estrellas() {
                      this.estrellas();
                 }
             };

             solar3.atraccion();
             System.out.println(solar3.atraccion());
             
        }
}

