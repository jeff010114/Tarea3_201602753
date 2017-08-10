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
    

    /**primercommit
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        String arreglo[] = new String[5];
        String aux;
        Scanner scn = new Scanner (System.in);
             
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
                
                
        for (int i=0; i<arreglo.length; i++){
            
            
            aux = scn.next();
            arreglo[i] = aux;
        }
        for (int i = 0; i<arreglo.length; i++){
           System.out.println(""+(i+1)+"."+arreglo[i]);
        }   
                
                
                
                break;
                
            case 2:
                System.out.println("    Palabras palondrimas");
                
                
                break;
            case 3:
                break; 
            default:
                break;
        }
    }
    
}
