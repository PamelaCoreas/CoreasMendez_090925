/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coreasmendez_080925;

/**
 *
 * @author Pamela Coreas
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //TAMAÑO DE ARREGLO
        int cantidad_elementos = 5;
        
        //CREACION DE INSTANCIA ARREGLO DE NUMEROS DESORDENADOS
        int [] numeros_desordenados = new int [cantidad_elementos];
        
        //CREACION E INSTANCIA ARREGLO DE NUMEROS ORDENADOS
        int [] numeros_ordenados = new int [cantidad_elementos];
        
        //CREACION E INSTANCIA DEL OBJETO SCANNER
        Scanner scanner = new Scanner (System.in);
        
        //NOTIFICACION AL USUARIO PARA INDICARLE QUE DEBE INGRESAR VALORES ENTEROS
        System.out.println("Por favor ingrese "+cantidad_elementos+"numeros enteros de manera desordenada");
        
        //SE RECORRE EL ARREGLO DE NUMEROS ENTEROS DESORDENADOS QUE POR DEFECTO
        //TIENEN EL VALOR DE CERO
        for (int i = 0; i<numeros_desordenados.length; i++) {
            
            //SE SOLICITA AL USUARIO EL INGRESO DE UN VALOR
            System.out.print("Digite el elementos: "+(i+1)+": ");
            
            //SE DIGITA UN VALOR DESDE EL TECLADO DE TIPO ENTERO
            numeros_desordenados[i] = scanner.nextInt();
            
        }
        
        //SE IMPRIME UNA SALIDA AL USUARIO PARA INDICAR LOS NUMEROS DIGITADOS
        System.out.println("Usted digito los siguientes numeros");
        
        //
        for(int j =0; j < numeros_desordenados.length; j++){
            
            //SE IMPRIMEN LOS NUMEROS DIGITADOS POR EL USUARIO
            //ALMACENADOS EN EL ARREGLO DE NUMEROS DESORDENADOS
            System.out.print(numeros_desordenados[j]+" ");
            
        }
        
        //
        System.out.println();
        
        //
        numeros_ordenados = ordenar(numeros_desordenados);
        
        //
        System.out.print("Los numeros ordenados son: ");
        
        //
        //
        for(int k = 0; k < numeros_ordenados.length; k++){
            
            //
            System.out.print(numeros_ordenados[k]+" ");
            
        }
        
        System.out.println();
        
    }
    
    
    //
    public static int[] ordenar( int[] arreglo ){
        
        //
        for(int i=0; i < arreglo.length - 1; i++){
            
            //
            //
            for(int j=0; j<arreglo.length - 1; j++){
                
                //
                //
                if(arreglo[j] > arreglo[j+1]){
                    
                    //
                    //
                    int mayor = arreglo[j];
                    
                    //
                    arreglo[j] = arreglo[j+1];
                    
                    //
                    arreglo[j+1] = mayor;
                    
                }
                
            }
            
            
            
        }
              
        return arreglo;
    }
}
