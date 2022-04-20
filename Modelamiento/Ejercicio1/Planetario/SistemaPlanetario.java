/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Planetario;

/**
 *
 * @author Christian
 */
    
    public abstract class SistemaPlanetario {
    public int velocidad;
    public int masa;
    public int densidad;
    public int diametro;
    public abstract void estrellas();
    
    public SistemaPlanetario(int velocidad){
        this.velocidad = velocidad;
        this.masa = 0;
        this.densidad = 0;
        this.diametro =0;
    
        } 
    
    public int atraccion(){
        
        return 0;
        
    } 
    
}
