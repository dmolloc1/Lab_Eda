//Búsqueda binaria: La búsqueda binaria es un algoritmo eficiente para buscar un elemento específico en
//un arreglo ordenado

import java.util.Scanner;

public class Ejercicio05 {
    static int medio ;
    public static void main(String[] args) {
        
        int[] num = {12,34,63,72,74,530,2123};
        int resp = busquedaBinaria(num,num.length, 0, 44);
        if(resp == -1){
            System.out.println("No se encontro el numero");
        }else{
            System.out.println("se encontro el numero " + 3 + "en el indice "+ resp +"y vale "+ num[resp]);
        }
    }

    public static int busquedaBinaria(int[] arr, int max, int min, int buscar){
        if(min <= max){
            medio = (max + min)/ 2;
            if(arr[medio] == buscar){
                return medio;
            }
            if(arr[medio] < buscar){
                min = medio + 1;
            }else{
                max = medio - 1;
            }
            return busquedaBinaria(arr,max,min,buscar);
        }
        return -1;
    }
}
