/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */


package com.jbtema4ejercicio.jbtema789ejercicio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

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
        
         //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
         Vector<String> myVector = new Vector<>();
         
         myVector.add("primero");
         myVector.add("segundo");//
         myVector.add("tercero");//
         myVector.add("cuarto");
         myVector.add("quinto");
         
         myVector.remove(1);
         myVector.remove(1);
         
         for (String i : myVector){
         System.out.println(i);
         }
         
         /*
         ¿Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.?
         el problema es cuando llega al limite porque al redimensionar el vector genera lentitud en el proceso 
         **/
         
         
         //Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
         
         ArrayList<String> myArrayList = new ArrayList<>();
         
         myArrayList.add("primero");
         myArrayList.add("segundo");
         myArrayList.add("Tercero");
         myArrayList.add("Cuarto");
         
         System.out.println("--Array List--" );
         LinkedList<String> myLinkedList = new LinkedList<>();
         
        myLinkedList.addAll(myArrayList);
        
        for(String i :myArrayList){
        System.out.println(i);
        }
        System.out.println("--LinkedList--" );
        
        for(String i :myLinkedList){
        System.out.println(i);
        }
        
        // Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        
         ArrayList<Integer> myArrayList2 = new ArrayList<>();
        
         for(int i=0;i<10;i++){
         myArrayList2.add(i+1);
         }
         
         for(int i=0;i<myArrayList2.size();i++){
         if(myArrayList2.get(i)%2==0){    
         myArrayList2.remove(i);
         }
         }
         for(int i=0;i<myArrayList2.size();i++){
         System.out.println(myArrayList2.get(i));
         }
         
         System.out.println(division(10,0));
         
        
    }
    
       public static int division(int a, int b) throws ArithmeticException {
        
        if(b==0)
        {throw new ArithmeticException("el Divisor no puede ser cero");}
        
        return a/b;
                
    
    }
}
