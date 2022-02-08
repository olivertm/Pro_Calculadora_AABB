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
    public static int Porcentaje(int numero, int por) {
        return (numero*por)/100;
    }
        
    public static void main(String args[])
    {
        System.out.println("30% de 100 es = "+ Porcentaje(100,30));
    }
}
