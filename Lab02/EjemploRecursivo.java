import java.util.Scanner;

public class EjemploRecursivo {
    static int medio ;
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int indice = sc.nextInt();
            int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int aux = busquedaDeIndice(num, num.length,0 , 3);
            if( aux != -1){
                if (indice != -1) {
                    System.out.println( "Se encontro el numero "+ indice + " en: " + indice);
                } else {
                    System.out.println("El elemento " + indice + " no se encontró en el array.");
                }
            }
        }


    public static int busquedaDeIndice(int[] arr, int max, int min, int buscar){
        
        if(min <= max){
            medio = (max + min)/ 2;
            if(medio == buscar){
                return medio;
            }
            if(medio < buscar){
                min = medio + 1;
            }else{
                max = medio - 1;
            }
            return busquedaDeIndice(arr,max,min,buscar);
        }
        return -1;
    }
}   
