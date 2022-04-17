/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Naves;



/**
 *
 * @author Christian
 */
public class Main {
   
    
     public static void main(String args[]) {
       
             Lanzadera nave1 = new Lanzadera(10);
             NoTripuladas nave2 = new NoTripuladas(20);
             Tripuladas nave3 = new Tripuladas(40);

             nave1.velocidad();
             nave2.tanque();
             nave3.tanque();
             
        }


}
