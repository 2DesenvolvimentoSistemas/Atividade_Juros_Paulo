/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.design;


/**
 *
 * @author paulo
 */
public class Calculadora {
    
    // método
    public double calcularJuros(double capital, double taxa, double prazo){
        return capital * taxa * prazo / 100;
    }
    
}
