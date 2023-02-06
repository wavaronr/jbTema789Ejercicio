/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.jbtema4ejercicio.jbtema789ejercicio;

/**
 *
 * @author alexn
 */
public class JbTema789Ejercicio {

    public static void main(String[] args) {
        
        
        //Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
        
        String palabra = "Palabra inversa";
        char[] myArray = new char[palabra.length()];
        
        for(int i =0; i < palabra.length();i++){
        myArray[i]=palabra.charAt(i);
        }
        
        String newPalabra="";
        int x=palabra.length()-1;
                
        for(int i =0; i < palabra.length();i++){
        newPalabra = newPalabra+myArray[x];
            x--;
        }
        System.out.println(newPalabra);
        
        
        //Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        
        String[] myArrayUniD = {"Wilmer", "Alexander", "Varon", "Rodriguez"};
        
        for(int i=0;i<myArrayUniD.length;i++){
            
        System.out.println(myArrayUniD[i]);
        }
        
        
        
        
    }
}
