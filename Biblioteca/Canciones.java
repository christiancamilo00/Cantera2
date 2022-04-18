/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

/**
 *
 * @author Christian
 */
public class Canciones {

    String nombreDisco;
    String autor;
    String formato;
    String[] nombreCancion;
    int indiceCancion;
    double duracion;
    double[] duracionCancion;
  
    


    public Canciones(){
        nombreDisco = "";
        autor = "";
        formato = "";
        duracion = 0;
        indiceCancion = 0;
        nombreCancion = new String [20];
        duracionCancion = new double [20];
    }
    
    public void setNombreDisco(String ingresoNombreDisco){
        nombreDisco = ingresoNombreDisco;
    }
   
    public void setAutor(String ingresoAutor){
        autor = ingresoAutor;
    }
   
    public void setFormato(String ingresoFormato){
        formato = ingresoFormato;
    }
   
    public void setIndiceCancion(int ingresoIndiceCancion){
        indiceCancion = ingresoIndiceCancion;
    }
   
    public int getIndiceCancion(){
        return indiceCancion;
    }
   
    public String getNombreDisco(){
        return nombreDisco;
    }
   
    public String getAutor(){
        return autor;
    }
   
    public String getFormato(){
        return formato;
    }
}
