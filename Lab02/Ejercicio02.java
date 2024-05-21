//• Crea un método que compruebe si un número está ordenado de forma decreciente y creciente
import java.util.*;
public class Ejercicio02 {
    static boolean esOrdenado;// True = ascendente , False = descendente
    static boolean noOrdenado;//parametro que indique cuando una lista no esta ordenada
    static int pivot;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        esAscendenteDescendente(num);
        
        if(noOrdenado){
            System.out.println("No esta ordenado");
        }else{
            if(esOrdenado){
                System.out.println("Es ascendente");
            }else{
                System.out.println("Es descendente");
            }
        }
        
    }
    public static int esAscendenteDescendente(int num){
        if (num < 10){
            return num;
        }
        pivot = esAscendenteDescendente(num / 10);
        //se define el valor de esOrdenado en la primera comparacion de numeros
        if(num <= 99){
            esOrdenado = num % 10 > pivot;
        }else{
            if(((num % 10) > pivot) != esOrdenado){
                noOrdenado = true;
        }
        return pivot;//retorna la variable recursiva esAscendenteDescendente(num / 10);
    }
}
