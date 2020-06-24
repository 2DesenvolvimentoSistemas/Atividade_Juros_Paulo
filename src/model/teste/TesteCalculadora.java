/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.teste;

import model.design.Calculadora;

/**
 *
 * @author paulo
 */
public class TesteCalculadora {
    public static void main(String[] args) {
        //criação e instância do objeto
        Calculadora cal = new Calculadora();
        
        System.out.printf("%.2f x %.2f x %.2f / 100 = %.2f \n", 1000.0, 10.0, 3.0, cal.calcularJuros(1000, 10, 3));
    }
    
}
