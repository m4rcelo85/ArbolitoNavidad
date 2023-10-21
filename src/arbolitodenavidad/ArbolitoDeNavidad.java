
package arbolitodenavidad;

import java.util.Scanner;


public class ArbolitoDeNavidad {

    
    public static void main(String[] args) {
        int altura;
        int largoTronco;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese la altura del arbol");
        altura = leer.nextInt();
        System.out.println("Ingrese largo del tronco");
        largoTronco = leer.nextInt();
        
        
        dibujarArbolito(altura, largoTronco);
        
        
    }
    public static void dibujarArbolito(int altura, int largoTronco){
        
        //bucle para recorrer todas las filas
        for (int fila = 0; fila < altura; fila++) {
            
            //bucle para los espacios
            for (int espacio = 0; espacio < (altura-fila-1); espacio++) {
                
                System.out.print(" ");
                
            }
            //bucle para los asteriscos 
            for (int asteriscos = 0; asteriscos < (fila * 2) + 1; asteriscos++) {
                
                System.out.print("*");
                
            }
            System.out.println();
        }
        
        //tronco
        for (int base = 0; base < largoTronco; base++) {
            
            //espacios en blanco
            for (int espacios = 0; espacios < (altura-2); espacios++) {
                
                System.out.print(" ");
                
            }
            
            //barritas tronco
            for (int barra = 0; barra < 3; barra++) {
                
                System.out.print("|");
                
            }
            
            System.out.println();
            
        }
        
        
    }
    
}
