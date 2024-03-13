/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sena;

import java.util.Scanner;

/**
 *
 * @author silva
 */
public class EstratoEmpleado {
 
     int estrato;
     
    public void pedirEstrato(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el estrato: ");
        estrato = teclado.nextShort();
        
    }
    
    String ciudad, nombreCompleto;
    float estatura;
    double distancia;
    
    public void pedirCiudad(){
        Scanner teclado = new Scanner  (System.in);
        System.out.println("Escriba la ciudad: " );
        ciudad = teclado.next();
        System.out.println("Escriba la estatura: ");
        estatura = teclado.nextFloat();
        System.out.println( "Escriba la distancia: ");
        distancia = teclado.nextDouble();
        System.out.println("Escriba el nombre completo: ");
        nombreCompleto = teclado.next();
    }
    
    
    
    
    public void clasificarEstrato(){
        
        if (estrato<3){
            System.out.println("Estrato Bajo \n");
        }else{
            System.out.println("Estrato Alto");
        }
    }
    
    
    public void ejecutar(){
        pedirEstrato();
        clasificarEstrato();
    }
    
    
  
    
    
    
public class EstratoEstudiante{
        String[] nombreEstudiante = new String[17];
        int [] estratoEstudiante = new int [7];
        
        
    public void pedirNombreYEstrato(){
        Scanner teclado = new Scanner (System.in);
        for (int i = 0;  i < nombreEstudiante.length; i++){
        System.out.println("Escriba el nombre: \n");
        String unNombreEmpleado = teclado.next();
        System.out.println("Escriba el estrato: \n");
        int unEstratoEmpleado = teclado.nextInt();
        nombreEstudiante[i] = unNombreEmpleado;
        estratoEstudiante[i] = unEstratoEmpleado;
           
        
           }
    }
       
    public void mostrarEstudianteTres(){
        pedirNombreYEstrato();
        for (int i = 0; i < estratoEstudiante.length; i++){
        int elEstrato = estratoEstudiante[i];
        if (elEstrato==3){
        System.out.println("Estudiante" + nombreEstudiante[i] + "es 3");
               }
           }
       }
    
}
}
