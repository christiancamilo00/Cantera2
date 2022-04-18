/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;
   
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Main {
 
    private static char opcion;
    private static int salir, elige, num, full;
    public String nombreDisco, autor, formato, nombreCancion[];
    
  
   
    public static void main (String[]args){
    String data;
    int can = 0;
       
    Canciones Disco1 = new Canciones();
    Canciones Disco2 = new Canciones();
    Canciones Disco3 = new Canciones();
    Scanner in = new Scanner(System.in);   
    do{
        System.out.println("Bienvenido que opcion desea ejecutar?");
        System.out.println("Ingresa A para añadir playlist.");
        System.out.println("Ingrese B para añadir una cancion a la playlist.");
        System.out.println("Ingrese C para obtener la informacion de la playlist..");
        System.out.println("Ingrese D para salir del programa");
        opcion = in.next().charAt(0);
        switch(opcion){
            case 'A':
            case 'a':
                System.out.println("***************************************************");
                System.out.println("A cual de los 3 playlist deseas añadirle canciones?");
                elige = in.nextInt();
                if (elige == 1){
                    System.out.println("Has elegido la playlist 1!");
                    System.out.println("Ingesa el nombre de la cancion 1: ");
                    data = in.next();
                    Disco1.setNombreDisco(data);
                    System.out.println("Ingresa el autor del cancion 1: ");
                    data = in.next();
                    Disco1.setAutor(data);
                    System.out.println("Ingresa el formato del cancion 1: ");
                    data = in.next();
                    Disco1.setFormato(data);
                    System.out.println("<------------------------------------------------->");
                    System.out.println("Ahora ingrese, ¿cuantas canciones tiene la playlist?: ");
                    num = in.nextInt();
                    if (num > 20) {
                        System.out.println("Solo se pueden almacenar un maximo de 20 canciones.");
                    }
                    else {
                    Disco1.setIndiceCancion(num);
                    can = 0;
                    for (int i = 0; i < Disco1.getIndiceCancion(); i++){
                        can++;
                        System.out.println("Ingrese el nombre de la cancion " + can + " :");
                        Disco1.nombreCancion[i] = in.next();
                        System.out.println("Ingrese la duracion de la cancion " + can + " :");
                        Disco1.duracionCancion[i] = in.nextDouble();
                        Disco1.duracion = Disco1.duracion + Disco1.duracionCancion[i];
                    }
                    full++;
                    }
                    System.out.println("Ingreso exitoso.");
                    System.out.println("***************************************************");
                }
                else if (elige == 2) {
                    System.out.println("Has elegido la playlist 2!");
                    System.out.println("Ingesa el nombre de la cancion 2: ");
                    data = in.next();
                    Disco2.setNombreDisco(data);
                    System.out.println("Ingresa el autor de la cancion 2: ");
                    data = in.next();
                    Disco2.setAutor(data);
                    System.out.println("Ingresa el formato de la cancion 2: ");
                    data = in.next();
                    Disco2.setFormato(data);
                    System.out.println("<------------------------------------------------->");
                    System.out.println("Ahora ingrese, ¿cuantas canciones tiene la playlist?: ");
                    num = in.nextInt();
                    if (num > 20) {
                        System.out.println("Solo se pueden almacenar un maximo de 20 canciones.");
                    }
                    else {
                    Disco2.setIndiceCancion(num);
                    can = 0;
                    for (int i = 0; i < Disco2.getIndiceCancion(); i++){
                        can++;
                        System.out.println("Ingrese el nombre de la cancion " + can + " :");
                        Disco2.nombreCancion[i] = in.next();
                        System.out.println("Ingrese la duracion de la cancion " + can + " :");
                        Disco2.duracionCancion[i] = in.nextDouble();
                        Disco2.duracion = Disco2.duracion + Disco2.duracionCancion[i];
                    }
                    full++;
                    }
                    System.out.println("Ingreso exitoso.");
                    System.out.println("***************************************************");
                }
                else if (elige == 3){
                    System.out.println("Has elegido la playlist 3!");
                    System.out.println("Ingesa el nombre de la cancion 3: ");
                    data = in.next();
                    Disco3.setNombreDisco(data);
                    System.out.println("Ingresa el autor de la cancion 3: ");
                    data = in.next();
                    Disco3.setAutor(data);
                    System.out.println("Ingresa el genero de la cancion 3: ");
                    data = in.next();
                    Disco3.setFormato(data);
                    System.out.println("<------------------------------------------------->");
                    System.out.println("Ahora ingrese, ¿cuantas canciones tiene la playlist?: ");
                    num = in.nextInt();
                    if (num > 20) {
                        System.out.println("Solo se pueden almacenar un maximo de 20 canciones.");
                    }
                    else {
                    Disco3.setIndiceCancion(num);
                    can = 0;
                    for (int i = 0; i < Disco3.getIndiceCancion(); i++){
                        can++;
                        System.out.println("Ingrese el nombre de la cancion " + can + " :");
                        Disco3.nombreCancion[i] = in.next();
                        System.out.println("Ingrese la duracion de la cancion " + can + " :");
                        Disco3.duracionCancion[i] = in.nextDouble();
                        Disco3.duracion = Disco3.duracion + Disco3.duracionCancion[i];
                    }
                    full++;
                    }
                    System.out.println("Ingreso exitoso.");
                    System.out.println("***************************************************");
                }
                else
                    System.out.println("No se encuentra la playlist.");
                System.out.println("***************************************************");
            break;
            case 'B':
            case 'b':   
                System.out.println("Elige a cual disco quieres agregarle una nueva cancion: ");
                elige = in.nextInt();
                if (elige == 1){
                    if (Disco1.indiceCancion >= 20){
                        System.out.println("Se ha llegado al limite de canciones.");
                    }
                    else{
                    System.out.println("***************************************************");
                    Disco1.indiceCancion++;
                    System.out.println("Ingrese el nombre de la nueva cancion: ");
                    Disco1.nombreCancion[Disco1.indiceCancion] = in.next();
                    System.out.println("Ingrese la duracion de la nueva cancion: ");
                    Disco1.duracionCancion[Disco1.indiceCancion] = in.nextDouble();
                    Disco1.duracion = Disco1.duracion + Disco1.duracionCancion[Disco1.indiceCancion];
                    System.out.println("***************************************************");
                    }
                }
                else if (elige == 2){
                    if (Disco2.indiceCancion >= 20){
                        System.out.println("Se ha llegado al limite de canciones.");
                    }
                    else{
                    System.out.println("***************************************************");
                    Disco2.indiceCancion++;
                    System.out.println("Ingrese el nombre de la nueva cancion: ");
                    Disco2.nombreCancion[Disco2.indiceCancion] = in.next();
                    System.out.println("Ingrese la duracion de la nueva cancion: ");
                    Disco2.duracionCancion[Disco2.indiceCancion] = in.nextDouble();
                    Disco2.duracion = Disco2.duracion + Disco2.duracionCancion[Disco2.indiceCancion];
                    System.out.println("***************************************************");
                    }
                }
                else if (elige == 3){
                    if (Disco3.indiceCancion >= 20){
                        System.out.println("Se ha llegado al limite de canciones.");
                    }
                    else{
                    System.out.println("***************************************************");
                    Disco3.indiceCancion++;
                    System.out.println("Ingrese el nombre de la nueva cancion: ");
                    Disco3.nombreCancion[Disco3.indiceCancion] = in.next();
                    System.out.println("Ingrese la duracion de la nueva cancion: ");
                    Disco3.duracionCancion[Disco3.indiceCancion] = in.nextDouble();
                    Disco3.duracion = Disco3.duracion + Disco1.duracionCancion[Disco3.indiceCancion];
                    System.out.println("***************************************************");
                    }
                }
                else
                    System.out.println("No se encuentra la playlist.");
                System.out.println("***************************************************");                         
            break;
            case 'C':
            case 'c':
                System.out.println("***************************************************");
                System.out.println("¿A cual playlist quieres elegir para ser su informacion?: ");
                elige = in.nextInt();
                if(elige == 1){
                   System.out.println(Disco1.getNombreDisco());
                   System.out.println(Disco1.getAutor());
                   System.out.println(Disco1.getFormato());
                   System.out.println("Duracion de la playlist 1: " + Disco1.duracion);
                   System.out.println("Canciones de la playlist ( canciones: " + Disco1.getIndiceCancion() + "): ");
                   for(int i = 0; i <= Disco1.getIndiceCancion(); i++){
                       System.out.println(Disco1.nombreCancion[i]);
                   }
                   System.out.println("***************************************************");
                }
                else if (elige == 2){
                   System.out.println(Disco2.getNombreDisco());
                   System.out.println(Disco2.getAutor());
                   System.out.println(Disco2.getFormato());
                   System.out.println("Duracion de la playlist 2: " + Disco2.duracion);
                   System.out.println("Canciones de la playlist ( canciones: " + Disco2.getIndiceCancion() + "): ");
                   for(int i = 0; i <= Disco2.getIndiceCancion(); i++){
                       System.out.println(Disco2.nombreCancion[i]);
                   }
                   System.out.println("***************************************************");
                }
                else if (elige == 3){
                   System.out.println(Disco3.getNombreDisco());
                   System.out.println(Disco3.getAutor());
                   System.out.println(Disco3.getFormato());
                   System.out.println("Duracion de la playlist 3: " + Disco3.duracion);
                   System.out.println("Canciones de la playlist  ( canciones: " + Disco3.getIndiceCancion() + "): ");
                   for(int i = 0; i <= Disco3.getIndiceCancion(); i++){
                       System.out.println(Disco3.nombreCancion[i]);
                   }
                   System.out.println("***************************************************");
                }
                else
                    System.out.println("No se encuentra la playlist.");
                System.out.println("***************************************************");
            break;
            case 'D':
            case 'd':
                salir++;
            break;
            default:
                System.out.println("El caracter que has introducido no es valido.");
            break;
        }
    }while(salir < 1);
    System.out.println("Gracias por tu atencion. <( º c º )> ");
    }
   
    
}

