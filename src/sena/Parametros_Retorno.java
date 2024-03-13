/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sena;

/**
 *
 * @author silva
 */
public class Parametros_Retorno {
    
    public void dividirDosNumeros (){
        float numero = 220f;
        float  valor = 12f;
        float resultado = numero / valor;
        System.out.println("Resultado = " + resultado);
        
    }
    
    public void multiplicarDosNumeros (int cantidad, int precio){
        int total = precio * cantidad;
        System.out.println("Total = " + total);
        
    }
    
    public int restarDosNumeros (int cotizacion, int presupuesto){
        int respuesta = cotizacion - presupuesto;
        return respuesta;
    }
    
    public double sumarDosNumeros (double poblacion, double dato){
        double salida = poblacion + dato;
        return salida;
        
        
    }
        
        
    public void mostrarSumayResta(){
        int resta = restarDosNumeros (50,23);
        double suma = sumarDosNumeros (89.29, 233.002);
        System.out.println("La resta da = " + resta);
        System.out.println("La suma da = " + suma);
        
    }    
        
}
