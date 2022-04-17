/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Naves;

/**
 *
 * @author Christian
 */
public abstract class nEspaciales {
    public int velocidad;
    public int motores;
    public int propulsores;
    public int tanque;
    public abstract void acceleracion();
    
    public nEspaciales(int velocidad){
        this.velocidad = velocidad;
        this.motores = 0;
        this.propulsores = 0;
        this.tanque =0;
    
        } 

    void velocidad() {
        this.velocidad =20;
    }

    void tanque() {
        this.tanque=5;
    }
    
    
}

