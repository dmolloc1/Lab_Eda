//Búsqueda binaria: La búsqueda binaria es un algoritmo eficiente para buscar un elemento específico en
//un arreglo ordenado

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        
        int[] num = {12,34,63,72,74,530,2123};
        int resp = busquedaBinaria(num, num.length/ 2,num.length, 0, 34);
        System.out.println("se encontro el numero " + 3 + "en el indice "+ resp +"y vale "+ num[resp]);
    }

    public static int busquedaBinaria(int[] arr, int medio, int max, int min, int buscar){
        if(arr[medio] == buscar){
            return medio;
        }
        if(arr[medio] < buscar){
            min = medio;
        }else{
            max = medio;
        }
        return busquedaBinaria(arr, (min + max)/ 2,max,min,buscar);
    }
}
