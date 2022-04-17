/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Date;

/**
 * Representa la clase Persona con sus atributos y metodos.
 * @author Christian Camilo Arias.
 */
public class Persona {
     //Variables de la clase
   public String name ;
   public String lastName1;
   public String lastName2;
   public Date dateBirth;
   public float height;

    //Contructor
    public Persona() {
    }
    //Metodos
    public String setName(String name){
        return name;
    }
    
    public String getName(){
        return name;
    }
    
}
