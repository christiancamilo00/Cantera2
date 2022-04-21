/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aleatorio;
import java.util.Random;

/**
 *
 * @author Christian
 */


public class Main {
    
    public static void main(String[] args) {
        int[] num = new int[11];
        Random random = new Random();

        for(int i = 1; i <=10; i++) {
            int value = random.nextInt((10 - 1) + 1) + 1;
            num[i]=value;
            System.out.println("solo valor " +value);
            System.out.println("vector " + num[i]);
        }
    }
}
