/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alvaro.clase02.clase02ejercicio02;

/**
 *
 * @author Alvaro
 */
public class ClaseMein {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Profesor profe = new Profesor("Alvaro","El salvador","25/23/02","M",18,"ING","Programador");
        System.err.println(profe);
        
     Estudiante est = new Estudiante("Danilo", "EL salvador","25/03/02","M",18, 2000,"ING.SIS");
        System.err.println(est.toString());
     
    }
   
            
     
}

