/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pro_calculadora_aabb;

/**
 *
 * @author olivert
 */
public class Calculadora {

    public static int Suma(int a, int b) {
        return a+b;
    }
    public static int Resta(int a, int b) {
        return a-b;
    }
    
    
    public static int Multiplicacion(int a, int b) {
        return a*b;
    }
    public static int Division(int a, int b) {
        return a/b;
    }
    
    public static int Porcentaje(int numero, int por) {
        return (numero*por)/100;
    }
    
    public static void main(String args[])
    {
        System.out.println("Suma de 1 + 3 = "+ Suma(1,3));
        System.out.println("Resta de 3 - 1 = "+ Resta(3,1));
        
        System.out.println("Multiplicación de 1 * 3 = "+ Multiplicacion(1,3));
        System.out.println("Division de 3 / 3 = "+ Division(3,3));

        System.out.println("30% de 100 es = "+ Porcentaje(100,30));
    }
}
