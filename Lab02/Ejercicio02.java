//• Crea un método que compruebe si un número está ordenado de forma decreciente y creciente
import java.util.*;
public class Ejercicio02 {
    static boolean esOrdenado;
    static boolean noOrdenado;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(esAscendenteDescendente(num));
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
        if(num == -1){
            return -1;
        }
        if (num < 10){
            return num;
        }else{
            if(num < 99){
                esOrdenado = num % 10 > esAscendenteDescendente(num / 10);
                //si esOrdenado es true significa que es ascendente si es false es descendente
            }else{
                if(((num % 10) > esAscendenteDescendente(num / 10)) != esOrdenado){
                noOrdenado = true;
                return -1;
                
                }else{
                    return esAscendenteDescendente(num / 10);
                }
            }
        }
        return -1;
    }
}
