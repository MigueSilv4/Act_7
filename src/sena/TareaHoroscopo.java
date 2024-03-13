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
public class TareaHoroscopo {
    String signoZoodiacal = " ";
    
    public void pedirDatos(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Escribe tu signo Zoodiacal");
        signoZoodiacal = teclado.nextLine();
        // revisar 
    }
    
    public void procesarDatos(){
        signoZoodiacal = signoZoodiacal.trim();
        signoZoodiacal = signoZoodiacal.toLowerCase();
    }
    
    public void mosatrarMensaje(){
        System.out.println("Tu Horoscopo es: ");
        switch(signoZoodiacal){
            case "aries":
                System.out.println("Te saldra una nueva oportunidad");
            break;
            
            case "piscis":
                System.out.println("Te llamaran al cel ");
            break;
            
            case "tauro":
                System.out.println("Encontraras Dinero");
            break;
            
            default:
                System.out.println("El signo ingresado no existe");
            
         
                
            
        }
    }
}
