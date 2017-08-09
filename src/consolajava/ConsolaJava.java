/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consolajava;
import java.util.Scanner;

/**
 *
 * @author Velveth
 */
public class ConsolaJava {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        
        
        int respuesta;
        int respuesta2;
        
       
        
        
        
        System.out.println("----------Tarea3----------");
        System.out.println("--------201602753---------");
        System.out.println("1. Usuarios");
        System.out.println("2. Palabras Palíndromas");
        System.out.println("3. Salir");
        
        respuesta=entrada.nextInt();
        
        
        switch(respuesta){
            case 1:
                System.out.println("    Menu de Usuarios");
                System.out.println("1.  Ingresar Usuarios");
                System.out.println("2.  Mostrar todos los Usuarios");
                System.out.println("3.  Mostrar un Usuario Personalizado");
                System.out.println("4.  Menú Principal");
                respuesta2=entrada2.nextInt();
                System.out.println(" Ingrese Usuario");
                
                
                
                break;
                
            case 2:
                System.out.println("    Mostrar todos los usuarios");
               
                
                break;
            case 3:
                break; 
            default:
                break;
        }
    }
    
}
