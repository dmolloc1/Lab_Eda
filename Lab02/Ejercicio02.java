//• Crea un método que compruebe si un número está ordenado de forma decreciente y creciente
import java.util.*;
public class Ejercicio02 {
    static boolean esOrdenado;
    static int pivot;
    static boolean noOrdenado;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
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
        if(num <= 99){
            esOrdenado = num % 10 > pivot;
            //si esOrdenado es true significa que es ascendente si es false es descendente
            return pivot;
        }else{
            
            if(((num % 10) > pivot) != esOrdenado){
                noOrdenado = true;
            }else{
                return pivot;
            }
        }
        return -1;
    }
}
